package com.instagram.urlhandlers.paymentbusiness;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.C10300i6;
import X.C18170wI;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class PaymentBusinessUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        Bundle bundle;
        AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getBundleExtra(C18170wI.A00(13));
        } else {
            bundle = null;
        }
        return r2.A07(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r3 = X.C18170wI.A00(13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 464339753(0x1bad4329, float:2.866385E-22)
            int r18 = X.C14030oh.A00(r0)
            r19 = r20
            r1 = r21
            r0 = r19
            super.onCreate(r1)
            if (r21 == 0) goto L_0x001b
            r1 = -316777352(0xffffffffed1e5c78, float:-3.0631512E27)
        L_0x0015:
            r0 = r18
            X.C14030oh.A07(r1, r0)
            return
        L_0x001b:
            android.content.Intent r1 = r19.getIntent()
            if (r1 == 0) goto L_0x017c
            r0 = 13
            java.lang.String r3 = X.C18170wI.A00(r0)
            android.os.Bundle r1 = r1.getBundleExtra(r3)
            if (r1 == 0) goto L_0x017c
            java.lang.String r0 = "original_url"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x017c
            int r0 = r2.length()
            if (r0 == 0) goto L_0x017c
            r1 = 0
            android.net.Uri r9 = X.C15430rJ.A01(r2)
            X.C04220Ms.A06(r9)
            X.0RG r2 = X.AnonymousClass0RA.A0C
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x0179
            android.os.Bundle r0 = r0.getBundleExtra(r3)
        L_0x004f:
            com.instagram.service.session.UserSession r5 = r2.A07(r0)
            if (r5 == 0) goto L_0x01b9
            java.lang.String r0 = "page"
            java.lang.String r12 = r9.getQueryParameter(r0)
            java.lang.String r11 = X.C61983Wp.A00()
            java.lang.String r10 = r9.getQueryParameter(r11)
            if (r10 != 0) goto L_0x0069
            java.lang.String r10 = X.C122037Js.A01()
        L_0x0069:
            X.C04220Ms.A09(r10)
            java.lang.String r7 = "financial_entity_id"
            java.lang.String r6 = r9.getQueryParameter(r7)
            java.lang.String r4 = "managed_merchant_account_id"
            java.lang.String r3 = r9.getQueryParameter(r4)
            java.lang.String r0 = "id"
            java.lang.String r13 = r9.getQueryParameter(r0)
            java.lang.String r8 = "referrer"
            java.lang.String r2 = r9.getQueryParameter(r8)
            java.lang.String r14 = "payout_details"
            boolean r0 = X.C04220Ms.A0I(r12, r14)
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = "payout_details_v2_fragment"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r14)
        L_0x0092:
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r12 = r0.A01
            r17 = 0
            if (r1 == 0) goto L_0x0131
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x0131
            java.lang.String r0 = "payout_release_id"
            kotlin.Pair r16 = X.C18180wK.A0p(r0, r13)
            kotlin.Pair r15 = X.C18180wK.A0p(r7, r6)
            kotlin.Pair r14 = X.C18180wK.A0p(r4, r3)
            com.facebookpay.msc.logging.LoggingData r13 = new com.facebookpay.msc.logging.LoggingData
            r13.<init>(r10)
            java.lang.String r0 = "logging_data"
            kotlin.Pair r13 = X.C18180wK.A0p(r0, r13)
            kotlin.Pair r8 = X.C18180wK.A0p(r8, r2)
            r0 = r16
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0, r15, r14, r13, r8}
            android.os.Bundle r8 = X.C98316Fa.A00(r0)
            X.6uw r0 = X.AnonymousClass7Kz.A06()
            X.0Oe r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.6rI r0 = (X.C113376rI) r0
            androidx.fragment.app.Fragment r8 = r0.A00(r8, r1)
            if (r8 == 0) goto L_0x01b4
            java.lang.String r13 = X.C18190wL.A0n(r9)
            r15 = 1
            X.8h9 r9 = X.AnonymousClass7Kz.A08()
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r14 = "view_name"
            java.lang.String r0 = "deeplink"
            r1.put(r14, r0)
            r1.put(r11, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_valid"
            r1.put(r0, r10)
            java.lang.String r0 = "target_url"
            r1.put(r0, r13)
            if (r12 == 0) goto L_0x0107
            java.lang.String r0 = "target_name"
            r1.put(r0, r12)
        L_0x0107:
            if (r2 == 0) goto L_0x010e
            java.lang.String r0 = "ref"
            r1.put(r0, r2)
        L_0x010e:
            if (r6 == 0) goto L_0x0113
            r1.put(r7, r6)
        L_0x0113:
            if (r3 == 0) goto L_0x0118
            r1.put(r4, r3)
        L_0x0118:
            java.lang.String r0 = "client_load_payouthub_init"
            r9.Bb8(r0, r1)
            r0 = r19
            X.Drz r1 = X.C18180wK.A0Q(r0, r5)
            r0 = r17
            r1.A0C = r0
            r1.A03 = r8
            r1.A05()
        L_0x012c:
            r1 = -586449201(0xffffffffdd0b7ecf, float:-6.2823119E17)
            goto L_0x0015
        L_0x0131:
            java.lang.String r4 = X.C18190wL.A0n(r9)
            X.8h9 r3 = X.AnonymousClass7Kz.A08()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "view_name"
            java.lang.String r0 = "deeplink"
            r2.put(r1, r0)
            r2.put(r11, r10)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_valid"
            r2.put(r0, r1)
            java.lang.String r0 = "target_url"
            r2.put(r0, r4)
            java.lang.String r0 = "client_load_payouthub_init"
            r3.Bb8(r0, r2)
            r19.finish()
            goto L_0x012c
        L_0x015e:
            java.lang.String r0 = "home"
            boolean r0 = X.C04220Ms.A0I(r12, r0)
            if (r0 != 0) goto L_0x016f
            if (r12 == 0) goto L_0x016f
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r1)
            goto L_0x0092
        L_0x016f:
            java.lang.String r1 = "home_fragment"
            java.lang.String r0 = "overview"
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            goto L_0x0092
        L_0x0179:
            r0 = 0
            goto L_0x004f
        L_0x017c:
            r19.finish()
            java.lang.String r6 = X.C122037Js.A00()
            java.lang.String r5 = ""
            r4 = 0
            X.8h9 r3 = X.AnonymousClass7Kz.A08()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "view_name"
            java.lang.String r0 = "deeplink"
            r2.put(r1, r0)
            java.lang.String r0 = X.C61983Wp.A00()
            r2.put(r0, r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_valid"
            r2.put(r0, r1)
            java.lang.String r0 = "target_url"
            r2.put(r0, r5)
            java.lang.String r0 = "client_load_payouthub_init"
            r3.Bb8(r0, r2)
            r1 = -1174127728(0xffffffffba043b90, float:-5.044276E-4)
            goto L_0x0015
        L_0x01b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x01b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.paymentbusiness.PaymentBusinessUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
