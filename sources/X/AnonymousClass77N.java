package X;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* renamed from: X.77N  reason: invalid class name */
public final class AnonymousClass77N {
    public static final AnonymousClass77N A00 = new AnonymousClass77N();
    public static final ImmutableSet A01;

    public final String A00(String str, BigDecimal bigDecimal) {
        int length = str.length();
        if (AnonymousClass0wJ.A1T(length, 3)) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(AnonymousClass7Kz.A0O());
            currencyInstance.setCurrency(Currency.getInstance(str));
            char minusSign = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getMinusSign();
            String format = currencyInstance.format(bigDecimal);
            C04220Ms.A06(format);
            String A0P = AnonymousClass8bP.A0P(format);
            AnonymousClass0wJ.A1Y(A0P, "(");
            if (!A0P.startsWith("(") || !A0P.endsWith(")")) {
                return A0P;
            }
            return AnonymousClass00U.A0B(AnonymousClass8bQ.A0l(AnonymousClass8bQ.A0l(A0P, "(", "", false), ")", "", false), minusSign);
        }
        throw C18190wL.A0a(Strings.A00("Invalid currency length: %d for currencyCode: %s", Integer.valueOf(length), str));
    }

    static {
        ImmutableSet A04 = ImmutableSet.A04(new Object[]{new Locale("ar", "AR"), new Locale("he", "IL")}, 2);
        C04220Ms.A06(A04);
        A01 = A04;
    }
}
