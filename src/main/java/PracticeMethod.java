import java.util.Arrays;

public class PracticeMethod {


    public static boolean isAnagram(String wordA, String wordB) {
        char[] charFromWordA = wordA.toCharArray();
        char[] charFromWordB = wordB.toCharArray();
        Arrays.sort(charFromWordA);
        Arrays.sort(charFromWordB);

        return Arrays.equals(charFromWordA,charFromWordB);
    }
}