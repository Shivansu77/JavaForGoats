package abstraction;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age){
        this.age=age;
        VALUE=32456789;
    }
    abstract void career();
    abstract void partner();
}
