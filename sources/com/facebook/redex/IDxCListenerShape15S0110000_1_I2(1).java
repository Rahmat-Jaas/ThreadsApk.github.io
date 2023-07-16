package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1TD;
import X.AnonymousClass25l;
import X.AnonymousClass3US;
import X.AnonymousClass49K;
import X.C04220Ms;
import X.C09140ev;
import X.C10300i6;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C22841am;
import X.C24471ir;
import X.C25828Dsm;
import X.C29231xY;
import X.C31155GhB;
import X.C32165H8c;
import X.C60243Og;
import X.C62473a5;
import X.C62653aT;
import X.C63813iO;
import X.C63833iQ;
import X.C63873iU;
import X.H1T;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.common.api.base.IDxACallbackShape1S0210000_1_I2;
import com.instagram.request.IDxDCallbackShape173S0100000_1_I2;

public class IDxCListenerShape15S0110000_1_I2 implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxCListenerShape15S0110000_1_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A02 != 0) {
            if (this.A01) {
                C24471ir r4 = (C24471ir) this.A00;
                AnonymousClass3US r8 = r4.A06;
                USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(r8.A00);
                A0K.A0T("event", "tap_component");
                String str = r8.A01;
                A0K.A0T("entry_point", str);
                A0K.A0T("component", "toggle");
                C18190wL.A1I(A0K, "ig_message_settings");
                A0K.A0Q("attempted_toggle_value", Boolean.valueOf(z));
                C18230wP.A1E(A0K);
                AnonymousClass49K r3 = r4.A0C;
                r3.A00 = C63813iO.A03(r4.A05, (String) null, 2131830492, 1);
                synchronized (r3) {
                    if (r3.A02 == null) {
                        r3.A01 = new IDxACallbackShape1S0210000_1_I2(3, r3, r8, z);
                        H1T A0O = AnonymousClass0wJ.A0O(r3.A07);
                        A0O.A0J("accounts/set_linked_page_ig_direct_message_access/");
                        A0O.A0O("setting_enabled_for_linked_page_ig_dm_access", String.valueOf(z));
                        A0O.A0O("entry_point", str);
                        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1TD.class, C60243Og.class);
                        r3.A02 = A0T;
                        C63873iU r1 = r3.A01;
                        C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.common.api.base.ApiCallback<com.instagram.settings.privacy.messages.api.FbsMessageAccessSettingResponse>");
                        A0T.A00 = r1;
                        C32165H8c h8c = r3.A02;
                        if (h8c != null) {
                            C31155GhB.A03(h8c);
                        } else {
                            throw AnonymousClass0wJ.A0b();
                        }
                    }
                }
                r4.A02 = false;
                r4.A0D.A0C();
            }
        } else if (this.A01 == z) {
        } else {
            if (z) {
                C29231xY r42 = (C29231xY) this.A00;
                Bundle bundle = r42.A00;
                if (bundle != null) {
                    if (bundle.getBoolean("is_two_factor_enabled")) {
                        C10300i6 A0U = AnonymousClass0wJ.A0U(r42.A07);
                        Bundle bundle2 = r42.A00;
                        if (bundle2 != null) {
                            String A08 = C63833iQ.A08(bundle2);
                            String A002 = C09140ev.A00(r42.requireContext());
                            C04220Ms.A06(A002);
                            C32165H8c A003 = C62473a5.A00(A0U, A08, A002);
                            A003.A00 = new IDxDCallbackShape173S0100000_1_I2(r42.getParentFragmentManager(), r42, 4);
                            r42.schedule(A003);
                            return;
                        }
                    } else {
                        C62653aT.A02.A03();
                        Bundle bundle3 = r42.A00;
                        if (bundle3 != null) {
                            bundle3.putBoolean("ARG_IS_ENABLING_WHATSAPP", true);
                            C22841am r2 = new C22841am();
                            AnonymousClass0wJ.A19(r2, C18210wN.A0F(bundle3, r2, r42), AnonymousClass0wJ.A0U(r42.A07));
                            return;
                        }
                    }
                }
                C04220Ms.A0E("twoFacResponseBundle");
                throw null;
            }
            Fragment fragment = (Fragment) this.A00;
            C04220Ms.A07(compoundButton);
            C25828Dsm A0V = AnonymousClass0wJ.A0V(fragment);
            A0V.A0L(2131837183);
            A0V.A0K(2131837182);
            AnonymousClass25l.A00(C18220wO.A0O(fragment, 98), A0V, 2131837167);
            C18180wK.A1N(A0V, compoundButton, 99, 2131823054);
            AnonymousClass0wJ.A1K(A0V);
        }
    }
}
