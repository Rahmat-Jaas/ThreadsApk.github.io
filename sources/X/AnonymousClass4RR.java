package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4RR  reason: invalid class name */
public final class AnonymousClass4RR implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public AnonymousClass4RR(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b0, code lost:
        if (r0 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        r5.A0L(r1);
        r5.A0K(2131836117);
        X.C18200wM.A1O(r5);
        r5.A0c(X.C18250wR.A0E(r4, r3, r6, 23), r7.getResources().getString(2131832765));
        r5.A0a(X.C18250wR.A0E(r4, r3, r6, 24), r7.getResources().getString(2131835345));
        r5.A0M(new com.facebook.redex.IDxCListenerShape100S0300000_1_I2(3, r3, r6, r4));
        X.AnonymousClass0wJ.A1K(r5);
        X.AnonymousClass6SU.A00(r2, "IG_FEED_CROSS_POSTING_UPSELL");
        X.C62383Zj.A00(X.C318729h.CP_FLOW, r3, X.AnonymousClass2A8.A04, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            android.app.Activity r1 = r10.A00
            com.instagram.service.session.UserSession r0 = r10.A01
            X.3AE r6 = new X.3AE
            r6.<init>(r1, r0)
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "share_menu"
            java.lang.String r0 = "XPostFeedEntryPoint"
            r4.put(r0, r1)
            boolean r9 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "userHasAutoXpostFeedToFBEnabled"
            r4.put(r0, r1)
            X.2A9 r3 = X.AnonymousClass2A9.A0B
            android.app.Activity r7 = r6.A01
            X.Dsm r5 = X.C18190wL.A0W(r7)
            r0 = 2131231789(0x7f08042d, float:1.8079669E38)
            X.C18230wP.A11(r7, r5, r0)
            com.instagram.service.session.UserSession r2 = r6.A02
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            if (r9 == 0) goto L_0x00b3
            r0 = 36878229881094296(0x83048e00020098, double:3.3852793012920325E-306)
        L_0x0038:
            java.lang.String r1 = X.C63803iN.A0C(r8, r2, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -169269864: goto L_0x009d;
                case 87906535: goto L_0x00a7;
                case 634559352: goto L_0x0093;
                default: goto L_0x0043;
            }
        L_0x0043:
            r1 = 2131833889(0x7f113421, float:1.9300873E38)
        L_0x0046:
            r5.A0L(r1)
            r0 = 2131836117(0x7f113cd5, float:1.9305392E38)
            r5.A0K(r0)
            X.C18200wM.A1O(r5)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131832765(0x7f112fbd, float:1.9298593E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 23
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r4, r3, r6, r0)
            r5.A0c(r0, r1)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131835345(0x7f1139d1, float:1.9303826E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 24
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r4, r3, r6, r0)
            r5.A0a(r0, r1)
            r1 = 3
            com.facebook.redex.IDxCListenerShape100S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape100S0300000_1_I2
            r0.<init>(r1, r3, r6, r4)
            r5.A0M(r0)
            X.AnonymousClass0wJ.A1K(r5)
            java.lang.String r0 = "IG_FEED_CROSS_POSTING_UPSELL"
            X.AnonymousClass6SU.A00(r2, r0)
            X.2A8 r1 = X.AnonymousClass2A8.A04
            X.29h r0 = X.C318729h.CP_FLOW
            X.C62383Zj.A00(r0, r3, r1, r2, r4)
            return
        L_0x0093:
            java.lang.String r0 = "statement_consistency_use_same_info"
            boolean r0 = r1.equals(r0)
            r1 = 2131836119(0x7f113cd7, float:1.9305396E38)
            goto L_0x00b0
        L_0x009d:
            java.lang.String r0 = "statement_consistency_keep_updated"
            boolean r0 = r1.equals(r0)
            r1 = 2131836118(0x7f113cd6, float:1.9305394E38)
            goto L_0x00b0
        L_0x00a7:
            java.lang.String r0 = "statement_recognition"
            boolean r0 = r1.equals(r0)
            r1 = 2131836120(0x7f113cd8, float:1.9305398E38)
        L_0x00b0:
            if (r0 != 0) goto L_0x0046
            goto L_0x0043
        L_0x00b3:
            r0 = 36878491874230428(0x8304cb0004009c, double:3.385444986806284E-306)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RR.run():void");
    }
}
