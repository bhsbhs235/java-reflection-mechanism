package org.example;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //클래스 타입의 인스턴스를 가져오는 방법
        /*
        Class<Book> bookClass = Book.class;

        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        Class<?> aClass1 = Class.forName("org.example.Book");

        Arrays.stream(bookClass.getFields()).forEach(System.out::println); // public만 가져옴
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);// 모든 필드
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f->{
            try {
                f.setAccessible(true); // public 아니면 접근 못하는데 가능하게함
                System.out.printf("%s %s \n", f, f.get(book)); // 필드와 그에 해당하는 값
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        Arrays.stream(bookClass.getMethods()).forEach(System.out::println); //Book class의 메소드 말고도 기본적(Object)으로 상속받는 클래스의 메소드도 가져옴
        Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);
        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println); // 생성자 목록

        Class<MyBook> myBookClass = MyBook.class;
        System.out.println(myBookClass.getSuperclass()); // super class

        Arrays.stream(myBookClass.getInterfaces()).forEach(System.out::println); // interface
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            int modifiers = f.getModifiers();
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });
        Arrays.stream(Book.class.getDeclaredMethods()).forEach(f -> {
            // f.getReturnType(); // 함수의 return type
            // f.getParameterTypes(); // parametertype
            // f.getGenericParameterTypes();
        });

        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
        Arrays.stream(Book.class.getDeclaredFields()).forEach( f -> {
            Arrays.stream(f.getAnnotations()).forEach( a -> {
                if( a instanceof MyAnnotation ){
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.name());
                    System.out.println(myAnnotation.number());
                }
            });
        });

        Class<?> bookClass = Class.forName("org.example.Book");
        //Constructor<?> constructor = bookClass.getConstructor(null); // 파라미터가 없는 생성자
        //Book book = (Book) constructor.newInstance();
        Constructor<?> constructor = bookClass.getConstructor(String.class);
        Book book = (Book) constructor.newInstance("hyoseong");
        System.out.println(book);

        Field declaredField = Book.class.getDeclaredField("B");
        System.out.println(declaredField.get(null)); // static 필드라 어느 객체에서 가져올 필요가 없기 때문에 null로 받을 수 있다 static이 아니면 객체 생성해서 값 넣어주겠쥬?
        declaredField.set(null, "AAAAAAA"); // 값이 바뀜
        System.out.println(declaredField.get(null));
         */

        Class<?> bookClass = Class.forName("org.example.Book");
        Constructor<?> constructor = bookClass.getConstructor(null); // 파라미터가 없는 생성자
        Book book = (Book) constructor.newInstance();

        Field b = Book.class.getDeclaredField("a");
        b.setAccessible(true);
        System.out.println(b.get(book));
        b.set(book, "BBBBBB");
        System.out.println(b.get(book));

        Method o = Book.class.getDeclaredMethod("o", int.class, int.class); // 파라미터까지 넣어줘야합니다
        int invoke = (int)o.invoke(book, 10, 20);
        System.out.println(invoke);
    }
}
