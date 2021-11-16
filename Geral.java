//Inicio do Curso de Java

//comentario em Java
/* tamem utilizado
para varias linhas*/
//ponto de entrada - entry-point -> é o ponto onde todos sistemas procura
//no seu projeto para comecar e iniciar o projeto
//metodos: sao instrucoes que define para o processo executar Exemplo:
//instrucao chamada System.out.println("")
//propriedades/variaveis -> sera onde iremos armazenar dados para manipulalos no futuro

//exemplo para instrucao onde imprimi mensagens e operacoes

public class Main {
    
   public static void main(String[] args) {       //entry-point
       System.out.println("Ola Mundo");           // instrucao chamada
       System.out.println(2 + 2);
       System.out.println(2 + 6);
       System.out.println("Hello World");
       System.out.println(10 / 3);
   }
} 


// declarar variaveis no java
//ira imprimir mundo, pois ele roda de cima para baixo

//variaveis -> tipo: textos (Strings) = "Ola"
//variaveis -> tipo: Numeros (Int) = 10
//variaveis -> tipo: Numeros fracionados (Double) = 10.3
//variaveis -> tipo: Booleanas (verdadeiro | falso) = true ou false

// Tipos de Dados

//nos java antigos é obrigatorio declarar o tipo de Dados
//no java atual nao precisa igual esta abaixo, dependendo do conteudo o java ja reconhece o tipo

//tipos primitivos
//String login = "ola";
//int number1 = 10;
//double percent = 24.33;
//boolean isDriver = true;

public class Main {
    
   public static void main(String[] args) {      
       var login = "Ola";
       var number1 = 10.3;
       var number2 = "200"; //entende como texto pelas aspas
       var password = "jajsajsjaksaj";
       var isDriver = true;
       
       System.out.println(login); //imprimi ola
       
       login = "Mundo"; //mudou a variavel pois ele executa de cima para baixo, imprimi mundo
       
       System.out.println(login);
       System.out.println(number1);
       System.out.println(number2);
       System.out.println(password);
       System.out.println(isDriver);
   }
} 
//variaveis
//sao espacos de memoria alocado (representado por tipos)


//manipulando a variavel

public class Main {
    
   public static void main(String[] args) {      
   int number;
   number = 55;
   System.out.println(number + 10); 
   }
} 


//Erros na Programação
//2 tipos de Erros

//erro na compilacao - (compilacao passar de alto para linguagem de computador)
//exemplo de compilacao .java -> .class
//erro na escrita da sintaxe

//erro de execuçao (exception)
//ou tambem erro de exceção
//por exemplo dividi numero por 0
public class Main {
    
   public static void main(String[] args) {      
       int x = 10;
       int y = 0;
       System.out.println(x / y);
   }
} 

// funcoes

public class Main {
    
   public static void main(String[] args) { 
      calc(x:10, y:5); // argumentos
   }
   
   static void calc(int x, int y) {
       // static void > declaracao padrao (falaremos depois sobre isso)
       //sum > nome da funcao (poderia ser qualquer outro) geralmente usamos verbos
       // () > usamos para definir o que chegara naquela funcao
       // (tipo nome_da_variavel)
       // {} > bloco de codigo que sera executado
       
       System.out.println(x + y);
       System.out.println(x - y);
       System.out.println(x * y);
       System.out.println(x / y);
   }
} 


// funcoes

public class Main {
    
   public static void main(String[] args) { 
       
       //args Tipo colecao de Strings
       //metodo Run > edit config > argumentos do Programa
       //assim voce pode adicionar os indices da colecao Strings
       //sempre comeca do 0, ou seja o primeiro parametro é o 0
       //args parametro pre definido
       //para o programa ficar dinamico consiga passar pra ele alguma instrução 
      
       System.out.println(args[0]);
   }
   
} 

//args referencia a um espaço de memoria onde se encontra alocado uma colecao de string

public class Main {
    
   public static void main(String[] args) { 

       System.out.println("Olá, " + args[0]);
       System.out.println("Olá, " + args[1]);
       System.out.println("Olá, " + args[2]);
       System.out.println("Olá, " + args[3]);
   }
   
} 


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


