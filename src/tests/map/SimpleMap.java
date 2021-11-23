package tests.map;
import java.util.Map;
import java.util.HashMap;

public class SimpleMap {
    public static void main(String[] args) {

        Map<String, Integer> salary = new HashMap<>();
        salary.put("Horianinskyi",2000);
        salary.put("Maskin", 1500);

        System.out.println(salary);
        System.out.println("--------------------------------------------------------------------------------");

        for(Map.Entry<String, Integer> temp : salary.entrySet()){
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

    }
}
