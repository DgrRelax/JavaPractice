package com.demo.random;

/**
 * 带权重的随机选择，1元，5元，10元， 70， 20， 10，权重举例
 */
public class Test {
    public static void main (String[] args){
        Pair[] options = new Pair[]{new Pair("1元",7),
                new Pair("5元",2),new Pair("10元",1)};
        WeightRandom random = new WeightRandom(options);
        for(int i = 0;i < 10;i++){
            System.out.print(random.nextItem() + " ");
        }
    }
}
