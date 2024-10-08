import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int maximum = 0;
        int currentSize = 0;

        for (int i = 0; i < s.length(); i++) {

            while(set.contains(s.charAt(i))){
                set.removeFirst();
                currentSize--;
            }

            set.add(s.charAt(i));
            currentSize++;
            if(maximum < currentSize){
                maximum = currentSize;
            }

        }
        return  maximum;
    }
}