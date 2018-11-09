package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanFile = new Scanner(new File("Imports.txt"));
        int maxIndx = -1;
        String text[] = new String[1000];

        String first[] = new String [100];
        String last[] = new String[100];
        int average[] = new int[100];
        int absences[] = new int[100];
        int classSize = 0;
        int classGradeTotal = 0;
        double classAverage = 0;
        int stop = 0;
        boolean stopp = false;

        Scanner scanFileAgain;
        scanFile.nextLine();
        while(scanFile.hasNext()){
            maxIndx++;
            text[maxIndx] = scanFile.useDelimiter("\\t").nextLine() + "\t";
            text[maxIndx] = text[maxIndx].replace("%", "");
        }
        scanFile.close();

        for (int i = 0; i < maxIndx; i++){
            scanFileAgain = new Scanner(text[i]);
            scanFileAgain.useDelimiter("\\t");
            first[i] = scanFileAgain.next();
            last[i] = scanFileAgain.next();
            average[i] = Integer.parseInt(scanFileAgain.next());
            absences[i] = Integer.parseInt(scanFileAgain.next());
            stop++;
        }
        for(int b = 0; b <= stop; b++) {
        classSize++;
        classGradeTotal += average[b];
        classAverage = classGradeTotal / classSize;
        }
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        for (int z = 0; z <= stop; z++)
        if (average[z] >= 90){
            A++;
        }else if (average[z] >= 80 && average[z] < 90){
            B++;
        }else if (average[z] >= 70 && average[z] < 80){
            C++;
        }else if (average[z] >= 60 && average[z] < 70){
            D++;
        }else {
            F++;
        }

        System.out.println("The Average Grade in the class is " + classAverage);
        System.out.println("There were " + A + " A's, "
                + B + " B's, "
                + C + " C's, "
                + D + " D's, "
                +  " and " + F + " F's");
        int place = 0;

        while (stopp == false){
            System.out.println("If you would like to find a student, type their name. If not, hit 0.");
            Scanner kbsreader = new Scanner(System.in);
            String response = kbsreader.nextLine();
            for (int k = 0; k == stop; k++){
               if(response.equalsIgnoreCase("0")) {
                   break;
               }else if(response.equals(first[k])){
                   place = k;
                }
            }
            if (place == -1){
                System.out.println("Type another name");
            }else {
                System.out.println("Student: " + first[place] + "" + last[place]);
                System.out.println("Average: " + average[place]);
                System.out.println("Absences: " + absences[place]);
                if (average[place] < 70 && absences[place] >= 5){
                    System.out.println(first[place] + " may be hurting their grade by missing class!");

                }
            }
            }
            }
        }





