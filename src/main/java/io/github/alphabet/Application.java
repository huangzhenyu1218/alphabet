package io.github.alphabet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String tips1 = "input you choice number:\n1:remove 3 or more consecutive " +
                "characters are identical from your input string;" +
                "\n2:replace the consecutively identical characters" +
                " with character that comes before it alphabetically." +
                "\nelse:quit.";
        Scanner scan = new Scanner(System.in);
        String input = "";
        boolean isContinue = true;
        while (isContinue) {
            System.out.println(tips1);
            if (scan.hasNext()) {
                String str1 = scan.next();
                switch (str1) {
                    case "1":
                        System.out.println("Input (for eaxample \"aabcccbbad\"):");
                        input = scan.next();
                        AlphabetFactory unRepeatAlphabetFactory = new UnRepeatAlphabetFactory();
                        System.out.println("Output:");
                        unRepeatAlphabetFactory.createAlphabet(input);
                        break;
                    case "2":
                        System.out.println("Input (for eaxample \"abcccbad\"):");
                        input = scan.next();
                        AlphabetFactory aggregationAlphabetFactory = new AggregationAlphabetFactory();
                        System.out.println("Output:");
                        aggregationAlphabetFactory.createAlphabet(input);
                        break;
                    default:
                        isContinue = false;
                }
            }
        }

        scan.close();
    }
}
