package java_study.generic;

// 제네릭 클래스

class ClassName<E> {

    private E element; // 제네릭 타입 변수

    void set(E element) {   // 제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {   //  제네릭 타입 반환 메소드
        return element;
    }
}



public class genericEx1 {
    public static void main(String[] args) {
        

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);


        System.out.println("a data : " + a.get());
        // 반환된 변수의 타입 출력
        System.out.println("a E Type : " + a.get().getClass().getName());


        System.out.println();
        System.out.println("b data : " + b.get());

        //반환된 변수의 타입 출력
        System.out.println("b E Type : " + b.get().getClass().getName());
        
    
    
    }   
}
