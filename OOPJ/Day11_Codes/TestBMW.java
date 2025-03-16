class BMW{
	public void showDetails(){
		System.out.println("This is a BMW vehicle.");
	}
	
	public void maxSpeed(){
		System.out.println("Speed varies by model.");
	}
}

class BMWSeries3 extends BMW{
	@Override 
	public void showDetails(){
		System.out.println("This is BMW Series 3.");
	}
	
	@Override
	public void maxSpeed(){
		System.out.println("Max speed: 240 km/h.");
	}
}

class BMWSeries5 extends BMW {
    @Override
    public void showDetails() {
        System.out.println("This is BMW Series 5.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed: 260 km/h.");
    }
}

class BMWSeries7 extends BMW {
    @Override
    public void showDetails() {
        System.out.println("This is BMW Series 7.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed: 300 km/h.");
    }
}

public class TestBMW{
	public static void main(String args[]){
		BMW bmwCars[] = {new BMWSeries3(), new BMWSeries5(), new BMWSeries7()};
		
		for(BMW car : bmwCars){
			car.showDetails();
			car.maxSpeed();
			System.out.println();
		}
	}
}