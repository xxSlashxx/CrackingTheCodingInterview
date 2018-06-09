import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        String stringToCheck = scanner.next();
        System.out.println(stringToCheck);
        System.out.println(hasOnlyUniqueCharacters(stringToCheck));
    }

    private static boolean hasOnlyUniqueCharacters(String pStringToCheck)
    {
        ArrayList<String> uniqueCharacters = new ArrayList<>();

        for (int i = 0; i < pStringToCheck.length(); i++)
        {
            String character = String.valueOf(pStringToCheck.charAt(i));

            if (uniqueCharacters.contains(character))
            {
                return false;
            }

            uniqueCharacters.add(character);
        }

        return true;
    }
}
