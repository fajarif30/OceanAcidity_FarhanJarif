import java.util.*;
public class AcidityRecord{
  //instance variables  
  private String date;
  private double oceanCO2;
  private double oceanPH;
  private double atmosphereCO2;
  
  //constructor
  public AcidityRecord(String date, double oceanCO2, double oceanPH, double atmosphereCO2){
    this.date = date;
    this.oceanCO2 = oceanCO2;
    this.oceanPH = oceanPH;
    this.atmosphereCO2 = atmosphereCO2;  

  }

  //accesors
  public String getDate(){
		return this.date;
	}

	public double getOceanCO2(){
		return this.oceanCO2;
	}

	public double getOceanPH(){
		return this.oceanPH;
	}

	public double getAtmosphereCO2(){
		return this.atmosphereCO2;
	}
  
  //toString method
	public String toString(){
		return this.date + " "+ this.oceanCO2;
	}


}