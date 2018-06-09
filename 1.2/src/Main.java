import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        String string1 = scanner.next();
        String string2 = scanner.next();
        System.out.println(isPermutation(string1, string2));
    }

    private static boolean isPermutation(String pString1, String pString2)
    {
        if (pString1.length() != pString2.length())
        {
            return false;
        }

        HashMap<String, Integer> characterCountMap = new HashMap<>();

        for (int i = 0; i < pString1.length(); i++)
        {
            String character = String.valueOf(pString1.charAt(i));

            if (characterCountMap.containsKey(character))
            {
                Integer count = characterCountMap.get(character);
                count++;
                characterCountMap.put(character, count);

            }
            else
            {
                characterCountMap.put(character, 1);
            }
        }

        System.out.println(characterCountMap);

        for (int i = 0; i < pString2.length(); i++)
        {
            String character = String.valueOf(pString2.charAt(i));

            if (!characterCountMap.containsKey(character))
            {
                return false;
            }
        }

        return true;
    }
}
