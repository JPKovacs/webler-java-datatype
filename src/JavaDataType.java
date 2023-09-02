import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JavaDataType {
    public static void main(String[] args) {

        // primitive types

        // size 8 bits
        // range -128 to 127
        // default value 0
        byte num1 = 100;

        // size 16 bits
        // range -32768 to 32767
        // default value 0
        short num2 = 10000;

        // size 32 bits
        // range -2^31 to 2^31-1 (-2147483648 to 2147483647)
        // default value 0
        int num3 = 1000000000;

        // size 64 bits
        // range -2^63 to 2^63-1 (-9223372036854775808 to 9223372036854775807)
        // default value 0
        long num4 = 1000000000000000000L; // L at the end!!! (long)

        // size 32 bits
        // range 3.4e−038 to 3.4e+038 (positive or negative) -> 1.40239846e-45f to 3.40282347e+38f
        // default value 0.0
        float num5 = 3.14f; // f at the end!!! (float)

        // size 64 bits
        // range 1.7e−308 to 1.7e+308 (positive or negative) -> 4.94065645841246544e-324 to 1.79769313486231570e+308
        // default value 0.0
        double num6 = 3.14;

        // size 16 bits
        // range '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
        // default value '\u0000'
        char letter = 'a';

        // size 1 bit
        // range true or false
        // default value false
        boolean isValid = true; // or isActive, isAlive, hasPassed, etc.

        // Wrapper class of the primitives
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean

        // how to convert from byte num1 = 100; a Wrapper class
        Byte num11 = num1; // auto-boxing
        // num1 -> primitive!
        // num11 -> primitveből lett Wrapper segítségével nem primitive!
        num11.byteValue();
        num11.toString();
        // num1.toString(); // nem lehet, mert primitív típus

        String name = "John";
        String name2 = "john"; // 'john' -> char, "john" -> String
        String name3 = "John";
        String name4 = new String("John"); // new String() -> mindig új objektumot hoz létre (heap-en)

        boolean isSame1 = name == name2; // false (primitív típust össze lehet hasonlítani ==-vel)
        boolean isSame11 = name == name3; // true
        boolean isSame12 = name == name4; // false
        boolean isSame2 = name.equals(name2); // false (Wrapper típust, nem primitivet össze lehet hasonlítani .equals-szel) -> ez metódus
        boolean isSame3 = name.equalsIgnoreCase(name2); // true

        System.out.println("John & john is the same (==): " + isSame1); // false
        System.out.println("John & John is the same (==): " + isSame11); // true
        System.out.println("John & John (as new String) is the same (==): " + isSame12); // false

        System.out.println("John & john is the same (equals): " + isSame2); // false
        System.out.println("John & john is the same (equalsIgnoreCase): " + isSame3); // true

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.contains(1);
        numbers.remove(0);
        int size = numbers.size();

        int[] nums = {1, 2, 3, 4, 5};
        int length = nums.length;

        List<Integer> nbrs = new ArrayList<>();
        nbrs.toArray();
    }
}