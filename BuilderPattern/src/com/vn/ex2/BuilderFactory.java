package com.vn.ex2;

public class BuilderFactory {
  public static final String TIPI  = "tipi";
  public static final String IGLOO = "Igloo";
  
   
   public HouseBuilder getHouseBuilder(String param){
	   
	   if(TIPI.equals(param)){
		   return new TipiHouseBuilder();
	   }else if(IGLOO.equalsIgnoreCase(param)){
		   return new IglooHouseBuilder();
	   }
	   return null;
   }
}
