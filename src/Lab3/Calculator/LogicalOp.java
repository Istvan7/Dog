package Lab3.Calculator;

public class LogicalOp {

    public int veryfyinterval(int first, int second, int third) {
        if ((first >= second) && (first <= third)) {
            return first;


        } else {
            return 0;
        }

    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;

        } else {
            return second;
        }
    }

    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public double imp(double z, double w) {

        double imp = z / w;
        return imp;
    }

    public int inmultire(int n, int m) {
        int inmultire = n * m;
        return inmultire;
    }

    public float scadere(float k, float l) {
        float scadere = k - l;
        return scadere;


    }

    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return ("Learn some more ");


        }
    }

    public String snow(int cm) {
        if ((cm >= 8) || (cm == 6)) {
            return "The amount of snow this winter was(cm):" + cm;
        } else {
            return "The forecast snow is(cm):" + cm;

        }
    }

    public String numar(int numar) {
        if ((numar > 3) && (numar != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (numar == 4) {
            return "The number is equal to 4";

        } else if (numar < 3) {
            return "The number is lower than 3";


        } else {
            return "numar";
        }
    }

    public boolean isNumberEven(int x) {
        if (x % 2 == 0) {
            return true;


        } else {
            return false;
        }

    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int greater(int a, int b, int c) {
        if (((a > b) && (a > c))) {
            return a;

        } else if (((b > a) && (b > c))) {
            return b;

        } else {
            return c;

        }
    }

    public void printNumber(int number) {
        switch (number) {
            case 100:
                System.out.println("Valoarea este 100");
                break;
            case 200:
                System.out.println("valoarea este 200");
                break;
            default:
                System.out.println("valoarea este 0 ");
        }
    }
}

