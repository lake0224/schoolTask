package schoolClass;

public class Main2_1 {
	public static void main(String[] args) {
	    int n =  (int)(Math.random() * 99) + 1;
	    switch( n % 3 ) {
	    case 0:
	      System.out.println(n + "は3で割ると割り切れます。");
	      break;
	    case 1:
	      System.out.println(n + "は3で割ると1余ります。");
	      break;
	    case 2:
	      System.out.println(n + "は3で割ると2余ります。");
	      break;
	    default:
	   }
	 }

}
