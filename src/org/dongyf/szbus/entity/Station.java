package org.dongyf.szbus.entity;

/**
 * Created by dongyf on 2014/10/13.
 */
public class Station {

    private String station;
    private String stationCode;
    private String local;
    private String street;
    private String sections;
    private String point;
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Station [station=" + station + ", stationCode=" + stationCode
				+ ", local=" + local + ", street=" + street + ", sections="
				+ sections + ", point=" + point + "]";
	}
    
	
}
