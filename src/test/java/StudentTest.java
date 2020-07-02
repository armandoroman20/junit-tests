import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp(){
        student = new Student(1L, "John");

    }

    @Test
    public void testInitialProperties(){
        assertEquals(1L, student.getId());
        assertEquals("John", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade(){
        assertEquals(0, student.getGrades().size());
        student.addGrade(100);
        assertEquals(1,student.getGrades().size());
        assertEquals(100, student.getGrades().get(0), 0);
    }
    @Test
    public void testGetGradeAverage(){
        student.addGrade(0);
        assertEquals(0, student.getGradeAverage(), 0);
        student.addGrade(100);
        assertEquals(50, student.getGradeAverage(), 0);
    }
}




