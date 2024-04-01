package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    public CurrencyType currencyType;

    public ChineseYR(){
        currencyType = CurrencyType.CHINESE_YR;
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
