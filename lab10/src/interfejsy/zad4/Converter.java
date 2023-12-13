package interfejsy.zad4;

public interface Converter {

    double convertToEuro(double amount);
    double convertToUSD(double amount);

    double getConversionRate(String currency);
}
