package test_20170303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class problem4 {

	public static void main(String[] args) throws IOException {
		String biggest = "", smallest = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] tmp = input.split("\\s+");
		ArrayList<String> arrList = new ArrayList<>();
		
		for(int i=0 ; i<tmp.length ; i++)
			arrList.add(tmp[i]);
		
		Collections.sort(arrList);
//		System.out.println(arrList);
		if(arrList.get(0).equals("0"))
		{
			smallest = arrList.get(1) + arrList.get(0);
			for(int i=2 ; i<arrList.size() ; i++)
				smallest += arrList.get(i);
		}
		else
			for(String num : arrList)
				smallest += num;
		
		Collections.reverse(arrList);
//		System.out.println(arrList);
		for(String num : arrList)
			biggest += num;
		
		System.out.println(biggest + "   " + smallest);
		int result = Integer.parseInt(biggest) + Integer.parseInt(smallest);
		System.out.println(result);
	}

}
