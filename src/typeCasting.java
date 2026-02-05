public class typeCasting {
    public static void main(String[] args) {
        char o = '0';
        int O;
        O=o;
        System.out.println("Character '0' to Integer: " + O);
        int num = 10000;
        byte b = (byte) num;
        System.out.println("Integer 10000 to Byte: " + b);
        long bigNum = 9999999999L;
        float f = (float) bigNum;
        System.out.println("Long 9999999999 to Float: " + f);
        double d = 123.456;
        int i = (int) d;
        System.out.println("Double 123.456 to Integer: " + i);
        
    }
    
}
