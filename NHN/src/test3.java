
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
	static int reverse(int n)
	{
		int ret = 0;
		while (n != 0)
		{
			ret = ret * 10 + n % 10;
			n /= 10;
		}
		return ret;
	}
	
    public static void main(String[] args) {
        int number = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            number = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // write your code here
        int i;
        boolean flag = false;
        for (i = 0; i < 3; i++)
        {
        	System.out.print("       number: " + number);
        	number = number + reverse(number);
        	System.out.println("                       number2 : " + number);
        	if (number == reverse(number))
        	{
        		flag = true;
        		break;
        	}
        }
        if (flag == true)
        {
        	System.out.println(number);
        }
        else
        {
        	System.out.println(-1);
        }
    }
}