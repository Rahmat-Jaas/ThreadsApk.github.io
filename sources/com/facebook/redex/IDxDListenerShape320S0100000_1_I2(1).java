package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1a6;
import X.AnonymousClass3X1;
import X.C18190wL;
import X.C18320wg;
import X.C23171cc;
import X.C24691jq;
import X.C26851rK;
import X.C28161tl;
import X.C32238HBy;
import X.C62703aY;
import X.C63533hk;
import X.C63803iN;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxDListenerShape320S0100000_1_I2 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape320S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                C18320wg.A00((C18320wg) this.A00, AnonymousClass006.A15);
                return;
            case 1:
                SharedPreferences A04 = C28161tl.A04(((C32238HBy) this.A00).A1N);
                AnonymousClass0wJ.A11(A04.edit(), "long_story_or_direct_video_nux_impression", C18190wL.A04(A04, "long_story_or_direct_video_nux_impression") + 1);
                return;
            case 2:
                AnonymousClass1a6 r1 = (AnonymousClass1a6) this.A00;
                if (r1.isAdded()) {
                    AnonymousClass3X1.A00(AnonymousClass0wJ.A0X(r1.A04)).AIB(r1);
                    return;
                }
                return;
            case 3:
                C23171cc r2 = (C23171cc) this.A00;
                C63533hk.A02(r2.A03).A0G(r2.A03.getUserId());
                C23171cc.A00(r2);
                return;
            case 4:
                C26851rK r12 = (C26851rK) this.A00;
                r12.A00 = null;
                r12.A03.unregisterLifecycleListener(r12);
                return;
            case 5:
                FragmentActivity fragmentActivity = ((C24691jq) ((IDxCListenerShape70S0200000_1_I2) this.A00).A00).A04;
                if (fragmentActivity != null) {
                    fragmentActivity.getWindow().setSoftInputMode(0);
                    return;
                }
                return;
            case 6:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            case 9:
                UserSession userSession = (UserSession) this.A00;
                if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36313686494676600L)) {
                    AnonymousClass0wJ.A11(C28161tl.A03(userSession), "upsells_cancel_count_for_link_switcher", C28161tl.A04(userSession).getInt("upsells_cancel_count_for_link_switcher", 0) + 1);
                    return;
                }
                return;
            case 10:
                return;
            default:
                C62703aY r13 = (C62703aY) this.A00;
                r13.A01 = false;
                r13.A05.CeG();
                return;
        }
    }
}
