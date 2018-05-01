package schoolClass;



import java.util.*;



	public class Test3 {
		public static void main(String[] args) {
			int l,m,n;
		    String line,line1,line2;
		    List<Integer> box= new ArrayList<Integer>();
		    	for(int i = 0; i < 1000; i++) {
		    		int random =  (int)(Math.random() * 99) + 1;
		    		box.add(random);
		    	}
		    	Collections.sort(box);
		    	System.out.println("最大値は "+ box.get(999) + "、 中間値は" + box.get(499) + "、 最小値は " + box.get(0) + " です。");
		    	System.out.println(box);
			
		}

	}


