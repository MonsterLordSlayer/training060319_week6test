package com.example.training060319_week6test;



import android.util.Log;

import java.util.ArrayList;

public class PigLatin {
    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(String.format("%s",c));
    }

    public static boolean isConsanant(char c){
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(String.format("%s",c));
    }
    public static String convert(String phrase){
        StringBuilder returnphrase=new StringBuilder();

        String ay="ay";
        ArrayList<StringBuilder> stringBuilders=new ArrayList<>();
        StringBuilder stringbuilder=new StringBuilder();

        char[] phrasechararray=phrase.toCharArray();
        for (char c:phrasechararray){
            if (c!=' '){
                stringbuilder.append(c);
            }
            if (c==' '){
                stringBuilders.add(stringbuilder);
                stringbuilder=new StringBuilder();
            }

        }
        stringBuilders.add(stringbuilder);
        for (StringBuilder sb:stringBuilders){
            StringBuilder consonantblock=new StringBuilder();
            for (int i=0;i<sb.length();i++){

                if (isConsanant(sb.charAt(i))){
                    consonantblock.append(sb.charAt(i));
                    sb.replace(i,i+1,"");
                    i=0;
                }

                else break;
            }
            sb.append(consonantblock);

        }
        for (StringBuilder sb:stringBuilders){
            returnphrase.append(sb);
            returnphrase.append(ay);
            returnphrase.append(" ");
        }




        return returnphrase.toString();
    }
    public static void main(String[] args){
        System.out.println(convert("Check"));
    }
}
