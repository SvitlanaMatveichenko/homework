package com.gmail.lanka.dag05.ua;
import java.util.Arrays;
public class Main {


        public static class ArraySort {
            public static void main(String[] args) {

                int n=10; //кількість елементів масиву
                int [] a=new int[n+1];
                for (int x=0 ; x<=n;x++){
                    a[x]=(int)(Math.random()*10);} //заповнюємо масив від 0 до 9
                Arrays.sort(a);
                //System.out.println(a[x]+"   ");
                for (int y : a) {
                    // System.out.print(a[y] + " ");
                    System.out.print(y+"   ");
                }

            }
        }


    }
