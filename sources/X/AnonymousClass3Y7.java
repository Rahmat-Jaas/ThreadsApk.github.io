package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/* renamed from: X.3Y7  reason: invalid class name */
public final class AnonymousClass3Y7 {
    public int A00;
    public int A01;

    public static String A01(AnonymousClass3Y7 r5) {
        LocalTime of;
        if (r5 == null) {
            return null;
        }
        Configuration configuration = Resources.getSystem().getConfiguration();
        DateTimeFormatter ofLocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        Locale locale = configuration.getLocales().get(0);
        if (locale == null || ofLocalizedTime == null || (of = LocalTime.of(r5.A00, r5.A01)) == null) {
            return null;
        }
        return of.format(ofLocalizedTime.withLocale(locale));
    }

    public static AnonymousClass3Y7 A00(String str) {
        String[] split = str.split(":");
        if (split.length >= 2) {
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt >= 0 && parseInt <= 23 && parseInt2 >= 0 && parseInt2 <= 59) {
                    return new AnonymousClass3Y7(parseInt, parseInt2);
                }
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AnonymousClass00U.A0V(String.format(locale, "%02d", C18210wN.A1X(this.A00)), ":", String.format(locale, "%02d", C18210wN.A1X(this.A01)));
    }

    public AnonymousClass3Y7(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
