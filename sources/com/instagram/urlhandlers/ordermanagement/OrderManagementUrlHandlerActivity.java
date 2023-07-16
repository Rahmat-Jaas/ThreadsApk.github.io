package com.instagram.urlhandlers.ordermanagement;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class OrderManagementUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) != false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = 823803231(0x311a3d5f, float:2.2444835E-9)
            int r21 = X.C14030oh.A00(r0)
            r8 = r22
            r0 = r23
            super.onCreate(r0)
            android.os.Bundle r1 = X.AnonymousClass0wJ.A0C(r8)
            X.0i6 r7 = r8.getSession()
            boolean r0 = r7 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x0026
            X.AnonymousClass3YR.A00(r8, r1, r7)
        L_0x001d:
            r1 = 1866870895(0x6f46306f, float:6.1336585E28)
            r0 = r21
            X.C14030oh.A07(r1, r0)
            return
        L_0x0026:
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            r6 = 0
            X.C04220Ms.A0B(r7, r6)
            r20 = 0
            com.instagram.bloks.hosting.IgBloksScreenConfig r19 = X.C18190wL.A0N(r7)
            java.lang.String r11 = "com.bloks.www.messenger.ctm.orderdetailsreceipt"
            r0 = r19
            r0.A0P = r11
            android.os.Bundle r13 = X.C18180wK.A06()
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r12 = "merchant_id"
            r15 = 0
            if (r0 == 0) goto L_0x01ca
            java.lang.String r5 = r0.getStringExtra(r12)
        L_0x0049:
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r10 = "consumer_id"
            if (r0 == 0) goto L_0x01c7
            java.lang.String r4 = r0.getStringExtra(r10)
        L_0x0055:
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r9 = "order_id"
            if (r0 == 0) goto L_0x01c4
            java.lang.String r3 = r0.getStringExtra(r9)
        L_0x0061:
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "entrypoint"
            if (r1 == 0) goto L_0x01c1
            java.lang.String r14 = r1.getStringExtra(r0)
        L_0x006d:
            java.lang.String r1 = r7.getUserId()
            boolean r1 = X.C04220Ms.A0I(r1, r5)
            if (r4 == 0) goto L_0x01bd
            com.instagram.user.model.User r17 = X.C18210wN.A0P(r7, r4)
        L_0x007b:
            if (r5 == 0) goto L_0x01b9
            com.instagram.user.model.User r16 = X.C18210wN.A0P(r7, r5)
        L_0x0081:
            if (r1 == 0) goto L_0x01ae
            if (r17 == 0) goto L_0x01b6
            java.lang.String r2 = X.C18250wR.A0a(r17)
        L_0x0089:
            r13.putString(r12, r5)
            r13.putString(r10, r4)
            r13.putString(r9, r3)
            java.lang.String r5 = "is_viewer_merchant"
            r13.putBoolean(r5, r1)
            if (r17 == 0) goto L_0x01ab
            java.lang.String r1 = r17.BK7()
        L_0x009d:
            java.lang.String r4 = "consumer_name"
            r13.putString(r4, r1)
            if (r16 == 0) goto L_0x00a8
            java.lang.String r15 = r16.BK7()
        L_0x00a8:
            java.lang.String r3 = "merchant_name"
            r13.putString(r3, r15)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "profile_image_url"
            r13.putString(r2, r1)
            r13.putString(r0, r14)
            X.43A r1 = new X.43A
            r1.<init>()
            X.0nS r15 = X.C13330nS.A01(r1, r7)
            java.lang.Object r1 = r13.get(r9)
            java.lang.String r14 = java.lang.String.valueOf(r1)
            java.lang.String r18 = ""
            if (r14 != 0) goto L_0x00d0
            r14 = r18
        L_0x00d0:
            java.lang.Object r1 = r13.get(r12)
            java.lang.String r17 = java.lang.String.valueOf(r1)
            if (r17 != 0) goto L_0x00dc
            r17 = r18
        L_0x00dc:
            java.lang.Object r1 = r13.get(r10)
            java.lang.String r16 = java.lang.String.valueOf(r1)
            if (r16 != 0) goto L_0x00e8
            r16 = r18
        L_0x00e8:
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x00f4
            r18 = r0
        L_0x00f4:
            int r0 = r14.length()
            if (r0 <= 0) goto L_0x0137
            int r0 = r17.length()
            if (r0 <= 0) goto L_0x0137
            int r0 = r16.length()
            if (r0 <= 0) goto L_0x0137
            java.lang.String r0 = "ORDER_LIST_CLICK"
            r1 = r18
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0194
            java.lang.String r0 = "biig_order_management_thread_details_order_click"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r15, r0)
            r0 = 90
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0137
        L_0x0122:
            java.lang.Long r14 = X.AnonymousClass0wJ.A0d(r17)
            java.lang.String r0 = "business_igid"
            r1.A0S(r0, r14)
            java.lang.Long r14 = X.AnonymousClass0wJ.A0d(r16)
            java.lang.String r0 = "consumer_igid"
            r1.A0S(r0, r14)
            r1.Bb4()
        L_0x0137:
            java.util.HashMap r14 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r15 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r6)
            java.lang.String r0 = r13.getString(r9)
            r14.put(r9, r0)
            java.lang.String r0 = r13.getString(r12)
            r14.put(r12, r0)
            java.lang.String r0 = r13.getString(r10)
            r14.put(r10, r0)
            java.lang.String r0 = r13.getString(r3)
            r14.put(r3, r0)
            java.lang.String r0 = r13.getString(r4)
            r14.put(r4, r0)
            java.lang.Boolean r0 = X.C18210wN.A0Q(r13, r5)
            r14.put(r5, r0)
            java.lang.String r2 = r13.getString(r2)
            java.lang.String r0 = "profile_pic_url"
            r14.put(r0, r2)
            X.3iE r2 = X.C63743iE.A03(r11, r14, r15)
            r0 = r20
            r2.A03 = r0
            r2.A02 = r0
            r0 = r19
            androidx.fragment.app.Fragment r1 = X.C63743iE.A00(r8, r0, r2, r1)
            X.Drz r0 = X.C18180wK.A0Q(r8, r7)
            X.C18220wO.A1B(r1, r0, r6)
            goto L_0x001d
        L_0x0194:
            java.lang.String r0 = "biig_order_management_xma_click"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r15, r0)
            r0 = 91
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x0137
            r1.A0T(r9, r14)
            goto L_0x0122
        L_0x01ab:
            r1 = r15
            goto L_0x009d
        L_0x01ae:
            if (r16 == 0) goto L_0x01b6
            java.lang.String r2 = X.C18250wR.A0a(r16)
            goto L_0x0089
        L_0x01b6:
            r2 = r15
            goto L_0x0089
        L_0x01b9:
            r16 = 0
            goto L_0x0081
        L_0x01bd:
            r17 = 0
            goto L_0x007b
        L_0x01c1:
            r14 = r15
            goto L_0x006d
        L_0x01c4:
            r3 = r15
            goto L_0x0061
        L_0x01c7:
            r4 = r15
            goto L_0x0055
        L_0x01ca:
            r5 = r15
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.ordermanagement.OrderManagementUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final void onPause() {
        int A00 = C14030oh.A00(-1792137961);
        super.onPause();
        setRequestedOrientation(10);
        C14030oh.A07(-592171435, A00);
    }

    public final void onResume() {
        int A00 = C14030oh.A00(-170436935);
        super.onResume();
        setRequestedOrientation(1);
        C14030oh.A07(1807910873, A00);
    }
}
