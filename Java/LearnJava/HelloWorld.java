package Java.LearnJava;

public class HelloWorld {
    public static void main(String [] args) {
        int a = 5;
        char b = '5';
        
        String name = "Aaryan";
        System.out.println(name.toLowerCase()+String(a)+b);
        System.out.println(Int(b));
        

    }

    private static String String(int a) {
        String s = Integer.toString(a);
        return s;
    }

    private static Integer Int(char b) {
        Integer i = Integer.valueOf(b);
        return i;
    }
}