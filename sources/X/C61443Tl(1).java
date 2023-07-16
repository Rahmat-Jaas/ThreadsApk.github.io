package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Tl  reason: invalid class name and case insensitive filesystem */
public final class C61443Tl {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (X.C59623Lo.A01(r3.A01(r7)) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.base.activity.BaseFragmentActivity r6, com.instagram.service.session.UserSession r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.util.List r11) {
        /*
            r5 = this;
            r4 = 0
            boolean r1 = X.AnonymousClass0wJ.A1Z(r6, r7)
            int r0 = r8.intValue()
            if (r0 != r1) goto L_0x0089
            X.0Ok r3 = X.C06810aP.A01
            boolean r0 = X.C18200wM.A1X(r7, r3)
            if (r0 != 0) goto L_0x001d
            com.instagram.user.model.User r0 = r3.A01(r7)
            boolean r0 = X.C59623Lo.A01(r0)
            if (r0 == 0) goto L_0x002e
        L_0x001d:
            r2 = 2131822330(0x7f1106fa, float:1.9277428E38)
            r1 = 15
            com.facebook.redex.IDxCListenerShape8S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape8S1200000_1_I2
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r10, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r2)
            r11.add(r4, r0)
        L_0x002e:
            boolean r0 = X.C18200wM.A1X(r7, r3)
            if (r0 != 0) goto L_0x0041
            com.instagram.user.model.User r0 = r3.A01(r7)
            boolean r0 = X.C59623Lo.A01(r0)
            r1 = 2131832203(0x7f112d8b, float:1.9297453E38)
            if (r0 == 0) goto L_0x0044
        L_0x0041:
            r1 = 2131820872(0x7f110148, float:1.9274471E38)
        L_0x0044:
            java.lang.String r0 = "IgPaymentsSettingsPaymentMethodsRoute"
            X.4MA r0 = A00(r6, r7, r0, r9, r1)
            r11.add(r0)
            r1 = 2131835362(0x7f1139e2, float:1.930386E38)
            java.lang.String r0 = "IgPaymentsSettingsSecurityPinRoute"
            X.4MA r0 = A00(r6, r7, r0, r9, r1)
            r11.add(r0)
            r1 = 2131824328(0x7f110ec8, float:1.928148E38)
            java.lang.String r0 = "IgPaymentsSettingsContactInfoRoute"
            X.4MA r0 = A00(r6, r7, r0, r9, r1)
            r11.add(r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36314206185719631(0x8103940000074f, double:3.028588445195968E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            if (r0 != 0) goto L_0x007d
            r0 = 36310980665278801(0x8100a500000151, double:3.026548613081059E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            if (r0 == 0) goto L_0x0089
        L_0x007d:
            r1 = 2131824939(0x7f11112b, float:1.928272E38)
            java.lang.String r0 = "IgPaymentsSettingsShippingInfoRoute"
            X.4MA r0 = A00(r6, r7, r0, r9, r1)
            r11.add(r0)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61443Tl.A01(com.instagram.base.activity.BaseFragmentActivity, com.instagram.service.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, java.util.List):void");
    }

    public static final AnonymousClass4MA A00(Activity activity, UserSession userSession, String str, String str2, int i) {
        Bundle A06 = C18180wK.A06();
        A06.putString("sessionId", str2);
        return AnonymousClass4MA.A00(new C64683rR(activity, A06, userSession, str, i), i);
    }
}
