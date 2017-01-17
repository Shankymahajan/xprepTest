package com.example.uddishverma22.xprep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Naman Gupta on 17-Jan-17.
 */

public class POJO {

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

//        @SerializedName("segments")
//        @Expose
//        String segments;

        @SerializedName("freeCancellationBy")
        @Expose
        String freeCancellationBy;

        public String getFreeCancellationBy() {
            return freeCancellationBy;
        }

//        public String getSegments() {
//            return segments;
//        }

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
