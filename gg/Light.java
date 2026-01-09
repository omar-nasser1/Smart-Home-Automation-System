public class Light extends Device{
    
     private int brightness;   
    private String color;     
    private String room;      

    public Light(String id, String name, String room, int brightness, String color) {
        super(id, name);
        this.room = room;
        this.brightness = brightness;
        this.color = color;
}
     public void setBrightness(int brightness) {
        if (brightness < 0) brightness = 0;
        if (brightness > 100) brightness = 100;
        this.brightness = brightness;
        System.out.println(name + " brightness set to " + this.brightness + "%");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println(name + " color changed to " + this.color);
    }

    @Override
    public void showStatus() {
        System.out.println("=== Light Status ===");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Room : " + room);
        System.out.println("On   : " + (isOn ? "Yes" : "No"));
        System.out.println("Brightness: " + brightness + "%");
        System.out.println("Color     : " + color);
    }
}
