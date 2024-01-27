import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getRollNo(), student2.getRollNo());
    }
}
