package schoolClass;

import java.io.*;

public class Main2_6 {
	public static void main(String[] args) {
		double a,b,c,s,heron,S;
		String line,line1,line2;
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	    try {
	    	System.out.println("aの値を入力してください:");
    		line = reader.readLine();
    		a = Double.parseDouble(line);
	    	System.out.println("bの値を入力してください:");
    		line1 = reader.readLine();
    		b = Double.parseDouble(line1);
	    	System.out.println("cの値を入力してください:");
    		line2 = reader.readLine();
    		c = Double.parseDouble(line2);
    		s = (a+b+c)/2;
    		if(s-a > 0 && s-b > 0 && s-c > 0) {
    			heron = s*(s-a)*(s-b)*(s-c);
    			S = Math.sqrt(heron);
    			System.out.println("S=" + S);
    		}else {
    			System.out.println("三角形の成立条件が満たされません");
    		}
	    }catch(IOException e) {
	    	System.out.println(e);
	    }   		
	}
}
