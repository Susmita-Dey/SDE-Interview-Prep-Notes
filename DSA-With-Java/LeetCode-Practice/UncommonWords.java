public class UncommonWords {
    public static void uncommonFromSentences(String s1, String s2) {
        String[] temp1 = s1.split(" ");
        String[] temp2 = s2.split(" ");

        for (String a : temp1)
            System.out.println(a);

        // return temp1;
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        // String[] words = uncommonFromSentences(s1, s2);
        uncommonFromSentences(s1, s2);
    }
}
