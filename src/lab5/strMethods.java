package lab5;

import java.util.Arrays;
import java.util.Locale;

public class strMethods {

    public String findLongestWord(String text) {

        String[] words = text.split("\\W+");
        String longestWord = "";

        if (text != null && !text.isEmpty() ) {
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    public boolean isPoli(String polin){
        polin = polin.toLowerCase();

        int left = 0;
        int right = polin.length() - 1;

        while (left < right){
            if (polin.charAt(left) != polin.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String censore(String text2) {

        text2 = text2.toLowerCase();
        String[] split = text2.split(" ");

        StringBuilder censored = new StringBuilder();

        if (text2 != null && !text2.isEmpty() ) {
            for (String s : split) {
                if (s.equals("бяка")) {
                    censored.append("[вырезано цензурой]");
                } else {
                    censored.append(s);
                }
                censored.append(" ");
            }
        }
        return censored.toString();
    }
    public int occurrence(String parent, String sub){
        int count = 0;
        int i = 0;
        if (parent != null && !parent.isEmpty() && sub != null && !sub.isEmpty() ) {
            while ((i = parent.indexOf(sub,i)) != -1){
                count++;
                i += sub.length();
            }
        }
        return count;
    }

    public String reverse (String text3){
        StringBuilder reversed = new StringBuilder(text3);

        reversed.reverse();

        return reversed.toString();
    }
}
