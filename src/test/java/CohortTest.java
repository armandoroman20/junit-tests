import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    private Student a;
    private Student b;
    private Cohort Ganymede;

    @Before
    public void setUp(){
        a = new Student(1L, "John");
        b = new Student(1l, "brandon");
        Ganymede = new Cohort();
    }

    @Test
    public void testCanAddStudent(){
        Ganymede.addStudent(a);
        assertFalse(Ganymede.getStudents().isEmpty());
    }

    @Test
    public void testGetCurrentListOfStudents(){


        Ganymede.addStudent(a);
        assertEquals(1, Ganymede.getStudents().size(), 0);

        Ganymede.addStudent(b);
        assertEquals(2, Ganymede.getStudents().size(), 0);

    }

    @Test
    public void testGetCorrectAverage(){

        a.addGrade(100);
        a.addGrade(50);

        b.addGrade(75);
        b.addGrade(50);

        Ganymede.addStudent(a);
        Ganymede.addStudent(b);

        Ganymede.getCohortAverage();
        System.out.println(Ganymede.getCohortAverage());
        assertEquals(68.75, Ganymede.getCohortAverage(), 0);
    }
}
