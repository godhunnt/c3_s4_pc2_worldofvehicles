package fuels;

import vehicle.Engine;

public class Diesel extends Engine {
    private boolean diesel;

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public Diesel(long modelNo, double displacement, double power, double maxRpm, int numberOfCylinder, String fuel, boolean diesel) {
        super(modelNo, displacement, power, maxRpm, numberOfCylinder, fuel);
        this.diesel = diesel;
    }
    public void displayDiesel() {
        System.out.println("Diesel--");
        System.out.println("ModelNo = " + getModelNo());
        System.out.println("Diesel = " + diesel);
        System.out.println("MaxRpm = " + getMaxRpm());
        System.out.println("Displacement = " + getDisplacement());
        System.out.println("Power = " + getPower());

    }
}
