package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7u2  reason: invalid class name and case insensitive filesystem */
public final class C132517u2 implements AnonymousClass0i1, C145208k3 {
    public final C145798l6 A00;
    public final C1198077b A01;
    public final C147128nR A02;
    public final C1200878l A03;
    public final C104596c2 A04;
    public final C04530Oa A05;
    public final AnonymousClass0YY A06 = C86164wN.A0q(this, 35);
    public final C03700Kj A07 = AnonymousClass0IY.A00;

    public final void cleanup() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (java.lang.System.currentTimeMillis() >= (X.C18190wL.A08(r1.A00) + 259200000)) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BQJ() {
        /*
            r9 = this;
            X.8nR r8 = r9.A02
            boolean r0 = r8.BXK()
            if (r0 == 0) goto L_0x007b
            X.8l6 r5 = r9.A00
            java.lang.String r4 = "IG_SCROLLING_SPEED"
            X.5Id r1 = r5.CfA(r4)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.A00
            long r6 = X.C18190wL.A08(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 259200000(0xf731400, double:1.280618154E-315)
            long r6 = r6 + r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
        L_0x0026:
            X.77b r0 = r9.A01
            X.5Id r1 = X.C1198077b.A00(r0, r8)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0047
            java.lang.Object r2 = X.C18240wQ.A0b(r1)
            com.facebook.dcp.model.Example r2 = (com.facebook.dcp.model.Example) r2
            long r0 = java.lang.System.currentTimeMillis()
            r5.CwJ(r2, r4, r0)
        L_0x0047:
            X.0Oa r0 = r9.A05
            java.lang.Object r2 = r0.getValue()
            X.8n4 r2 = (X.C146908n4) r2
            r1 = 0
            java.util.List r0 = X.AnonymousClass3RR.A00
            X.5Id r0 = r2.CX7(r1, r1, r0)
            java.lang.Object r1 = r0.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x007b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x007b
            X.78l r4 = r9.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.C18240wQ.A0b(r1)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            double r2 = X.C86124wJ.A00(r0)
            float r1 = (float) r2
            java.lang.String r0 = "Result"
            r4.A01(r0, r1)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132517u2.BQJ():void");
    }

    public C132517u2(UserSession userSession, Context context) {
        C04220Ms.A0B(userSession, 0);
        this.A03 = C132467tw.A00(userSession);
        this.A02 = new C126037eT(userSession);
        this.A04 = new C104596c2(userSession);
        C18200wM.A1S(userSession, context);
        this.A01 = ((C132317th) C86124wJ.A0o(userSession, C132317th.class, context, 35)).A00;
        this.A00 = ((C132207tW) C86124wJ.A0n(userSession, C132207tW.class, 42)).A00;
        this.A05 = AnonymousClass0OY.A02(C86154wM.A15(context, this, userSession, 11));
    }
}
