package com.training;

import com.training.ifaces.IFunction;

public class TempCoverter implements IFunction {

	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return (arg-32)*5/9;
	}

}
