package X;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.6OK  reason: invalid class name */
public final class AnonymousClass6OK {
    public static final Object A00(C63893iY r8) {
        String format;
        C04220Ms.A0B(r8, 0);
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.setCurrency(Currency.getInstance((String) A0B));
        String A01 = C18250wR.A0h("\\D").A01((String) C63893iY.A0C(r8, A0h, 1), "");
        if (A01.length() <= 0) {
            A01 = "0";
        }
        double parseDouble = Double.parseDouble(A01) / Math.pow(10.0d, (double) currencyInstance.getCurrency().getDefaultFractionDigits());
        if (parseDouble > 0.0d) {
            format = currencyInstance.format(parseDouble);
        } else {
            format = currencyInstance.format(0.0d);
        }
        C04220Ms.A06(format);
        if (parseDouble > 2.147483646E9d) {
            return C18230wP.A0s(format, 0, format.length() - 1);
        }
        return format;
    }
}
