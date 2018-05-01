package schoolClass;


public class Main3_3 {
	public static void main(String[] args) {
	    int count = 0;
	    int max = 1000;
	    
	    for(int n=1; count<=max; n++) {
	      count += n;   
	      if(count > max) {
	    	  
	    	  System.out.println(n);
	      }
	    }
	 }	   
}
