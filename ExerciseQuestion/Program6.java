package com.ExerciseQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            System.out.print("Enter Permutable String: ");
            String permute = s.next();
            System.out.print("Enter word: ");
            String word = s.next();
            ArrayList<Boolean> bool = new ArrayList<>();
            permutation("", permute, word, bool);
            for (int i = 0; i < bool.size(); i++) {
                if (bool.get(i) == true) {
                    System.out.println("yes");
                    return;
                }

            }
            System.out.println("No");


    }

    public static void permutation(String processed,String unprocessed,String word,ArrayList<Boolean>bool)
    {
        if(unprocessed.isEmpty())
        {
            bool.add(checkpermute(processed,word));
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for(int i=0;i<=processed.length();i++)
        {
            String first=processed.substring(0,i);
            String second = processed.substring(i);
            permutation(first+ch+second,unprocessed,word,bool);
        }
    }
    public static boolean checkpermute(String permute, String word)
    {
        if(word.contains(permute))
        {
            return true;
        }
       return false;
    }
}
