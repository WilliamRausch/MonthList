package com.example;
//public String[] englishname = new String[] {"january", "february", "march", "april", "may", "june","july", "august", "september", "october", "november", "december"} ;
import java.util.Scanner;
public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    private final int monthNumber;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public static void monthList(Month month, String[] englishname) {
        for(int i = month.monthNumber; i<12; i++){
            System.out.println(englishname[i]);
        }
    }

    public static void main(String[] args){
        String[] englishname = new String[] {"january", "february", "march", "april", "may", "june","july", "august", "september", "october", "november", "december"} ;

        for(int i = 0; i<englishname.length; i++){
            System.out.println(englishname[i]);
        }
        Month month = Month.JANUARY;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month");
        String userInput = scan.nextLine();
        String input = userInput;
        if(input.equals("JANUARY")){
            month = Month.JANUARY;
        }else if(input.equals("FEBRUARY")){
            month = Month.FEBRUARY;
        }else if(input.equals("MARCH")){
            month = Month.MARCH;
        }else if(input == "APRIL"){
            month = Month.APRIL;
        }else if(input == "MAY"){
            month = Month.MAY;
        }else if(input == "JUNE"){
            month = Month.JUNE;
        }else if(input == "JULY"){
            month = Month.JULY;
        }else if(input == "AUGUST"){
            month = Month.AUGUST;
        }else if(input == "SEPTEMBER"){
             month = Month.SEPTEMBER;
        }else if(input == "OCTOBER"){
            month = Month.OCTOBER;
        }else if(input == "NOVEMBER"){
            month = Month.NOVEMBER;
        }else if(input == "DECEMBER"){
            month = Month.DECEMBER;
        }else{
            System.out.println("invalid");
        }
        monthList(month, englishname);

    }
}
