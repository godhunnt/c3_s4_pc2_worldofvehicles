package vehicle;

public class Engine {
    private long modelNo;
    private double displacement;
    private double power;
    private double maxRpm;
    private int numberOfCylinder;
    private String fuel;

    public Engine(long modelNo, double displacement, double power, double maxRpm, int numberOfCylinder, String fuel) {
        this.modelNo = modelNo;
        this.displacement = displacement;
        this.power = power;
        this.maxRpm = maxRpm;
        this.numberOfCylinder = numberOfCylinder;
        this.fuel = fuel;
    }

    public long getModelNo() {
        return modelNo;
    }

    public void setModelNo(long modelNo) {
        this.modelNo = modelNo;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(double maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
