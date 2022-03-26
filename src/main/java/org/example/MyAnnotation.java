package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // 컴파일시에는 컴파일러가 어노테이션의 메모리를 가져가지만 실질적으로 런타임시에는 사라짐 즉 리플렉션으로 선언된 어노테이션 데이터를 가져올 수 없다
// RetentionPolicy.SOURCE 소스 코드에만 사용 사실상 주석처럼
//  RetentionPolicy.RUNTIME 런타임까지 사용할 수 있다. 런타임 종료할 때 까지 메모리는 살아있다. 리플렉션으로 데이터를 가져올 수 있다.
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited // 상속가능한 어노테이션 MyBook에서 Book에 사용된 어노테이션을 가져올 수 있다.
public @interface MyAnnotation {

    String name() default "hyoseung";

    int number() default  100;
}
