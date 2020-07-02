import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testInitialProperties(){
        Student student = new Student(1L, "John");
        assertEquals(1L, student.getId());
        assertEquals("John", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }
    @Test
    public void testAddGrade(){
        Student s = new Student(1L, "John");
        assertEquals(0, s.getGrades().size());
        s.addGrade(100);
        assertEquals(1,s.getGrades().size());
        assertEquals(100, s.getGrades().get(0), 0);
    }
    @Test
    public void testGetGradeAverage(){
        Student student = new Student(1L,"John");
        student.addGrade(0);
        assertEquals(0, student.getGradeAverage(), 0);
        student.addGrade(100);
        assertEquals(50, student.getGradeAverage(), 0);
    }
}




