public class Fan extends Device{
    
    
    private int speedLevel;      
    private boolean oscillating; 
    private String room;

    public Fan(String id, String name, String room, int speedLevel, boolean oscillating) {
        super(id, name);
        this.room = room;
        this.speedLevel = speedLevel;
        this.oscillating = oscillating;
    }

    public void setSpeedLevel(int speedLevel) {
        if (speedLevel < 1) speedLevel = 1;
        if (speedLevel > 3) speedLevel = 3;
        this.speedLevel = speedLevel;
        System.out.println(name + " speed set to level " + this.speedLevel);
    }

    public void setOscillating(boolean oscillating) {
        this.oscillating = oscillating;
        System.out.println(name + " oscillation: " + (this.oscillating ? "ON" : "OFF"));
    }

    @Override
    public void showStatus() {
        System.out.println("=== Fan Status ===");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Room : " + room);
        System.out.println("On   : " + (isOn ? "Yes" : "No"));
        System.out.println("Speed Level : " + speedLevel);
        System.out.println("Oscillating : " + (oscillating ? "Yes" : "No"));
    }
}
