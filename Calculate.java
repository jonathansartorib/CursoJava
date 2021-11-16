// Projeto 01 e Condiçoes

// projeto calculadora

// Exercicio continue e adicione multiplicar e dividir

// adicione exemplo somar 10 20 pra dar 30 no comand line arguments


public class Calculate {
    
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]); //converter Strings em inteiros
        int y = Integer.parseInt(args[2]);
        
        if(args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("multiplicar")) {
            multip(x, y);
        } else if (args[0].equals("dividir")) {
            divid(x, y);            
        } else {
            System.out.println("Nenhuma instrução definida");
        }
    }
    
    static void sum(int x, int y) {
        System.out.println(x + y);
    }
    
    static void minus(int x, int y) {
        System.out.println(x - y);
    }
    
    static void multip(int x, int y) {
        System.out.println(x * y);
    }
    
    static void divid(int x, int y) {
        System.out.println(x / y);
    }
}
