/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1partb;

import com.mycompany.assignment1parta.Module;
import com.mycompany.assignment1parta.Student;
import com.mycompany.assignment1parta.programme;
import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author Owner
 */

public class StudentTester {
    
    public static void main(String[] Args) {
        /**
         * **************** Define Student **********************
         */
        Student s1= new Student("youssouf","moussa",32,new LocalDate(1987, 05, 29),"4BP","CT417", 11111111);
        Student s2 = new Student("tom","joe", 49, new LocalDate(1987, 05, 29), "4BP", "CSIT",22222222);
        Student s3 = new Student("jerry","conor", 50, new LocalDate(1987, 05, 29), "4BP", "CSIT",33333333);
        
        /**
         * *************** All Student *************************
         */
        ArrayList<Student> group1 = new ArrayList<Student>();
        group1.add(s1);
        group1.add(s2);



        /**
         * *************** CS&IT and BP *************************
         */
        ArrayList<Student> group2 = new ArrayList<Student>();
        group2.add(s1);
        group2.add(s3);

        /**
         * *************** Module Definitions ******************
         */
        Module CT417 = new Module("Software Eng.3", "CT417", group1,"CSIT");
        Module CT401 = new Module("Machine Learning", "CT401", group2,"CSIT");


        /**
         * ************** CS Modules ***************************
         */
        ArrayList<Module> CSmodules = new ArrayList<Module>();
        CSmodules.add(CT417);
        CSmodules.add(CT401);
        LocalDate start = new LocalDate(2016, 9, 5);
        LocalDate end = new LocalDate(2017, 5, 31);
        programme CSIT = new programme("CSIT", start, end,  CSmodules);


        /**
         * **** Prints Student name, Course & modules *********
         */
        CSIT.printStudents();

    }

}
