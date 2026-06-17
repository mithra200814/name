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
/*
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
            if (s.name.equals("mithra")) {
                s.marks = 95;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("mithra", 101, 80));
        students.add(new Student("narthika", 102, 75));
        students.add(new Student("nivetha", 103, 90));
        students.add(new Student("sweatha", 104, 85));
        students.add(new Student("menga", 105, 88));


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
 */
public class day10{
    static void main(){
        String name= null;
        try {
            System.out.println(name.charAt(0));
            System.out.println(45/0);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("This will always execute");
            name="";
        }
        System.out.println("Still running");
        System.out.println("Name :"+name);
    }
}




































































































































































































































































































































































































































































































