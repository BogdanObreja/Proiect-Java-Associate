import java.util.*;
public class Adapost{
    
    private List<Animal> animale = new ArrayList<>();
     
    public List<Animal> getAnimale(){
        return animale;
    }
    
    private Adapost(){}
    private static final class SingletonHolder{
        private static final Adapost SINGLETON = new Adapost();
        
    }
    public static Adapost getInstance(){
        return SingletonHolder.SINGLETON;
    }
   
    public void adaugaAnimal (Animal a){
        int x = 0;
        if(!animale.isEmpty()){
            
            for(int i=0;i<animale.size();i++){
                if(animale.get(i).nume.equals(a.nume)){x = 1;}    
               }
            }
        if (x ==1){throw new NumeDejaExistentException();}
        else animale.add(a);
    }
    
    public void afiseazaAnimale(){
        animale.forEach(a->System.out.println(a));
    }
    
    public void afiseazaAnimaleDomestice(){
        animale.stream()
        .filter(a -> a instanceof AnimalDomestic)
        .forEach(System.out::println);
    }
    
    public void afiseazaSortat(){
        Collections.sort(animale, (a1,a2) -> {
           return a1.getNume().compareTo(a2.getNume());
     
        });
       
    }
    
    public void adoptaAnimal(String nume){
        for(int i=0;i<animale.size();i++){
            if(animale.get(i).nume.equalsIgnoreCase(nume)){
                animale.remove(animale.get(i));
            }
        }
        }
    }
    