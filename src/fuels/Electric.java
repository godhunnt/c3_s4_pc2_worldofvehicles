package fuels;

import vehicle.Engine;

public class Electric extends Engine {
    private double voltage;
    private boolean electric;

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public Electric(long modelNo, double displacement, double power, double maxRpm, int numberOfCylinder, String fuel, double voltage,boolean electric) {
        super(modelNo, displacement, power, maxRpm, numberOfCylinder, fuel);
        this.voltage = voltage;
    }
    public void displayElectric() {
        System.out.println("Electric--");
        System.out.println("ModelNo = " + getModelNo());
        System.out.println("Electric = " + electric);
        System.out.println("MaxRpm = " + getMaxRpm());
        System.out.println("Displacement = " + getDisplacement());
        System.out.println("Power = " + getPower());
        System.out.println("voltage = " + voltage);

    }
}
