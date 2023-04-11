//import.java.lang.*;
import kr.hs.emirim.MyClass;
import kr.hs.emirim.MyInterface;

import java.util.Objects;
//import kr.hs.emirim.*;  //모든 걸 다 사용
//import kr.*;//kr 에 있는 것을 가져온다. 다르나

class MyInterfaceImpl implements MyInterface{}

class Point{
    private int x,y;
    public Point (int x, int y){
        this.x=x;
        this.y=y;
    }

//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }

    @Override
    public boolean equals(Object o){
        if(this ==o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Point p = (Point) o;
        return this.x == p.x&& this.y ==p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point (0,0);
        Point p2 = new Point (0,0);
        Point p3 = new Point (1,2);

        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        

//        System.out.println(p1.getClass().getName());
//        System.out.println(p1.hashCode());
//        System.out.println(p1.toString());
//        System.out.println(p1);



//        MyClass mc = new MyClass();
//        kr.hs.MyClass ms2 = new kr.hs.MyClass();
//        kr.MyClass mc3 = new kr.MyClass();
//        kr.hs.emirim.MyClass mc4 = new kr.hs.emirim.MyClass();
//        java.lang.String ss = new java.lang.String("Hello");

        String s ="Hello";
        s = s+"Java";
        System.out.println(s);

        String java ="Java";
        String java2 = "java";
        String c="C";
        String z = "Z";
        int res1 =java.compareTo(java2);
        System.out.println(res1);
        int res2 = java.compareTo(c);
        System.out.println(res2);
        int res3 = java.compareTo(z);
        System.out.println(res3);

    }
}