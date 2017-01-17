package com.example.uddishverma22.xprep;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Naman Gupta on 17-Jan-17.
 */

public class POJO
{

    @SerializedName("leg")
    private ArrayList<Legs> leg;

    public ArrayList<Legs> getLegsData()
    {
        return leg;
     }


    public class Legs
    {
        @SerializedName("legId")
       String legId;

        @SerializedName("travelDuration")
       String travelDuration;

        @SerializedName("baggageFeesUrl")
        String baggageFeesUrl;

        @SerializedName("segments")
        String segments;

        @SerializedName("freeCancellationBoy")
        String freeCancellationBoy;

        public String getFreeCancellationBoy() {
            return freeCancellationBoy;
        }

        public String getSegments() {
            return segments;
        }

        public String getBaggageFeesUrl() {
            return baggageFeesUrl;
        }

        public String getTravelDuration() {
            return travelDuration;
        }

        public String getLegId() {
            return legId;
        }




        public Legs()
        {
            legId="";
            travelDuration="";
            baggageFeesUrl="";
            segments="";
            freeCancellationBoy="";
        }



    }


}
