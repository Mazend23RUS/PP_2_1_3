package app.model;
import org.springframework.stereotype.Component;


@Component
public class Dog extends Animal {


    @Override
    public String toString(){
        return "Hellow, i'm RoboDOG";
    }

}
