import java.util.LinkedList;

//import java.util.LinkedList;
/*
public class day10 {

}
    /*
    static void main() {
        //String[] StudentList = {"nivetha", "narthika", "sweatha","ram","menga"};]
        ArrayList<String> list=new ArrayList();
        //System.out.println(StudentList.length);
        //ArrayList<String> list=new ArrayList();
        list.add("nivetha");
        list.add("narthika");
        list.add("sweatha");
        list.add("ram");
        list.add("menga");
        for(String s:list){
            System.out.println(s);
        }
        list.add("monisha");
        list.remove("ram");                
        System.out.println();
        for(String s:list){
            System.out.println(s);
        }
    }
}
*/
/*
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("mithra");
        queue.add("narthika");
        queue.add("nivetha");
        queue.add("sweathasri");
        queue.add("mengasri");
        while (queue.size()>0) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue) {
        String removed = queue.removeFirst();
        System.out.println("Removed:" + queue.remove());
    }
}
*/
/*
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Sweatha");
        queue.add("Menaga");
        queue.add("Narthika");
        queue.add("Mithra");
        queue.add("Nivetha");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}
*/

import java.util.LinkedList;

public class day10 {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Deepa")) {
                s.marks = 95;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Arun", 101, 80));
        students.add(new Student("Bala", 102, 75));
        students.add(new Student("Charan", 103, 90));
        students.add(new Student("Deepa", 104, 85));
        students.add(new Student("Esha", 105, 88));


        removeStudent(students);

        updateStudent(students);


        System.out.println("Student Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks + " "
            );
        }
    }
}
