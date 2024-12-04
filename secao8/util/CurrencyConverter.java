package secao8.util;

public class CurrencyConverter {
	
	public static final double IOF = 6;
	
	public static double addIOF(double value) {
		return value * IOF/100;
	}
	
	public static double converter(double dollarPrice, double quantityDollar) {
		return dollarPrice * quantityDollar + addIOF(dollarPrice * quantityDollar);
	}

}
