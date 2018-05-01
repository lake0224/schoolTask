package schoolClass;

public class Main3_2 {
	public static void main(String[] args) {
	    double x, y;
	    int count = 0;
	    int max = 1000000;
	    int period = max/10;
	    
	    for(int n=1; n<=max; n++) {
	      x = Math.random();
	      y = Math.random();
	      if(Math.sqrt(x*x+y*y) <= 1.0) count++;
	      if((n % period) == 0) {
	        System.out.println(n + "回め: " + (4.0 * count/ n ));
	        
	        
	      }
	    }
	  } 

}
