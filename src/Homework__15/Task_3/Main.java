package Homework__15.Task_3;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алиса", "ПО-11", 1));
        students.add(new Student("Иннокентий", "ЭМ-11", 1));
        students.add(new Student("Растислав", "ЭО-11", 1));
        students.get(0).setGrades("Ин.яз.",3);
        students.get(0).setGrades("Литература",4);
        students.get(1).setGrades("Физ-ра",4);
        students.get(2).setGrades("Физика",2);
        printStudent(students, 1);
        removeStudentsWhoseGradesBelow3(students);

    }

    private static void printStudent(List<Student> students, int course) {
        System.out.println("Студенты "+ course +" курса :");
        students.forEach(student -> {
            if (student.getCourse() == course)
                System.out.println(student.getName());
        });
    }

    private static void removeStudentsWhoseGradesBelow3(List<Student> students) {

        for(int i=0; i<students.size();i++) {
            if (students.get(i).getAverageGrade() < 3.0 && students.get(i).getAverageGrade()!=0.0) {
                System.out.println("Студент " + students.get(i).getName()+" отчислен, т.к. средний бал меньше 3");
                students.remove(i);
            } else if(students.get(i).getAverageGrade()>=3.0) {
                System.out.println("Студент " + students.get(i).getName()+" переведён на следующий курс, средний бал выше 3");
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
            else {
                System.out.println(students.get(i).getName()+" don't have grades");
            }
        }
    }


}