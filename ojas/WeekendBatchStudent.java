package com.ojas;

public class WeekendBatchStudent extends Student {
	public double calculateFee(String course) {
		double fee = 0;
		double weekEndFee = 20000;
		if (course.equals("java")) {
			fee = 15000;
		} else if (course.equals("ui")) {
			fee = 12000;
		} else if (course.equals("testing")) {
			fee = 10000;
		}
		return fee+weekEndFee;
	}
}
