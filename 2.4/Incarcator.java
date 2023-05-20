public class Incarcator extends AparatElectric{
    @Override
    public void update() {
       if(this.prelungitor.getstareconectat()==true){
           System.out.println("Incarcatorul functioneaza");
       }else{
           System.out.println("Incarcatorul nu funcioneaza");
       }
    }

    public Incarcator(Prelungitor prelungitor){
        this.prelungitor=prelungitor;
        this.prelungitor.add(this);
    }

}
