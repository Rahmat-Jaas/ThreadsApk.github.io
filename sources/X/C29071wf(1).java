package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.1wf  reason: invalid class name and case insensitive filesystem */
public final class C29071wf extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "TakeABreakMenuFragment";
    public UserSession A00;
    public long A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public C29071wf(int i) {
        String valueOf;
        this.A04 = true;
        this.A03 = false;
        this.A04 = false;
        this.A03 = true;
        if (i == 0) {
            valueOf = "off";
        } else {
            valueOf = String.valueOf(i);
        }
        this.A02 = valueOf;
    }

    public final void configureActionBar(AnonymousClass4u2 r1) {
    }

    public final String getModuleName() {
        return "time_spent";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(500657806);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-489661974, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r15 = this;
            r0 = 1032344701(0x3d88547d, float:0.0665674)
            int r5 = X.C14030oh.A02(r0)
            super.onResume()
            com.instagram.service.session.UserSession r2 = r15.A00
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36316134626102240(0x81055500010be0, double:3.029807998659136E-306)
            java.lang.Boolean r2 = X.C63803iN.A05(r6, r2, r0)
            boolean r2 = r2.booleanValue()
            long r12 = X.C18240wQ.A08(r2)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            com.instagram.service.session.UserSession r7 = r15.A00
            r2 = 36879084579651762(0x830555000300b2, double:3.385819816101369E-306)
            java.lang.String r3 = X.C63803iN.A0C(r6, r7, r2)
            java.lang.String r2 = ","
            java.lang.String[] r3 = r3.split(r2)
            int r2 = r3.length
            if (r2 <= 0) goto L_0x007a
            java.util.List r2 = java.util.Arrays.asList(r3)
            java.util.ArrayList r7 = X.C18200wM.A0s(r2)
        L_0x003f:
            r3 = 2131836597(0x7f113eb5, float:1.9306365E38)
            X.3hC r2 = new X.3hC
            r2.<init>((int) r3)
            r4.add(r2)
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r11 = r7.iterator()
        L_0x0052:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x007f
            java.lang.String r9 = X.C18180wK.A0k(r11)
            int r10 = java.lang.Integer.parseInt(r9)
            if (r10 <= 0) goto L_0x0052
            android.content.res.Resources r8 = X.AnonymousClass0wJ.A0B(r15)
            com.instagram.service.session.UserSession r2 = r15.A00
            java.lang.Boolean r2 = X.C63803iN.A05(r6, r2, r0)
            boolean r3 = r2.booleanValue()
            boolean r2 = r15.A03
            java.lang.String r2 = X.C60653Py.A00(r8, r10, r3, r2)
            X.C62563aI.A01(r9, r2, r14)
            goto L_0x0052
        L_0x007a:
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            goto L_0x003f
        L_0x007f:
            com.instagram.service.session.UserSession r0 = r15.A00
            X.3am r8 = X.C63043bN.A01
            long r0 = r8.A05(r0)
            r15.A01 = r0
            boolean r6 = r15.A04
            java.lang.String r9 = "off"
            r2 = 0
            if (r6 == 0) goto L_0x00db
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r15)
            r0 = 2131831950(0x7f112c8e, float:1.929694E38)
        L_0x0098:
            java.lang.String r0 = r1.getString(r0)
            X.C62563aI.A01(r9, r0, r14)
        L_0x009f:
            long r0 = r15.A01
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ba
            long r0 = r0 / r12
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cf
            java.lang.String r6 = java.lang.String.valueOf(r0)
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x00cf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r15.A02 = r0
        L_0x00ba:
            java.lang.String r0 = r15.A02
            r11 = 1
            com.facebook.redex.IDxCListenerShape3S0200100_1_I2 r10 = new com.facebook.redex.IDxCListenerShape3S0200100_1_I2
            r10.<init>(r11, r12, r14, r15)
            X.C61353Sw.A00(r10, r0, r4, r14)
            r15.setItems(r4)
            r0 = 1955538403(0x748f25e3, float:9.073082E31)
            X.C14030oh.A09(r0, r5)
            return
        L_0x00cf:
            com.instagram.service.session.UserSession r0 = r15.A00
            android.content.SharedPreferences$Editor r1 = X.C62803am.A00(r8, r0)
            java.lang.String r0 = "TAKE_A_BREAK"
            X.AnonymousClass0wJ.A12(r1, r0, r2)
            goto L_0x00ba
        L_0x00db:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x009f
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r15)
            r0 = 2131836599(0x7f113eb7, float:1.930637E38)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29071wf.onResume():void");
    }

    public C29071wf() {
        this.A04 = true;
        this.A03 = false;
        this.A02 = "off";
    }
}
