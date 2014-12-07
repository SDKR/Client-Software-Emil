package connections;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import json.AddNoteJson;
import json.AuthUserJson;
import json.CreateCalendarJson;
import json.CreateEventJson;
import json.DeleteCalendarJson;
import json.EventsDayJson;
import json.EventsWeekJson;
import json.GetAllCalendarJson;
import json.NoteJson;
import json.QOTDJson;
import json.UnSubscribeCalendarJson;
import json.WeatherJson;
import json.subscribeUserJson;
import json.userToCalendar;
import TCPSocket.TCPConnect;

public class ServerManager {
	
	TCPConnect TCon = new TCPConnect();
	Gson gson = new GsonBuilder().create();
	
//	Quote function
	String quoteOutput;
	String qouteAuthor;

//	Weather function
	String weatherDegrees;
	String weatherDecription;
	String weatherDate;
	
//	Login Function
	public String userChecker(String email, String password){
		String userChecker = "";
		
		Gson gson = new GsonBuilder().create();
		AuthUserJson AUJ = new AuthUserJson();
		AUJ.setAuthUserEmail(email);
		AUJ.setAuthUserPassword(password);
		String gsonString = gson.toJson(AUJ);
		
		try {
			userChecker = TCon.sendMessage(gsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return userChecker;

	}
	
//	Weather function, degrees, decription, date and getters 
	public void weatherCheck(){
	String currentWeather = "";
	Gson gson = new GsonBuilder().create();
	WeatherJson WJ = new WeatherJson();
	String gsonString = gson.toJson(WJ);
	try{
		currentWeather = TCon.sendMessage(gsonString);
	}
	catch (Exception e){
		e.printStackTrace();
	}
	
	WeatherJson WJ1 = gson.fromJson(currentWeather, WeatherJson.class);
//	String weatherOutput = WJ1.getDegrees() +" "+ WJ1.getDesc() +" "+ WJ1.getWeather();

	weatherDegrees = WJ1.getDegrees();
	weatherDecription = WJ1.getDesc();
	weatherDate = WJ1.getWeather();
	
}
//	getters
public String getWeatherDegrees() {
		return weatherDegrees;
	}

	public String getWeatherDecription() {
		return weatherDecription;
	}

	public String getWeatherDate() {
		return weatherDate;
	}

	//	Quote function
	public void quoteCheck(){
		String currentQuote = "";
		Gson gson = new GsonBuilder().create();
		QOTDJson QJ = new QOTDJson();
		String gsonString = gson.toJson(QJ);
		try{
			currentQuote = TCon.sendMessage(gsonString);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(currentQuote);
		QOTDJson QJ1 = gson.fromJson(currentQuote, QOTDJson.class);
		
		quoteOutput = QJ1.getQuote();
		qouteAuthor = QJ1.getAuthor();

	}
//	getters for the author and quote itself
	public String getQuoteOutput() {
		return quoteOutput;
	}

	public String getQouteAuthor() {
		return qouteAuthor;
	}

	//	CreateEvent
	public String createEvent(String eventName, String eventLocation, String eventInfo, String eventTypeCombo, String startYear, String startMonth, String startDay, String startHour, String startMinute, String endYear, String endMonth, String endDay, String endHour, String endMinute, String Calendar){
		String stringToBeReturned = "";
		CreateEventJson EJ1 = new CreateEventJson();
		EJ1.setName(eventName);
		EJ1.setLocationName(eventLocation);
		EJ1.setText(eventInfo);
		EJ1.setType(eventTypeCombo);
		EJ1.setStartYear(startYear);
		EJ1.setStartMonth(startMonth);
		EJ1.setStartDay(startDay);
		EJ1.setStartHour(startHour);
		EJ1.setStartMinute(startMinute);
		EJ1.setEndYear(endYear);
		EJ1.setEndMonth(endMonth);
		EJ1.setEndDay(endDay);
		EJ1.setEndHour(endHour);
		EJ1.setEndMinute(endMinute);
		EJ1.setCalendarID(Calendar);
		
		
		Gson gson = new GsonBuilder().create();
		String gsonString = gson.toJson(EJ1);
		
		try{
			stringToBeReturned = TCon.sendMessage(gsonString);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(stringToBeReturned);
		//EventsJson EJ2 = gson.fromJson(stringToBeReturned, EventsJson.class);

		//String eventOutput = EJ2.getCalendarID() /*+ " " + EJ2.getLocation() */+ " " + EJ2.getLocationName() + " " + EJ2.getName() + " " + EJ2.getText() + " " + EJ2.getType() + " " + EJ2.getStartYear() + " " + EJ2.getStartMonth() + " " + EJ2.getStartDay() + " " + EJ2.getStartHour() + " " + EJ2.getStartMinute() + " " + EJ2.getEndYear() + " " + EJ2.getEndMonth() + " " + EJ2.getEndDay() + " " + EJ2.getEndHour() + " " + EJ2.getEndMinute() + " " + EJ2.getCalendarID();
		return stringToBeReturned;
	}
	
//	Get daily events
	public String[][] daysevents(String AdminKeeper) {
		String[][] stringArrayToBeReturned = null;
		EventsDayJson EDJ = new EventsDayJson();
		EDJ.setCreatedby(AdminKeeper);
		String gsonString = gson.toJson(EDJ);
		try
		{ 
			stringArrayToBeReturned = gson.fromJson(TCon.sendMessage(gsonString), String[][].class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringArrayToBeReturned;
	}
	
	public String[][] getEventsFromUSerWeek(String UserKeeper) {
		String[][] stringArrayToBeReturned = null;
		EventsWeekJson EWJ = new EventsWeekJson();
		EWJ.setCreatedby(UserKeeper);
		String gsonString = gson.toJson(EWJ);
		try
		{ 
			stringArrayToBeReturned = gson.fromJson(TCon.sendMessage(gsonString), String[][].class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringArrayToBeReturned;
	}
	
//	Calendar
	public String useToCalendar(String username, String Calendarname)
	{
		String stringToBeReturned = "";
		userToCalendar UTC = new userToCalendar();
		UTC.setCalendarName(Calendarname);
		UTC.setEmail(username);
		String gsonString = gson.toJson(UTC);
		try
		{
			stringToBeReturned = TCon.sendMessage(gsonString);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringToBeReturned;
	}
	
//	Calendar
	public String UnSubScribeCalendar(String username, String Calendarname)
	{
		String stringToBeReturned = "";
		UnSubscribeCalendarJson USC = new UnSubscribeCalendarJson();
		USC.setCalendarName(username);
		USC.setEmail(Calendarname);
		String gsonString = gson.toJson(USC);
		try
		{
			stringToBeReturned = TCon.sendMessage(gsonString);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringToBeReturned;
	}

//	Delte calendar 
	public void deleteCalendar(String calendarName, String allKnowingUsername) {
		String stringToBeReturned = "";
		DeleteCalendarJson DCJ = new DeleteCalendarJson();
		DCJ.setCalenderName(calendarName);
		DCJ.setUserName(allKnowingUsername);
		String gsonString = gson.toJson(DCJ);
		try
		{
			stringToBeReturned = TCon.sendMessage(gsonString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

//	create calendar
	public void createCalendar(String calendarName, int pP, String allKnowingUsername) {
		String stringToBeReturned ="";
		CreateCalendarJson CCJ = new CreateCalendarJson();
		CCJ.setCalenderName(calendarName);
		CCJ.setPublicOrPrivate(pP);
		CCJ.setUserName(allKnowingUsername);
		String gsonString = gson.toJson(CCJ);
		try
		{
			stringToBeReturned = TCon.sendMessage(gsonString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
//	Get all calendars
	public String[][] getAllCalendars() {
		String[][] stringArrayToBeReturned = null;
		GetAllCalendarJson GAC = new GetAllCalendarJson();
		String gsonString = gson.toJson(GAC);
		try
		{
			stringArrayToBeReturned = gson.fromJson(TCon.sendMessage(gsonString), String[][].class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return stringArrayToBeReturned;
	}
	
//	Get notes
	public String getNote(String eventID) {
		String stringToBeReturned = "";
		String stringFromServer = "";
		NoteJson NJ = new NoteJson();
		NJ.setEventID(eventID);
		String gsonString = gson.toJson(NJ);
		try
		{
			stringFromServer = TCon.sendMessage(gsonString);
			try
			{
				NoteJson NJR = gson.fromJson(stringFromServer, NoteJson.class);
				stringToBeReturned = "Note for event "+NJR.getEventID()+"\n"+NJR.getNote()+"\n"+"Created by: "+NJR.getCreatedBy()+" "+NJR.getDateTime();
			}
			catch(Exception e)
			{
				stringToBeReturned = stringFromServer;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return stringToBeReturned;
	
}
	
//	get note tesxt
	public String getNoteText(String eventID) {
		String stringToBeReturned = "";
		String stringFromServer = "";
		NoteJson NJ = new NoteJson();
		NJ.setEventID(eventID);
		String gsonString = gson.toJson(NJ);
		try
		{
			stringFromServer = TCon.sendMessage(gsonString);
			try
			{
				NoteJson NJR = gson.fromJson(stringFromServer, NoteJson.class);
				stringToBeReturned = NJR.getNote();
			}
			catch(Exception e)
			{
				stringToBeReturned = stringFromServer;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return stringToBeReturned;
	}
	
//	Update notes
	public String updateNote(String eventID, String noteText, String allKnowingUsername) {
		String stringToBeReturned = "";
		AddNoteJson ANJ = new AddNoteJson();
		ANJ.setCreatedBy(allKnowingUsername);
		ANJ.setEventID(eventID);
		ANJ.setNote(noteText);
		String gsonString = gson.toJson(ANJ);
		try
		{
			stringToBeReturned = TCon.sendMessage(gsonString);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringToBeReturned;
	}
	
//	Subscribe another user
	public String subsribeOtherUser(String subscriber, String userName, String calendarName) {
		String stringToBeReturned = "";
		subscribeUserJson SUJ = new subscribeUserJson();
		SUJ.setCalendarName(calendarName);
		SUJ.setUsername(userName);
		SUJ.setSubscriber(subscriber);
		String gsonString = gson.toJson(SUJ);
		try
		{
			stringToBeReturned = TCon.sendMessage(gsonString);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return stringToBeReturned;
		
	}
	
}