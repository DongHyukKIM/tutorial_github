
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        String a = "11";
        String b = "22";
        System.out.println(a.length());
        System.out.println(b.length());

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            String[] numStrList = input.split(" ");
            for (String numStr : numStrList) {
                numberList.add(Integer.parseInt(numStr));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 다음과 같은 방식으로 numberList와 number 변수를 사용할 수 있음
        /*
        for (Integer number : numberList) {
            System.out.println(number);
        }
        */
        
        int i, j, max, min;
        String[] strList = new String [numberList.size()];
        String maxStr = "", minStr = "";
        
        i = 0;
        for (Integer number : numberList)
        {
        	strList[i++] = Integer.toString(number);
        }
        
        for (i = 0; i < strList.length; i++)
        {
        	for (j = i + 1; j < strList.length; j++)
        	{
        		if (compare(strList[i], strList[j]) > 0)
        		{
    				String tmp = strList[i];
    				strList[i] = strList[j];
    				strList[j] = tmp;
        		}
        	}
        }
        
        for (i = 0; i < strList.length; i++)
        {
        	maxStr = strList[i] + maxStr;
        	minStr = minStr + strList[i];
        }
        
        max = Integer.parseInt(maxStr);
        min = Integer.parseInt(minStr);
        
        System.out.println(max + " + " + min);
        System.out.println(max + min);
    }

	private static int compare(String string1, String string2) {
		// TODO Auto-generated method stub
		int len;
		String substr1, substr2;
		if (string1.length() == string2.length())
		{
			return string1.compareTo(string2);
		}
		else if (string1.length() < string2.length())
		{
			substr1 = string1;
			substr2 = string2.substring(0, string1.length());
		}
		else
		{
			substr1 = string1.substring(0, string2.length());
			substr2 = string2;
		}
		
		if (substr1.compareTo(substr2) == 0)
		{
			if (string1.length() < string2.length())
			{
				return compare(string1, string2.substring(string1.length()));
			}
			else
			{
				return compare(string1.substring(string2.length()), string2);
			}
		}
		
		return substr1.compareTo(substr2);
	}
}