import java.util.ArrayList;
import java.util.List;

public class Grades {


    public static void main(String... args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        gradingStudents(grades).stream().forEach(System.out::println);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();

        grades.stream().forEach(grade -> {
            if (grade >= 38) {
                int nextNum = ((grade / 5) + 1) * 5;
                if (nextNum - grade < 3) {
                    finalGrades.add(nextNum);
                }
                if (nextNum - grade == 3) {
                    finalGrades.add(grade);
                }
            } else {
                finalGrades.add(grade);
            }

        });

        // OLD School
        /*for (Integer grade : grades) {
            if (grade >= 38) {
                int nextNum = ((grade / 5) + 1) * 5;
                if (nextNum - grade < 3) {
                    finalGrades.add(nextNum);
                }if(nextNum-grade == 3){
                    finalGrades.add(grade);
                }
            } else {
                finalGrades.add(grade);
            }

        }*/
        return finalGrades;
    }
}
