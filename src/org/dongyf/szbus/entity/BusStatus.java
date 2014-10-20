package org.dongyf.szbus.entity;

import java.util.Date;

/**
 * Created by dongyf on 2014/10/13.
 */
public class BusStatus {

    private String stationName;
    private String carCode;
    private Date arrivalTime;
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
        return "BusStatus [stationName=" + stationName + ", carCode=" + carCode
                + ", arrivalTime=" + arrivalTime + "]";
	}


}
