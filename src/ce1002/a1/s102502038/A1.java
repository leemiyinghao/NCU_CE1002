package ce1002.a1.s102502038;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class A1 {
	public static void main(String[] args){
		while(true){
			System.out.print("Please input a number (5~30): ");
			String inputln = null;
			int num = 0;
			try{
				BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				inputln = buff.readLine();
				num = Integer.parseInt(inputln);
			}catch(IOException error){
				System.out.println("Input Section Error: " + error);
				continue;
			}catch(java.lang.NumberFormatException error){
				System.out.println("Input Section Error: " + error);
				continue;
			}
			if(num <= 30 && num >= 5){
				for(int i = 0;i<num;i++){
					for(int j = 0;j<num;j++){
						System.out.print((j+i)%2 == 0 ? "X" : "O");
					}
					System.out.println("");
				}
				break;
			}else{
				System.out.println("Out of range!");
			}
		}
		return;
	}
}
