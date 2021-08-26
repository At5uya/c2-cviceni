package cz.educanet.praha;

import cz.educanet.praha.school.Class;
import cz.educanet.praha.school.School;
import cz.educanet.praha.school.Student;

public class SchoolCountStudentsFromClassByName {

    public static int countStudentsFromClassByItsName(School school, String className) {

        int pocetStudentu = 0;
        Class[] tridy = school.classes;
        for (int i = 0; i < tridy.length; i++){
            Class trida = tridy[i];
            Student[]students = trida.students;
            if (trida.name.equals(className)){
                pocetStudentu += students.length;
            }


        }
        return pocetStudentu;







    }
}
