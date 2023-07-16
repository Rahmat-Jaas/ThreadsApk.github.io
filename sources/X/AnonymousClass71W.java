package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.71W  reason: invalid class name */
public final class AnonymousClass71W {
    public static String A01(String str, Currency currency, Locale locale) {
        String replaceAll = str.replaceAll("\\D", "");
        if (!replaceAll.equals("")) {
            return A00(Double.valueOf(Double.parseDouble(replaceAll)), currency, locale);
        }
        return replaceAll;
    }

    public static String A00(Double d, Currency currency, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(0);
        currencyInstance.setMinimumFractionDigits(0);
        return currencyInstance.format(d).trim();
    }
}
