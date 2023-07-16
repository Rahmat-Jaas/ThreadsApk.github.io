package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6T8  reason: invalid class name */
public final class AnonymousClass6T8 {
    public static final AnonymousClass76X A00(UserSession userSession, Integer num, String str, String str2, boolean z) {
        Integer num2;
        Long l;
        C18180wK.A1P(num, 0, userSession);
        long j = AnonymousClass76X.A05;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (str != null) {
            str3 = str;
        }
        String A0V = AnonymousClass00U.A0V("offline_feed_", str2, str3);
        if (num == AnonymousClass006.A04 || num == AnonymousClass006.A05) {
            num2 = AnonymousClass006.A0N;
            l = null;
            j = C86164wN.A09(AnonymousClass0TJ.A05, userSession, TimeUnit.SECONDS, 36597905957391102L);
        } else {
            num2 = AnonymousClass006.A01;
            if (num == num2 && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36326150490170819L)) {
                num2 = AnonymousClass006.A0j;
                l = null;
                j = -1;
            } else if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317745239560153L) || !AnonymousClass7GL.A01(userSession, num) || !z) {
                num2 = AnonymousClass006.A0Y;
                boolean A1Y = C18240wQ.A1Y(num, AnonymousClass006.A0u);
                long j2 = AnonymousClass76X.A04;
                if (A1Y) {
                    j2 *= (long) 2;
                }
                l = Long.valueOf(j2);
            } else {
                l = null;
                j = 0;
            }
        }
        return new AnonymousClass76X(num2, l, A0V, j);
    }
}
