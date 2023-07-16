package X;

import android.content.Context;
import java.util.Date;
import java.util.EnumMap;

/* renamed from: X.6Us  reason: invalid class name and case insensitive filesystem */
public final class C102316Us {
    public static final CharSequence A00(Context context, int i, int i2) {
        int i3;
        int i4;
        String string;
        long j = (long) 1000;
        long j2 = ((long) i) * j;
        Date date = new Date(j2);
        Class<AnonymousClass68E> cls = AnonymousClass68E.class;
        EnumMap enumMap = new EnumMap(cls);
        C19591Ayr.A0B(new Date(System.currentTimeMillis()), date, enumMap);
        enumMap.get(AnonymousClass68E.HOURS);
        AnonymousClass68E r12 = AnonymousClass68E.MINUTES;
        Number number = (Number) enumMap.get(r12);
        if (number != null) {
            i3 = number.intValue();
        } else {
            i3 = 0;
        }
        AnonymousClass68E r9 = AnonymousClass68E.SECONDS;
        Number number2 = (Number) enumMap.get(r9);
        if (number2 != null) {
            i4 = number2.intValue();
        } else {
            i4 = 0;
        }
        Date date2 = new Date(System.currentTimeMillis());
        Date date3 = new Date(j2 + (((long) i2) * j));
        EnumMap enumMap2 = new EnumMap(cls);
        C19591Ayr.A0B(date2, date3, enumMap2);
        int A03 = C18210wN.A03((Number) enumMap2.get(r12));
        int A032 = C18210wN.A03((Number) enumMap2.get(r9));
        if (A03 > 0 || A032 > 0) {
            if (i3 <= 0) {
                i3 = 0;
            }
            string = context.getString(2131829038, C18210wN.A1Y(Integer.valueOf(i3), i4));
        } else {
            string = context.getString(2131829039);
        }
        C04220Ms.A06(string);
        return string;
    }
}
