package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gp  reason: invalid class name and case insensitive filesystem */
public final class C24061gp extends AnonymousClass436 {
    public final Activity A00;
    public final Context A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final C24681jp A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        C04220Ms.A0B(obj2, 2);
        if (r2 != null) {
            r2.A5K(0);
        }
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011d, code lost:
        if ((java.lang.System.currentTimeMillis() - X.C18180wK.A05(r1, "last_time_dismissed_ci_find_people_button_follow_list")) >= 86400000) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01df, code lost:
        if (r11 == r0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f5, code lost:
        if (r16 != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
        if (r11 == X.AnonymousClass006.A0N) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r29, android.view.View r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            r28 = this;
            r10 = r32
            r0 = -723762981(0xffffffffd4dc40db, float:-7.5678472E12)
            int r21 = X.C14030oh.A03(r0)
            r20 = 1
            r1 = r30
            r0 = r20
            X.C04220Ms.A0B(r1, r0)
            r14 = 3
            X.C04220Ms.A0B(r10, r14)
            r2 = r28
            android.content.Context r0 = r2.A01
            r23 = r0
            android.app.Activity r0 = r2.A00
            r22 = r0
            com.instagram.service.session.UserSession r8 = r2.A03
            X.0kW r0 = r2.A02
            r17 = r0
            java.lang.Object r7 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.recommended.adapter.row.FindPeopleButtonsRowViewBinder.Holder"
            X.C04220Ms.A0C(r7, r0)
            X.3D4 r7 = (X.AnonymousClass3D4) r7
            X.39E r10 = (X.AnonymousClass39E) r10
            X.1jp r6 = r2.A04
            java.lang.String r19 = "unknown"
            r5 = 0
            X.C18180wK.A1R(r7, r10)
            r4 = 8
            android.view.View r3 = r7.A00
            r3.setVisibility(r4)
            java.lang.Class<X.3ys> r11 = X.C67103ys.class
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320326514186150(0x810925000117a6, double:3.032458965562779E-306)
            boolean r0 = X.C63803iN.A0E(r2, r8, r0)
            if (r0 == 0) goto L_0x01f9
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r11)
            java.lang.String r0 = "ig_recommended_user"
            boolean r1 = X.C62963bD.A03(r1, r8, r0)
        L_0x005b:
            java.lang.Integer r11 = r10.A01
            java.lang.Integer r13 = X.AnonymousClass006.A01
            if (r11 == r13) goto L_0x006b
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r11 == r0) goto L_0x006b
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r16 = 0
            if (r11 != r0) goto L_0x01f0
        L_0x006b:
            r16 = 1
            if (r1 != 0) goto L_0x01f0
            r3.setVisibility(r5)
            com.instagram.share.facebook.widget.FindPeopleButton r9 = r7.A04
            r9.setVisibility(r5)
            r0 = 340(0x154, float:4.76E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            r9.setActionButtonOnClickListener(r0)
            boolean r0 = r10.A00
            r9.setDismissButtonEnabled(r0)
            r1 = 76
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r10, (java.lang.Object) r8)
            r9.setDismissButtonOnClickListener(r0)
        L_0x008f:
            r0 = 47
            kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55 r1 = new kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55
            r1.<init>(r8, r0)
            java.lang.Class<X.48i> r0 = X.C693848i.class
            java.lang.Object r0 = r8.A01(r0, r1)
            X.48i r0 = (X.C693848i) r0
            com.instagram.service.session.UserSession r15 = r0.A00
            X.0TJ r12 = X.AnonymousClass0TJ.A06
            r0 = 2342160423740051059(0x2081067f00010e73, double:4.063393617907783E-152)
            X.C63803iN.A0E(r12, r15, r0)
        L_0x00aa:
            com.instagram.share.facebook.widget.FindPeopleButton r12 = r7.A06
            r12.setVisibility(r4)
            if (r16 == 0) goto L_0x01e9
            r0 = 36318179032568015(0x810731002010cf, double:3.0311008895402563E-306)
            boolean r0 = X.C63803iN.A0E(r2, r8, r0)
            if (r0 == 0) goto L_0x01e9
            com.instagram.user.model.User r16 = X.AnonymousClass0wJ.A0Y(r8)
            com.instagram.share.facebook.widget.FindPeopleButton r15 = r7.A05
            com.instagram.common.typedurl.ImageUrl r1 = r16.B4M()
            r0 = r17
            r15.setAvatar(r1, r0)
            r1 = 228(0xe4, float:3.2E-43)
            r0 = r22
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r6, r0, r1)
            r15.setActionButtonOnClickListener(r0)
            r15.setDismissButtonEnabled(r5)
            boolean r0 = r16.A3a()
            if (r0 == 0) goto L_0x00f0
            r0 = 36318179032633552(0x810731002110d0, double:3.031100889581702E-306)
            boolean r0 = X.C63803iN.A0E(r2, r8, r0)
            if (r0 == 0) goto L_0x00f0
            r0 = 2131835653(0x7f113b05, float:1.930445E38)
            r15.setSubtitle((int) r0)
        L_0x00f0:
            r0 = r23
            boolean r0 = X.C34832Lb.A00(r0, r8)
            if (r0 != 0) goto L_0x01e3
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            if (r11 == r0) goto L_0x01e3
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r11 != r0) goto L_0x01df
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)
            java.lang.String r0 = "num_times_dismissed_ci_find_people_button_follow_list"
            int r0 = r1.getInt(r0, r5)
            if (r0 >= r14) goto L_0x01e3
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "last_time_dismissed_ci_find_people_button_follow_list"
            long r0 = X.C18180wK.A05(r1, r0)
            long r16 = r16 - r0
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x01e3
        L_0x011f:
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r7.A02
            r0 = 2131832428(0x7f112e6c, float:1.929791E38)
            r1.setTitle((int) r0)
            r0 = 2131832429(0x7f112e6d, float:1.9297912E38)
            r1.setSubtitle((int) r0)
            r0 = 2131836523(0x7f113e6b, float:1.9306215E38)
            r1.setButtonText((int) r0)
        L_0x0133:
            r3.setVisibility(r5)
            com.instagram.share.facebook.widget.FindPeopleButton r14 = r7.A02
            r14.setVisibility(r5)
            r0 = 229(0xe5, float:3.21E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r10, r6, r0)
            r14.setActionButtonOnClickListener(r0)
            boolean r0 = r10.A00
            r14.setDismissButtonEnabled(r0)
            r23 = 20
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r24 = r10
            r25 = r8
            r26 = r6
            r27 = r7
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            r14.setDismissButtonOnClickListener(r0)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x017f
            r0 = r20
            r6.A00 = r0
            com.instagram.service.session.UserSession r0 = r6.A07
            X.0kW r10 = r6.A03
            X.0nS r1 = X.C13330nS.A01(r10, r0)
            java.lang.String r0 = "inline_ci_upsell_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1579(0x62b, float:2.213E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.C18180wK.A1C(r0, r10)
            r0.Bb4()
        L_0x017f:
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            if (r11 == r0) goto L_0x0185
            if (r11 != r13) goto L_0x01d9
        L_0x0185:
            java.lang.String r1 = "su_in_stories"
            r0 = r19
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019a
            r0 = 36326202029450709(0x810e7d000125d5, double:3.0361746650748874E-306)
            boolean r0 = X.C63803iN.A0E(r2, r8, r0)
            if (r0 == 0) goto L_0x01d9
        L_0x019a:
            r3.setVisibility(r5)
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r7.A03
            r1.setVisibility(r5)
            r1.setChevronButtonVisibility(r5)
            r0 = 341(0x155, float:4.78E-43)
            X.AnonymousClass0wJ.A17(r1, r0, r6)
        L_0x01aa:
            android.view.View r1 = r7.A01
            r2 = 2
            r0 = r2
            r1.setImportantForAccessibility(r2)
            int r1 = r12.getVisibility()
            if (r1 != 0) goto L_0x01b8
            r0 = 1
        L_0x01b8:
            r12.setImportantForAccessibility(r0)
            int r1 = r9.getVisibility()
            r0 = 2
            if (r1 != 0) goto L_0x01c3
            r0 = 1
        L_0x01c3:
            r9.setImportantForAccessibility(r0)
            int r0 = r14.getVisibility()
            if (r0 != 0) goto L_0x01cd
            r2 = 1
        L_0x01cd:
            r14.setImportantForAccessibility(r2)
            r1 = 400887825(0x17e51011, float:1.4802834E-24)
            r0 = r21
            X.C14030oh.A0A(r1, r0)
            return
        L_0x01d9:
            com.instagram.share.facebook.widget.FindPeopleButton r0 = r7.A03
            r0.setVisibility(r4)
            goto L_0x01aa
        L_0x01df:
            if (r11 != r0) goto L_0x0133
            goto L_0x011f
        L_0x01e3:
            com.instagram.share.facebook.widget.FindPeopleButton r14 = r7.A02
            r14.setVisibility(r4)
            goto L_0x017f
        L_0x01e9:
            com.instagram.share.facebook.widget.FindPeopleButton r0 = r7.A05
            r0.setVisibility(r4)
            goto L_0x00f0
        L_0x01f0:
            com.instagram.share.facebook.widget.FindPeopleButton r9 = r7.A04
            r9.setVisibility(r4)
            if (r16 == 0) goto L_0x00aa
            goto L_0x008f
        L_0x01f9:
            X.1z6 r9 = X.C35692Ol.A00(r8)
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r11)
            java.lang.String r0 = "ig_android_linking_cache_suggested_userse"
            boolean r1 = r9.A05(r1, r0)
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24061gp.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C24061gp(Activity activity, Context context, C11630kW r3, UserSession userSession, C24681jp r5) {
        AnonymousClass0wJ.A1P(context, userSession);
        this.A01 = context;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        UserSession userSession;
        AnonymousClass2A8 r1;
        AnonymousClass2A9 r0;
        int A032 = C14030oh.A03(691585626);
        AnonymousClass264 r12 = this.A04.A08;
        if (r12 == AnonymousClass264.A0J) {
            userSession = this.A03;
            r1 = AnonymousClass2A8.A04;
            r0 = AnonymousClass2A9.A0H;
        } else {
            if (r12 == AnonymousClass264.A0C) {
                userSession = this.A03;
                r1 = AnonymousClass2A8.A04;
                r0 = AnonymousClass2A9.A03;
            }
            View A0E = C18240wQ.A0E(LayoutInflater.from(this.A01), R.layout.row_find_people_buttons);
            C04220Ms.A06(A0E);
            A0E.setTag(new AnonymousClass3D4(A0E));
            C14030oh.A0A(1886523137, A032);
            return A0E;
        }
        C62383Zj.A01(r0, r1, userSession);
        View A0E2 = C18240wQ.A0E(LayoutInflater.from(this.A01), R.layout.row_find_people_buttons);
        C04220Ms.A06(A0E2);
        A0E2.setTag(new AnonymousClass3D4(A0E2));
        C14030oh.A0A(1886523137, A032);
        return A0E2;
    }
}
