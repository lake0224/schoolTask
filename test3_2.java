package schoolClass;

import java.io.*;

public class test3_2 {
	public static void main(String args[]) {
		int random =  (int)(Math.random() * 999) + 1;
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int count =0;
	    try {
	    	for(int i= 0; i < 10; i ++) {
	    		if(count == 10) {
	    			System.out.println("正解は"+ random);
	    			break;
	    		}
	    	 	System.out.println("0～999までの整数を入力してください。");
	    	 	String	line = reader.readLine();
	    	    int l = Integer.parseInt(line);
	    	    if(l < random) {
	    	    	System.out.println("入力は正解よりも小さいです。");
	    	    	count++;
	    	    	continue;
	    	    }if(l >random) {
	    	    	System.out.println("入力は正解よりも大きいです。");
	    	    	count++;
	    	    	continue;
	    	    }else{
	    	    	System.out.println(i+1 + "回目で正解です");
	    	    	break;
	    	    }
	    	    
	    	    
	    	}
	    
	    }catch(IOException e){
	    	System.out.println(e);	
	    }
		
	}
	
}



