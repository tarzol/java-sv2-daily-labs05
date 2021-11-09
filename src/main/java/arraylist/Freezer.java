package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("cukor");
        System.out.println(foodList);
        foodList.add(1,"étolaj");
        foodList.add("só");
        foodList.add(3,"liszt");
        foodList.add("hús");
        System.out.println(foodList);
        foodList.remove("cukor");
        foodList.remove("liszt");
        System.out.println(foodList);
    }
}
