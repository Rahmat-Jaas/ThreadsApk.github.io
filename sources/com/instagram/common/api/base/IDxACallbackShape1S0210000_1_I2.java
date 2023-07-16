package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass1TD;
import X.AnonymousClass2OP;
import X.AnonymousClass3Fo;
import X.AnonymousClass3LY;
import X.AnonymousClass3US;
import X.AnonymousClass3XX;
import X.AnonymousClass49K;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C19894BEu;
import X.C22921bc;
import X.C23411dm;
import X.C24471ir;
import X.C25786Drz;
import X.C28161tl;
import X.C306022c;
import X.C553432u;
import X.C57333Aq;
import X.C58163Ei;
import X.C60213Od;
import X.C62423Zt;
import X.C63483hZ;
import X.C63733iD;
import X.C63813iO;
import X.C63873iU;
import X.C687845l;
import X.C85794vm;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCBackShape137S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.service.session.UserSession;

public class IDxACallbackShape1S0210000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxACallbackShape1S0210000_1_I2(int i, Object obj, Object obj2, boolean z) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int i;
        int i2;
        switch (this.A03) {
            case 1:
                i = C14030oh.A03(1293272146);
                Object obj = this.A01;
                Context context = (Context) this.A00;
                C63733iD A012 = C63733iD.A01();
                C63733iD.A07(context, A012, 2131824748);
                A012.A0F(C306022c.ERROR);
                A012.A0E = "daisy_snackbar_error";
                A012.A0C();
                A012.A0I = true;
                A012.A0D = AnonymousClass0wJ.A0k(context, 2131824747);
                A012.A07 = new IDxCBackShape137S0200000_1_I2(4, (Object) context, obj);
                C63733iD.A0A(A012);
                i2 = -693066410;
                break;
            case 2:
                i = C14030oh.A03(-728366961);
                Fragment fragment = ((C57333Aq) ((IDxCListenerShape267S0100000_1_I2) this.A00).A00).A00;
                if (fragment.isAdded()) {
                    C63813iO.A03(fragment.getContext(), "allow_resharing_to_stories_settings_failed", 2131831662, 0);
                    ((CompoundButton) this.A01).setChecked(!this.A02);
                }
                i2 = -1802495184;
                break;
            case 3:
                i = AnonymousClass0wJ.A00(-1870267797, r7);
                super.onFail(r7);
                AnonymousClass49K r1 = (AnonymousClass49K) this.A01;
                Toast toast = r1.A00;
                if (toast != null) {
                    toast.cancel();
                }
                r1.A00 = null;
                C24471ir r0 = r1.A04;
                if (r0 != null) {
                    C23411dm.A08(r0);
                    C60213Od.A00(r0.A05);
                }
                AnonymousClass3US r3 = (AnonymousClass3US) this.A00;
                boolean z = this.A02;
                USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(r3.A00);
                AnonymousClass3US.A00(A0K, r3, "submit_error");
                C18190wL.A1I(A0K, "ig_message_settings");
                A0K.A0Q("attempted_toggle_value", Boolean.valueOf(z));
                A0K.A0T("message_controls_settings_version", "v2");
                A0K.A1J(C63483hZ.A02(r7));
                A0K.A0T("error_identifier", C63483hZ.A01(r7));
                A0K.Bb4();
                i2 = -320183144;
                break;
            default:
                super.onFail(r7);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onFinish() {
        if (3 - this.A03 != 0) {
            super.onFinish();
            return;
        }
        int A032 = C14030oh.A03(1547834074);
        super.onFinish();
        ((AnonymousClass49K) this.A01).A02 = null;
        C14030oh.A0A(87219974, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        switch (this.A03) {
            case 0:
                A032 = C14030oh.A03(666553452);
                int A033 = C14030oh.A03(269234018);
                if (((C553432u) ((C85794vm) obj).D7H()).A00) {
                    C58163Ei.A01.A00();
                    UserSession userSession = ((AnonymousClass3Fo) this.A00).A04;
                    boolean z = this.A02;
                    Bundle A0E = AnonymousClass0wJ.A0E(userSession);
                    A0E.putBoolean("is_parent_account", z);
                    C22921bc r2 = new C22921bc();
                    r2.setArguments(A0E);
                    C25786Drz A0Q = C18180wK.A0Q((FragmentActivity) this.A01, userSession);
                    A0Q.A03 = r2;
                    A0Q.A0D = true;
                    A0Q.A05();
                }
                C14030oh.A0A(226124419, A033);
                i = -572705085;
                break;
            case 1:
                A032 = C14030oh.A03(-1243299161);
                int A034 = C14030oh.A03(861570859);
                UserSession userSession2 = (UserSession) this.A01;
                AnonymousClass2OP.A00(userSession2).A00(this.A02);
                Context context = (Context) this.A00;
                C19894BEu.A02(context, userSession2).A0E(context);
                AnonymousClass3LY.A00(userSession2).CWx(new C687845l());
                C14030oh.A0A(732484660, A034);
                i = -1849015064;
                break;
            case 2:
                A032 = C14030oh.A03(-150648725);
                int A035 = C14030oh.A03(-1080496248);
                boolean z2 = this.A02;
                UserSession userSession3 = ((C57333Aq) ((IDxCListenerShape267S0100000_1_I2) this.A00).A00).A02;
                C62423Zt.A02(userSession3);
                AnonymousClass0wJ.A0Y(userSession3).A05.Ckv(Boolean.valueOf(!z2));
                C14030oh.A0A(-1923315830, A035);
                i = 605637532;
                break;
            default:
                A032 = C14030oh.A03(2114369809);
                AnonymousClass1TD r8 = (AnonymousClass1TD) obj;
                int A002 = AnonymousClass0wJ.A00(906428603, r8);
                super.onSuccess(r8);
                boolean z3 = r8.A01;
                if (!z3 || r8.A00 != null) {
                    AnonymousClass3US r1 = (AnonymousClass3US) this.A00;
                    Boolean bool = r8.A00;
                    USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(r1.A00);
                    AnonymousClass3US.A00(A0K, r1, "submit");
                    C18190wL.A1I(A0K, "ig_message_settings");
                    A0K.A0Q("eligible_ig_dm_toggle", Boolean.valueOf(z3));
                    A0K.A0Q("source_of_truth_toggle_value", bool);
                    C18230wP.A1E(A0K);
                    if (z3) {
                        C28161tl r12 = ((AnonymousClass49K) this.A01).A06;
                        Boolean bool2 = r8.A00;
                        if (bool2 != null) {
                            AnonymousClass0wJ.A13(C28161tl.A02(r12), "direct_linked_page_ig_dm_access", bool2.booleanValue());
                        } else {
                            IllegalStateException A0b = AnonymousClass0wJ.A0b();
                            C14030oh.A0A(907798829, A002);
                            throw A0b;
                        }
                    }
                } else {
                    ((AnonymousClass3US) this.A00).A01("submit_error", Boolean.valueOf(this.A02));
                    z3 = false;
                }
                AnonymousClass49K r13 = (AnonymousClass49K) this.A01;
                Toast toast = r13.A00;
                if (toast != null) {
                    toast.cancel();
                }
                r13.A00 = null;
                C24471ir r14 = r13.A04;
                if (r14 != null) {
                    r14.A02 = true;
                    r14.A04 = z3;
                    if (!z3) {
                        C60213Od.A00(r14.A05);
                    }
                    r14.A0D.A0C();
                }
                C14030oh.A0A(-1510345583, A002);
                i = 1303959280;
                break;
        }
        C14030oh.A0A(i, A032);
    }
}
