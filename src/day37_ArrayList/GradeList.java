package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeList {
    public static void main(String[] args) {


    ArrayList<Integer> grades = new ArrayList<>();
    grades.addAll(Arrays.asList(100,90,75,85,65,8,55,85,45,79,73,35,47));

        ArrayList<Integer> gradeofA = new ArrayList<>(); // 90-100
        gradeofA.addAll(grades);
        gradeofA.removeIf(g -> g < 90);
        System.out.println("Number of student who gets A is " + gradeofA.size());

        ArrayList<Integer> gradeofB = new ArrayList<>(); // 80-89
        gradeofB.addAll(grades);
        gradeofB.removeIf(g -> g < 80 || g > 89);
        System.out.println("Number of student who gets B is " + gradeofB.size());

        ArrayList<Integer> gradeofC = new ArrayList<>(); // 70-79
        gradeofC.addAll(grades);
        gradeofC.removeIf(g -> g < 70 || g > 79);
        System.out.println("Number of student who gets C is " + gradeofC.size());

        ArrayList<Integer> gradeofD = new ArrayList<>(); // 60-69
        gradeofA.addAll(grades);
        gradeofD.removeIf(g -> g < 60 || g > 69);
        System.out.println("Number of student who gets D is " + gradeofD.size());

        ArrayList<Integer> gradeofF = new ArrayList<>(); // 0-59
        gradeofA.addAll(grades);
        gradeofA.removeIf(g -> g > 59);
        System.out.println("Number of student who fails is " + gradeofA.size());
}
 }