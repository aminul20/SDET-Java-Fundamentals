//2.Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)
package ifelse_forloop;

import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        float   data_structure, java, math, english, mark=0, point=0, points=0, gpa;
        //float point1, point2, point3, point4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Mark of \"Data Structure\"=");
        data_structure = sc.nextFloat();
        System.out.println("Input Mark of Java=");
        java = sc.nextFloat();
        System.out.println("Input Mark of Mathematics=");
        math = sc.nextFloat();
        System.out.println("Input Mark of English=");
        english = sc.nextFloat();

        for (int i=1; i<=4; i++)
        {
            if (i==1)
                mark = data_structure;
            else if(i==2)
                mark = java;
            else if(i==3)
                mark = math;
            else if(i==4)
                mark = english;

            if(mark>=90 && mark<=100)
                //A
                point = 4.00f;
            else if(mark>=86 && mark<=89)
                //A-
                point = 3.67f;
            else if(mark>=82 && mark<=85)
                //B+
                point = 3.33f;
            else if(mark>=78 && mark<=81)
                //B
                point = 3.00f;
            else if(mark>=74 && mark<=77)
                //B-
                point = 2.67f;
            else if(mark>=70 && mark<=73)
                //C+
                point = 2.33f;
            else if(mark>=66 && mark<=69)
                //C
                point = 2.00f;
            else if(mark>=62 && mark<=65)
                //C-
                point = 1.67f;
            else if(mark>=58 && mark<=61)
                //D+
                point = 1.33f;
            else if(mark>=55 && mark<=61)
                //D
                point = 1.00f;
            else if(mark>=0 && mark<=54)
                point = 0.0f;

            points = points + point;
        }

        gpa = points/4;
        float roundOff = Math.round(gpa * 100.0f) / 100.0f;
        System.out.println("Your GPA: "+roundOff);
//        System.out.println("Your GPA: "+gpa);

    }
}
