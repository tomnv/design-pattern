package com.vn.ex2;

public class BuilderSample {
	 public static void main(String[] args) {
		    BuilderFactory builderFactory  = new BuilderFactory();
		    HouseBuilder  houseBuilder  = builderFactory.getHouseBuilder(BuilderFactory.TIPI);
		    if(houseBuilder!= null){
		    	CivilEngineer engineer  = new CivilEngineer(houseBuilder);
		    	 engineer.constructHouse();
		    	 House house = engineer.getHouse();
		    	 System.out.println("Builder constructed: "+house);
		    }
		    
		    
		    
		    HouseBuilder iglooBuilder = new IglooHouseBuilder();
		    CivilEngineer engineer = new CivilEngineer(iglooBuilder);
		 
		    engineer.constructHouse();
		 
		    House house = engineer.getHouse();
		    System.out.println("Builder constructed: "+house);
		    
		  }
}
