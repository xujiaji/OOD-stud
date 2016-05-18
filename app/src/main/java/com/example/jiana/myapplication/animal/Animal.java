package com.example.jiana.myapplication.animal;
//public Animal sleep(Animal animal) {//睡觉
//
//        }


//动物
public class Animal {
    private String food;
    public Animal(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }


}

class Zoo {
    Object obj = new Zoo().eatBreakfast(new Animal("肉"));
    String food = new Zoo().eatBreakfast(new Ostrich());
    /**
     * 吃早餐
     */
    public String eatBreakfast(Animal animal) {
        return animal.getFood();
    }
}

//鸟
class Bird extends Animal{
    public Bird(String food) {
        super(food);
    }
}

//鸵鸟
class Ostrich extends Bird{
    public Ostrich() {
        super("草");
    }
}

//麻雀
class Sparrow extends Bird{
    public Sparrow() {
        super("虫子");
    }
}
