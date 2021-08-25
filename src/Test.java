import java.util.Scanner;

public class Test {
    private final static String WORDS_ENDING_WITH_LETTER_E = "([a-zA-Z]+)(e|E)(\\W|$)";
    private final static String ARTICLE_REGEX_INSIDE = "\\W(a|A|The|the|An|an)\\W";
    private final static String DOUBLE_LETTER = "([a-z])\\1+";
    private final static String ARTICLE_REGEX_START_OR_END = "^(a|A|The|the|An|an)\\W|\\W(a|A|The|the|An|an)$";
    public static void main(String[] args) {
    String str = ReplaceFirst();
    str = ReplaceSecond(str);
    str = ReplaceThird(str);
    str = ReplaceFor(str);
        System.out.println(str);
    }
    public static String ReplaceFirst() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String str = in.nextLine();
        in.close();
        str = str.replaceAll("ci", "si");
        str = str.replaceAll("ce", "se");
        str = str.replaceAll("ck", "k");
        str = str.replaceAll("c", "k");
        return str;
    }
        public static String ReplaceSecond(String str) {
            str = str.replaceAll("ee", "i");
            str = str.replaceAll("oo", "u");
            str = str.replaceAll(DOUBLE_LETTER, "$1");
            return str;
        }
        public static String ReplaceThird(String str) {
        str = str.replaceAll(WORDS_ENDING_WITH_LETTER_E, "$1$3");
        return str;
    }

        public static String ReplaceFor(String str) {
        str = str.replaceAll(ARTICLE_REGEX_START_OR_END, "");
        str = str.replaceAll(ARTICLE_REGEX_INSIDE, " ");
        return str;
    }
}