//loops (repetição)

//Projeto gerador de senhas
import java.util.Random;

public class Megasena {
    
   public static void main(String[] args) { 
       Random generate = new Random();
       //tipo random foi importado, ate da com random + enter
       int i = 0;
       while(i < 6) { // enquanto i for menor que 0
       
       // while (true) -> loop infinito
       // outro loop infinito for(;;)
       // trocando o while por for:
       // for(int i = 0; i < 6; i++) {
       
       int number = generate.nextInt(60);
       System.out.println(number);
       
       i = i + 1; // ou i++;
       
       } 
   }
} 


// imports e packages

//aula 11

//estudar com calma de novo



//Java interativo

//com esse metodo consegue fazer interacoes com o usuario

//pode ser usado no projeto da calculadora

import java.util.Scanner;

public class Main {
    
   public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o seu nome:");
       
       String name = scanner.nextLine();
       
       System.out.println("Ola, " + name);

   }
}


//Tipos nao primitivos

//de preferencia a tipos primitivos pois ocupam menos memoria
//na impressao vao ser exatamente iguais
//os primitivos nao tem function (metodos) para manipula-los
// essa é a unica dioferença

public class Main {
    
   public static void main(String[] args) { 
       int x = 2;
       Integer y = 2; //Tipo nao primitivo
       System.out.println(x);
       System.out.println(y);
       
   }
}


// Escopo de Variaveis
//a variavel é destruida quando sai do bloco de codigo
//para manipula-la é preciso ficar atento ao escopo onde ela é declarada


public class Main {
    
   public static void main(String[] args) { 
        if (true) {
            int x = 10; //variavel local ou seja fica presente 
                        //somente dentro do bloco de codigo
        }
       System.out.println(x); //sistema nao consegue imprimir a variavel nesse caso
       
   }
}



// Variavel Imutavel ou Constantes


public class Main {
    
   public static void main(String[] args) { 

       final double PI = 3.1415; // PI exemplo de numero imutavel ou seja valor final
                                  // constante o valor nao vai ser mudado
      
   }
}

//Proxima aula video 16


//Visibilidade

public class App {
    // visibilidade padrao (default) 
    //pois nao foi especificado nada ex: public
    // somente classes ou arquivos dentro do mesmo escopo podem acessar
    static int x;
    //public visibilidade publica p todos os packages
    
    //private visibilidade privada p todos os packages
    //somente a classe atual pode acessar essa variavel
    
    //protected vai explicar na orientada a objeto
    
    public static void main(String[] args) {
    
    }
    public static void sum(int a, int b) {
        System.out.println(x);
    }
}


//tipos primitivos revisao


public class App {

    public static void main(String[] args) {
    //tipos primitivos
    
    boolean isLogged = true;
    byte b = 'a';
    char c = 'c'; //apenas uma letra
    short s = -129; // = int so com menos espaços
    int i = 123456789; // numeros maiores
    long l = 12345789456123l; //igual inteiro com mais espaços
    float f = 19.19f; //32bit (menor do que double)
    double d = 19.19; // 64bit 
    
    //String nao é primitivo
    String character = "c";
    
    }
}



// conversao de tipos
//Casting

public class App {

    public static void main(String[] args) {
        //converter tipos primitivos
        //Casting
        
        double dd = 10.10;
        short ss = 32;
        
        int x = (int) dd / ss;
        
        System.out.println(x);
        //resultado vai ser 0 pois int so aceita inteiro 
        //o resultado normal seria 0.315625
    }
}


//Manipulando Strings

public class App {

    public static void main(String[] args) {
        String x = "Ola mundo, esse é o novo mundo";
        
        System.out.println(x.length()); // contar numeros de caracteres da frase
        System.out.println(x + " concatenada"); //concatenar texto
        System.out.println(x.contains("novo"));//busca no texto e retorna boolean
        System.out.println(x.indexOf("mundo")); //aonde que começa tal palavra
        System.out.println(x.lastIndexOf("mundo"));//qual o indice da ultima vez que ocorreu a palavra
        System.out.println(x.toUpperCase());//manipular caixa alta (maiuscula)
        System.out.println(x.toLowerCase());//minuscula
        System.out.println(x.trim());//remove espaços desnecessarios
        System.out.println(x.substring(9));//comeca a partir de tal caracter
        
       //comparação (dos mais utilizados) 
        System.out.println(x.equals("ola"));
    }
}


