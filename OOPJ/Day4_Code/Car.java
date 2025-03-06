public class Car{
   private double gasTank;
   private double totalKm;
   private double efficiency;
   
   public Car(double efficiency){
     this.gasTank = 0;
	 this.totalKm = 0;
	 this.efficiency = efficiency;
   }
   
   public void drive(double distance){
   double requiredGas = distance / efficiency;
   if(requiredGas <= gasTank){
      totalKm = totalKm + distance;
	  gasTank = gasTank - requiredGas;
	  
	  System.out.println("Drove" + distance + " km. gas remaining: " + gasTank + " liters.");
   }
   else{
      System.out.println("Not enough gas to drive " + distance + " km.");
   }
   }

    public void loadGas(double liters){
	  if(liters > 0){
	    gasTank = gasTank + liters;
		System.out.println("Added" + liters + " liters of gas. current gas: " + gasTank);
	  }
	  else{
	    System.out.println("Invalid gas amount.");
	  }
	}
	
	public void changeEffeciency(double newEfficiency){
	  if(newEfficiency > 0){
	     efficiency = newEfficiency;
		 System.out.println("Efficiency changesd to " + efficiency + "km/liter.");
	  }
	  else{
	     System.out.println("Invalid efficiency value.");
	  }
	}
	
	public double checkGas(){
	  return gasTank;
	}
	
	public double checkOdometer(){
	   return totalKm;
	}


    public static void main(String args[]){
	Car myCar = new Car(18);
	
	myCar.loadGas(10);
	myCar.drive(1000);
	System.out.println("Current gas level: " + myCar.checkGas() + " liters.");
	System.out.println("Total kilometers driven: " + myCar.checkOdometer() + " km.");
	myCar.changeEffeciency(180);
	myCar.drive(5000);
	System.out.println("Current gas level: " + myCar.checkGas() + " liters.");
	System.out.println("Total kilometers driven: " + myCar.checkOdometer() + " km.");
	}
}