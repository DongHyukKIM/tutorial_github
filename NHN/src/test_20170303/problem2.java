package test_20170303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem2 {

	public static void main(String[] args) throws IOException {
		int[] aeiou_list = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
		ArrayList<Integer> aeiou = new ArrayList<>();
		for(int condition : aeiou_list)
			aeiou.add(condition);
		
		int result_aeiou = 0, result_others = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String tmp[] = input.split("\\s+");
		
		for(String words : tmp)
		{
			char[] tmp_word = words.toCharArray();
			boolean flag_aeiou = false, flag_others = false;
			
			for(int i=0 ; i<tmp_word.length-2 ; i++)
			{
				if(flag_aeiou == true && flag_others == true)
					break;
				else if(flag_aeiou == false && aeiou.contains((int)tmp_word[i]) && aeiou.contains((int)tmp_word[i+1]))
				{
					result_aeiou++;
					flag_aeiou = true;
				}
				else if(flag_others == false && !aeiou.contains((int)tmp_word[i]) && !aeiou.contains((int)tmp_word[i+1]) && !aeiou.contains((int)tmp_word[i+2]))
				{
					result_others++;
					flag_others = true;
				}
			}
			if(aeiou.contains((int)tmp_word[tmp_word.length-2]) && aeiou.contains((int)tmp_word[tmp_word.length-1]))
				result_aeiou++;
		}
		br.close();
		
		System.out.println("모음2개연속: " + result_aeiou);
		System.out.println("모음외3개연속: " + result_others);
	}

}
