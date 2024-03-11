import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("Claudio", 30));
        studentArrayList.add(new Student("Carlo", 20));
        studentArrayList.add(new Student("Claudia", 29));
        studentArrayList.add(new Student("Marta", 31));

        System.out.println("Lista degli studenti");
        for (Student student : studentArrayList) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }
}