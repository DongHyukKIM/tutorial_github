
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test2 {
	public static void main(String[] args) {
		String[] words = null;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			words = line.split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 다음과 같은 방식으로 words와 word 변수를 사용할 수 있음
		/*
        for (String word : words) {
            System.out.println(word);
        }
		 */
		int res[] = new int [2];

		for (String word : words)
		{
			int i, j;
			String subword;
			boolean flag = true;
			for (i = 1; i < word.length(); i++)
			{
				flag = true;
				subword = word.substring(i - 1, i + 1);

				for (j = 0; j < 2; j++)
				{
					if (subword.charAt(j) != 'a' && subword.charAt(j) != 'e' && subword.charAt(j) != 'i' && subword.charAt(j) != 'o' && subword.charAt(j) != 'u')
					{
						flag = false;
					}
				}
				if (flag == true)
				{
					res[0]++;
					break;
				}
			}
			for (i = 2; i < word.length(); i++)
			{
				flag = true;
				subword = word.substring(i - 2, i + 1);
				for (j = 0; j < 3; j++)
				{
					if (subword.charAt(j) == 'a' || subword.charAt(j) == 'e' || subword.charAt(j) == 'i' || subword.charAt(j) == 'o' || subword.charAt(j) == 'u')
					{
						flag = false;
					}
				}
				if (flag == true)
				{
					res[1]++;
					break;
				}
			}
		}
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}