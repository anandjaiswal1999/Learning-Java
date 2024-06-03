package Patterns.FactoryPatterns;

public class Factory {
    public AbstractInterface getShape(String s){
        if(s=="C"){
            return new CircleImpl();
        }else {
            return new square();
        }
    }
}
