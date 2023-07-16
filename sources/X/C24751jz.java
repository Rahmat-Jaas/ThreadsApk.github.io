package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.redex.IDxCListenerShape0S3200000_1_I2;
import com.facebook.redex.IDxCListenerShape14S1200000_1_I2;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jz  reason: invalid class name and case insensitive filesystem */
public final class C24751jz extends C19819BBt implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(C24751jz.class);
    public static final String __redex_internal_original_name = "FacebookLoginHelper";
    public FxSsoViewModel A00;
    public AnonymousClass3F0 A01;
    public String A02;
    public AnonymousClass1jf A03;
    public final Activity A04;
    public final Handler A05 = C18250wR.A08();
    public final C34640IcN A06;
    public final C11630kW A07;
    public final C07530bf A08;
    public final AnonymousClass3S9 A09;
    public final AnonymousClass265 A0A;

    private DialogInterface.OnClickListener A00(AnonymousClass3BX r9, String str, String str2, String str3, String str4, String str5) {
        int i;
        AnonymousClass3BX r2 = r9;
        String str6 = r9.A00;
        String str7 = str;
        switch (str6.hashCode()) {
            case -1828522310:
                if (str6.equals("email_sign_up")) {
                    i = 5;
                    break;
                } else {
                    return null;
                }
            case -563041124:
                if (str6.equals("switch_to_signup_flow")) {
                    return C18220wO.A0O(this, StringTreeSet.MAX_SYMBOL_COUNT);
                }
                return null;
            case -469212106:
                if (str6.equals("forgot_password_flow")) {
                    return new IDxCListenerShape20S1100000_1_I2(this, str2, 7);
                }
                return null;
            case 366006153:
                if (str6.equals("username_log_in")) {
                    return new IDxCListenerShape14S1200000_1_I2(r9, this, str3, 5);
                }
                return null;
            case 460966973:
                if (!str6.equals("stop_account_deletion")) {
                    return null;
                }
                return new IDxCListenerShape0S3200000_1_I2(r2, this, str7, str5, str4, 1);
            case 1160163273:
                if (str6.equals("login_with_facebook")) {
                    return new IDxCListenerShape14S1200000_1_I2(r9, this, str, 6);
                }
                return null;
            case 1671672458:
                if (str6.equals("dismiss")) {
                    i = 6;
                    break;
                } else {
                    return null;
                }
            case 2138021083:
                if (str6.equals("create_new_account_with_fb_contact_point_taken")) {
                    i = 8;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return new IDxCListenerShape20S1100000_1_I2(this, str3, i);
    }

    public final void A0A(C26743EUq eUq, C26743EUq eUq2, C07530bf r14, String str, String str2, String str3, String str4) {
        A02(AnonymousClass5rZ.A00, eUq, eUq2, this, r14, (Boolean) null, str, str2, str3, str4, true);
    }

    public static void A03(C24751jz r4) {
        C07530bf r3 = r4.A08;
        C67363zQ.A0E(r3, false, false, true);
        C63313hF.A04(r3, (C313625r) null, r4.A0A, "register_with_email");
        r4.A05.post(new C72614Pa(r4));
    }

    public static void A04(C24751jz r3) {
        FragmentActivity activity = r3.A06.getActivity();
        if (activity != null) {
            C25828Dsm A0W = C18190wL.A0W(activity);
            A0W.A0K(2131831662);
            C18180wK.A1O(A0W, r3, 126, 2131831976);
            AnonymousClass0wJ.A1K(A0W);
        }
    }

    public static void A05(C24751jz r6, User user, String str) {
        C07530bf r3 = r6.A08;
        C63313hF.A04(r3, (C313625r) null, r6.A0A, "recover_password");
        C25786Drz A002 = C63463hW.A00(r6.A06.getActivity(), r3);
        String id = user.getId();
        String BK7 = user.BK7();
        ImageUrl B4M = user.B4M();
        AnonymousClass1c4 r1 = new AnonymousClass1c4();
        Bundle A062 = C18180wK.A06();
        C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
        C18220wO.A16(A062, B4M, str, id, BK7);
        C18180wK.A0x(A062, r1, A002);
    }

    public static void A06(C24751jz r4, AnonymousClass269 r5, String str) {
        if (str != null && str.equals("fb_email_taken")) {
            C63313hF.A04(r4.A08, (C313625r) null, r4.A0A, r5.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r9 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r15 != null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C26651qz r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r21 = this;
            r14 = r21
            android.app.Activity r8 = r14.A04
            X.Dsm r7 = X.C18190wL.A0W(r8)
            r5 = r22
            java.lang.String r0 = r5.getErrorMessage()
            r7.A0p(r0)
            java.lang.String r0 = r5.mErrorTitle
            if (r0 == 0) goto L_0x0017
            r7.A02 = r0
        L_0x0017:
            java.lang.String r0 = r5.mErrorBody
            if (r0 == 0) goto L_0x001e
            r7.A0p(r0)
        L_0x001e:
            java.lang.String r6 = r5.mErrorType
            java.util.List r0 = r5.A0F
            if (r0 == 0) goto L_0x012e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x012e
            java.util.List r0 = r5.A0F
            java.lang.String r4 = "stop_account_deletion"
            X.3BX r0 = A01(r4, r0)
            r16 = r23
            r19 = r24
            r20 = r25
            if (r0 == 0) goto L_0x00cf
            java.lang.String r9 = r5.A08
            java.lang.String r1 = r5.getErrorMessage()
            java.lang.String r10 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00a8
            r0 = 2131834837(0x7f1137d5, float:1.9302796E38)
            X.C18220wO.A14(r8, r7, r0)
        L_0x004e:
            if (r9 == 0) goto L_0x0062
        L_0x0050:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0062
            r2 = 2131829574(0x7f112346, float:1.929212E38)
            r1 = 4
            com.facebook.redex.IDxCListenerShape20S1100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape20S1100000_1_I2
            r0.<init>((X.C24751jz) r14, (java.lang.String) r9, (int) r1)
            r7.A0O(r0, r2)
        L_0x0062:
            java.util.List r2 = r5.A0F
            java.lang.String r10 = r5.A0D
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0094
            X.3BX r15 = A01(r4, r2)
            if (r15 == 0) goto L_0x007f
            java.lang.String r1 = r15.A02
            r18 = r6
            r17 = r10
            android.content.DialogInterface$OnClickListener r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.A0c(r0, r1)
        L_0x007f:
            java.lang.String r0 = "back_to_login"
            X.3BX r15 = A01(r0, r2)
            if (r15 == 0) goto L_0x0094
        L_0x0087:
            java.lang.String r1 = r15.A02
            r18 = r6
            r17 = r10
            android.content.DialogInterface$OnClickListener r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.A0b(r0, r1)
        L_0x0094:
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x00a7
            X.269 r0 = X.AnonymousClass269.A0J
            A06(r14, r0, r6)
            X.4QN r0 = new X.4QN
            r0.<init>(r7)
            X.C63643hy.A04(r0)
        L_0x00a7:
            return
        L_0x00a8:
            android.text.SpannableStringBuilder r3 = X.C18200wM.A0E(r1)
            java.lang.String r2 = r5.A06
            if (r2 == 0) goto L_0x00b9
            r1 = 1
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            X.AnonymousClass3Zw.A00(r3, r0, r2)
        L_0x00b9:
            if (r9 == 0) goto L_0x00cb
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00cb
            r1 = 1
            com.facebook.redex.IDxCListenerShape5S2100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape5S2100000_1_I2
            r0.<init>(r14, r10, r9, r1)
            r7.A0Z(r0, r3, r10)
            goto L_0x0050
        L_0x00cb:
            r7.A0p(r3)
            goto L_0x004e
        L_0x00cf:
            java.util.List r12 = r5.A0F
            java.lang.String r10 = r5.A0D
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0094
            java.lang.Object r15 = X.C18240wQ.A0b(r12)
            X.3BX r15 = (X.AnonymousClass3BX) r15
            java.lang.String r1 = r15.A02
            r18 = r6
            r17 = r10
            android.content.DialogInterface$OnClickListener r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            r7.A0c(r0, r1)
            int r0 = r12.size()
            r13 = 1
            if (r0 <= r13) goto L_0x0094
            X.0bf r11 = r14.A08
            X.265 r0 = r14.A0A
            java.lang.String r9 = r0.A01
            X.C18210wN.A0n(r13, r11, r9)
            double r3 = X.C18200wM.A00()
            double r1 = X.AnonymousClass269.A00()
            X.0nS r5 = X.C13330nS.A02(r11)
            java.lang.String r0 = "fb_clash_dialog"
            X.0A2 r5 = X.AnonymousClass0wJ.A0M(r5, r0)
            r0 = 617(0x269, float:8.65E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r5, r0)
            X.AnonymousClass0wJ.A1B(r0, r3, r1)
            X.C18180wK.A1A(r0, r1)
            X.AnonymousClass269.A08(r0, r9)
            X.C18180wK.A19(r0)
            X.C63683i7.A07(r0)
            X.C63683i7.A0A(r0, r11)
            java.lang.Object r15 = r12.get(r13)
            X.3BX r15 = (X.AnonymousClass3BX) r15
            goto L_0x0087
        L_0x012e:
            r1 = 2131826195(0x7f111613, float:1.9285268E38)
            r0 = 0
            r7.A0P(r0, r1)
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24751jz.A0B(X.1qz, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A0C(C07530bf r12, String str, String str2, boolean z) {
        AnonymousClass5rZ r0 = AnonymousClass5rZ.A00;
        A02(r0, r0, r0, this, r12, (Boolean) null, str, str2, (String) null, (String) null, z);
    }

    public final void A0D(AnonymousClass264 r8) {
        String str;
        String str2;
        C07530bf r5 = this.A08;
        C67363zQ.A0E(r5, false, false, true);
        CallerContext callerContext = A0B;
        if (C62433Zv.A02(callerContext, r5, "ig_android_growth_sdk_token_fbig_sign_up")) {
            str = C62433Zv.A00(callerContext, r5, "ig_android_growth_sdk_token_fbig_sign_up");
        } else {
            str = null;
        }
        if (C62433Zv.A02(callerContext, r5, "ig_android_growth_sdk_token_fbig_sign_up")) {
            str2 = C62433Zv.A01(callerContext, r5, "ig_android_growth_sdk_token_fbig_sign_up");
        } else {
            str2 = null;
        }
        if (str == null) {
            String str3 = this.A0A.A01;
            C04220Ms.A0B(r5, 0);
            C04220Ms.A0B(str3, 1);
            AnonymousClass3XD.A00(r5, (Boolean) null, str3, 28);
            C67363zQ.A08(this.A06, r5, r8, C29771zH.A01);
            return;
        }
        A0C(r5, str2, str, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass2CD.A00(intent, new AnonymousClass3yW(this), i2);
    }

    public final void onCreate() {
        ((BaseFragmentActivity) this.A04).A0E(this.A03);
    }

    public final void onDestroy() {
        ((BaseFragmentActivity) this.A04).A0F(this.A03);
    }

    public final void onPause() {
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (((X.C83644rk) r3).BRB() == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r4 = this;
            android.app.Activity r3 = r4.A04
            boolean r0 = r3 instanceof X.C83644rk
            if (r0 == 0) goto L_0x0010
            r0 = r3
            X.4rk r0 = (X.C83644rk) r0
            boolean r0 = r0.BRB()
            r2 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            X.0bf r1 = r4.A08
            int r0 = X.C18250wR.A01(r1)
            if (r0 <= 0) goto L_0x003a
            if (r2 != 0) goto L_0x003a
            X.0kW r0 = r4.A07
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "resumed_non_add_account_flow_is_logged_in"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2641(0xa51, float:3.701E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r0.Bb4()
            java.lang.String r1 = "FacebookLoginHelper"
            java.lang.String r0 = "activity finish loop"
            X.AnonymousClass0LU.A0D(r1, r0)
            r3.finish()
        L_0x003a:
            X.3Vx r0 = X.C61823Vx.A01
            if (r0 == 0) goto L_0x004a
            X.3Ie r1 = r0.A03()
            X.0Oa r0 = X.H8S.A01
            r0.getValue()
            r1.A01()
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24751jz.onResume():void");
    }

    public C24751jz(C34640IcN icN, C11630kW r3, FxSsoViewModel fxSsoViewModel, C07530bf r5, AnonymousClass265 r6, String str) {
        this.A08 = r5;
        this.A06 = icN;
        this.A04 = icN.getActivity();
        this.A0A = r6;
        this.A07 = r3;
        this.A01 = new AnonymousClass3F0(icN, r5);
        this.A09 = C49332rD.A00(r5);
        this.A02 = str;
        this.A03 = new AnonymousClass1jf(this);
        this.A00 = fxSsoViewModel;
    }

    public static AnonymousClass3BX A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3BX r1 = (AnonymousClass3BX) it.next();
            if (r1.A00.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public static void A07(C24751jz r7, String str, String str2, List list, List list2, boolean z, boolean z2) {
        String str3;
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        C07530bf r6 = r7.A08;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "register_with_facebook"), 2625);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        C18180wK.A19(A0I);
        AnonymousClass269.A08(A0I, r7.A0A.A01);
        AnonymousClass0wJ.A1D(A0I, A003, A002);
        C63683i7.A08(A0I);
        A0I.A0Q("has_fb_access_token", Boolean.valueOf(AnonymousClass0wJ.A1W(str2)));
        C63683i7.A09(A0I, r6);
        C18210wN.A19(A0I, "facebook");
        A0I.Bb4();
        if (list == null || list.isEmpty()) {
            str3 = "unknown";
        } else {
            str3 = C18190wL.A0p(list, 0);
        }
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18299764726564675L)) {
            C62213Xu.getInstance().startDeviceValidation(r7.A06.getContext(), str3);
        }
        r7.A05.post(new AnonymousClass4TC(r7, str, str2, list, list2, z, z2));
    }

    public final void A08() {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        C07530bf r6 = this.A08;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A07, r6), "pw_recovery_tapped"), 2545);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        C18210wN.A17(A0I);
        AnonymousClass269.A08(A0I, this.A0A.A01);
        AnonymousClass0wJ.A1D(A0I, A003, A002);
        C63683i7.A0A(A0I, r6);
    }

    public final void A09(TextView textView, C34640IcN icN, AnonymousClass265 r8) {
        String str;
        String str2;
        C566037v r0;
        AnonymousClass3AB r02 = AnonymousClass44X.A00().A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            str = null;
        } else {
            str = r0.A00;
        }
        C07530bf r1 = this.A08;
        C54122yw.A00(r1, r8.A01);
        if (TextUtils.isEmpty(str2)) {
            if (AnonymousClass47l.A03.A00(r1)) {
                if (C63693i8.A08(r1)) {
                    str2 = null;
                } else {
                    str2 = AnonymousClass47l.A01;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
            } else {
                textView.setText(2131830111);
                return;
            }
        }
        FxSsoViewModel fxSsoViewModel = this.A00;
        if (fxSsoViewModel != null) {
            String A0o = AnonymousClass0wJ.A0o(icN, str2, 2131824394);
            C04220Ms.A0B(A0o, 0);
            C18230wP.A0J(fxSsoViewModel.A01).A0H(A0o);
        }
        textView.setText(AnonymousClass0wJ.A0o(icN, str2, 2131824394));
    }

    public static void A02(C26743EUq eUq, C26743EUq eUq2, C26743EUq eUq3, C24751jz r35, C07530bf r36, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C32165H8c A0A2;
        AnonymousClass269 r2;
        Boolean bool2 = bool;
        String str6 = null;
        if (C63173fJ.A05(AnonymousClass0TJ.A06, 2324144822639791137L)) {
            bool2 = null;
        }
        boolean z2 = false;
        C24751jz r0 = r35;
        Activity activity = r0.A04;
        C07530bf r8 = r0.A08;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        if (str3 != null) {
            AnonymousClass3TD A0G = C63883iV.A0G(FxcalAccountType.FACEBOOK, str8, str7);
            if (eUq3.A06()) {
                str6 = (String) eUq3.A03();
            }
            A0A2 = C63883iV.A09(r8, A0G, bool2, str9, C09140ev.A00(activity), C18230wP.A0i(activity), str6, str4);
            r2 = AnonymousClass269.A0h;
        } else {
            if (eUq.A06()) {
                str5 = (String) eUq.A03();
            } else {
                str5 = null;
            }
            if (eUq3.A06()) {
                str6 = (String) eUq3.A03();
            }
            A0A2 = C63883iV.A0A(r8, bool2, str5, str8, (String) null, (String) null, C09140ev.A00(activity), C18230wP.A0i(activity), str6, z, true, false, false, false);
            r2 = AnonymousClass269.A0f;
        }
        String str10 = r2.A01;
        AnonymousClass265 r6 = r0.A0A;
        C63313hF.A04(r8, C313625r.A03, r6, str10);
        boolean A062 = eUq.A06();
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        }
        C34640IcN icN = r0.A06;
        C18330wh A012 = C18330wh.A01(icN);
        A012.A04(AnonymousClass0wJ.A0o(icN, icN.getString(2131826983), 2131824316));
        A0A2.A00 = new C24441io(eUq2, r0, r36, A012, str7, str8, str9, z2, A062, false);
        icN.schedule(A0A2);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "try_facebook_sso"), 2770);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        AnonymousClass269.A06(A0I, A003);
        C18180wK.A19(A0I);
        C18190wL.A1I(A0I, r6.A01);
        C63683i7.A0A(A0I, r8);
    }
}
