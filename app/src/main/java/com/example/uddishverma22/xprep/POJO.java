package com.example.uddishverma22.xprep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Naman Gupta on 17-Jan-17.
 */

public class POJO implements Serializable{

    @SerializedName("legs")
    @Expose
    private ArrayList<Legs> leg;

    public ArrayList<Legs> getLegsData() {
        return leg;
    }


    public static class Legs {

        @SerializedName("legId")
        @Expose
        String legId;

        @SerializedName("travelDuration")
        @Expose
        String travelDuration;

        @SerializedName("baggageFeesUrl")
        @Expose
        String baggageFeesUrl;


        public String getBaggageFeesUrl() {
            return baggageFeesUrl;
        }

        public String getTravelDuration() {
            return travelDuration;
        }

        public String getLegId() {
            return legId;
        }


    }


}
