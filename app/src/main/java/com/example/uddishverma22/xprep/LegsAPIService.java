package com.example.uddishverma22.xprep;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Naman Gupta on 17-Jan-17.
 */

public interface LegsAPIService
{
    @GET("/x/mflights/search?departureAirport=LAX&arrivalAirport=ORD&departureDate=2017-04-22&childTravelerAge=2&apikey=TB1BMpIIHsb6eUGYKLdLpCXz4gEJoFSP")
    Call<POJO> getLegsData();

}
