import java.sql.SQLOutput;

public class VariabelGlobalLokal {
    static int varGlobal = 34;

    public static void main(String[] args) {
        varGlobal =25;
        System.out.println("varGlobal di akses di methid main dengan nilai ="+varGlobal);
        double varLokal =3.14;
        System.out.println("varLokal hanya bisa di akses di method main nilai ="+varLokal);
        aksesVariabelLokal();
    }

    public static void aksesVariabelLokal() {
        System.out.println("varGlobal bisa di akses di method main dengan nilai="+varGlobal);
        //varLokal=2,5;
        System.out.println("varLokal tidak bisa di akses di method aksesVariabelLokal ini");

    }
}
