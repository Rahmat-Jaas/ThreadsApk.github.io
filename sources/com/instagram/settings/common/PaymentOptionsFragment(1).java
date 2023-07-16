package com.instagram.settings.common;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fC;
import X.AnonymousClass3W8;
import X.AnonymousClass3YL;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C13330nS;
import X.C14030oh;
import X.C170039uK;
import X.C18180wK;
import X.C18230wP;
import X.C21661By7;
import X.C24758DYo;
import X.C36941JhV;
import X.C61443Tl;
import X.C61953Wm;
import X.C63393hP;
import X.C80644m9;
import X.C82034oy;
import X.I5x;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.ui.emptystaterow.EmptyStateView;

public final class PaymentOptionsFragment extends I5x implements C82034oy, C21661By7 {
    public static final C61443Tl A04 = new C61443Tl();
    public AnonymousClass1fC A00;
    public String A01;
    public boolean A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public EmptyStateView emptyStateView;

    public final void Bw8() {
    }

    public final void configureActionBar(AnonymousClass4u2 r20) {
        AnonymousClass4u2 r3 = r20;
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131832211);
        r3.CtT(true);
        Context context = getContext();
        if (context != null) {
            r3.Cro(new C24758DYo(C63393hP.A01(context, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass006.A00, -2, -2, -2, -2, -2, -2, -2, true));
        }
    }

