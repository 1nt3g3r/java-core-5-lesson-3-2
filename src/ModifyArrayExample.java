import java.util.Arrays;

public class ModifyArrayExample {
    public static void main(String[] args) {
        String[] fruits = {
                "apple",
                "banana",
                "mango"
        };

        System.out.println(Arrays.toString(fruits));

        for(int i = 0; i < fruits.length; i++) {
            fruits[i] = "Fruit " + fruits[i];
        }

        System.out.println(Arrays.toString(fruits));


//        for(int i = 0; i < fruits.length; i++) {
//            String fruit = fruits[i];
//
//            char firstLetter = fruit.charAt(0);
//            String remainder = fruit.substring(1);
//
//            String fixedFruitName = Character.toUpperCase(firstLetter) + remainder;
//
//            fruits[i] = fixedFruitName;
//        }

    }
}
