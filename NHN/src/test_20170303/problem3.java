package test_20170303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class problem3 {
	
	private static int reverse(int input)
	{
		int output = 0;
		String num = Integer.toString(input);
		ArrayList<Character> charArr = new ArrayList<>();
		char[] tmp = num.toCharArray();
		for(Character c : tmp)
			charArr.add(c);
		Collections.reverse(charArr);
		
		String output_tmp = "";
		for(int i=0 ; i<charArr.size() ; i++)
			output_tmp += charArr.get(i);
		output = Integer.parseInt(output_tmp);
		
		return output;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		int reverseNum = reverse(num);
		
		for(int i=0 ; i<3 ; i++)
		{
			num += reverseNum;
			reverseNum = reverse(num);
			
			if(num == reverseNum)
			{
				System.out.println(num);
				break;
			}
			if(i == 2 && num != reverseNum)
			{
				System.out.println(-1);
				break;
			}
		}
	}
}
