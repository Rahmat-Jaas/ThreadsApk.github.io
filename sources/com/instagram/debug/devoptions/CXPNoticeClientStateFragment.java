package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C18250wR;
import X.C23411dm;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;

public final class CXPNoticeClientStateFragment extends C23411dm implements C82034oy {
    public CXPNoticeStateRepository cxpNoticesRepository;
    public C10300i6 session;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825108);
    }

    public String getModuleName() {
        return "cxp_notice_client_state";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        resetItems();
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        if ((r7.getValue() instanceof java.lang.String) == false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void resetItems() {
        /*
            r10 = this;
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            r0 = 2131825437(0x7f11131d, float:1.928373E38)
            X.C63613hu.A03(r3, r0)
            java.lang.String r1 = "Clear All CXP Notice States"
            com.instagram.debug.devoptions.CXPNoticeClientStateFragment$resetItems$1 r0 = new com.instagram.debug.devoptions.CXPNoticeClientStateFragment$resetItems$1
            r0.<init>(r10)
            X.AnonymousClass4MA.A02(r0, r1, r3)
            r0 = 2131825535(0x7f11137f, float:1.9283929E38)
            X.C63613hu.A03(r3, r0)
            java.lang.String r2 = "CXP notice stats is up-to-date on the server: "
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r0 = r10.cxpNoticesRepository
            java.lang.String r4 = "cxpNoticesRepository"
            if (r0 == 0) goto L_0x0154
            X.3Ee r0 = r0.A02
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "has_synced_notice_states"
            boolean r0 = X.C18190wL.A1X(r1, r0)
            java.lang.String r1 = X.AnonymousClass00U.A0o(r2, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r2 = 2131165226(0x7f07002a, float:1.7944663E38)
            r0.A01 = r2
            r3.add(r0)
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r0 = r10.cxpNoticesRepository
            if (r0 == 0) goto L_0x0154
            X.3Ee r0 = r0.A02
            android.content.SharedPreferences r0 = r0.A00
            java.util.Map r0 = r0.getAll()
            X.C04220Ms.A06(r0)
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            java.util.Iterator r9 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0054:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0094
            java.util.Map$Entry r7 = X.C18180wK.A0o(r9)
            X.25p[] r8 = X.C313425p.values()
            int r5 = r8.length
            r4 = 0
        L_0x0064:
            if (r4 >= r5) goto L_0x0092
            r0 = r8[r4]
            java.lang.String r1 = r0.name()
            java.lang.Object r0 = r7.getKey()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x008f
            r4 = 1
        L_0x0077:
            java.lang.Object r0 = r7.getValue()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r7.getValue()
            boolean r1 = r0 instanceof java.lang.String
            r0 = 1
            if (r1 != 0) goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            if (r4 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            X.C18210wN.A1Q(r6, r7)
            goto L_0x0054
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x0064
        L_0x0092:
            r4 = 0
            goto L_0x0077
        L_0x0094:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = X.C18190wL.A0u(r6)
        L_0x009c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.util.Map$Entry r0 = X.C18180wK.A0o(r4)
            java.lang.String r1 = X.C18200wM.A0p(r0)
            java.lang.Object r0 = r0.getValue()
            X.C04220Ms.A04(r1)
            X.25p r1 = X.C313425p.valueOf(r1)
            X.C18240wQ.A1I(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.MMo r0 = X.C18180wK.A0L(r0)
            X.16c r0 = X.AnonymousClass3P4.parseFromJson(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            r5.add(r0)
            goto L_0x009c
        L_0x00ca:
            java.util.Map r0 = X.AnonymousClass4WJ.A0B(r5)
            java.util.Iterator r7 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00d2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0150
            java.util.Map$Entry r0 = X.C18180wK.A0o(r7)
            java.lang.Object r6 = r0.getKey()
            java.lang.Object r4 = r0.getValue()
            X.16c r4 = (X.C207916c) r4
            java.util.Locale r1 = java.util.Locale.getDefault()
            r0 = 825(0x339, float:1.156E-42)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            r5.<init>(r0, r1)
            int r0 = r4.A02
            long r0 = X.C18220wO.A09(r0)
            java.lang.String r5 = X.C18240wQ.A0i(r5, r0)
            X.C63273h9.A02(r3)
            java.lang.String r0 = r6.toString()
            X.C63613hu.A01(r0, r3)
            java.lang.String r1 = "Impression count: "
            int r0 = r4.A00
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r0.A01 = r2
            r3.add(r0)
            java.lang.String r0 = "Last impression time: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r5)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r0.A01 = r2
            r3.add(r0)
            java.lang.String r1 = "Has synced with server: "
            boolean r0 = r4.A03
            java.lang.String r1 = X.AnonymousClass00U.A0o(r1, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r0.A01 = r2
            r3.add(r0)
            java.lang.String r1 = "Sequence number: "
            int r0 = r4.A01
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r0.A01 = r2
            r3.add(r0)
            goto L_0x00d2
        L_0x0150:
            r10.setItems(r3)
            return
        L_0x0154:
            X.C04220Ms.A0E(r4)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.CXPNoticeClientStateFragment.resetItems():void");
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-802348407);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        this.cxpNoticesRepository = new CXPNoticeStateRepository(AnonymousClass0wJ.A0X(this.userSession$delegate), AnonymousClass006.A00);
        C14030oh.A09(-1139328888, A02);
    }
}
