package com.training.ifaces;

import

@WebService
@SOAPBinding(style = Style.RPC)
public interface RatingService {




@WebResult(name = "rating")
public double findRating(@WebParam(name = "movieName") String movieName);
}