package schoolClass;

import java.io.*;

public class Main3_4 {
	public static void main(String args[]) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String ansyou = "1111";
		int zandaka = 100000;
		int count = 0;
		try {
		while(true) {

			System.out.println("暗証番号を入力してください");
			String line = reader.readLine();
			if(!line.equals(ansyou)) {
				if(count == 2) {
					System.exit(0);
				}
				System.out.println("もう一度暗証番号を入力してください");
				count++;
				continue;
			}else {
				break;
			}
			
		}
		System.out.println("引き出すお金を入力してください");
		String line2 = reader.readLine();
		int hikidasikinn = Integer.parseInt(line2);
		if(hikidasikinn > zandaka) {
			System.out.println("残高が足りません");	
		}else {
			zandaka = zandaka-hikidasikinn;
			System.out.println("残高は"+ zandaka +"円" );
		}
		}catch(IOException e) {
			
		}
	}

}
