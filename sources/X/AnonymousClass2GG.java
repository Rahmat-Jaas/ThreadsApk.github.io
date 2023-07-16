package X;

import android.content.Context;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: X.2GG  reason: invalid class name */
public final class AnonymousClass2GG {
    public static final Object A00(C63893iY r9) {
        EnumSet of;
        C04220Ms.A0B(r9, 0);
        int i = 0;
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        Integer num = AnonymousClass006.A0N;
        Integer num2 = num;
        Integer[] A1a = C18240wQ.A1a();
        int length = A1a.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num3 = A1a[i];
            if (C04220Ms.A0I(C36532Rr.A00(num3), A0B)) {
                num = num3;
                break;
            }
            i++;
        }
        Context A08 = C18230wP.A08();
        C04220Ms.A0B(num, 0);
        if (num == AnonymousClass006.A0C || num == num2) {
            of = EnumSet.of(AnonymousClass24N.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE, AnonymousClass24N.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY, AnonymousClass24N.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID);
        } else {
            of = EnumSet.of(AnonymousClass24N.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE);
        }
        EnumSet complementOf = EnumSet.complementOf(of);
        C04220Ms.A06(complementOf);
        Iterator it = complementOf.iterator();
        String str = null;
        while (it.hasNext()) {
            AnonymousClass24N r0 = (AnonymousClass24N) it.next();
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    str = C63573hp.A02(A08);
                } else if (ordinal == 2) {
                    str = AnonymousClass2BE.A01;
                } else if (ordinal == 3 && ((str = C63573hp.A03(A08)) == null || str.length() == 0)) {
                    str = null;
                }
            }
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return null;
    }
}
