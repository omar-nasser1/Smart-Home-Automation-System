public class Thermostat extends Device {
    
     private double currentTemperature;
    private double targetTemperature;
    private String mode; 

    public Thermostat(String id, String name, double currentTemperature, double targetTemperature, String mode) {
        super(id, name);
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.mode = mode;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        System.out.println(name + " target temperature set to " + this.targetTemperature + "°C");
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println(name + " mode set to " + this.mode);
    }

    @Override
    public void showStatus() {
        System.out.println("=== Thermostat Status ===");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("On   : " + (isOn ? "Yes" : "No"));
        System.out.println("Current Temp : " + currentTemperature + "°C");
        System.out.println("Target Temp  : " + targetTemperature + "°C");
        System.out.println("Mode         : " + mode);
    }
   
}
