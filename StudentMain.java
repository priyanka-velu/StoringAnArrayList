import java.util.ArrayList;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student(101, "Sarah", "123 Rose St"));
        studentList.add(new Student(102, "Alice", "456 Sunflower St"));
        studentList.add(new Student(103, "Darrel", "567 Valley St"));
        studentList.add(new Student(104, "John", "101 Lily St"));
        studentList.add(new Student(105, "Carol", "234 Wildflower St"));
        studentList.add(new Student(106, "Bob", "789 Jasmine St"));
        studentList.add(new Student(107, "Gerald", "345 Shine St"));
        studentList.add(new Student(108, "Faith", "012 Green St"));
        studentList.add(new Student(109, "Ethan", "891 Waterfall St"));
        studentList.add(new Student(110, "Harry", "678 Sun St"));
        
        // sorting by name
        selectionSort(studentList, new NameComparator());
        System.out.println("Sorted by Name:");
        printStudentList(studentList);

        // sorting by roll number
        selectionSort(studentList, new RollNoComparator());
        System.out.println("\nSorted by Roll No:");
        printStudentList(studentList);
    }

    // selection sort method
    private static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }

    // printing the student list
    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.getName() + " - Roll No: " + student.getRollNo());
        }
    }
}
