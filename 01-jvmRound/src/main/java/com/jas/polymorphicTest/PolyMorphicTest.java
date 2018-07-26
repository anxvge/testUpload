package com.jas.polymorphicTest;

/**
 * ClassName:PolyMorphicTest
 * Package:com.jas.polymorphicTest
 * Descrip: 多态中父类引用可以访问子类的属性和方法吗
 * 父类引用指向子类对象之后,父类引用使用父类自己的属性,若要使用子类的属性需要进行向下转型(强制类型转化)
 * 父类引用只能调用父类本身的方法,若该方法已经被子类重写,则会调用重写的子类方法
 * @Date:2018/7/23 上午9:00
 * @Author:jas
 */
public class PolyMorphicTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        Sup sup = new Sup();
        //sub = (Sub) sup; //会报错,类型转换异常,因为子类引用不能指向父类对象
        sup = new Sub();
        //sub = (Sub) sup;
        sub.xx();
        sub.yy();
        System.out.println(sub.z);
        System.out.println(sub.x);

//        yyy = xxx;
//        System.out.println(xxx);
//        System.out.println(((Sub) xxx).x);
//        System.out.println(((Sub) xxx).a);
//        xxx.xx();
    }
}

class Sup {
    int x = 10;
    int z = 30;
    public void xx (){
        System.out.println("这是父类方法");
    }
    protected void zz (){
        System.out.println("这个父类方法没有被子类重写");
    }
}

class Sub extends Sup{
    int x = 20;
    int a = 50;

    @Override
    public void xx() {
        System.out.println("这是子类方法");;
    }

    public void yy(){
        super.xx();
    }
}
