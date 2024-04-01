package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    public CurrencyType currencyType;

    public Pound(){
        currencyType = CurrencyType.POUND;
    }
    @Override
    public Double convert(CurrencyType currencyType) {

        return currencyType.getRate() / this.currencyType.getRate();
    }

    @Override
    public CurrencyType getTypeOfCurrency() {
        return this.currencyType;
    }
}
