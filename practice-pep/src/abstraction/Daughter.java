package abstraction;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("Iam going to be a coder");
    }

    @Override
    void partner(){
        System.out.println("I love IronMan");
    }
}
