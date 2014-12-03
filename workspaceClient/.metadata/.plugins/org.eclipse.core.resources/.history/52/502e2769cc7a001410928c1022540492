package connections;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import json.AuthUserJson;
import json.QOTDJson;
import json.WeatherJson;
import TCPSocket.TCPConnect;

public class ServerManager {
	
	TCPConnect TCon = new TCPConnect();
	
	
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
	
//	Weather function
	public String weatherCheck(){
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

	String weatherOutput = WJ1.getDegrees() +" "+ WJ1.getDesc() +" "+ WJ1.getWeather();

	return weatherOutput;
	
}
	
//	Quote function
	public String quoteCheck(){
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
		
		String quoteOutput = QJ1.getAuthor() + " " + QJ1.getQuote();
 		
		return quoteOutput;
	}
	
}
