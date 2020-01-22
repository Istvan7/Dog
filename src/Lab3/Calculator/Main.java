package Lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        System.out.println(op.veryfyinterval(5, 2, 8));
        System.out.println(op.checkBiggerNumber(7, 9));
        System.out.println(op.sum(2, 5));
        System.out.println(op.scadere(9, 7));
        System.out.println(op.inmultire(8, 7));
        System.out.println(op.imp(10, 3));
        String text ="FastTrack";
        System.out.println( op.verifyText(text));
        System.out.println(op.snow(88));
        System.out.println(op.numar(-8));
        System.out.println(op.isNumberEven(3));
        System.out.println(op.isEligibleToVote(18));
        System.out.println(op.greater(3,2,1));


    }
}