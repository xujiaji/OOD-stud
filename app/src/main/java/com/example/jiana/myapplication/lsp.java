package com.example.jiana.myapplication;


public class lsp {
    public void birdLetGo(com.example.jiana.myapplication.animal.Bird bird) {
        if (bird.isType == com.example.jiana.myapplication.animal.Bird.IS_OSTRICH) {
            Ostrich ostrich = (Ostrich) bird;
            ostrich.toBeiJing();
        } else if (bird.isType == com.example.jiana.myapplication.animal.Bird.IS_SPARROW) {
            Sparrow sparrow = (Sparrow) bird;
            sparrow.toBeiJing();
        }
    }
}


/**
 * 鸟
 */
class Bird{
    public static final int IS_OSTRICH = 1;//是鸵鸟
    public static final int IS_SPARROW = 2;//是麻雀
    public int isType;
    public Bird(int isType) {
        this.isType = isType;
    }
}
/**
 * 鸵鸟
 */
class Ostrich extends com.example.jiana.myapplication.animal.Bird {
    public Ostrich() {
        super(com.example.jiana.myapplication.animal.Bird.IS_OSTRICH);
    }
    public void toBeiJing(){
        System.out.print("跑着去北京！");
    }
}

/**
 * 麻雀
 */
class Sparrow extends com.example.jiana.myapplication.animal.Bird {
    public Sparrow() {
        super(com.example.jiana.myapplication.animal.Bird.IS_SPARROW);
    }
    public void toBeiJing(){
        System.out.print("飞着去北京！");
    }
}
