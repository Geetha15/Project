package com.capg.fms.flight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Flight {
    @Id
   

    private long flightNumber;

	private String flightModel;
   
    private String carrierName;
    
  
    private int seatCapacity;
    
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(long flightNumber, String flightModel, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName=" + carrierName
				+ ", seatCapacity=" + seatCapacity + "]";
	}
    
	
    
    
    
    

}