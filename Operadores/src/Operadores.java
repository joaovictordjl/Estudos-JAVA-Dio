public class Operadores {
    public static void main(String[] args) throws Exception {
        
        //CONCATENAÇÃO
        
        String nomeCompleto ="João" + "Do Java" + 1;
        System.out.println(nomeCompleto);

        String concatenacao ="?";
        
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);//Quando aparece uma string no meio, o restante concatena 100%


        //ADIÇÃO

        int notaAluno1 = 6;
        int notaAluno2 =4;
        int soma=(notaAluno1+notaAluno2);
        System.out.println(soma);

        //SuUBTRAÇÃO

        int laranjaLima=52;
        int laranja=14;
        int subtracao=(laranjaLima-laranja);
        System.out.println(subtracao);

        //DIVISÃO

        int peixePalhaco=15;
        int pessoas=3;
        int divisao=(peixePalhaco/pessoas);
        System.out.println(divisao);


        //MULTIPLICAÇÃO

        int base=10;
        int altura=5;
        int area=(base*altura);
        System.out.println(area);

        //OPERADORES UNÁRIOS

        //numeros negativos
        int numeroNegativo=-5;
        int numeroPositivo=6;
        int calculaAi=(numeroNegativo+numeroPositivo);
        System.out.println(calculaAi);
        int multiplicaAi=(numeroNegativo*numeroPositivo);
        System.out.println(multiplicaAi);

        //INCREMENTAL=incrementa unidades
        int vacilao=5;
        vacilao++; //incrementa uma unidade.
        System.out.println(vacilao);

        //DECREMENTAL=decrementa unidades
        int zeMane=5;
        zeMane--; //decrementa uma unidade.
        System.out.println(zeMane);

        //NEGAÇÃO DE BOOLEAN

        boolean variavel =true;
        System.out.println(!variavel);//alteração de true para false.
        //ou
        boolean variavel1=true;
        variavel1= !variavel1;
        System.out.println(variavel1);
        


        
    }
}
