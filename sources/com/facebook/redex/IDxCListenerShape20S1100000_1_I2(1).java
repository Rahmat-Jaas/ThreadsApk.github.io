package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1cj;
import X.AnonymousClass265;
import X.AnonymousClass269;
import X.AnonymousClass2A5;
import X.AnonymousClass3GF;
import X.AnonymousClass3Ui;
import X.AnonymousClass3W8;
import X.AnonymousClass3Wh;
import X.AnonymousClass3Zz;
import X.AnonymousClass44X;
import X.AnonymousClass47l;
import X.C04220Ms;
import X.C07530bf;
import X.C10300i6;
import X.C10450iM;
import X.C13330nS;
import X.C15730rn;
import X.C18180wK;
import X.C18210wN;
import X.C18230wP;
import X.C18240wQ;
import X.C23151ca;
import X.C24751jz;
import X.C25786Drz;
import X.C32122Ah;
import X.C35782Ou;
import X.C36941JhV;
import X.C60583Pr;
import X.C61863Wc;
import X.C63173fJ;
import X.C63313hF;
import X.C63463hW;
import X.C63533hk;
import X.C63553hn;
import X.C63583hq;
import X.C63693i8;
import X.C63823iP;
import X.C67363zQ;
import X.C73374Sd;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDxCListenerShape20S1100000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape20S1100000_1_I2(C24751jz r1, String str, int i) {
        this.A02 = i;
        if (4 - i != 0) {
            this.A00 = r1;
            this.A01 = str;
            return;
        }
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        C10300i6 r2;
        C36941JhV jhV;
        String str;
        String str2;
        String str3;
        Handler handler;
        C73374Sd r0;
        switch (this.A02) {
            case 0:
                AnonymousClass269 r02 = AnonymousClass269.A0c;
                AnonymousClass1cj r22 = (AnonymousClass1cj) this.A00;
                C18180wK.A1K(C63313hF.A01(r22, r02), r22.A0M);
                C25786Drz A002 = C63463hW.A00(r22.getActivity(), r22.A0M);
                String str4 = this.A01;
                Bundle A06 = C18180wK.A06();
                A06.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str4);
                C18180wK.A0x(A06, new C23151ca(), A002);
                return;
            case 1:
                AnonymousClass1cj r3 = (AnonymousClass1cj) this.A00;
                String str5 = this.A01;
                if (r3.A01 != null) {
                    try {
                        r3.A01.setText(C18180wK.A0j("%d", C18240wQ.A1b(PhoneNumberUtil.A01(r3.getRootActivity()).A0A(str5, r3.A0H.A01).A02)));
                        return;
                    } catch (C32122Ah unused) {
                        C10450iM.A03(AnonymousClass1cj.__redex_internal_original_name, "Error parsing suggested phone number.");
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                AnonymousClass3Wh.A00(((OneTapLoginLandingFragment) this.A00).A03, AnonymousClass265.ONE_TAP, this.A01);
                return;
            case 3:
                OneTapLoginLandingFragment oneTapLoginLandingFragment = (OneTapLoginLandingFragment) this.A00;
                C07530bf r1 = oneTapLoginLandingFragment.A03;
                AnonymousClass265 r03 = AnonymousClass265.ONE_TAP;
                String str6 = this.A01;
                AnonymousClass3Wh.A01(r1, r03, str6);
                C63533hk.A02(oneTapLoginLandingFragment.A03).A0A(oneTapLoginLandingFragment, oneTapLoginLandingFragment.A03, AnonymousClass006.A01, str6, "OneTapLoginLandingFragment");
                List A003 = OneTapLoginLandingFragment.A00(oneTapLoginLandingFragment);
                boolean z = true;
                if (A003.isEmpty()) {
                    FragmentActivity activity = oneTapLoginLandingFragment.getActivity();
                    if (activity != null) {
                        C63553hn.A04(oneTapLoginLandingFragment.mArguments, activity.getSupportFragmentManager());
                        return;
                    }
                    C15730rn A004 = C15730rn.A00(oneTapLoginLandingFragment, "ig_android_onetap_remove_crash_scenario");
                    A004.A09("has_activity", Boolean.valueOf(AnonymousClass0wJ.A1W(oneTapLoginLandingFragment.getActivity())));
                    A004.A09("has_fragment_manager", Boolean.valueOf(AnonymousClass0wJ.A1W(oneTapLoginLandingFragment.getActivity())));
                    FragmentActivity activity2 = oneTapLoginLandingFragment.getActivity();
                    if (activity2 == null || !activity2.isFinishing()) {
                        z = false;
                    }
                    A004.A09("is_finishing", Boolean.valueOf(z));
                    C18180wK.A1K(A004, oneTapLoginLandingFragment.A03);
                    return;
                } else if (A003.size() == 1) {
                    OneTapLoginLandingFragment.A01(oneTapLoginLandingFragment, A003);
                    return;
                } else {
                    oneTapLoginLandingFragment.A01.A09(A003);
                    return;
                }
            case 4:
                C24751jz r12 = (C24751jz) this.A00;
                String str7 = this.A01;
                context = r12.A04;
                r2 = r12.A08;
                jhV = new C36941JhV(str7);
                str = context.getString(2131829574);
                break;
            case 5:
                C24751jz r23 = (C24751jz) this.A00;
                C24751jz.A06(r23, AnonymousClass269.A0H, this.A01);
                dialogInterface.dismiss();
                C24751jz.A03(r23);
                return;
            case 6:
                String str8 = this.A01;
                if (str8 != null && str8.equals("sso_disabled")) {
                    C07530bf r24 = ((C24751jz) this.A00).A08;
                    C04220Ms.A0B(r24, 0);
                    C35782Ou.A00(AnonymousClass2A5.A06, r24, (String) null, (HashMap) null);
                    return;
                }
                return;
            case 7:
                C24751jz r32 = (C24751jz) this.A00;
                C07530bf r13 = r32.A08;
                C04220Ms.A0B(r13, 0);
                C35782Ou.A00(AnonymousClass2A5.A05, r13, (String) null, (HashMap) null);
                r32.A08();
                r32.A01.A00((AnonymousClass3GF) null, this.A01);
                return;
            case 8:
                C24751jz r5 = (C24751jz) this.A00;
                C24751jz.A06(r5, AnonymousClass269.A0H, this.A01);
                dialogInterface.dismiss();
                if (C63173fJ.A05(AnonymousClass0TJ.A05, 2324143057408100276L)) {
                    AnonymousClass44X A005 = AnonymousClass44X.A00();
                    C07530bf r4 = r5.A08;
                    if (AnonymousClass44X.A01(r4, A005, "ig_android_growth_FX_access_fbig_create_cp_claiming")) {
                        String A03 = AnonymousClass44X.A00().A03(r4, "ig_android_growth_FX_access_fbig_create_cp_claiming");
                        String A022 = AnonymousClass44X.A00().A02(r4, "ig_android_growth_FX_access_fbig_create_cp_claiming");
                        C67363zQ.A0E(r4, false, false, true);
                        handler = r5.A05;
                        r0 = new C73374Sd(r5, A03, A022);
                        handler.post(r0);
                        return;
                    }
                }
                AnonymousClass47l r04 = AnonymousClass47l.A03;
                C07530bf r42 = r5.A08;
                if (r04.A00(r42)) {
                    if (C63693i8.A08(r42)) {
                        str2 = null;
                    } else {
                        str2 = AnonymousClass47l.A00;
                    }
                    if (C63693i8.A08(r42)) {
                        str3 = null;
                    } else {
                        str3 = AnonymousClass47l.A02;
                    }
                    if (str2 != null && str3 != null) {
                        C67363zQ.A0E(r42, false, false, true);
                        handler = r5.A05;
                        r0 = new C73374Sd(r5, str3, str2);
                        handler.post(r0);
                        return;
                    }
                    return;
                }
                C24751jz.A03(r5);
                return;
            case 9:
                context = (Context) this.A00;
                C04220Ms.A0B(context, 0);
                r2 = C18230wP.A0Z();
                jhV = new C36941JhV(AnonymousClass3W8.A01(context, "https://help.instagram.com/227486307449481"));
                str = this.A01;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                UserSession userSession = (UserSession) this.A00;
                AnonymousClass3Ui.A00(C60583Pr.A01(userSession), C63823iP.A05(userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_upsell_unified_dialog_ok_tap", this.A01, (Map) null, 4088);
                dialogInterface.dismiss();
                return;
            case 13:
                UserSession userSession2 = (UserSession) this.A00;
                Integer A012 = AnonymousClass3Zz.A01(this.A01);
                C04220Ms.A0B(userSession2, 0);
                C63583hq.A04(userSession2, AnonymousClass006.A0O, A012, (Long) null, (Long) null, (Long) null, "take_break", true);
                return;
            default:
                C61863Wc.A02((C13330nS) this.A00, "dialog_ok_button", this.A01);
                return;
        }
        C18210wN.A0t(context, r2, jhV, str);
    }

    public IDxCListenerShape20S1100000_1_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }
}
