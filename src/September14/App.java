package September14;

public class App {
    private boolean active = false;

    public App(){

    }
    public App(boolean active){
        this.active = active;
    }


    @Override
    public String toString(){
        return "App{" + "active='" + active + "'}";

    }
    public boolean isActive(){
        return active;
    }
    public void setActive(boolean active){
        this.active = true;
    }




}
