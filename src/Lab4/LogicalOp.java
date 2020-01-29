package Lab4;

public class LogicalOp {

    /*public int veryfyinterval(int first, int second, int third) {
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
                System.out.println("valoarea este 0 ");*/


    public void printnrpare(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void numaratore(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void nrscazuta(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void delaxlay(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void pare1oo(int x) {
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void inpare1oo(int x) {
        for (int i = x; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int adunare100(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;

        }
        return sum;
    }

    public float medie(int x) {
        int sum = 0;
        float average = 0;
        int counter = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;
            i++;
            counter++;

        }
        average = sum / counter;
        return average;
    }

    public void schema(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    public void whileex1(int x) {
        do {
            System.out.println(x);
            x++;
        } while (x < 100);
    }

    public void whileex2(int x) {
        do {
            System.out.println(x);
            x--;
        } while (x >= -100);
    }

    public void whileex3(int x, int y) {
        do {
            System.out.println(x);
            x++;
        } while (x <= y);
    }


    public void whileex4(int x, int y) {
        do {
            System.out.println(x);
            x++;
        } while (x < y);

        {
            if (y < x) {
                do {
                    System.out.println(y);
                    y++;
                }
                while (y < x);
            }
        }
    }

    public void whileex5(int x) {
        while ((x >= 1) && (x <= 100)) {
            x++;
            if (x % 2 == 0) {
                System.out.println(x);
            }


        }
    }

    public void whileex6(int x) {
        while ((x >= 0) && (x < 100)) {
            x++;
            if (x % 2 != 0) {
                System.out.println(x);
            }


        }
    }

    public float whileex7(int x, int y) {
        float sum = 0;
        float average = 0;
        float counter = 0;
        while (x < y) {
            sum += x;
            x++;
            counter++;

        }
        average = sum / counter;
        return average;
    }

    public float whileex8(int x, int y) {
        float sum = 0;
        float average = 0;
        int counter = 0;
        while ((x < y) && (x % 7 != 0)) {
            sum += x;
            x++;
            counter++;

        }
        average = sum / counter;
        return sum;
    }

    public void nrfibonacci() {
        int number = 20;
        int x1 = 0;
        int x2 = 1;
        for (int i = 1; i <= number; i++) {
            System.out.println(x1);
            int sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
    }

    public void Cozalozawoza() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza");

            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza");
            } else if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.print("WozaLoza");

            } else if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)) {
                System.out.print("CozaLozaWoza");

            } else {
                System.out.print(i);
            }
        }
    }
}



















































