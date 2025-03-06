public class LightBulb{
      private boolean isOn;

      public LightBulb(){
	     this.isOn = isOn;
	  }
   
      public void switchOff(){
	     isOn = false;
	     System.out.println("Bulb is off.");
	  }
	  
	  public void switchOn(){
	     isOn = true;
	     System.out.println("Bulb is on.");
	  }
	  
	  public boolean isOn(){
	    return isOn;
	  }

      public static void main(String args[]){
	  LightBulb bulb = new LightBulb();
	  
	  bulb.switchOn();
	  System.out.println("Is LightBulb is on? " + bulb.isOn());
      bulb.switchOff();
	  
	  System.out.println("Is LightBulb is on? " + bulb.isOn());
	  }
}