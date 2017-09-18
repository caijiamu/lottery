package com.example.demo;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by caijiamu on 2017/9/2.
 */
@Component
public class Lottery3d {


    public int autoCount3d(int count) {
        ArrayList numberArray = new ArrayList();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int all = i + j + k;
                    if (all == count) {
                        String number = String.format("%d,%d,%d", i, j, k);
                        numberArray.add(number);
                    }
                }
            }
        }

        String str = String.format("当和值为%d,可能性%d种:", count, numberArray.size());
        System.out.print(str + "\n");
//        for (Object index:numberArray) {
//            System.out.print(index);
//            System.out.print("\n");
//        }

        return numberArray.size();
    }


    public void AISelectNumber() {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(10);
            System.out.print(a);
            System.out.print("\n");
        }
    }



}