//Comparando String
//comparar uma senha

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
         String password = "123456"; //senha salva
         System.out.println("Digite a sua senha: ");
         
         Scanner scanner = new Scanner(System.in);//instanciar (Criar objeto) 
         String pass = scanner.nextLine();
         //resposta vai esperar escrever algo e guardar na variavel pass
         
         System.out.println(password.equals(pass));
        
    }
}



//Orientado a Objetos;




import User; //fazendo link com o arquivo da Classe

public class App {
    
    public static void main(String[] args) {
        
        User userA = new User();// dando vida ao objeto userA
        userA.firstName = "Jonathan";
        userA.lastName = "Sartori";
        
        User userB = new User();// dando vida ao objeto userB
        userB.firstName = "João";
        userB.lastName = "Silva";
        
        System.out.println(userA.firstName);
        System.out.println(userB.firstName);
        
    }
}



//criando a classe (declarando o molde)

public class User {
    
    // membros - propriedades e metodos (comportamentos)
    public String firstName;
    public String lastName;
    
}



//Orientado a Objetos;
import Guitar; //fazendo link com o arquivo da Classe

public class App {
    
    public static void main(String[] args) {
        
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "Fender";
  
        Guitar ibanez = new Guitar();
        ibanez.chors = 6;
        ibanez.name = "Ibanez";
    }
}


//criando a classe (declarando o molde)

public class Guitar {
    
    // membros - propriedades 
    public String name;
    public int chords;
    
    //comportamentos (metodos)
    public void play() {
        //aqui vai ser tocado o audio
    }
    
}



//HERANCA


import javax.swing.*;
public class UsaVeiculo {
    
    public static void main(String args[]) {
        
       Veiculo1 v = new Veiculo1();
       v.liga();
       v.setNome(JOptionPane.showImputDialog("Digite o nome: "));
       v.setVelocidade(Integer.parseInt(JOptionPane.showImputDialog("Digite a Velocidade: ")));
       JOptionPane.showMessageDialog(null,"Velocidade Atual: " + v.getVelocidade());
       v.acelera();
       JOptionPane.showMessageDialog(null,"Velocidade Atual: " + v.getVelocidade() );
       v.frea();
       JOptionPane.showMessageDialog(null,"Velocidade Atual: " + v.getVelocidade() );
       v.desliga();
       
    }
}


class Veiculo {
    private String nome;
    private float veocidade;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }
    public float getVelocidade(){
        return velocidade;
    }
    
    public void acelera(){
        if(velocidade<=10){
            velocidade++;
        }
    }
    
    public void frea(){
        if(velocidade>0)
            velovidade--;
    }
}


class Veiculo1 extends Veiculo {
    private boolean ligado;
    
    public void liga(){
        ligado = true;
    }
    
    public void desliga(){
        ligado = false;
    }
}




// metodos e propriedades


public class Main {
	public static void main(String[] args) {

        User userA = new User();
        userA.firstName = "Jonathan";
        userA.lastName = "Sartori";
        String fullName = userA.getFullName();
        
        userA.numberHouse = "2521";
        userA.zipCode = "06730-000";
        userA.nameStreet = "Estrada da Bonanza";
        userA.nameCity = "Vargem Grande Paulista";
        String fullAdress = userA.getFullAdress();
        
        System.out.println(fullName);
        System.out.println(fullAdress);
        
	}
}


public class User {
    
    public String firstName;
    public String lastName;
    private String fullName;
    
    private String fullAdress;
    public String nameStreet;
    public String numberHouse;
    public String zipCode;
    public String nameCity;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getFullAdress() {
        return "Logradouro: " +  nameStreet + " " + "Numero: " + numberHouse + " " + "CEP: " + zipCode + " " + "Cidade: " + nameCity;
    }
    
}































