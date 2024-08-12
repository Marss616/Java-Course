public class PrimitiveReferenceTypes {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x; // y is a copy of x's value
        x = 2; // Changing x does not affect y
        System.out.println(y); // y still holds the original value of x, which is 1
    }
}
