import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<Integer> grades;


// The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.


    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;

        for (Integer grade : grades) {

            total += grade;
        }
        return total / grades.size();
    }
}
