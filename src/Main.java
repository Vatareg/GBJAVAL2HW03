import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] colors = {"White", "Black", "Red", "Blue", "Orange", "Black", "Pink",
                "White", "Red", "White", "Red", "Blue", "Black", "Green",
                "Blue", "Dark", "Black", "Dark", "Pink", "Green"};
        System.out.println("Starting array: " + Arrays.asList(colors));
        Set<String> colorsUnique = new HashSet<>(Arrays.asList(colors));
        System.out.println("List of unique words of the starting array: " + colorsUnique);
        Map<String, Integer> colorsRepeat = new HashMap<>();
        for (String color : colors) {
            if (colorsRepeat.containsKey(color)) {
                colorsRepeat.put(color, colorsRepeat.get(color) + 1);
            } else {
                colorsRepeat.put(color, 1);
            }
        }
        System.out.println("Number of repetitions of each word: " + colorsRepeat + "\n");
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Unit1", "+000000000001");
        telephoneDirectory.add("Unit2", "+000000000002");
        telephoneDirectory.add("Unit3", "+000000000003");
        telephoneDirectory.add("Unit4", "+000000000004");
        telephoneDirectory.add("Unit5", "+000000000005");
        telephoneDirectory.add("Unit6", "+000000000006");
        telephoneDirectory.add("Unit7", "+000000000007");
        telephoneDirectory.add("Unit8", "+000000000008");
        telephoneDirectory.add("Unit9", "+000000000009");
        telephoneDirectory.add("Unit10", "+000000000010");
        telephoneDirectory.add("Unit11", "+000000000011");
        telephoneDirectory.add("Unit12", "+000000000012");
        System.out.println(telephoneDirectory.get("Unit4"));
        System.out.println(telephoneDirectory.get("Unit6"));
        System.out.println(telephoneDirectory.get("Unit1"));
        System.out.println(telephoneDirectory.get("Unit5"));
        System.out.println(telephoneDirectory.get("Unit12"));
    }
}
