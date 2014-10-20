package org.dongyf.szbus.entity;		

import java.util.List;

/**
 * Created by dongyf on 2014/10/14.
 */
public class ResultCodes <T>{
    private int resultCode;
    private String reason;
    private int errorCode;
    public List<T> BusInfo;
    /**/
    

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<T> getBusInfo() {
        return BusInfo;
    }

    public void setBusInfo(List<T> busInfo) {
        BusInfo = busInfo;
    }

    @Override
    public String toString() {
        return "ResultCodes{" +
                "resultCode=" + resultCode +
                ", reason='" + reason + '\'' +
                ", errorCode=" + errorCode +
                ", BusInfo=" + BusInfo +
                '}';
    }
}
