package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.483  reason: invalid class name */
public final class AnonymousClass483 implements C144608im {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C11630kW A03;
    public final /* synthetic */ C61603Ul A04;
    public final /* synthetic */ C82844qM A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public AnonymousClass483(Activity activity, Fragment fragment, FragmentActivity fragmentActivity, C11630kW r4, C61603Ul r5, C82844qM r6, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = r6;
        this.A09 = z;
        this.A04 = r5;
        this.A08 = str;
        this.A06 = userSession;
        this.A01 = fragment;
        this.A07 = str2;
        this.A02 = fragmentActivity;
        this.A0A = z2;
        this.A03 = r4;
        this.A0B = z3;
        this.A0C = z4;
        this.A00 = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        if (X.C04220Ms.A0I(r13, "qp") != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016b, code lost:
        if (r3 != false) goto L_0x016d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CAi(java.util.Map r15) {
        /*
            r14 = this;
            r4 = 0
            X.C04220Ms.A0B(r15, r4)
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            java.lang.Object r0 = r15.get(r0)
            X.68d r0 = (X.C971568d) r0
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            int r1 = r0.ordinal()
            java.lang.String r7 = "Required value was null."
            r3 = 1
            if (r1 == r4) goto L_0x0078
            r0 = 2
            com.instagram.service.session.UserSession r5 = r14.A06
            if (r1 == r0) goto L_0x012a
            X.0kW r0 = r14.A03
            X.AnonymousClass3h4.A05(r0, r5, r4)
            X.4qM r6 = r14.A05
            if (r1 == r3) goto L_0x004b
            if (r6 == 0) goto L_0x0070
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x003c
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A00(r1, r0)
        L_0x0035:
            if (r6 != 0) goto L_0x016d
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x003c:
            java.lang.String r0 = "contacts_upsell_declined"
            X.0rn r1 = X.C63313hF.A00(r5, r0)
            java.lang.String r0 = "contacts_upsell"
            X.C18250wR.A19(r1, r0)
            X.C18180wK.A1K(r1, r5)
            goto L_0x0035
        L_0x004b:
            if (r6 == 0) goto L_0x0070
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x0061
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A00(r1, r0)
        L_0x005a:
            if (r6 != 0) goto L_0x016d
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x0061:
            java.lang.String r0 = "contacts_upsell_declined"
            X.0rn r1 = X.C63313hF.A00(r5, r0)
            java.lang.String r0 = "contacts_upsell"
            X.C18250wR.A19(r1, r0)
            X.C18180wK.A1K(r1, r5)
            goto L_0x005a
        L_0x0070:
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            goto L_0x017e
        L_0x0078:
            X.4qM r5 = r14.A05
            if (r5 == 0) goto L_0x011f
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x0116
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.A00(r1, r0)
        L_0x0089:
            if (r5 == 0) goto L_0x0182
            r5.Ben(r4)
        L_0x008e:
            androidx.fragment.app.Fragment r1 = r14.A01
            android.content.Context r7 = r1.getContext()
            if (r7 == 0) goto L_0x010f
            java.util.LinkedHashMap r0 = X.AnonymousClass3WE.A02(r7)
            X.06E r5 = X.AnonymousClass06E.A00(r1)
            java.lang.String r11 = X.AnonymousClass3WE.A01(r0)
            com.instagram.service.session.UserSession r8 = r14.A06
            java.lang.String r13 = r14.A08
            java.lang.String r6 = r14.A07
            java.lang.String r2 = "serp_users_ci_upsell"
            boolean r0 = X.C04220Ms.A0I(r6, r2)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            java.lang.String r12 = "find_friends_contacts"
            X.H8c r0 = X.AnonymousClass3Zx.A00(r7, r8, r9, r10, r11, r12, r13)
            X.C31155GhB.A01(r7, r5, r0)
            X.C04220Ms.A0I(r6, r2)
            java.lang.String r5 = "qp"
            boolean r0 = X.C04220Ms.A0I(r6, r5)
            if (r0 == 0) goto L_0x0100
            X.3iD r2 = X.C63733iD.A01()
            android.content.Context r1 = r1.requireContext()
            r0 = 2131828967(0x7f1120e7, float:1.929089E38)
            X.C63733iD.A07(r1, r2, r0)
            r2.A0C()
            X.C63733iD.A0A(r2)
        L_0x00de:
            boolean r0 = X.C04220Ms.A0I(r13, r5)
            if (r0 == 0) goto L_0x00e9
        L_0x00e4:
            X.0kW r0 = r14.A03
            X.AnonymousClass3h4.A05(r0, r8, r3)
        L_0x00e9:
            com.instagram.service.session.UserSession r5 = r14.A06
            X.0kW r0 = r14.A03
            X.AnonymousClass3h4.A05(r0, r5, r3)
            X.C62423Zt.A02(r5)
            X.KHq r1 = X.AnonymousClass3LY.A00(r5)
            X.45m r0 = new X.45m
            r0.<init>()
            r1.CWx(r0)
            goto L_0x0170
        L_0x0100:
            boolean r0 = r14.A0A
            r1 = 2131828965(0x7f1120e5, float:1.9290886E38)
            if (r0 == 0) goto L_0x010a
            r1 = 2131828966(0x7f1120e6, float:1.9290888E38)
        L_0x010a:
            r0 = 0
            X.C63813iO.A03(r7, r0, r1, r4)
            goto L_0x00de
        L_0x010f:
            boolean r0 = r14.A0B
            if (r0 == 0) goto L_0x00e9
            com.instagram.service.session.UserSession r8 = r14.A06
            goto L_0x00e4
        L_0x0116:
            com.instagram.service.session.UserSession r1 = r14.A06
            java.lang.String r0 = "contacts_upsell"
            X.AnonymousClass3XA.A00(r1, r0)
            goto L_0x0089
        L_0x011f:
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.A00(r1, r0)
            goto L_0x008e
        L_0x012a:
            X.0kW r8 = r14.A03
            X.AnonymousClass3h4.A05(r8, r5, r4)
            boolean r3 = r14.A0C
            if (r3 != 0) goto L_0x015a
            android.app.Activity r7 = r14.A00
            boolean r6 = r14.A09
            r1 = 2131824342(0x7f110ed6, float:1.928151E38)
            java.lang.String r2 = r14.A07
            X.4FE r0 = new X.4FE
            r0.<init>(r8, r5, r2)
            X.C62413Zr.A02(r7, r0, r1, r6)
            X.0nS r1 = X.C13330nS.A01(r8, r5)
            java.lang.String r0 = "ci_settings_modal_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 157(0x9d, float:2.2E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.C18210wN.A1B(r0, r2)
            r0.Bb4()
        L_0x015a:
            X.4qM r6 = r14.A05
            if (r6 == 0) goto L_0x0178
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x0174
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.A00(r1, r0)
            if (r3 == 0) goto L_0x0170
        L_0x016d:
            r6.Ben(r4)
        L_0x0170:
            X.AnonymousClass3LY.A01(r5)
            return
        L_0x0174:
            X.C54202z4.A00(r5)
            goto L_0x016d
        L_0x0178:
            X.3Ul r2 = r14.A04
            java.lang.String r1 = r14.A08
            java.lang.Integer r0 = X.AnonymousClass006.A0N
        L_0x017e:
            r2.A00(r1, r0)
            goto L_0x0170
        L_0x0182:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass483.CAi(java.util.Map):void");
    }
}
