class Count {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item)) {
                count++;
            }
        }
        return count;
    }
}

public class A3_Q6 {
    public static void main(String[] args) {
        String[] name = {"Vivek", "Ankit", "Abhinav", "Ankit"};
        Integer[] no = {1, 2, 4, 2, 6, 7, 2, 0, 5}; // Use Integer[], not int[]

        System.out.println(Count.count(name, "Ankit"));     // Output: 2
        System.out.println(Count.count(no, 2));              // Output: 3
    }
}


