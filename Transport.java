package ProgramOnInheritanceInJAVA;

class Vehicle{
	protected String vehiclemodel;
	protected int registrationnumber;
	protected int vehiclespeed;
	protected int fuelcapacity;
	protected int fuelconsumption;
	
	Vehicle(String vehiclemodel,int registrationnumber,int vehiclespeed,int fuelcapacity,int fuelconsumption){
		this.vehiclemodel=vehiclemodel;
		this.registrationnumber=registrationnumber;
		this.vehiclespeed=vehiclespeed;
		this.fuelcapacity=fuelcapacity;
		this.fuelconsumption=fuelconsumption;
	}
	
	public String getVehiclemodel() {
		return vehiclemodel;
	}


	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}


	public int getRegistrationnumber() {
		return registrationnumber;
	}


	public void setRegistrationnumber(int registrationnumber) {
		this.registrationnumber = registrationnumber;
	}


	public int getVehiclespeed() {
		return vehiclespeed;
	}


	public void setVehiclespeed(int vehiclespeed) {
		this.vehiclespeed = vehiclespeed;
	}


	public int getFuelcapacity() {
		return fuelcapacity;
	}


	public void setFuelcapacity(int fuelcapacity) {
		this.fuelcapacity = fuelcapacity;
	}


	public int getFuelconsumption() {
		return fuelconsumption;
	}


	public void setFuelconsumption(int fuelconsumption) {
		this.fuelconsumption = fuelconsumption;
	}


	protected int fuelNeeded(int kilometer) {
		int fuelneeded=kilometer/fuelconsumption;
		return fuelneeded;
	}
	
	protected int distanceCovered(int time) {
		int distancecovered=time*vehiclespeed;
		return distancecovered;
	}
	
	protected void display() {
		
	}
}


class Truck extends Vehicle{
	int cargoweightlimit;
	Truck(String vehiclemodel,int registrationnumber,int vehiclespeed,int fuelcapacity,int fuelconsumption,int cargoweightlimit){
		super(vehiclemodel,registrationnumber,vehiclespeed,fuelcapacity,fuelconsumption);
		this.cargoweightlimit=cargoweightlimit;
	}

	public int getCargoWeightLimit() {
		return cargoweightlimit;
	}


	public void setCargoWeightLimit(int cargoweightlimit) {
		this.cargoweightlimit = cargoweightlimit;
	}

	protected void display() {
		System.out.println("Vehicle Model is \t\t\t:\t"+vehiclemodel);
		System.out.println("Registration number is \t\t\t:\t"+registrationnumber);
		System.out.println("Vehicle speed \t\t\t\t:\t"+vehiclespeed+" km/hour");
		System.out.println("Fuel Capacity \t\t\t\t:\t"+fuelcapacity+" liters");
		System.out.println("Fuel Consumption \t\t\t:\t"+fuelconsumption+" km/liter");
	}
}


class Bus extends Vehicle{
	int noofpassengers;
	
	Bus(String vehiclemodel,int registrationnumber,int vehiclespeed,int fuelcapacity,int fuelconsumption,int noofpassengers){
		super(vehiclemodel,registrationnumber,vehiclespeed,fuelcapacity,fuelconsumption);
		this.noofpassengers=noofpassengers;
	}

	public int getNoOfPassengers() {
		return noofpassengers;
	}


	public void setNoOfPassengers(int noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
	
	protected void display() {
		System.out.println("\n\n\nVehicle Model is \t\t\t:\t"+vehiclemodel);
		System.out.println("Registration number is \t\t\t:\t"+registrationnumber);
		System.out.println("Vehicle speed \t\t\t\t:\t"+vehiclespeed+" km/hour");
		System.out.println("Fuel Capacity \t\t\t\t:\t"+fuelcapacity+" liters");
		System.out.println("Fuel Consumption \t\t\t:\t"+fuelconsumption+" km/liter");
	}
}


public class Transport {

	public static void main(String[] args) {
		Truck t1=new Truck("EICHER",4400,60,500,10,50000);
		Bus b1=new Bus("NAITIK TRAVELS",4400,85,20,60,45);
		
		int fneed=t1.fuelNeeded(150);
		int dcover=t1.distanceCovered(7);
		t1.display();
		System.out.println("Total distance traveled int 7 hours is \t:\t"+dcover);
		System.out.println("Total Fuel Require to travel 150 km is \t:\t"+fneed);
		
		fneed=b1.fuelNeeded(150);
		dcover=b1.distanceCovered(7);
		b1.display();
		System.out.println("Total distance traveled int 7 hours is \t:\t"+dcover);
		System.out.println("Total Fuel Require to travel 150 km is \t:\t"+fneed);
	}

}
