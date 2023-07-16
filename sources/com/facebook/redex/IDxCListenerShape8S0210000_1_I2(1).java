package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1x7;
import X.AnonymousClass3LL;
import X.AnonymousClass4MC;
import X.C04220Ms;
import X.C15730rn;
import X.C18180wK;
import X.C18240wQ;
import X.C25041le;
import X.C28161tl;
import X.C31155GhB;
import X.C41030Luu;
import X.C63723iC;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class IDxCListenerShape8S0210000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxCListenerShape8S0210000_1_I2(AnonymousClass3LL r1, C63723iC r2, int i, boolean z) {
        this.A03 = i;
        this.A00 = r2;
        if (1 - i != 0) {
            this.A02 = z;
            this.A01 = r1;
        } else {
            this.A01 = r1;
            this.A02 = z;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A03) {
            case 0:
                if (this.A02) {
                    C18240wQ.A1G(this.A00);
                    return;
                }
                FragmentActivity A0I = C18240wQ.A0I(this.A01);
                A0I.setResult(9692, (Intent) null);
                A0I.finish();
                return;
            case 1:
                C63723iC r2 = (C63723iC) this.A00;
                UserSession userSession = r2.A08;
                C04220Ms.A0B(userSession, 0);
                AnonymousClass3LL.A00(userSession, "logout_password_saving_logout_clicked", "logout_spi", "logout", "logout_interaction", (String) null, (HashMap) null);
                r2.A0D(AnonymousClass006.A00, this.A02);
                return;
            case 2:
                C63723iC r0 = (C63723iC) this.A00;
                UserSession userSession2 = r0.A08;
                C15730rn A002 = C15730rn.A00(r0.A03, "logout_d2_cancel_tapped");
                A002.A0D("type", "is_all");
                C18180wK.A1K(A002, userSession2);
                if (this.A02) {
                    C04220Ms.A0B(userSession2, 0);
                    AnonymousClass3LL.A00(userSession2, "logout_password_saving_multiaccount_cancel_clicked", "logout_spi", "logout", "logout_interaction", (String) null, (HashMap) null);
                    return;
                }
                return;
            case 3:
                AnonymousClass4MC r1 = (AnonymousClass4MC) this.A01;
                boolean z = !this.A02;
                r1.A0C = z;
                AnonymousClass1x7 r22 = (AnonymousClass1x7) this.A00;
                int i2 = r1.A04;
                if (i2 == r22.A06.A04) {
                    AnonymousClass0wJ.A13(C28161tl.A02(r22.A01), "oxp_allow_app_updates", z);
                    AnonymousClass1x7.A0B(r22);
                }
                if (i2 == r22.A04.A04) {
                    AnonymousClass0wJ.A13(C28161tl.A02(r22.A01), "oxp_show_app_update_available_notifications", z);
                }
                if (i2 == r22.A05.A04) {
                    AnonymousClass0wJ.A13(C28161tl.A02(r22.A01), "oxp_show_app_update_installed_notifications", z);
                }
                dialogInterface.dismiss();
                ((C41030Luu) r22.getAdapter()).notifyDataSetChanged();
                return;
            default:
                C31155GhB.A03(new C25041le((AnonymousClass1x7) this.A00, (AnonymousClass4MC) this.A01, this.A02, true));
                dialogInterface.dismiss();
                return;
        }
    }

    public IDxCListenerShape8S0210000_1_I2(int i, Object obj, Object obj2, boolean z) {
        this.A03 = i;
        this.A02 = z;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
