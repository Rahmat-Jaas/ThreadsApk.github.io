package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.MicroUserDict;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1jJ  reason: invalid class name */
public class AnonymousClass1jJ extends C30814GWv implements C11630kW, AnonymousClass0RJ {
    public static final String __redex_internal_original_name = "LogoutTask";
    public final Context A00;
    public final FragmentActivity A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final Integer A04;
    public final List A05;
    public final List A06;
    public final boolean A07;
    public final Fragment A08;
    public final C12560m7 A09;
    public final boolean A0A;

    public final String getModuleName() {
        return "log_out_task";
    }

    public static void A00(C62353Yv r16, AnonymousClass1jJ r17, int i) {
        AnonymousClass1jJ r10 = r17;
        C07530bf A052 = AnonymousClass0RA.A0C.A05(r10);
        C62353Yv r7 = r16;
        ImmutableList A0J = C18240wQ.A0J(r7.A01);
        AnonymousClass3FU r11 = (AnonymousClass3FU) A0J.get(i);
        FragmentActivity fragmentActivity = r10.A01;
        AnonymousClass265 r14 = AnonymousClass265.A0Z;
        C11630kW r8 = r10.A02;
        Integer num = AnonymousClass006.A01;
        MicroUserDict microUserDict = r11.A00;
        C04220Ms.A0B(microUserDict, 0);
        String str = microUserDict.A0F;
        if (str == null) {
            str = "";
        }
        C70224Dh r9 = new C70224Dh(fragmentActivity);
        Fragment fragment = r10.A08;
        Uri uri = null;
        if (fragment != null) {
            uri = C67323zM.A01(fragment);
        }
        C26771rB r4 = new C26771rB(fragmentActivity, uri, r7, r8, r9, r10, r11, A052, A052, r14, num, str, A0J, i);
        C32165H8c A042 = C63883iV.A04(r10.A00, A052, r11.A01, r11.A00(), (String) null);
        A042.A00 = r4;
        C31155GhB.A03(A042);
    }

