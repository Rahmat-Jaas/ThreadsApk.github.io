package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3TQ  reason: invalid class name */
public final class AnonymousClass3TQ {
    public CharSequence A00;
    public String A01;
    public String A02;
    public final Activity A03;
    public final C82454pe A04;
    public final UserSession A05;
    public final Integer A06;
    public final boolean A07;
    public final AnonymousClass2AC A08;
    public final AnonymousClass2AD A09;
    public C67263zF feedShareToFBController;

    public static final void A00(AnonymousClass29W r7, AnonymousClass3TQ r8) {
        UserSession userSession = r8.A05;
        AnonymousClass2AC r5 = r8.A08;
        AnonymousClass2AD r4 = r8.A09;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        A002.A0A("ig_media_id", "");
        C04220Ms.A0B(userSession, 0);
        C18210wN.A1D(A002, (long) C28161tl.A04(userSession).getInt("dialog_after_sharing_feed_show_times", 0));
        C49322rC.A00(r5, r7, r4, A002, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0069, code lost:
        if (X.C67373zR.A0D(r7) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3TQ(android.app.Activity r11, X.AnonymousClass2AC r12, X.AnonymousClass2AD r13, X.C82454pe r14, com.instagram.service.session.UserSession r15, java.lang.Integer r16) {
        /*
            r10 = this;
            X.AnonymousClass0wJ.A1Q(r15, r13)
            r0 = 4
            X.C04220Ms.A0B(r12, r0)
            r10.<init>()
            r10.A03 = r11
            r10.A05 = r15
            r10.A09 = r13
            r10.A08 = r12
            r0 = r16
            r10.A06 = r0
            r10.A04 = r14
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36322581372083635(0x810b3200021db3, double:3.033884946776733E-306)
            boolean r3 = X.C63803iN.A0E(r6, r15, r0)
            r10.A07 = r3
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131825677(0x7f11140d, float:1.9284217E38)
            if (r3 == 0) goto L_0x0031
            r0 = 2131825669(0x7f111405, float:1.92842E38)
        L_0x0031:
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            r10.A02 = r0
            X.2AI r0 = X.AnonymousClass2AI.A04
            com.instagram.service.session.UserSession r7 = r10.A05
            java.lang.String r5 = r0.A01(r7)
            if (r5 == 0) goto L_0x00d5
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00d5
            android.app.Activity r2 = r10.A03
            android.content.Context r9 = r2.getBaseContext()
            X.C04220Ms.A06(r9)
            int r0 = X.C63803iN.A02(r6, r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.16t r4 = X.C63073bQ.A01(r7)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r7)
            boolean r0 = r0.Apo()
            if (r0 != 0) goto L_0x006b
            boolean r1 = X.C67373zR.A0D(r7)
            r0 = 0
            if (r1 == 0) goto L_0x006c
        L_0x006b:
            r0 = 1
        L_0x006c:
            java.lang.String r4 = X.C63143c0.A04(r9, r4, r8, r0)
            boolean r0 = X.C67373zR.A0D(r7)
            if (r0 == 0) goto L_0x00ac
            if (r4 == 0) goto L_0x00c9
            r0 = 36322581372018098(0x810b3200011db2, double:3.033884946735287E-306)
            boolean r0 = X.C63803iN.A0E(r6, r7, r0)
            if (r0 == 0) goto L_0x00c9
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131825674(0x7f11140a, float:1.928421E38)
        L_0x008a:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r4}
        L_0x008e:
            android.text.Spanned r0 = X.C16370sw.A00(r2, r0, r1)
            X.C04220Ms.A09(r0)
        L_0x0095:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.A00 = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131825648(0x7f1113f0, float:1.9284158E38)
            if (r3 == 0) goto L_0x00a5
            r0 = 2131825685(0x7f111415, float:1.9284233E38)
        L_0x00a5:
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            r10.A01 = r0
            return
        L_0x00ac:
            if (r4 == 0) goto L_0x00c1
            r0 = 36322581372018098(0x810b3200011db2, double:3.033884946735287E-306)
            boolean r0 = X.C63803iN.A0E(r6, r7, r0)
            if (r0 == 0) goto L_0x00c1
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131825676(0x7f11140c, float:1.9284215E38)
            goto L_0x008a
        L_0x00c1:
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131825675(0x7f11140b, float:1.9284213E38)
            goto L_0x00d0
        L_0x00c9:
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131825673(0x7f111409, float:1.9284209E38)
        L_0x00d0:
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            goto L_0x008e
        L_0x00d5:
            android.app.Activity r0 = r10.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131825672(0x7f111408, float:1.9284207E38)
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TQ.<init>(android.app.Activity, X.2AC, X.2AD, X.4pe, com.instagram.service.session.UserSession, java.lang.Integer):void");
    }
}
