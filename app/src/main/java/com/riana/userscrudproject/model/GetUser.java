package com.riana.userscrudproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUser {
    @SerializedName("data")
    List<User> data;
    @SerializedName("total")
    String total;

    public String getTotal() {
        return total;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
