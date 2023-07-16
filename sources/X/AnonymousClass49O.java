package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxObjectShape119S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.KtLambdaShape66S0100000_I2_46;

/* renamed from: X.49O  reason: invalid class name */
public final class AnonymousClass49O implements AnonymousClass0i4 {
    public C694948t A00;
    public C32163H7y A01;
    public String A02;
    public boolean A03 = false;
    public final boolean A04;
    public final boolean A05;
    public final H8D A06;
    public final ScheduledExecutorService A07 = AnonymousClass0gE.A00().A00;

    public final void A01() {
        this.A02 = null;
        C32163H7y h7y = this.A01;
        if (h7y != null) {
            this.A03 = false;
            h7y.A02 = null;
        }
        C694948t r0 = this.A00;
        if (r0 != null) {
            r0.A00 = null;
            r0.A01 = null;
        }
    }

    public static AnonymousClass49O A00(UserSession userSession) {
        AnonymousClass49O r3 = (AnonymousClass49O) C18180wK.A0c(userSession, AnonymousClass49O.class, 15);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36315791028718386L)) {
            C32163H7y h7y = (C32163H7y) userSession.A01(C32163H7y.class, new IDxObjectShape119S0200000_1_I2(0, r3, userSession));
            r3.A01 = h7y;
            C04220Ms.A0B(h7y, 1);
            r3.A00 = (C694948t) userSession.A01(C694948t.class, new KtLambdaShape66S0100000_I2_46(h7y, 15));
        }
        return r3;
    }

    public final void A02(int i) {
        String str;
        AnonymousClass29N r1;
        C32163H7y h7y = this.A01;
        if (h7y != null && h7y.A08 && (str = h7y.A02) != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(h7y.A03, "omnipicker_search_error_state"), 2448);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T(AnonymousClass3QA.A00(0, 10, 126), str);
                A0I.A0T("query_string", h7y.A01);
                if (i == 1) {
                    r1 = AnonymousClass29N.NO_RESULTS;
                } else if (i != 2) {
                    r1 = AnonymousClass29N.GENERAL_ERROR;
                } else {
                    r1 = AnonymousClass29N.NO_INTERNET;
                }
                A0I.A0O(r1, "error_state");
                A0I.Bb4();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (X.AnonymousClass0wJ.A1X(r1.A03.get()) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass49O(com.instagram.service.session.UserSession r4) {
        /*
            r3 = this;
            r3.<init>()
            X.0gE r0 = X.AnonymousClass0gE.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.A00
            r3.A07 = r0
            r0 = 0
            r3.A03 = r0
            X.H8D r0 = X.C60883Qx.A00(r4)
            r3.A06 = r0
            X.3Up r1 = X.C61623Up.A00(r4)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x002b
            X.0Oe r0 = r1.A03
            java.lang.Object r0 = r0.get()
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r3.A05 = r0
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36314382279575438(0x8103bd0003078e, double:3.0286998076594535E-306)
            X.C63803iN.A0E(r2, r4, r0)
            r0 = 36315791028914997(0x81050500040b35, double:3.029590706414369E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49O.<init>(com.instagram.service.session.UserSession):void");
    }

    public final void onSessionWillEnd() {
        A01();
    }
}
