package com.didate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{

   

    public  static long factorial(int N) {
        long fact =1;
        if(N==0 || N==1)
            return 1;
        for(int i=N; i>=2;--i){
            fact = fact * i;
        }// 4 3 2 
        return fact;
    }

    public ArrayList<Integer> quadraticRoots2(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<Integer>();
        int root1 = 0, root2 = 0;
        // value of b^2-4ac
        int temp = (int)(Math.pow(b, 2) - 4 * a * c);

        // if b^2-4ac is less than zero then roots are imaginary
        if (temp < 0) {
            roots.add(-1);
        } else {
            // calculate root1 and root2 using formula
            root1 = (int) Math.floor((-1 * b + Math.sqrt(temp)) / (2 * a));
            root2 = (int) Math.floor((-1 * b - Math.sqrt(temp)) / (2 * a));
            // store both roots calculated in List
            roots.add(Math.max(root1, root2));
            roots.add(Math.min(root1, root2));
        }
        return roots;
    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        double delta = b*b -4*a*c;
        ArrayList<Integer> result = new ArrayList<>();
        if (delta < 0){
            System.out.println("Imaginary");
            result.add(-1);
        }else{
            double sqrtDelta = Math.sqrt(delta);
            int x1 = (int) Math.floor((-b + sqrtDelta) /(2*a));
            int x2 = (int) Math.floor((-b - sqrtDelta) /(2*a));
            if(x1>x2){
                result.add(x1);
                result.add(x2);
            }else{
                result.add(x2);
                result.add(x1);
            }
        }
        return result;
        
    }

    public static int digitsInFactorial(int N){
        long fact = factorial(N);
        int nd =0;
        while(fact >=1){
            fact=fact/10;
            nd++;
        }
        return nd;
    }
    public static long sumUnderModulo(long a, long b){
        BigDecimal sum = new BigDecimal(a).add( new BigDecimal(b));
        BigDecimal mod = sum.remainder(BigDecimal.valueOf(Math.pow(10,9)+7)) ;
        return  mod.longValue();
    } 
    public static void main( String[] args )
    {
    
        System.out.println(~2);
       
    }
}
