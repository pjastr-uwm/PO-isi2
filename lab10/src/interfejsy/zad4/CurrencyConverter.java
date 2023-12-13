package interfejsy.zad4;

public class CurrencyConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        return 4.56 * amount;
    }

    @Override
    public double convertToUSD(double amount) {
        return 4.2 * amount;
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency == null)
            return 0;
        if (currency.equals("EUR"))
            return  4.56;
        return 4.9;
    }
}
