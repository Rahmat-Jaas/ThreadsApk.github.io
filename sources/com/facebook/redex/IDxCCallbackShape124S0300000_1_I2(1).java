package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass1c4;
import X.AnonymousClass3LL;
import X.C04220Ms;
import X.C07530bf;
import X.C13950oZ;
import X.C26761rA;
import X.C26791rD;
import X.C26811rF;
import X.C49022qi;
import X.C82664q4;
import X.C82674q5;
import X.C83634rj;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

public class IDxCCallbackShape124S0300000_1_I2 implements C83634rj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void BrI(boolean z, String str) {
        String str2 = str;
        switch (this.A03) {
            case 0:
                if (!z) {
                    boolean A0I = C04220Ms.A0I(str, "The save prompt is disabled for the current app. To restore, remove this app from the \"Never save\" list in the Smart Lock for Passwords settings for all accounts on this device.");
                    C07530bf r0 = ((C26761rA) this.A02).A01;
                    if (A0I) {
                        AnonymousClass3LL.A00(r0, "login_smartlock_save_impression_not_allowed", "login_smart_lock", "smartlock", (String) null, (String) null, (HashMap) null);
                    } else {
                        if (str == null) {
                            str2 = "Unknown failure, failure_reason null";
                        }
                        AnonymousClass3LL.A00(r0, "login_smartlock_save_failed", "login_smart_lock", "smartlock", (String) null, str2, (HashMap) null);
                    }
                }
                ((C26761rA) this.A02).A04((UserSession) this.A01, (User) this.A00);
                return;
            case 1:
                AnonymousClass1c4 r5 = ((C26811rF) this.A00).A05;
                User user = (User) this.A01;
                IDxDListenerShape133S0300000_1_I2 iDxDListenerShape133S0300000_1_I2 = new IDxDListenerShape133S0300000_1_I2(0, this, this.A02, user);
                FragmentActivity activity = r5.getActivity();
                if (activity != null) {
                    C13950oZ.A00(C49022qi.A00(activity, iDxDListenerShape133S0300000_1_I2, r5, r5.A07, AnonymousClass006.A1C, user.BK7(), user.getId()));
                    return;
                }
                return;
            default:
                C26791rD.A00((C26791rD) this.A00, (UserSession) this.A02, (User) this.A01);
                return;
        }
    }

    public IDxCCallbackShape124S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = obj3;
        this.A01 = obj2;
    }

    public final void CGo(C82674q5 r6) {
        C82664q4 iDxDCallbackShape140S0300000_1_I2;
        switch (this.A03) {
            case 0:
                iDxDCallbackShape140S0300000_1_I2 = new IDxDCallbackShape140S0300000_1_I2(0, this.A00, this.A01, this.A02);
                break;
            case 1:
                iDxDCallbackShape140S0300000_1_I2 = new IDxDCallbackShape140S0300000_1_I2(1, this, this.A02, this.A01);
                break;
            default:
                iDxDCallbackShape140S0300000_1_I2 = new IDxDCallbackShape633S0100000_1_I2(this, 2);
                break;
        }
        r6.Cek(iDxDCallbackShape140S0300000_1_I2);
    }
}
