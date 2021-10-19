// reverse a string
// Using iteration
class ReverseString {
    public static void main(String[] args) {
        String s = "Hello Java";
        String reverse = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Original string" + s);
        System.out.println("reverse a string" + reverse);
    }
}

// Using String Buffer
class ReverseStringStringBuffer {
    public static void main(String[] args) {
        String s = "Hello Java";
        StringBuffer s1 = new StringBuffer(s);
        System.out.println("Original string" + s);
        System.out.println("reverse a string" + s1.reverse());
    }
}

// Using collections

class ReverseStringUsingCollections {
    public static void main(String[] args) {
        String arr[] = {"Hello", "Java"};
        System.out.println("Original array" + Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reverse array" + Arrays.toString(arr));
    }
}
