package com.example.uddishverma22.xprep;

/**
 * Created by Naman Gupta on 17-Jan-17.
 */

public class LegsPOJO
{
    String legId;
    String travelDuration;
    String baggageFeesUrl;
    String segments;
    String freeCancellationBy;


    public String getLegId() {
        return legId;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public String getTravelDuration() {
        return travelDuration;
    }

    public void setTravelDuration(String travelDuration) {
        this.travelDuration = travelDuration;
    }

    public String getBaggageFeesUrl() {
        return baggageFeesUrl;
    }

    public void setBaggageFeesUrl(String baggageFeesUrl) {
        this.baggageFeesUrl = baggageFeesUrl;
    }

    public String getSegments() {
        return segments;
    }

    public void setSegments(String segments) {
        this.segments = segments;
    }

    public String getFreeCancellationBy() {
        return freeCancellationBy;
    }

    public void setFreeCancellationBy(String freeCancellationBy) {
        this.freeCancellationBy = freeCancellationBy;
    }
}
