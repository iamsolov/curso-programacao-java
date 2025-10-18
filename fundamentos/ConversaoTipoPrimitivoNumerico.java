public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        // Conversão implícita (widening conversion)
        // O tipo int é convertido automaticamente para double, pois double tem maior capacidade de armazenamento.
        double valorDouble = 1;
        System.out.println("Conversão implícita de int para double: " + valorDouble);

        // Conversão explícita (narrowing conversion)
        // Necessário fazer casting manual, pois float tem menor precisão que double.
        float valorFloat = (float) 1.123456789123456789;
        System.out.println("Conversão explícita de double para float: " + valorFloat);

        // Conversão implícita de byte para int
        // O tipo byte cabe dentro de um int, então a conversão é feita automaticamente.
        byte valorByte = 100;
        int valorInt = valorByte;
        System.out.println("Conversão implícita de byte para int: " + valorInt);

        // Conversão explícita de double para float
        double outroDouble = 1.56;
        float outroFloat = (float) outroDouble;
        System.out.println("Conversão explícita de double para float: " + outroFloat);

        // Exemplo de perda de precisão em conversão narrowing
        double valorGrande = 123456789.987654321;
        float valorConvertido = (float) valorGrande;
        System.out.println("Perda de precisão (double → float): " + valorConvertido);

        // Exemplo de estouro (overflow) em conversão narrowing
        int valorIntGrande = 130;
        byte valorByteEstourado = (byte) valorIntGrande;
        System.out.println("Overflow (int → byte): " + valorByteEstourado); // resultado inesperado

        // Exemplo de promoção automática em expressões
        byte x = 10;
        byte y = 20;
        // Quando há uma operação aritmética entre bytes, o resultado é promovido para int
        int soma = x + y;
        System.out.println("Promoção automática em expressão (byte + byte → int): " + soma);
    }
}
