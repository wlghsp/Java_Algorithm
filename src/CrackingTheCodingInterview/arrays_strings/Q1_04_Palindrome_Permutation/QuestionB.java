package CrackingTheCodingInterview.arrays_strings.Q1_04_Palindrome_Permutation;

public class QuestionB {


    private static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = Common.getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x]% 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }


    public static void main(String[] args) {
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(pali));
    }
}