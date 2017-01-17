package com.example.uddishverma22.xprep;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Naman Gupta on 17-Jan-17.
 */

public interface LegsAPIService
{
    @GET("mflights/search")
    Call<POJO> getLegsData(@Query("departureAirport") String da
                          ,@Query("arrivalAirport") String aA,
                           @Query("departureDate") String dD,
                           @Query("childTravelerAge") String cTA,
                           @Query("apikey") String apiKey);

}
