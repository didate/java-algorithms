package com.didate;

public class Natural {

    /**
     * Calcul du pgcd par la methode de substraction successive
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public int pgcdBySubstract(int a, int b) throws Exception {
        if(a <1 || b <1){
            throw new Exception("a et b doivent etre >= 1");
        }
        int difference = Math.abs(a-b);
        if(difference == 0)
            return a;
        if(a > b){
            a = difference;
        }else b = difference;
        return pgcdBySubstract(a,b);
    }


    /**
     * Calcul du pgcd par la methode de division euclidienne
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public int pgcdByDE(int a, int b) throws Exception{
        if(a <1 || b <1){
            throw new Exception("a et b doivent etre >= 1");
        }
        int reste = a > b ? a % b : b % a;
        if(reste == 0)
            return a > b ? b : a;
        if(a > b){
            a = reste;
        }else b = reste;
        return pgcdByDE(a,b);
    }

    /**
     * Calcul du ppcm de deux entiers naturels
     * @param a
     * @param b
     * @return
     */
    public int ppcm(int a, int b) throws Exception {
        return a*b / pgcdByDE(a,b);
    }

}

