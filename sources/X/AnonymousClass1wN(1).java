package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.1wN  reason: invalid class name */
public final class AnonymousClass1wN extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "DataSaverOptionsFragment";
    public UserSession A00;
    public C62153Xk A01;

    public final String getModuleName() {
        return "data_saver_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131824766);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1623371727);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(985407814, A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r8 = this;
            r0 = 1601501263(0x5f74f84f, float:1.7651946E19)
            int r4 = X.C14030oh.A02(r0)
            super.onResume()
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            com.instagram.service.session.UserSession r0 = r8.A00
            X.1tl r6 = X.AnonymousClass3WS.A01(r0)
            com.instagram.service.session.UserSession r0 = r8.A00
            X.3V2 r0 = X.AnonymousClass3V2.A00(r0)
            boolean r3 = r0.A01()
            r0 = 2131824773(0x7f111085, float:1.9282383E38)
            X.C63613hu.A04(r5, r0)
            r0 = 2131824772(0x7f111084, float:1.9282381E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 275(0x113, float:3.85E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r8, r0)
            X.3Xk r7 = new X.3Xk
            r7.<init>((java.lang.CharSequence) r1, (android.view.View.OnClickListener) r0)
            r8.A01 = r7
            com.instagram.service.session.UserSession r0 = r8.A00
            X.3V2 r0 = X.AnonymousClass3V2.A00(r0)
            com.instagram.service.session.UserSession r0 = r0.A00
            android.content.SharedPreferences r2 = X.C28161tl.A04(r0)
            java.lang.String r1 = "data_saver_network_resources_quality"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            if (r1 == r0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c5
            r0 = 1
            if (r1 == r0) goto L_0x00c9
            r0 = 2
            if (r1 != r0) goto L_0x00cd
            r0 = 2131824770(0x7f111082, float:1.9282377E38)
        L_0x0058:
            java.lang.String r0 = r8.getString(r0)
            r7.A04 = r0
            r1 = r3 ^ 1
            X.3Xk r0 = r8.A01
            r0.A07 = r1
            X.C18210wN.A1G(r8)
            r2 = 2131824768(0x7f111080, float:1.9282373E38)
            r1 = 6
            com.facebook.redex.IDxCListenerShape149S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape149S0200000_1_I2
            r0.<init>(r1, r6, r8)
            X.AnonymousClass4MC.A08(r0, r5, r2, r3)
            r0 = 2131824769(0x7f111081, float:1.9282375E38)
            X.C63293hC.A01(r8, r5, r0)
            X.3Xk r0 = r8.A01
            r5.add(r0)
            com.instagram.service.session.UserSession r3 = r8.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320618571896921(0x81096900001859, double:3.032643664035093E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bb
            android.content.SharedPreferences r1 = r6.A00
            java.lang.String r0 = "high_quality_media_upload"
            r3 = 0
            int r1 = r1.getInt(r0, r3)
            r0 = 1
            if (r0 != r1) goto L_0x009e
            r3 = 1
        L_0x009e:
            r0 = 2131828340(0x7f111e74, float:1.9289618E38)
            X.C63613hu.A04(r5, r0)
            r2 = 2131828339(0x7f111e73, float:1.9289616E38)
            r1 = 7
            com.facebook.redex.IDxCListenerShape149S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape149S0200000_1_I2
            r0.<init>(r1, r6, r8)
            X.AnonymousClass4MC.A08(r0, r5, r2, r3)
            r1 = 2131828338(0x7f111e72, float:1.9289614E38)
            X.3hC r0 = new X.3hC
            r0.<init>((int) r1)
            r5.add(r0)
        L_0x00bb:
            r8.setItems(r5)
            r0 = 1684619959(0x646942b7, float:1.7211595E22)
            X.C14030oh.A09(r0, r4)
            return
        L_0x00c5:
            r0 = 2131824767(0x7f11107f, float:1.9282371E38)
            goto L_0x0058
        L_0x00c9:
            r0 = 2131824771(0x7f111083, float:1.928238E38)
            goto L_0x0058
        L_0x00cd:
            java.lang.String r0 = "Unrecognized network setting"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1wN.onResume():void");
    }
}
