package com.jas.builderPatternTest;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * ClassName:BuilderPatternTest
 * Package:com.jas.builderPatternTest
 * Descrip:
 *
 * @Date:2018/7/20 下午2:57
 * @Author:jas
 */
public class BuilderPatternTest {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.getCkickenCoalPack();
        System.out.println("你的套餐总价为"+meal.showPrice());
    }

}

interface Item{
    public String name();
    public Double price();
    public Package pack();
}

class CreateItem implements Item{
    public String name() {
        return "lisi";
    }

    public Double price() {
        return 20.0;
    }

    public Package pack() {
        return new Bottle();
    }
}

class Total {
    private List<Item> list=  new ArrayList<Item>();

    public void add(Item item){
        list.add(item);
    }
}

class TotalBuilder {
    public Total getTotal(){
        Total total = new Total();
        total.add(new CreateItem());
        return total;
    }
}

class BuilerItem{
    public static Item getCreate(){
        return new CreateItem();
    }
}

interface Package {
    public String pack();
}

class Wrapper implements Package{
    public String pack() {
        return "wrapper";
    }
}

class Bottle implements Package{
    public String pack() {
        return "bottle";
    }
}

abstract class Burger implements Item{
    public Package pack() {
        return new Wrapper();
    }
}

abstract class Drink implements Item{
    public Package pack(){
        return new Bottle();
    }
}

class ChickenBurger extends Burger{
    public String name() {
        return "鸡肉堡";
    }

    public Double price() {
        return 17.5;
    }
}

class Coal extends Drink{
    public String name() {
        return "可口可乐";
    }

    public Double price() {
        return 3.5;
    }
}

class Meal{
    private List<Item> list = new ArrayList<Item>();

    public void addMeal(Item item){
        list.add(item);
    }

    public Double showPrice(){
        Double count = 0.0;
        for(Item item : list){
            count += item.price();
        }
        return count;
    }

}

class MealBuilder{
    public Meal getCkickenCoalPack(){
        Meal meal = new Meal();
        meal.addMeal(new ChickenBurger());
        meal.addMeal(new Coal());
        return meal;
    }
}
