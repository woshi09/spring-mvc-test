package com.spring.test.model;

/**
 * Created by guixinyuan on 16/3/11.
 */
public class WmPoiSpArea {
    public long id;
    public int type;
    public long min_lat;
    public long max_lat;
    public long min_lng;
    public long max_lng;
    public double min_price;
    public int ctime;
    public int utime;
    public int valid;
    public double shipping_fee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getMin_lat() {
        return min_lat;
    }

    public void setMin_lat(long min_lat) {
        this.min_lat = min_lat;
    }

    public long getMax_lat() {
        return max_lat;
    }

    public void setMax_lat(long max_lat) {
        this.max_lat = max_lat;
    }

    public long getMin_lng() {
        return min_lng;
    }

    public void setMin_lng(long min_lng) {
        this.min_lng = min_lng;
    }

    public long getMax_lng() {
        return max_lng;
    }

    public void setMax_lng(long max_lng) {
        this.max_lng = max_lng;
    }

    public double getMin_price() {
        return min_price;
    }

    public void setMin_price(double min_price) {
        this.min_price = min_price;
    }

    public int getCtime() {
        return ctime;
    }

    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    public int getUtime() {
        return utime;
    }

    public void setUtime(int utime) {
        this.utime = utime;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public double getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(double shipping_fee) {
        this.shipping_fee = shipping_fee;
    }
}
