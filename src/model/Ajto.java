package model;

public class Ajto {

    private boolean auto;

    
    public Ajto(){
        this(false);
    }
    public Ajto(boolean auto) {
        this.auto = auto;
    }
    
    public void setNyertes(){
        this.auto = true;
    }

    public boolean isAuto() {
        return auto;
    }

}
