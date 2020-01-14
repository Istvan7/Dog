package Lab2;

public class Main {
    public static void main(String[] args) {
        int x = sum (10,5);
        float j =scadere(50,14);
        double o = imp(10.1,5.2);
        int b = inmultire(5,7);
        double Ex4 = exercitiu4(9,5,7);
        float Ex6 = rest(10, 3);
        double Ex7= celsius(30);
        double Ex8= metri(100);
        double Ex9= viteza(10000,2,10,21);
        double Ex9_1 =kmpeo(100000,2,10,21);
        double Ex9_2 =milpeo(100000, 2,10,21);
        printMyName();
        System.out.println(x);
        System.out.println(j);
        System.out.println(o);
        System.out.println(b);
        printExercitiu3();
        System.out.println(Ex4);
        printexercitiu5();
        System.out.println(Ex6);
        System.out.println(Ex7);
        System.out.println(Ex8);
        System.out.println(Ex9);
        System.out.println(Ex9_1);
        System.out.println(Ex9_2);




    }
    public static int sum (int first , int second ){
        int sum = first + second;
        return sum;
    }
public static double imp (double z, double w ){

        double imp = z/w;
        return imp;
}
public static int inmultire (int n, int m){
        int inmultire = n*m;
        return inmultire;
}
public static float scadere(float k, float l){
        float scadere =k-l;
        return scadere;
}
public static void printMyName(){
    System.out.println("Hello \n Istvan");

}
public static void printExercitiu3(){

    System.out.println("   J    a   V     V    a\n   J   a a   V   V    a a\nJ  J  aaaaa   V V    aaaaa\n JJ  a     a   V     a   a");

}
public static double exercitiu4 (double e, double r, double t){
        double exercitiu4 = (e+r+t)/3;
        return exercitiu4;
}
public static void printexercitiu5(){
    System.out.println(" +\"\"\"\"\"+\n[| O O |]\n |  ^  |\n | '_' |\n +-----+");
}
public static float rest(float a, float b){
    float rest = a%b;
            return rest;

}
public static double celsius(double x){
    double y =9;
    double z=5;
    double celsius =z/y*(x-32);
    return celsius;
}
public static double metri(double z){
    double t=0.0254;
    double metri =z*t;
            return metri;
}
public static double viteza(double distanta,double ore , double minute ,double secunde  ){
    double viteza =(distanta/secunde);
    return viteza;
}
public static double kmpeo(double distanta,double ore , double minute ,double secunde){
    double kmpo= distanta*0.001/ore;
    return kmpo;
}
public static double milpeo(double distanta,double ore , double minute ,double secunde){
    double milpeo=distanta*0.000621371192/ore;
    return milpeo;
}

    }




