package connections;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import json.AuthUserJson;
import TCPSocket.TCPConnect;

public class ServerKeeper {
	
	TCPConnect TCon = new TCPConnect();
	
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
}
