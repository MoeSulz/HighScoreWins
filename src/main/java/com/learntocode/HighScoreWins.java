package com.learntocode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter final score: ");
        String finalScore = input.nextLine();

        String[] scores = finalScore.split(Pattern.quote("\\|"));
        String homeName = scores[0].split(":")[0];
        String visitor = scores[1].split(":")[1];
        int homeScore = Integer.parseInt(scores[1].split(":")[0]);
        int visitorScore = Integer.parseInt(scores[1].split(":")[1]);


        if (homeScore > visitorScore){
            System.out.print(homeName + " is the winner!");
        } else
            System.out.print(visitor + " is the winner!");

    }
}
