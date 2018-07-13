package fileeditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SctenseReverse{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String instr = null;
		try {
			instr = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String arr[] = instr.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = arr.length - 1; i > 0; i--){
            sb.append(arr[i] + " ");
        }
        sb.append(arr[0]);
        System.out.println(sb.toString());
        System.exit(0);
    }
}