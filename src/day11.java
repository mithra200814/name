import java.util.HashMap;
import java.util.Map;

/*import java.util.HashSet;
import java.util.Set;

public class day11 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("mithra");
        set.add("narthika");
        set.add("nivetha");
        set.add("mithra");
        System.out.println("set:");
        for(String s:set){
            System.out.println(s);
        }
    }

}
*/
public class day11{
    public static void main(String[] args){
       Map<String, Integer> person = new HashMap<>();
       person.put("ram",89);
       person.put("john",78);
       person.put("Aravindh",67);
       person.put("ramesh",90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }

}
























































































