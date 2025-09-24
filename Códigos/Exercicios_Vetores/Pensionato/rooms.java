package Exercicios_Vetores.Pensionato;

public class rooms {
    
    private String name;
    private String email;
    private int numroom;


    public rooms(String name, String email, int numroom){
        this.email = email;
        this.name = name;
        this.numroom = numroom;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email){
        return this.email = email;
    }

    public int getNumroom(){
        return numroom;
    }

    public int setNumroom(int numroom){
        return this.numroom = numroom;
    }
}
