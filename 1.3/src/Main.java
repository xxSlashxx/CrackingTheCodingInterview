import java.io.InputStream;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Test: Mr John Smith    , 13
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();

        String string1 = line.split(",")[0];
        String string2 = line.split(",")[1];

        System.out.println(getOutput(string1, Integer.valueOf(string2.trim())));
    }

    private static String getOutput(String pInput, int pInputLength)
    {
        char[] output = new char[pInput.length()];
        int newIndex = 0;

        for (int i = 0; i < pInputLength; i++)
        {
            char character = pInput.toCharArray()[i];

            if (character == ' ')
            {
                output[newIndex] = '%';
                output[newIndex + 1] = '2';
                output[newIndex + 2] = '0';
                newIndex = newIndex + 3;
            }
            else
            {
                output[newIndex] = character;
                newIndex++;
            }
        }

        return new String(output);
    }
}
