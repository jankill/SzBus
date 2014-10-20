package org.dongyf.szbus.entity;

import java.util.Date;

/**
 * Created by dongyf on 2014/10/13.
 */
public class StationCode {
    
    private String bus;
    private String fromTo;
    private String code;
    private String carCode;
    private Date time;
    private String distance;
	public String getBus() {
		return bus;
	}
	public void setBus(String bus) {
		this.bus = bus;
	}
	public String getFromTo() {
		return fromTo;
	}
	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "StationCode [bus=" + bus + ", fromTo=" + fromTo + ", code="
				+ code + ", carCode=" + carCode + ", time=" + time
				+ ", distance=" + distance + "]";
	}
    
  


}
