import java.util.ArrayList;

public class Prelungitor {
    private ArrayList<AparatElectric> aparate=new ArrayList<AparatElectric>();
    private boolean stareconectat;

    public boolean getstareconectat(){
        return stareconectat;
    }

    public void setStare(boolean stareconectat){
        this.stareconectat=stareconectat;
        notifyAllDevices();
    }

    public void add(AparatElectric aparatElectric){
        aparate.add(aparatElectric);
    }

    public void notifyAllDevices(){
        for(AparatElectric iterator:aparate){
            iterator.update();
        }
    }



}
