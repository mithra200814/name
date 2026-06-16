import java.util.ArrayList;
public class day10 {
    static void main() {
        String[] StudentList = {"nivetha", "narthika", "sweatha","ram","menga"};
        System.out.println(StudentList.length);
        ArrayList<String> list=new ArrayList();
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