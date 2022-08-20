package fuels;

import vehicle.Engine;

public class Cng extends Engine {
    private boolean cng;

    public boolean isCng() {
        return cng;
    }

    public void setCng(boolean cng) {
        this.cng = cng;
    }

    public Cng(long modelNo, double displacement, double power, double maxRpm, int numberOfCylinder, String fuel, boolean cng) {
        super(modelNo, displacement, power, maxRpm, numberOfCylinder, fuel);
        this.cng = cng;
    }
    public void displayCng() {
        System.out.println("CNG--");

        System.out.println("ModelNo = " + getModelNo());
        System.out.println("Cng = " + cng);
        System.out.println("MaxRpm = " + getMaxRpm());
        System.out.println("Displacement = " + getDisplacement());
        System.out.println("Power = " + getPower());

    }
}
