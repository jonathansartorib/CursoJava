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