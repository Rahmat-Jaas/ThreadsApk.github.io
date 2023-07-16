package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17;

/* renamed from: X.47I  reason: invalid class name */
public final class AnonymousClass47I implements C21800C0z {
    public E2V A00;
    public L5D A01;
    public UserSession A02;
    public C61683Uw A03;
    public User A04;
    public String A05;
    public String A06;
    public final AnonymousClass3HX A07;
    public final C127397h3 A08;
    public final C04530Oa A09 = AnonymousClass0OY.A02(new KtLambdaShape37S0100000_I2_17(this, 40));
    public final C04530Oa A0A = AnonymousClass0OY.A02(new KtLambdaShape37S0100000_I2_17(this, 41));

    public final void A02(UserSession userSession, C19818BBs bBs) {
        C127397h3 r4 = this.A08;
        if (r4.A0T(42, false) || A03()) {
            boolean A1X = AnonymousClass0wJ.A1X(this.A0A.getValue());
            C61683Uw r5 = this.A03;
            if (r5 == null) {
                String str = this.A05;
                if (str == null) {
                    str = "";
                }
                String str2 = this.A06;
                AnonymousClass3HX r2 = this.A07;
                C04220Ms.A06(C63913ic.A09(r2).getModuleName());
                String A0O = r4.A0O(40, "");
                Fragment A002 = C63913ic.A00(r2);
                C04220Ms.A0C(A002, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                C34640IcN icN = (C34640IcN) A002;
                C71934La r10 = new C71934La(this);
                String A0O2 = r4.A0O(62, (String) null);
                C04220Ms.A0B(icN, 7);
                r5 = new C61683Uw(icN.requireContext(), icN, icN, userSession, r10, bBs, str, str2, A0O, A0O2, A1X);
                this.A03 = r5;
            }
            E2V A012 = A01();
            r5.A00 = A012;
            A012.CtT(true);
            r5.A01 = AnonymousClass6VR.A00(r5.A04).A03(r5.A06);
            C61683Uw.A00(r5);
            C19818BBs bBs2 = r5.A05;
            if (bBs2 != null) {
                bBs2.A02((String) null, r5.A07);
                return;
            }
            return;
        }
        SpannableStringBuilder A0E = C18200wM.A0E(this.A06);
        User user = this.A04;
        if (user != null && user.BZi()) {
            C63563ho.A04(C63913ic.A04(this.A07), A0E, true);
        }
        E2V A013 = A01();
        E2V.A0K(A013, A0E, false);
        A013.Cqc((View.OnClickListener) null);
    }

    public final /* synthetic */ void Bsd(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass47I r22) {
        /*
            r1 = r22
            com.instagram.service.session.UserSession r8 = r1.A02
            r9 = 0
            if (r8 != 0) goto L_0x0021
            X.3HX r0 = r1.A07
            X.0i6 r8 = X.C63913ic.A0E(r0)
            boolean r0 = r8 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x001f
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
        L_0x0013:
            r1.A02 = r8
            if (r8 != 0) goto L_0x0021
            java.lang.String r1 = "NavbarExtensionController"
            java.lang.String r0 = "Got a null user session while configuring navbar"
            X.C30967GcS.A02(r1, r0)
        L_0x001e:
            return
        L_0x001f:
            r8 = r9
            goto L_0x0013
        L_0x0021:
            X.3HX r3 = r1.A07
            androidx.fragment.app.FragmentActivity r7 = X.C63913ic.A04(r3)
            X.E2V r2 = r1.A01()
            r0 = 1
            r2.CtT(r0)
            androidx.fragment.app.Fragment r0 = X.C63913ic.A00(r3)
            androidx.fragment.app.Fragment r0 = r0.mParentFragment
            boolean r0 = r0 instanceof X.AnonymousClass9OE
            if (r0 == 0) goto L_0x0049
            X.E2V r3 = r1.A01()
            X.Drc r2 = X.C18190wL.A0K()
            X.DlZ r0 = new X.DlZ
            r0.<init>(r2)
            r3.Crl(r0)
        L_0x0049:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x00ba
            X.7h3 r3 = r1.A08
            r2 = 49
            X.7h3 r0 = r3.A0K(r2)
            if (r0 == 0) goto L_0x00ba
            X.7h3 r0 = r3.A0K(r2)
            if (r0 == 0) goto L_0x00ba
            X.6jp r6 = X.C18230wP.A0V(r0)
            if (r6 == 0) goto L_0x00ba
            X.E2V r5 = r1.A01()
            X.Drc r4 = X.C18240wQ.A0K()
            r2 = 61
            java.lang.String r0 = "NAV_NAVICON"
            java.lang.String r3 = r3.A0O(r2, r0)
            int r2 = r3.hashCode()
            r0 = 1572713947(0x5dbdb5db, float:1.70875913E18)
            if (r2 != r0) goto L_0x0089
            java.lang.String r0 = "NAV_DOTS_3_VERTICAL"
            boolean r0 = r3.equals(r0)
            r2 = 2131232817(0x7f080831, float:1.8081754E38)
            if (r0 != 0) goto L_0x008c
        L_0x0089:
            r2 = 2131232791(0x7f080817, float:1.8081701E38)
        L_0x008c:
            r4.A05 = r2
            r0 = 2131830527(0x7f1126ff, float:1.9294054E38)
            r4.A04 = r0
            r0 = 9
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r1, r6, r0)
            r4.A0C = r0
            X.DlZ r0 = new X.DlZ
            r0.<init>(r4)
            android.view.View r3 = r5.A7Q(r0)
            X.0Oa r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r2.getDimensionPixelSize(r0)
            X.C09860go.A0U(r3, r0)
        L_0x00ba:
            X.7h3 r2 = r1.A08
            java.lang.String r16 = X.C18220wO.A0o(r2)
            r3 = 63
            r0 = -1
            int r4 = r2.A0H(r3, r0)
            X.Axa r6 = X.C19513Axa.A00
            r0 = 40
            java.lang.String r3 = ""
            java.lang.String r11 = r2.A0O(r0, r3)
            r0 = 45
            java.lang.String r12 = r2.A0O(r0, r3)
            r0 = 38
            java.lang.String r13 = r2.A0O(r0, r3)
            X.5dy r0 = X.AnonymousClass6JQ.A00(r8)
            r3 = 383984041(0x16e321a9, float:3.669507E-25)
            long r21 = r0.generateFlowId(r3, r4)
            X.9vM r19 = X.C170659vM.Bloks
            X.BvI r20 = X.C18915Anb.A01(r8)
            X.Ae7 r10 = new X.Ae7
            r17 = r10
            r18 = r0
            r17.<init>(r18, r19, r20, r21)
            r14 = r9
            r15 = r9
            X.BBs r5 = r6.A0N(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r16 == 0) goto L_0x0142
            com.instagram.user.model.User r4 = r1.A04
            if (r4 == 0) goto L_0x01ae
            X.D0g r3 = r4.Aj4()
        L_0x0107:
            X.D0g r0 = X.C23894D0g.FollowStatusUnknown
            if (r3 != r0) goto L_0x0118
            if (r4 == 0) goto L_0x0118
            com.instagram.service.session.UserSession r0 = r1.A02
            if (r0 == 0) goto L_0x0118
            X.Drj r0 = X.C37088JkK.A00(r0)
            r0.A0C(r4)
        L_0x0118:
            r1.A02(r8, r5)
            com.instagram.user.model.User r0 = r1.A04
            if (r0 == 0) goto L_0x0125
            java.lang.Integer r0 = r0.A0n()
            if (r0 != 0) goto L_0x0142
        L_0x0125:
            java.lang.String r3 = r1.A05
            if (r3 == 0) goto L_0x0142
            X.3Y8 r0 = X.AnonymousClass3Y8.A02
            r0.A00(r8, r9, r3)
            X.KHq r4 = X.AnonymousClass3LY.A00(r8)
            java.lang.Class<X.46P> r3 = X.AnonymousClass46P.class
            X.L5D r0 = r1.A01
            if (r0 != 0) goto L_0x013d
            X.46g r0 = new X.46g
            r0.<init>(r1, r8, r5)
        L_0x013d:
            r1.A01 = r0
            r4.A01(r0, r3)
        L_0x0142:
            r6 = 0
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x018b
            r0 = 43
            boolean r0 = r2.A0T(r0, r6)
            if (r0 == 0) goto L_0x018b
            java.lang.String r3 = r8.getUserId()
            java.lang.String r0 = r1.A05
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 == 0) goto L_0x018b
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r8)
            com.instagram.api.schemas.ShopManagementAccessState r3 = r0.A0W()
            com.instagram.api.schemas.ShopManagementAccessState r0 = com.instagram.api.schemas.ShopManagementAccessState.NONE
            if (r3 == r0) goto L_0x018b
            X.E2V r4 = r1.A01()
            X.Drc r3 = X.C18240wQ.A0K()
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
            r3.A05 = r0
            r0 = 2131835796(0x7f113b94, float:1.930474E38)
            r3.A04 = r0
            r0 = 10
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r1, r8, r0)
            r3.A0C = r0
            X.DlZ r0 = new X.DlZ
            r0.<init>(r3)
            r4.A7Q(r0)
        L_0x018b:
            r0 = 36
            boolean r0 = r2.A0T(r0, r6)
            if (r0 == 0) goto L_0x001e
            com.instagram.service.session.UserSession r4 = r1.A02
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36312806026380479(0x81024e000004bf, double:3.027702978791899E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r0, r4, r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001e
            X.E2V r0 = r1.A01()
            r5.A01(r0)
            return
        L_0x01ae:
            r3 = 0
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47I.A00(X.47I):void");
    }

    public final E2V A01() {
        E2V e2v = this.A00;
        if (e2v != null) {
            return e2v;
        }
        C04220Ms.A0E("actionBarService");
        throw null;
    }

    public final boolean A03() {
        C127397h3 r3 = this.A08;
        C109326jp A0L = r3.A0L(50);
        if (A0L == null) {
            return false;
        }
        return AnonymousClass3WF.A02(C122047Jt.A03(this.A07, r3, C63893iY.A01, A0L));
    }

    public AnonymousClass47I(AnonymousClass3HX r4, C127397h3 r5, UserSession userSession) {
        User user;
        this.A07 = r4;
        this.A08 = r5;
        this.A02 = userSession;
        this.A05 = C18220wO.A0o(r5);
        UserSession userSession2 = this.A02;
        if (userSession2 != null) {
            user = AnonymousClass6VR.A00(userSession2).A03(this.A05);
        } else {
            user = null;
        }
        this.A04 = user;
        this.A06 = r5.A0O(59, (String) null);
    }

    public final void onResume() {
        E2V.A0G(A01());
        A00(this);
    }
}
