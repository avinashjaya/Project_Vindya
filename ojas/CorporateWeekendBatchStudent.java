package com.ojas;

public class CorporateWeekendBatchStudent extends Student {
	public double calculateFee(String course) {
		double fee = 0;
		double corporateWeekEndFee = 35000;
		if (course.equals("java")) {
			fee = 15000;
		} else if (course.equals("ui")) {
			fee = 12000;
		} else if (course.equals("testing")) {
			fee = 10000;
		}
		return fee+corporateWeekEndFee;
	}
}
