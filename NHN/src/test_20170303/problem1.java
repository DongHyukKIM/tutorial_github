package test_20170303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class problem1 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String tmp[] = input.split("\\s+");
		
		for(int i=0 ; i<tmp.length ; i++)
			arr.add(Integer.parseInt(tmp[i]));
		br.close();
		
		Collections.sort(arr);
		
		int calc = arr.get(1) - arr.get(0);
		int[] result = {arr.get(0), arr.get(1)};
		
		for(int i=2 ; i<arr.size() ; i++)
		{
			if((arr.get(i) - arr.get(i-1)) < calc)
			{
				calc = arr.get(i) - arr.get(i-1);
				result[0] = arr.get(i-1);
				result[1] = arr.get(i);
			}
		}
		
		System.out.println(result[0] + " , " + result[1]);
	}
}
