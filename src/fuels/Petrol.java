package fuels;

import vehicle.Engine;

public class Petrol extends Engine {
    private boolean petrol;

    public boolean isPetrol() {
        return petrol;
    }

    public void setPetrol(boolean petrol) {
        this.petrol = petrol;
    }

    public Petrol(long modelNo, double displacement, double power, double maxRpm, int numberOfCylinder, String fuel, boolean petrol) {
        super(modelNo, displacement, power, maxRpm, numberOfCylinder, fuel);
        this.petrol = petrol;
    }
    public void displayPetrol() {
        System.out.println("Petrol--");
        System.out.println("ModelNo = " + getModelNo());
        System.out.println("Petrol = " + petrol);
        System.out.println("MaxRpm = " + getMaxRpm());
        System.out.println("Displacement = " + getDisplacement());
        System.out.println("Power = " + getPower());

    }
}