    public static void A01(AnonymousClass1jJ r10) {
        UserSession userSession = r10.A03;
        C62353Yv A002 = C62353Yv.A00(userSession);
        if (!A002.A01.isEmpty()) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A002.A01 = A0y;
            A002.A04(A0y.values());
        }
        if (!A002.A00.isEmpty()) {
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A002.A00 = A0y2;
            A002.A03(A0y2.values());
        }
        if (new AnonymousClass3Y9(r10.A01, userSession).A02(AnonymousClass006.A0C)) {
            HashMap A0y3 = AnonymousClass0wJ.A0y();
            List list = r10.A06;
            A0y3.put("uids", list.toString());
            C18220wO.A1O(userSession, A0y3, list.size());
            AnonymousClass3LL.A00(userSession, "logout_success", "login_logout_integration", "logout_integration", "logout", (String) null, A0y3);
        }
        C09120et A022 = C09120et.A02();
        C18240wQ.A1D(A022.A07, C18230wP.A0q(userSession));
        C38040KHr.A01.CWx(new AnonymousClass0PA((String) null, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (X.C63533hk.A06(r13.A03) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r13.A07 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.Integer r11 = r13.A04
            java.lang.Integer r10 = X.AnonymousClass006.A01
            r7 = 1
            if (r11 == r10) goto L_0x0010
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r11 == r0) goto L_0x0010
            boolean r0 = r13.A07
            r2 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r11 == r0) goto L_0x0017
            if (r11 != r10) goto L_0x0020
        L_0x0017:
            com.instagram.service.session.UserSession r0 = r13.A03
            boolean r1 = X.C63533hk.A06(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r2 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            r7 = 0
        L_0x0026:
            com.instagram.service.session.UserSession r2 = r13.A03
            X.0nS r1 = X.C13330nS.A01(r13, r2)
            java.lang.String r0 = "ig_log_out_sso"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1333(0x535, float:1.868E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "sso_enabled"
            r3.A0Q(r0, r1)
            java.lang.String r0 = r2.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "user_id"
            r3.A0S(r0, r1)
            X.0ev r6 = X.C09140ev.A02
            android.content.Context r0 = X.C10600ic.A00
            java.lang.String r1 = r6.A04(r0)
            java.lang.String r0 = "app_device_id"
            r3.A0T(r0, r1)
            r3.Bb4()
            X.0Ok r9 = X.C06810aP.A01
            X.MeW r0 = X.C18240wQ.A0W(r2, r9)
            java.lang.String r1 = r0.BAY()
            android.content.Context r8 = r13.A00
            X.H1T r3 = X.C18180wK.A0P(r2)
            r3.A0F(r10)
            java.lang.String r0 = "accounts/logout/"
            r3.A0J(r0)
            java.lang.String r0 = "session_flush_nonce"
            java.lang.String r5 = X.C18220wO.A0g(r8, r3, r0, r1)
            r4 = 0
            r1 = 9
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r0 = X.AnonymousClass3QB.A00(r4, r1, r0)
            r3.A0O(r0, r5)
            java.lang.String r1 = r6.A05(r8)
            java.lang.String r0 = "guid"
            r3.A0O(r0, r1)
            java.lang.String r1 = X.C18190wL.A0l(r2)
            java.lang.String r0 = "phone_id"
            r3.A0P(r0, r1)
            java.lang.Class<X.1T4> r1 = X.AnonymousClass1T4.class
            java.lang.Class<X.3ND> r0 = X.AnonymousClass3ND.class
            r3.A0B(r1, r0)
            if (r7 == 0) goto L_0x00aa
            java.lang.String r1 = "one_tap_app_login"
            java.lang.String r0 = "true"
            r3.A0O(r1, r0)
        L_0x00aa:
            X.H8c r12 = r3.A02()
            if (r7 == 0) goto L_0x00d8
            X.3Vp r0 = X.C61793Vp.A00(r2)
            java.lang.String r1 = r0.A04
            X.1hW r0 = new X.1hW
            r0.<init>(r8, r13, r2, r1)
            r12.A00 = r0
            X.3hk r7 = X.C63533hk.A02(r2)
            java.lang.String r3 = r2.getUserId()
            long r5 = java.lang.System.currentTimeMillis()
            X.3ac r1 = X.C63533hk.A03(r7, r3)
            r1.A00 = r5
            java.util.Map r0 = r7.A00
            r0.put(r3, r1)
            r0 = 0
            r7.A0C(r0, r0, r0, r4)
        L_0x00d8:
            r12.run()
            X.C04220Ms.A0B(r8, r4)
            X.0bg r0 = r2.endSessionManager
            r0.A00(r8, r2)
            if (r11 != r10) goto L_0x00f4
            java.util.List r1 = r13.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f4
            com.instagram.user.model.User r0 = r9.A01(r2)
            r1.remove(r0)
        L_0x00f4:
            java.util.List r0 = r13.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0145
            r0 = 6
            kotlin.jvm.internal.IDxLambdaShape880S0100000_I2 r1 = new kotlin.jvm.internal.IDxLambdaShape880S0100000_I2
            r1.<init>(r2, r0)
            java.lang.Class<X.0Qs> r0 = X.C05070Qs.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.0Qs r0 = (X.C05070Qs) r0
            com.instagram.service.session.UserSession r3 = r0.A00
            boolean r0 = r3.isStopped()
            if (r0 == 0) goto L_0x0145
            X.0QH r0 = r3.sessionState
            X.0QH r2 = X.AnonymousClass0QH.DESTROYED
            X.C04220Ms.A0B(r2, r4)
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0145
            X.0QH r1 = r3.sessionState
            X.0QH r0 = X.AnonymousClass0QH.ENDED
            X.C04220Ms.A0B(r0, r4)
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0138
            X.0cc r0 = r3.userSessionEnder
            if (r0 == 0) goto L_0x0138
            X.0Pk r1 = r0.A00
            r0 = 0
            r1.ADn(r0)
        L_0x0138:
            boolean r0 = r3.hasEnded()
            if (r0 == 0) goto L_0x0145
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00
            r0.clear()
            r3.sessionState = r2
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1jJ.A03(java.lang.Object[]):java.lang.Object");
    }

    public final void A04() {
        if (this.A0A) {
            C12560m7 r4 = this.A09;
            if (r4.A0O("ProgressDialog") == null) {
                new C29001vx().A0D(new AnonymousClass01J(r4), "ProgressDialog", true);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        if (this instanceof C26991rb) {
            ((C26991rb) this).A06((Boolean) obj);
        } else {
            A06((Boolean) obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.lang.Boolean r16) {
        /*
            r15 = this;
            com.instagram.service.session.UserSession r8 = r15.A03
            X.0BO r1 = r8.multipleAccountHelper
            X.0RL r1 = r1.A00
            r7 = 0
            java.util.List r3 = r1.A04(r7)
            java.lang.String r6 = r8.getUserId()
            java.util.List r12 = r15.A06
            r12.add(r6)
            X.0nS r2 = X.C13330nS.A01(r15, r8)
            java.lang.Integer r10 = r15.A04
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            if (r10 != r4) goto L_0x004a
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = "log_out_all_accounts"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2383(0x94f, float:3.339E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r2, r1)
            java.util.HashSet r6 = X.C18200wM.A0u()
            java.util.Iterator r2 = r12.iterator()
        L_0x0038:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = X.C18180wK.A0k(r2)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            r6.add(r1)
            goto L_0x0038
        L_0x004a:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r10 != r1) goto L_0x0084
            java.util.List r1 = r15.A05
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "log_out_account_group"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2382(0x94e, float:3.338E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r2, r1)
            java.util.HashSet r6 = X.C18200wM.A0u()
            java.util.Iterator r2 = r12.iterator()
        L_0x006a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = X.C18180wK.A0k(r2)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            r6.add(r1)
            goto L_0x006a
        L_0x007c:
            java.lang.String r2 = "array_logging_out_account_ids"
            X.0A2 r1 = r5.A00
            r1.A7d(r6, r2)
            goto L_0x009d
        L_0x0084:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r10 != r1) goto L_0x00a0
            java.lang.String r1 = "log_out_single_accounts"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2384(0x950, float:3.34E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r2, r1)
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r6)
            java.lang.String r1 = "logging_out_account_id"
            r5.A0S(r1, r2)
        L_0x009d:
            r5.Bb4()
        L_0x00a0:
            r14 = 0
            if (r10 != r4) goto L_0x00de
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x00de
            java.lang.Object r3 = r3.get(r14)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.0RG r1 = X.AnonymousClass0RA.A0C
            r1.A05(r15)
            com.facebook.redex.IDxSCallbackShape334S0200000_1_I2 r2 = new com.facebook.redex.IDxSCallbackShape334S0200000_1_I2
            r2.<init>(r15, r3, r14)
            X.C04220Ms.A0B(r3, r14)
            X.0RA r1 = X.AnonymousClass0RG.A00()
            com.instagram.service.session.UserSession r9 = r1.A02(r2, r3)
            android.content.Context r4 = r15.A00
            X.0m7 r2 = r15.A09
            androidx.fragment.app.Fragment r5 = r15.A08
            androidx.fragment.app.FragmentActivity r1 = r15.A01
            X.0kW r0 = r15.A02
            X.1jJ r3 = new X.1jJ
            r6 = r1
            r7 = r2
            r8 = r0
            r11 = r12
            r12 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00d8:
            java.lang.Void[] r0 = new java.lang.Void[r14]
            r3.A02(r0)
        L_0x00dd:
            return
        L_0x00de:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r10 != r1) goto L_0x0118
            java.util.List r11 = r15.A05
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0118
            java.lang.Object r3 = r11.get(r14)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.0RG r1 = X.AnonymousClass0RA.A0C
            r1.A05(r15)
            r1 = 1
            com.facebook.redex.IDxSCallbackShape334S0200000_1_I2 r2 = new com.facebook.redex.IDxSCallbackShape334S0200000_1_I2
            r2.<init>(r15, r3, r1)
            X.C04220Ms.A0B(r3, r14)
            X.0RA r1 = X.AnonymousClass0RG.A00()
            com.instagram.service.session.UserSession r9 = r1.A02(r2, r3)
            android.content.Context r4 = r15.A00
            X.0m7 r7 = r15.A09
            androidx.fragment.app.Fragment r5 = r15.A08
            androidx.fragment.app.FragmentActivity r6 = r15.A01
            X.0kW r8 = r15.A02
            boolean r13 = r15.A0A
            X.1jJ r3 = new X.1jJ
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00d8
        L_0x0118:
            X.0m7 r2 = r15.A09
            java.lang.String r1 = "ProgressDialog"
            X.C18240wQ.A11(r2, r1)
            X.3Yv r2 = X.C62353Yv.A00(r8)
            if (r10 == r4) goto L_0x014f
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0141
            java.lang.Object r9 = r3.get(r14)
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.0BO r5 = r8.multipleAccountHelper
            android.content.Context r6 = r15.A00
            boolean r0 = r5.A0N(r6, r8, r9)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r10 = "log_out"
            r5.A0H(r6, r7, r8, r9, r10)
            return
        L_0x0141:
            java.util.HashMap r1 = r2.A01
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x014f
            A00(r2, r15, r14)
            return
        L_0x014f:
            A01(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1jJ.A06(java.lang.Boolean):void");
    }

    public AnonymousClass1jJ(Context context, Fragment fragment, FragmentActivity fragmentActivity, C12560m7 r4, C11630kW r5, UserSession userSession, Integer num, List list, List list2, boolean z, boolean z2) {
        this.A00 = context;
        this.A03 = userSession;
        this.A09 = r4;
        this.A04 = num;
        this.A0A = z;
        this.A07 = z2;
        this.A06 = list2;
        this.A05 = list;
        this.A08 = fragment;
        this.A01 = fragmentActivity;
        this.A02 = r5;
    }

    public AnonymousClass1jJ(Context context, Fragment fragment, FragmentActivity fragmentActivity, C12560m7 r16, C11630kW r17, UserSession userSession, Integer num, List list, boolean z) {
        this(context, fragment, fragmentActivity, r16, r17, userSession, num, Collections.emptyList(), list, true, z);
    }
}
