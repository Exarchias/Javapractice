/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.*;

/**
 *
 * @author cobra
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the name of the Student");
        String studentName = in.nextLine();
        System.out.println("Enter the year of the Student");
        String studentYear = in.nextLine();
        System.out.println("How much will the student spent on materials?");
        int studentMaterial = in.nextInt();
        System.out.println("How many hours has the student booked?");
        int studentHours = in.nextInt();
        System.out.println("How much do every hour cost?");
        int hoursCost = in.nextInt();
        System.out.println("Will the student live in a Dorm? (y/n)");
        String studentDorm = in.next();
        System.out.println("How many weeks the student will stay?");
        int studentWeeks = in.nextInt();
        printMethod(studentName, studentYear, studentMaterial, studentHours, hoursCost, studentDorm, studentWeeks);
    }
    
    public static void printMethod(String sName, String sYear, int sMaterial, int sHours, int hCost, String sDorm, int  sWeeks){
        int total = 0;
        System.out.println("Students name is " + sName);
        System.out.println("Students year is " + sYear);
        System.out.println("Students initial material cost is " + sMaterial);
        System.out.println("the student will study for  " + sHours + " hours in total");
        System.out.println("For every hour the cost will be " + hCost);
        System.out.println("Will the Student have dorm? The answer is " + sDorm);
        System.out.println("The Student will stay " + sWeeks + "weeks in total");
        if (sDorm == "y"){
            total += 250 * sWeeks;
        }
        total += sHours * hCost;
        total += sMaterial;
        System.out.println("Students total cost is " + total);
        
    }
    
}
