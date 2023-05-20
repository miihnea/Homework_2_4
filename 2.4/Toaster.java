public class Toaster extends AparatElectric{
    @Override
    public void update() {
         if(this.prelungitor.getstareconectat()==true){
             System.out.println("Toaster-ul funcioneaza");
         }else{
             System.out.println("Toaster-ul nu functioneaza");
         }
    }

    public Toaster(Prelungitor prelungitor){
        this.prelungitor=prelungitor;
        this.prelungitor.add(this);
    }
}
