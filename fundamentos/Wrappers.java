public class Wrappers {

    public static void main(String[] args) {

        // ---------------- BYTE ----------------
        byte valorByte = 10;
        Byte objetoByte = valorByte; // autoboxing: o byte é convertido automaticamente em Byte
        System.out.println(objetoByte);
        System.out.println("Conversão para String: " + Byte.toString(objetoByte));
        System.out.println("Conversão de String para byte: " + Byte.parseByte("10"));
        System.out.println();

        // ---------------- SHORT ----------------
        short valorShort = 20;
        Short objetoShort = valorShort;
        System.out.println(objetoShort);
        System.out.println("Conversão para String: " + Short.toString(valorShort));
        System.out.println("Conversão de String para short: " + Short.parseShort("20"));
        System.out.println();

        // ---------------- INT / INTEGER ----------------
        int valorInt = 30;
        Integer objetoInt = valorInt;
        System.out.println(objetoInt);
        System.out.println("Conversão para String: " + Integer.toString(valorInt));
        System.out.println("Conversão de String para int: " + Integer.parseInt("30"));
        System.out.println();

        // ---------------- LONG ----------------
        long valorLong = 40l;
        Long objetoLong = valorLong;
        System.out.println(objetoLong);
        System.out.println("Conversão para String: " + Long.toString(valorLong));
        System.out.println("Conversão de String para long: " + Long.parseLong("40"));
        System.out.println();

        // ---------------- FLOAT ----------------
        float valorFloat = 3.14f;
        Float objetoFloat = valorFloat;
        System.out.println(objetoFloat);
        System.out.println("Conversão para String: " + Float.toString(valorFloat));
        System.out.println("Conversão de String para float: " + Float.parseFloat("3.14"));
        System.out.println();

        // ---------------- DOUBLE ----------------
        double valorDouble = 2.718;
        Double objetoDouble = valorDouble;
        System.out.println(objetoDouble);
        System.out.println("Conversão para String: " + Double.toString(valorDouble));
        System.out.println("Conversão de String para double: " + Double.parseDouble("2.718"));
        System.out.println();

        // ---------------- CHAR / CHARACTER ----------------
        char valorChar = 'A';
        Character objetoChar = valorChar;
        System.out.println(objetoChar);
        System.out.println("Conversão para String: " + Character.toString(valorChar));
        System.out.println("Conversão de String para char: " + "A".charAt(0));
        System.out.println();

        // ---------------- BOOLEAN ----------------
        boolean valorBoolean = true;
        Boolean objetoBoolean = valorBoolean;
        System.out.println(objetoBoolean);
        System.out.println("Conversão para String: " + Boolean.toString(valorBoolean));
        System.out.println("Conversão de String para boolean: " + Boolean.parseBoolean("true"));
        System.out.println();

    }
}