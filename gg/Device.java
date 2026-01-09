public abstract  class Device implements Controllable {
     protected String id;
    protected String name;
    protected boolean isOn;

    public Device(String id, String name) {
        this.id = id;
        this.name = name;
        this.isOn = false; // default: off
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now OFF.");
    }

    
    public abstract void showStatus();
}
