import java.util.ArrayList;
import java.util.List;

public class Grades {


    public static void main(String... args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(80);
        grades.add(96);
        grades.add(18);
        grades.add(73);
        grades.add(78);
        grades.add(60);
        grades.add(60);
        grades.add(15);
        grades.add(45);
        grades.add(15);
        grades.add(10);
        grades.add(5);
        grades.add(46);
        grades.add(87);
        grades.add(33);
        grades.add(60);
        grades.add(14);
        grades.add(71);
        grades.add(65);
        grades.add(2);
        grades.add(5);
        grades.add(97);
        grades.add(0);
        gradingStudents(grades).stream().forEach(System.out::println);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();

        grades.stream().forEach(grade -> {
             if (grade >= 38 && (grade%5) != 0) {
                int nextNum = ((grade / 5) + 1) * 5;
                if (nextNum - grade < 3) {
                    finalGrades.add(nextNum);
                }else if(nextNum-grade == 3){
                    finalGrades.add(grade);
                }else {
                    finalGrades.add(grade);
                }
            } else {
                finalGrades.add(grade);
            }

        });

        // OLD School
      /*  for (Integer grade : grades) {
            if (grade >= 38 && (grade%5) != 0) {
                int nextNum = ((grade / 5) + 1) * 5;
                if (nextNum - grade < 3) {
                    finalGrades.add(nextNum);
                }else if(nextNum-grade == 3){
                    finalGrades.add(grade);
                }else {
                    finalGrades.add(grade);
                }
            } else {
                finalGrades.add(grade);
            }

        }*/
        return finalGrades;
    }
}
