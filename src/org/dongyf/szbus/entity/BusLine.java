package org.dongyf.szbus.entity;

/**
 * Created by Dongyf on 2014/10/19.
 * 公交车  例如：119路
 */
/*
{
        "resultcode": "200",
        "reason": "success",
        "result": [{
        "bus": "119",
        "FromTo": "火车站北广场首末站",
        "code": "e3c73484-f4dd-4a62-9a8f-040eb4c0a42c"
        },
        {
        "bus": "119",
        "FromTo": "唯亭便利中心首末站",
        "code": "c527510a-144d-4d75-bac9-67ee24e1d6ce"
        }],
        "error_code": 0
        }*/

public class BusLine {

    private int bus;
    private String FromTo;
    private String code;

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Busline{" +
                "bus=" + bus +
                ", FromTo='" + FromTo + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
