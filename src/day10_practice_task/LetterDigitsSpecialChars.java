package day10_practice_task;

import day05_practicet_tasks.EnglishAlphabets;

public class LetterDigitsSpecialChars {

    public static void main(String[] args) {

        String str="Wooden Spoon123!";
        String digit = "", letters = "", specialChars="";

        for(char eachChar : str.toCharArray()){
            if(Character.isLetter(eachChar)) {
                letters += eachChar;
            } else if(Character.isDigit(eachChar)) {
                digit += eachChar;
            }else {
                specialChars += eachChar;

              }
            }

        System.out.println("letters=" + letters);
        System.out.println("digits=" + digit);
        System.out.println("special chars=" + specialChars);

        }
    }
