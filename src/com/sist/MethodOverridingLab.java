package com.sist;

/**
 * Created by sist on 2016-02-17.
 */
public class MethodOverridingLab {
    public static void main(String[] args){
        Line line=new Line();
        paint(line);    //Line의 draw() 메서드 실행

        //paint() 메소드 내에서 Shape에 대한 레퍼런스 shape로 업캐스팅됨.
        paint(new Shape());     //Shape의 draw() 실행.
        paint(new Line());      //오버라이딩된 메서드 Line의 draw() 실행.
        paint(new Rect());      //오버라이딩된 메서드 Rect의 draw() 실행.
        paint(new Circle());    //오버라이딩된 메서드 Circle의 draw() 실행.
    }

    static void paint(Shape shape){     //Shape을 상속받은 모든 객체들이 매개변수로 넘어올 수 있음.
        shape.draw();       //shape가 가리키는 객체에서 오버라이딩한 draw() 호출함.(=동적 바인딩)
    }
}
