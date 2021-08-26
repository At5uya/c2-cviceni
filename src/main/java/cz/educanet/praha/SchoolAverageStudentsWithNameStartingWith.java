package cz.educanet.praha;

import cz.educanet.praha.school.Class;
import cz.educanet.praha.school.School;
import cz.educanet.praha.school.Student;

public class SchoolAverageStudentsWithNameStartingWith {




    public static double averageAgeOfStudentsWithNameStartingWith(School s, char startsWith)
    {

        /*
        Student pepa = new Student("Pepa",15);
        Student jitka = new Student("Jitka",16);
        Student [] students = new Student [30];
        students[0] = pepa;
        students[1] = jitka;
        Class trida3B = new Class("3B",students);
        Class [] classes = new Class[10];
        classes[0]=trida3B;
        School s2 = new School(classes);
        */

        double celkovejVek = 0;
        int pocetStudentu = 0;
        Class[] classes = s.classes;
        for (int i = 0; i < classes.length; i++){
            Class trida = classes[i];
            Student[]studenti = trida.students;
            for (int j = 0; j < studenti.length;j++){
                Student student = studenti[j];
                String jmeno = student.name;
                char c = jmeno.charAt(0);
                if (c == startsWith){
                    int vek = student.age;
                    celkovejVek += vek;
                    pocetStudentu++;

                }
            }
        }
        double prumer = celkovejVek/pocetStudentu;
        return prumer;







    }

}
