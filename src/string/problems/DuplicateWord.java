package string.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming language. Java is also an Island of Indonesia. Java is widely used Language.";

        int count;
       st = st.toLowerCase();
        //System.out.println(st);
        String word[] = st.split(" ");
        System.out.println("Duplicate words in a given string are: ");
        for (int i = 0; i < word.length; i++) {
            count = 1;
            for (int j = i+1 ; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    word[j] = "0";
                }
            }
            if (count > 1 && word[i]!="0")
                System.out.println(word[i]);
            }


        }
    }