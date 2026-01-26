package abstraction;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("Iam going to be a doctor");
    }

    @Override
    void partner(){
        System.out.println("I love pepper Potts");
    }
}
