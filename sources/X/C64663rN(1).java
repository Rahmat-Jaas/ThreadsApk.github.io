package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64663rN implements View.OnClickListener {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C64663rN(Dialog dialog, Context context, Fragment fragment, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = fragment;
        this.A04 = str;
        this.A00 = dialog;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (X.C63803iN.A0E(r6, r5, r0) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        X.C34572Kb.A00(X.C304921n.IG_PAGE_LINK, r5).CXf(r4, new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2((java.lang.Object) X.AnonymousClass22J.PAGE_SELECTION, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7), r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.instagram.service.session.UserSession r5 = r12.A03
            android.content.Context r7 = r12.A01
            androidx.fragment.app.Fragment r4 = r12.A02
            java.lang.String r3 = r12.A04
            android.app.Dialog r2 = r12.A00
            X.AnonymousClass0wJ.A1N(r5, r3)
            int r0 = r3.hashCode()
            switch(r0) {
                case -2026751916: goto L_0x0082;
                case 229373044: goto L_0x0072;
                case 407391086: goto L_0x0062;
                case 1985941072: goto L_0x0052;
                default: goto L_0x0014;
            }
        L_0x0014:
            com.facebook.common.callercontext.CallerContext r1 = X.C67243zD.A00
            java.lang.String r0 = "ig_professional_fb_page_linking"
            boolean r0 = X.C61853Wb.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Class<com.instagram.business.activity.FbConnectPageActivity> r0 = com.instagram.business.activity.FbConnectPageActivity.class
            android.content.Intent r6 = X.C18250wR.A04(r7, r0)
            X.C18230wP.A12(r6, r5)
            java.lang.String r0 = "entry_point"
            r6.putExtra(r0, r3)
            r1 = 132(0x84, float:1.85E-43)
            X.05L r0 = X.C18230wP.A0O()
            r0.A0B(r6, r4, r1)
        L_0x0035:
            boolean r0 = r4 instanceof android.content.DialogInterface.OnCancelListener
            if (r0 == 0) goto L_0x003e
            android.content.DialogInterface$OnCancelListener r4 = (android.content.DialogInterface.OnCancelListener) r4
            r4.onCancel(r2)
        L_0x003e:
            java.lang.String r1 = "connect_existing_page"
            java.lang.String r0 = "connect_existing_page_button"
            X.C67243zD.A03(r5, r3, r1, r0)
            r2.dismiss()
            return
        L_0x0049:
            X.42m r0 = new X.42m
            r0.<init>(r7, r4, r5, r3)
            X.C67243zD.A02(r4, r0, r5)
            goto L_0x0035
        L_0x0052:
            java.lang.String r0 = "setting"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36326266453894638(0x810e8c000025ee, double:3.0362154073526445E-306)
            goto L_0x0091
        L_0x0062:
            java.lang.String r0 = "share_table"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36326872044283681(0x810f1900002721, double:3.036598385153192E-306)
            goto L_0x0091
        L_0x0072:
            java.lang.String r0 = "edit_profile"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36325836957164826(0x810e280000251a, double:3.035943791891267E-306)
            goto L_0x0091
        L_0x0082:
            java.lang.String r0 = "location_page_info"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36327572123953219(0x810fbc00002843, double:3.0370411183552025E-306)
        L_0x0091:
            boolean r0 = X.C63803iN.A0E(r6, r5, r0)
            if (r0 == 0) goto L_0x0014
            X.22J r7 = X.AnonymousClass22J.PAGE_SELECTION
            r8 = 0
            r11 = 7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2
            r9 = r8
            r10 = r8
            r6.<init>((java.lang.Object) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
            X.21n r0 = X.C304921n.IG_PAGE_LINK
            X.4tw r0 = X.C34572Kb.A00(r0, r5)
            r0.CXf(r4, r6, r3)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64663rN.onClick(android.view.View):void");
    }
}
