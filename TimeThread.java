public class TimeThread implements Runnable{
    @Override
    public void run(){
        try{
            while(true){
                Thread.sleep(30000);
                System.out.println("In adapost sunt: "+ Adapost.getInstance().getAnimale().size()+" animale");
                
            }
        
        }catch(InterruptedException e){
            System.out.println("nu putem arata numarul de animale");
        }
    }
}