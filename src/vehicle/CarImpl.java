package vehicle;

import fuels.Cng;
import fuels.Diesel;
import fuels.Electric;
import fuels.Petrol;

public class CarImpl {
    public static void main(String[] args) {
        Petrol petrol = new Petrol(2001,20,900,65,5,"Diesel Petrol Cng Electric",true);
        Diesel diesel = new Diesel(2056,20,60,55,4,"Diesel Petrol Cng Electric",true);
        Cng cng = new Cng(2091,20,350,45,3,"Diesel Petrol Cng Electric",true);
        Electric electric = new Electric(2331,270,30,65,2,"Diesel Petrol Cng Electric",5,true);

        System.out.println("Different Models of Cars with specifications: " + "\n");
        System.out.println("Fuels list are:"+"\n");
        System.out.println(petrol.getFuel());
        petrol.displayPetrol();
        diesel.displayDiesel();
        cng.displayCng();
        electric.displayElectric();
    }
}
