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