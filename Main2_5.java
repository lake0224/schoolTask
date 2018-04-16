package schoolClass;


import java.io.*;
import java.util.*;

public class Main2_5 {
	
	public static void main(String[] args) {
		Map<String, String> pass = new HashMap<String, String>();
		pass.put("user1", "pasuwa-do");
		pass.put("user2", "0dc6a4");
		pass.put("user3", "hirakegoma!");
		String user_Name,passward;
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	    try {
	    		System.out.println("ユーザー名を入力してください: ");
	    		user_Name = reader.readLine();
	    		System.out.println(user_Name + "さんですね。パスワードを入力してください　:");
	    		passward = reader.readLine();
	    
	    		if(pass.containsKey(user_Name)) {
	    			if(passward.equals(pass.get(user_Name))){
	    				System.out.println("OK");
	    			}else {
	    				System.out.println("NG");
	    			}	
	    		}else {
	    			System.out.println("NG");
	    		}
	    }catch(IOException e) {
	    		System.out.println(e);
	    }	
	}
}
