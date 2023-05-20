public class Computer extends AparatElectric{
    @Override
    public void update() {
       if (this.prelungitor.getstareconectat()==true){
           System.out.println("Computer-ul functioneaza");
       }else{
           System.out.println("Computer-ul nu functioneaza");
       }
    }

    public Computer(Prelungitor prelungitor){
        this.prelungitor=prelungitor;
        this.prelungitor.add(this);
    }

}
