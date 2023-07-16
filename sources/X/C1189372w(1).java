package X;

import android.content.res.Resources;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableSet;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.72w  reason: invalid class name and case insensitive filesystem */
public final class C1189372w {
    public static final Set A00 = ImmutableSet.A04(new Object[]{Locale.CHINA, Locale.TAIWAN, Locale.JAPAN, Locale.KOREA}, 4);

    public static String A00(Resources resources, Integer num, boolean z) {
        Locale locale;
        Integer num2;
        int i;
        double floor;
        String str;
        int i2;
        int i3;
        int i4;
        if (resources.getConfiguration().getLocales().isEmpty()) {
            locale = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            locale = resources.getConfiguration().getLocales().get(0);
        }
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        if (intValue < 10000) {
            return NumberFormat.getNumberInstance(locale).format(num);
        }
        if (A00.contains(locale)) {
            num2 = AnonymousClass006.A00;
        } else {
            num2 = AnonymousClass006.A01;
        }
        double d = (double) intValue;
        if (num2.intValue() != 0) {
            i = 3;
        } else {
            i = 4;
        }
        double d2 = (double) i;
        double pow = d / Math.pow(Math.pow(10.0d, d2), Math.floor(Math.floor(Math.log10(d)) / d2));
        if (pow >= Math.pow(10.0d, (double) (i - 1))) {
            floor = Math.floor(pow);
        } else {
            floor = Math.floor(pow * 10.0d) / 10.0d;
        }
        if (((int) Math.floor(10.0d * floor)) % 10 == 0) {
            str = "%.0f";
        } else {
            str = "%.1f";
        }
        String format = String.format(Locale.getDefault(), str, new Object[]{Double.valueOf(floor)});
        int i5 = 0;
        int i6 = 1;
        while (true) {
            if (num2.intValue() != 0) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            int i7 = i2 + i5;
            if (num2.intValue() != 0) {
                i3 = 9;
            } else {
                i3 = 8;
            }
            if (i7 > i3) {
                break;
            }
            i6 = (int) (((double) i6) * Math.pow(10.0d, (double) i2));
            if (((double) i6) > d) {
                break;
            }
            i5 += i2;
        }
        if (i5 == 3) {
            i4 = 2131835942;
            if (z) {
                i4 = 2131835943;
            }
        } else if (i5 == 4) {
            i4 = 2131835941;
        } else if (i5 == 6) {
            i4 = 2131835939;
            if (z) {
                i4 = 2131835940;
            }
        } else if (i5 == 8) {
            i4 = 2131835938;
        } else if (i5 == 9) {
            i4 = 2131835936;
            if (z) {
                i4 = 2131835937;
            }
        } else {
            throw C18250wR.A0V(AnonymousClass00U.A0J("Invalid multiplier: ", i5));
        }
        return C18190wL.A0h(resources, StringFormatUtil.formatStrLocaleSafe("%s", format), i4);
    }
}
