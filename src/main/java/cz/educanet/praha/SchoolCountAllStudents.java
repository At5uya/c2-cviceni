package cz.educanet.praha;

import cz.educanet.praha.school.Class;
import cz.educanet.praha.school.School;
import cz.educanet.praha.school.Student;

public class SchoolCountAllStudents {

    public static int countAllStudents(School school) {

        int pocetStudentu = 0;
        Class[] tridy = school.classes;
        for (int i = 0; i < tridy.length; i++){
            Class trida = tridy[i];
            Student[]students = trida.students;
            pocetStudentu += students.length;

            /*

            for (int j = 0; j < students.length; j++){
            pocetStudentu++;
            }

             */


        }
        return pocetStudentu;









    }
}
