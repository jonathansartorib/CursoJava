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