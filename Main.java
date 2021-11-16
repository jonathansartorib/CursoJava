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