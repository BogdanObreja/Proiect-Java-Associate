        import java.util.*;
        public class Main{
            public static void main(String [] args){
                
            TimeThread r = new TimeThread();
            Thread t= new Thread(r);
            t.start();
                
                Scanner scanner = new Scanner(System.in);
                while(true){
                    System.out.println("Comanda: ");
                    String cmd = scanner.nextLine();
                    String [] cuvinte = cmd.split("\\s+");
                    
                    switch(cuvinte[0]){
                        case "exit": System.out.println("Se inchide aplicatia!");
                                     System.exit(0);
                        case "ADAUGA_ANIMAL": 
                            
                            if("salbatic".equalsIgnoreCase(cuvinte[1])){
                                AnimalSalbatic a = new AnimalSalbatic();
                                a.nume=cuvinte[2];
                                a.varsta=Integer.parseInt(cuvinte[3]);
                                switch(Integer.parseInt(cuvinte[4])){
                                    case 0: a.setPericol(Pericol.PASNIC); break;
                                    case 1: a.setPericol(Pericol.APROAPE_PASNIC); break;
                                    case 2: a.setPericol(Pericol.PUTIN_PERICULOS); break;
                                    case 3: a.setPericol(Pericol.PERICULOS); break;
                                    case 4: a.setPericol(Pericol.MEDIU_PERICULOS); break;
                                    case 5: a.setPericol(Pericol.FOARTE_PERICULOS); break;
                                }
                                try{
                                    Adapost.getInstance().adaugaAnimal(a);
                                    System.out.println("Animalul a fost adaugat");
                                }catch(NumeDejaExistentException e){
                                    e.printStackTrace();
                                }
                               
                            }else {
                                AnimalDomestic a = new AnimalDomestic();
                                a.nume = cuvinte[2];
                                a.varsta = Integer.parseInt(cuvinte[3]);
                            if("nu".equalsIgnoreCase(cuvinte[5])){
                                a.setInterior(false);
                            }else {a.setInterior(true);}
                            try{
                                Adapost.getInstance().adaugaAnimal(a);
                                System.out.println("Animalul a fost adaugat");
                                }catch(NumeDejaExistentException e){
                                    e.printStackTrace();
                            }
                            }
                            break;
                        case "AFIS":   
                            System.out.println("Animalele din adapost sunt:");
                            Adapost.getInstance().afiseazaAnimale();
                            break;
                            
                        case "AFIS_DOMESTICE":
                        System.out.println("Animalele domestice din adapost sunt:");
                        Adapost.getInstance().afiseazaAnimaleDomestice();
                        break;
                        
                    case "AFIS_SORTAT":
                        System.out.println("Animalele in ordine alfabetica sunt:");
                        Adapost.getInstance().afiseazaSortat();
                        Adapost.getInstance().afiseazaAnimale();
                        break;
                        
                    case "ADOPTA":
                        Adapost.getInstance().adoptaAnimal(cuvinte[1]);
                        System.out.println("Animalul a fost adoptat");
                        break;
                    
                    }
                        
                        
                        
                        
                }
                
            }
        }
