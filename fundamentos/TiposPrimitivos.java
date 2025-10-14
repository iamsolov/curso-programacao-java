public class TiposPrimitivos {
    
    public static void main(String[] args){

        // Tipos Númericos inteiros
        byte anosDeEmpresa = 25;
        short numeroDeVoos = 575;
        int id = 56798;
        long pontosAcumulados = 2_134_845_223l;

        // Tipos Númericos reais
        float salario = 11_570.10f;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo Booleano
        boolean estaDeFerias = false;

        // Tipo Caractere
        char status = 'A';

        //Dias de Empresa
        System.out.println(anosDeEmpresa * 365);

        // Números de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por Real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        // Identificador
        System.out.println("ID: " + id + " ganha " + salario);

        // Ferias e status
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);


    }
}
