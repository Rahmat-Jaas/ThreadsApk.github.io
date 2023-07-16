package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.6IR  reason: invalid class name */
public final class AnonymousClass6IR {
    public static final String A00(Locale locale, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AnonymousClass000.A00(266), locale);
        Date parse = simpleDateFormat.parse(str);
        if (parse != null) {
            String format = simpleDateFormat2.format(parse);
            C04220Ms.A06(format);
            return format;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