    public final String getModuleName() {
        return "settings_payments_options";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str = this.A01;
        if (str == null) {
            C04220Ms.A0E("sessionId");
            throw null;
        } else {
            bundle.putString(C61953Wm.A00(), str);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r11 = 0
            r1 = r17
            X.C04220Ms.A0B(r1, r11)
            r4 = r16
            r0 = r18
            super.onViewCreated(r1, r0)
            X.C018908v.A00(r4)
            android.widget.ListView r0 = r4.A05
            android.view.View r1 = r0.getEmptyView()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView"
            X.C04220Ms.A0C(r1, r0)
            com.instagram.ui.emptystaterow.EmptyStateView r1 = (com.instagram.ui.emptystaterow.EmptyStateView) r1
            r4.emptyStateView = r1
            if (r1 == 0) goto L_0x0026
            X.9uK r0 = X.C170039uK.LOADING
            r1.A0N(r0)
        L_0x0026:
            java.lang.String r0 = "payment_settings_loading"
            A02(r4, r0)
            X.0Oa r3 = r4.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Class<X.3YL> r2 = X.AnonymousClass3YL.class
            r1 = 30
            java.lang.Object r0 = X.C18180wK.A0c(r0, r2, r1)
            X.3YL r0 = (X.AnonymousClass3YL) r0
            java.util.Set r0 = r0.A0F
            r0.add(r4)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Object r0 = X.C18180wK.A0c(r0, r2, r1)
            X.3YL r0 = (X.AnonymousClass3YL) r0
            java.lang.Integer r0 = r0.A0B
            if (r0 == 0) goto L_0x0066
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0066
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Object r1 = X.C18180wK.A0c(r0, r2, r1)
            X.3YL r1 = (X.AnonymousClass3YL) r1
            X.3As r0 = r1.A05
            r0.A02 = r11
            X.3UW r0 = r1.A03
            r0.A01(r1)
            return
        L_0x0066:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.Object r4 = X.C18180wK.A0c(r0, r2, r1)
            X.3YL r4 = (X.AnonymousClass3YL) r4
            java.lang.String r5 = "ig_payment_settings"
            java.lang.Integer r0 = r4.A0B
            if (r0 != 0) goto L_0x0136
            X.3As r3 = r4.A07
            r3.A02 = r11
            X.3As r0 = r4.A06
            r0.A02 = r11
            com.instagram.service.session.UserSession r0 = r4.A02
            android.content.SharedPreferences r2 = X.C28161tl.A04(r0)
            java.lang.String r1 = "has_stored_payment_info"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x009f
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r1 != 0) goto L_0x00d4
        L_0x0097:
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x00d4
            X.3SS r3 = r4.A09
            monitor-enter(r3)
            goto L_0x00a1
        L_0x009f:
            r1 = 0
            goto L_0x0097
        L_0x00a1:
            boolean r0 = r3.A01     // Catch:{ all -> 0x0129 }
            if (r0 != 0) goto L_0x00e8
            r0 = 1
            X.AnonymousClass3SS.A00(r3, r0)     // Catch:{ all -> 0x0129 }
            X.3zb r2 = X.C67463zb.A00()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "payment_type"
            r2.A05(r0, r5)     // Catch:{ all -> 0x0129 }
            java.lang.Class<X.16R> r1 = X.AnonymousClass16R.class
            java.lang.String r0 = "IgPaymentsSettingsInfoQuery"
            X.3zc r2 = X.C67473zc.A00(r2, r1, r0)     // Catch:{ all -> 0x0129 }
            X.01V r1 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0129 }
            r0 = 39059457(0x2540001, float:1.5575301E-37)
            r1.markerStart(r0)     // Catch:{ all -> 0x0129 }
            com.instagram.service.session.UserSession r0 = r3.A00     // Catch:{ all -> 0x0129 }
            X.H8c r2 = X.C18180wK.A0R(r2, r0)     // Catch:{ all -> 0x0129 }
            r0 = 43
            X.C63873iU.A0F(r2, r3, r4, r0)     // Catch:{ all -> 0x0129 }
            r1 = 218(0xda, float:3.05E-43)
            r0 = 3
            X.C31155GhB.A05(r2, r1, r0, r11, r11)     // Catch:{ all -> 0x0129 }
            goto L_0x00e8
        L_0x00d4:
            r0 = 1
            r3.A02 = r0
            r3.A00 = r1
            if (r1 == 0) goto L_0x00e6
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00e6
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x00e3:
            r4.A0B = r0
            goto L_0x00e9
        L_0x00e6:
            r0 = 0
            goto L_0x00e3
        L_0x00e8:
            monitor-exit(r3)
        L_0x00e9:
            X.3SR r3 = r4.A04
            monitor-enter(r3)
            boolean r0 = r3.A01     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x012c
            r0 = 1
            X.AnonymousClass3SR.A00(r3, r0)     // Catch:{ all -> 0x0129 }
            r12 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = com.facebook.graphql.calls.GraphQlCallInput.A00()     // Catch:{ all -> 0x0129 }
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r0 = com.facebook.graphql.calls.GraphQlCallInput.A00()     // Catch:{ all -> 0x0129 }
            X.8l9 r6 = X.C63233h2.A00()     // Catch:{ all -> 0x0129 }
            java.util.Map r8 = r1.A07()     // Catch:{ all -> 0x0129 }
            java.util.Map r9 = r0.A07()     // Catch:{ all -> 0x0129 }
            java.lang.Class<com.instagram.graphql.instagramschema.IgDonationsEligibilityQueryResponseImpl> r10 = com.instagram.graphql.instagramschema.IgDonationsEligibilityQueryResponseImpl.class
            java.lang.String r7 = "IgDonationsEligibilityQuery"
            java.lang.String r15 = "me"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest     // Catch:{ all -> 0x0129 }
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0129 }
            com.instagram.service.session.UserSession r0 = r3.A00     // Catch:{ all -> 0x0129 }
            X.Grx r2 = X.AnonymousClass3WK.A01(r0)     // Catch:{ all -> 0x0129 }
            r1 = 42
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2     // Catch:{ all -> 0x0129 }
            r0.<init>(r1, r3, r4)     // Catch:{ all -> 0x0129 }
            r2.A07(r5, r0)     // Catch:{ all -> 0x0129 }
            goto L_0x012c
        L_0x0127:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x012c:
            monitor-exit(r3)
            X.3As r0 = r4.A05
            r0.A02 = r11
            X.3UW r0 = r4.A03
            r0.A01(r4)
        L_0x0136:
            X.AnonymousClass3YL.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings.common.PaymentOptionsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A02(PaymentOptionsFragment paymentOptionsFragment, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(paymentOptionsFragment, AnonymousClass0wJ.A0U(paymentOptionsFragment.A03)), "payflows_init"), 2481);
        A0I.A0T("product", "ig_payment_settings");
        A0I.A0T("flow_name", "payment_settings");
        A0I.A0T("flow_step", str);
        C18230wP.A1G(A0I, "init");
        String str2 = paymentOptionsFragment.A01;
        if (str2 == null) {
            C04220Ms.A0E("sessionId");
            throw null;
        }
        A0I.A0T(C61953Wm.A00(), str2);
        A0I.Bb4();
    }

    public final /* bridge */ /* synthetic */ C10300i6 A0I() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public static final void A01(PaymentOptionsFragment paymentOptionsFragment, int i, int i2) {
        EmptyStateView emptyStateView2 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView2 != null) {
            emptyStateView2.A0R(C170039uK.ERROR, i);
        }
        EmptyStateView emptyStateView3 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView3 != null) {
            emptyStateView3.A0Q(C170039uK.ERROR, i2);
        }
        EmptyStateView emptyStateView4 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView4 != null) {
            emptyStateView4.A0P(C170039uK.ERROR, R.drawable.instagram_lock_outline_96);
        }
    }

    public final void Bw9() {
        Context context = getContext();
        if (context != null) {
            SimpleWebViewActivity.A01.A02(context, AnonymousClass0wJ.A0U(this.A03), new C36941JhV(AnonymousClass3W8.A01(context, "https://help.instagram.com/contact/502692143473097?ref=igapp")).A00());
        }
    }

    public final void onCreate(Bundle bundle) {
        String string;
        int A022 = C14030oh.A02(-1538088349);
        super.onCreate(bundle);
        this.A00 = new AnonymousClass1fC(requireContext(), AnonymousClass0wJ.A0U(this.A03), this);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("com.instagram.settings.intf.ARGUMENT_FORCE_RISK_FETCH", false);
        }
        this.A02 = z;
        AnonymousClass1fC r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("adapter");
            throw null;
        }
        A0F(r0);
        if (bundle == null || (string = bundle.getString(C61953Wm.A00())) == null) {
            String A0e = C18180wK.A0e();
            C04220Ms.A06(A0e);
            this.A01 = A0e;
            A02(this, "payment_settings");
        } else {
            this.A01 = string;
        }
        C14030oh.A09(1837796785, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1502328838);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_empty_state, viewGroup, false);
        C14030oh.A09(1849910987, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1492004075);
        super.onDestroyView();
        ((AnonymousClass3YL) C18180wK.A0c(AnonymousClass0wJ.A0X(this.A03), AnonymousClass3YL.class, 30)).A0F.remove(this);
        this.emptyStateView = null;
        C14030oh.A09(667903179, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-289081184);
        super.onResume();
        AnonymousClass3YL r3 = (AnonymousClass3YL) C18180wK.A0c(AnonymousClass0wJ.A0X(this.A03), AnonymousClass3YL.class, 30);
        if (AnonymousClass3YL.A01(r3) && r3.A02() != AnonymousClass006.A00) {
            r3.A05.A02 = false;
            r3.A03.A01(r3);
            EmptyStateView emptyStateView2 = this.emptyStateView;
            if (emptyStateView2 != null) {
                emptyStateView2.A0N(C170039uK.LOADING);
            }
        }
        C14030oh.A09(1123217473, A022);
    }
}
