package cn.vpclub.design.decorate;

public class Test {

    public static void main(String[] args) {
        Compoment compoment = new CompomentImpl();
        DecrateA a = new DecrateA();
        a.setCompoment(compoment);
        Double c = a.getPrice();
        System.out.println(c);
    }
}