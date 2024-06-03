package Patterns.FactoryPatterns;

public class Main {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        AbstractInterface abstractInterface = shapeFactory.getShape("C");
        System.out.println(abstractInterface.getShape());

    }
}
