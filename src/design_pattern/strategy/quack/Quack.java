package design_pattern.strategy.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
