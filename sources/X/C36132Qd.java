package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

/* renamed from: X.2Qd  reason: invalid class name and case insensitive filesystem */
public final class C36132Qd {
    public static final void A00(Context context, Fragment fragment, FragmentActivity fragmentActivity, C130667qT r18, C22191Ts r19, C07530bf r20, boolean z) {
        C25828Dsm A0W;
        int i;
        int i2;
        AnonymousClass06E A00;
        AnonymousClass4A9 A002;
        int i3;
        Handler A0F;
        Runnable r0;
        C22191Ts r5 = r19;
        C04220Ms.A0B(r5, 0);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Fragment fragment2 = fragment;
        AnonymousClass0wJ.A1Q(fragmentActivity2, fragment2);
        C130667qT r7 = r18;
        C07530bf r3 = r20;
        C18180wK.A1R(r3, r7);
        boolean z2 = z;
        if ("show_login_support_form".equals(r5.A00)) {
            A0F = AnonymousClass0wJ.A0F();
            r0 = new C73554Sw(fragmentActivity2, r5, r3, z2);
        } else {
            Context context2 = context;
            if ("show_help_center_link".equals(r5.A00)) {
                String A01 = AnonymousClass3W8.A01(context, r5.A08);
                C04220Ms.A06(A01);
                SimpleWebViewActivity.A01.A02(context2, r3, new SimpleWebViewConfig(A01, (String) null, context.getString(2131828277), (String) null, false, false, false, false, z2, true, false, true, false, false, false));
                AnonymousClass3YT.A00(r3, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "account_assistance_impression", (String) null);
                return;
            }
            if ("show_recovery_challenge".equals(r5.A00)) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("get_challenge", "true");
                String str = r5.A07;
                C04220Ms.A06(str);
                A0y.put("user_id", str);
                String str2 = r5.A06;
                C04220Ms.A06(str2);
                A0y.put("nonce_code", str2);
                String str3 = r5.A03;
                C04220Ms.A06(str3);
                A0y.put("cni", str3);
                String str4 = r5.A02;
                if (str4 != null) {
                    A0y.put("challenge_context", str4);
                }
                A00 = AnonymousClass06E.A00(fragment2);
                A002 = C63263h8.A00(r3, r5.A01, A0y);
                i3 = 6;
            } else if ("show_recovery_accounts_list".equals(r5.A00)) {
                A0F = AnonymousClass0wJ.A0F();
                r0 = new C73564Sx(fragmentActivity2, r5, r3, z2);
            } else {
                if ("show_vettedness_dialog".equals(r5.A00)) {
                    String str5 = r5.A05;
                    String str6 = r5.A04;
                    if (str5 != null && str6 != null) {
                        A0W = C18190wL.A0W(context);
                        A0W.A02 = str5;
                        A0W.A0p(str6);
                        A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
                        i = 2131827994;
                        i2 = 30;
                    } else {
                        return;
                    }
                } else if ("show_two_factor_support_challenge".equals(r5.A00)) {
                    HashMap A0y2 = AnonymousClass0wJ.A0y();
                    A0y2.put("get_challenge", "true");
                    String str7 = r5.A07;
                    C04220Ms.A06(str7);
                    A0y2.put("user_id", str7);
                    String str8 = r5.A06;
                    C04220Ms.A06(str8);
                    A0y2.put("nonce_code", str8);
                    String str9 = r5.A03;
                    C04220Ms.A06(str9);
                    A0y2.put("cni", str9);
                    String str10 = r5.A02;
                    if (str10 != null) {
                        A0y2.put("challenge_context", str10);
                    }
                    A00 = AnonymousClass06E.A00(fragment2);
                    A002 = C63263h8.A00(r3, r5.A01, A0y2);
                    i3 = 7;
                } else if ("show_error_dialog".equals(r5.A00)) {
                    String str11 = r5.A05;
                    String str12 = r5.A04;
                    String str13 = r5.A08;
                    if (str11 != null && str12 != null) {
                        A0W = C18190wL.A0W(context);
                        A0W.A02 = str11;
                        A0W.A0p(str12);
                        A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
                        C04220Ms.A06(str13);
                        if (str13.length() > 0) {
                            i = 2131827994;
                            i2 = 31;
                        }
                        AnonymousClass0wJ.A1K(A0W);
                        return;
                    }
                    return;
                } else {
                    C62973bE.A01(context);
                    return;
                }
                A0W.A0N(C18250wR.A0E(context, r3, r5, i2), i);
                AnonymousClass0wJ.A1K(A0W);
                return;
            }
            AnonymousClass4A9.A02(A002, context, r7, r3, i3);
            C31155GhB.A01(context, A00, A002);
            return;
        }
        A0F.post(r0);
    }
}
