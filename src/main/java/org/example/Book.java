package org.example;

@MyAnnotation
public class Book{

    private String a = "a";

    private static String B = "Book";

    private static final String C = "hi";

    public String d = "d";

    protected  String e = "e";

    public Book(){

    }

    public Book(String a) {
        this.a = a;
    }

    public void f(){
        System.out.println("F");
    }

    private void g(){
        System.out.println("g");
    }

    public static void j(){
        System.out.println(B); // static 메소드는 static 변수만 호출 가능
        // System.out.println(a); satic 메소드에서는 static이 선언되지 않은 변수에 접근이 불가능하다 static 변수는 미리 만들어 메모리에 올라가지만 non-static은 아직 메모리에 올라오지 못한 상황
    }

    public int o(int a, int b){
       return a + b;
    }

    public int h(){
        return 100;
    }
}