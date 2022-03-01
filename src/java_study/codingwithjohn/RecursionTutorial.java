package java_study.codingwithjohn;

public class RecursionTutorial {
    public static void main(String[] args) {
       sayHi(3);
    }

    private static void  sayHi(int count) {
        System.out.println("Hi!");

        if (count <= 1) {
            return;
        }
        sayHi(count - 1);
    }
}
