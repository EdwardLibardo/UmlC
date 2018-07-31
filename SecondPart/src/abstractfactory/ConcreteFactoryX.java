package abstractfactory;

import Interfaces.ProductA;
import Interfaces.ProductAX;
import Interfaces.ProductB;
import Interfaces.ProductBX;

public class ConcreteFactoryX implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ProductAX();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBX();
    }
}
