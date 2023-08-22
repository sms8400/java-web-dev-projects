import java.util.HashMap;
import java.util.Map;

//public class EmployeeID {
//
//    public static void main(String args[]){
//
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(10,"Daniel");
//        map.put(4,"Peter");
//        map.put(1,"Claudia");
//        map.put(0, "Sarah");
//
//        for(Map.Entry<Integer,String> entry : map.entrySet()){
//            System.out.println(entry.getKey() +" -> "+entry.getValue());
//        }
//
//    }
//}
public class EmployeeID {
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("Test1", 1234);
        employees.put("Test2", 4567);
        employees.put("Test3", 78910);
        System.out.println(employees.get("Test2"));
        System.out.println(employees.containsKey("Test4"));
        System.out.println(employees.containsValue(78910));
    }
}