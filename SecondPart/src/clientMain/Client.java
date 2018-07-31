package clientMain;

import Interfaces.ProductA;
import Interfaces.ProductB;
import abstractfactory.AbstractFactory;
import abstractfactory.ConcreteFactoryX;
import abstractfactory.ConcreteFactoryY;

public class Client {

    void printProducts()

    {

        AbstractFactory concreteFactoryX=new ConcreteFactoryX();

        AbstractFactory concreteFactoryY=new ConcreteFactoryY();

        ProductA ax = concreteFactoryX.createProductA();

        ProductB bx = concreteFactoryX.createProductB();

        ProductA ay= concreteFactoryY.createProductA();

        ProductB by= concreteFactoryY.createProductB();

        ax.printNameProduct();

        bx.printNameProduct();

        ay.printNameProduct();

        by.printNameProduct();

    }

}
