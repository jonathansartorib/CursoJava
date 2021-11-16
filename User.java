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