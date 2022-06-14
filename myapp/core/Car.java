package myapp.core;

// Class
public class Car implements Controllable {

    // properties, members
    private String colour;
    protected String make;
    private Integer engineCapacity;
    private Boolean started = false;
    private long startedSince;

    // Default constructor
    public Car() {
        System.out.println("*** Instantiating Car object");
        this.colour = "red";
    }
    public Car(Integer capacity) {
        this.EngineCapacity = capacity;
    }   

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public Integer getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public Boolean getStarted() {
        return started;
    }
    public void setStarted(Boolean started) {
        this.started = started;
    }
    public long getStarted() {
        return started;
    }
    public void setStarted(boolean started) {
        this.started = started;
    }
    public long getDrivingDuraton() {
        if (this.isStarted())
            // Convert to ms -> sec
            return (System.currentTimeMillis() - this.startedSince) / 1000;
        return (long)1;
    }

    // behaviour - methods
    public void start() {
        if (this.started) {
            System.out.println("Your car is running");
        } else {
            System.out.println("Vroom.....");
            this.started = true;
            // Since 0000 Jan 1 1970
            this.startedSince = System.currentTimeMillis();
        }
    }
    public void stop() {
        if (!this.started) {
            System.out.println("Your car is not running");
        } else {
            System.out.println("Splutter splutter stop.....");
            this.started = false;
        }
    }
}
