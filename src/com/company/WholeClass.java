package com.company;
import java.util.*;
import java.io.*;
/**
 * Created by bm846 on 11/5/18.
 */
public class WholeClass {
    public int percentTotal;
    public int classAverages;
    public String letter;
    public int a;
    public int b;
    public int c;
    public int d;
    public int f;
    public Students classAverage(){
       percentTotal = 0;
       for (int i = 0; i < Students[i].length; i++){
        percentTotal += Students[i].percent;
       } classAverages = percentTotal/Students.length;
    return classAverages}

    public Students letterGrades(){
        for (int i = 0; i < Students[i].length; i++){
            if (Students[i].percent >= 90){
                letter = "A";
                a++;
            }else if (Students[i].percent >= 80 && Students[i].percent < 90){
                letter = "B";
                b++;
            }else if (Students[i].percent >= 70 && Students[i].percent < 80){
                letter = "C";
                c++;
            }else if (Students[i].percent >= 60 && Students[i].percent < 70){
                letter = "D";
                d++;
            }else (Students[i].percent < 60){
                letter = "F";
                f++
            }
        }
    return a++;
    }
}

