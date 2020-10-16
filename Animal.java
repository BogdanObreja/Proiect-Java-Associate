public abstract class Animal{
    protected String nume;
    protected int varsta;
    
    
    public String getNume(){
        return this.nume;
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public int getVarsta(){
        return this.varsta;
    }
    
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o instanceof Animal){
            Animal a = (Animal)o;
            return this.nume.equals(a.nume);
        }
        return false;
    }
    @Override
    public String toString(){
        return nume + " " + varsta;
    }
}