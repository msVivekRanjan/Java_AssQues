public class A3_Q2 {
    public static void main(String[] args) {
        try {
            String[] colors = {"Red", "Blue", "Green"};
            System.out.println(colors[5]); // ArrayIndexOutOfBoundsException
            String nullColor = null;
            System.out.println(nullColor.length()); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range.");
        } catch (NullPointerException e) {
            System.out.println("Tried to access a null object.");
        }
    }
}
