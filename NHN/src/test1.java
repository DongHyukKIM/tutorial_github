
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();

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
            System.out.println("number=" + number);
        }
        */       

        int i = 0, j, min, idx = 1;
        int numArray[] = new int [numberList.size()];
        for (Integer number : numberList)
        {
        	numArray[i++] = number;
        }
        
        for (i = 0; i < numArray.length; i++)
        {
        	for (j = i + 1; j < numArray.length; j++)
        	{
        		if (numArray[i] > numArray[j])
        		{
        			int tmp = numArray[i];
        			numArray[i] = numArray[j];
        			numArray[j] = tmp;
        		}
        	}
        }
        
        min = numArray[1] - numArray[0];
        for (i = 2; i < numArray.length; i++)
        {
        	if (numArray[i] - numArray[i - 1] < min)
        	{
        		min = numArray[i] - numArray[i - 1];
        		idx = i;
        	}
        }
        
        System.out.println(numArray[idx - 1] + " " + numArray[idx]);
    }
}