public class Q_CastingPromotion {
    public static void main(String[] args) {
        long varLong = 1000000L;
        int varInt=23456;
        varInt=(int) varLong;
        varLong=varInt;
        System.out.println("nilai varLong= "+varLong);
        System.out.println("Nilai varInt= "+varInt);
        char varChar='a';
        varInt=(int) varChar;
        System.out.println("nilai varInt('a')= "+varInt);
        varChar=(char) (varInt+1);
        System.out.println("nilai varChar= "+varInt);
        byte varByte=127;
        varInt=varByte;
        System.out.println("nilai varint(127)= "+varInt);
        short varShort=(short) varInt;
        System.out.println("nilai varShort= "+varShort);
        varShort=varByte;
        System.out.println("nilai varShort="+varShort);
        double varDouble=3.145256718992022;
        float varFloat=(float) varDouble;
        System.out.println("nilai varDouble= "+varDouble);
        System.out.println("nilai varFloat= "+varFloat);
    }
}
