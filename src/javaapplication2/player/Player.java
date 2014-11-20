package javaapplication2.player;

public abstract class Player {
    
    private String name;
    
    public Player(){
        this.name = "Inny";
    }
    public Player(String name){
        //konstruktor -- nie określa się typu zwracanego, musi mieć tą samą nazwę co klasa
        this.name = name;
    }
    
    
    public void setName(String name){
        if(name != null && !name.isEmpty()){ // Sprawdza czy obiekt jest pusty
            this.name = name; // this -- referencja do obiektu na ktorym wywołujemy metode
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public String getName(){
        return name;
    }
    
    public abstract int guess();

}
