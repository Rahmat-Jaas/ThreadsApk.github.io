package com.instagram.bloks.util;

import X.AnonymousClass0wJ;
import X.AnonymousClass1eT;
import X.AnonymousClass3XX;
import X.C10300i6;
import X.C10450iM;
import X.C12560m7;
import X.C130667qT;
import X.C18230wP;
import X.C18250wR;
import X.C18330wh;
import X.C33492Fx;
import X.C61323St;
import X.C61733Vd;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.urlhandlers.infocenterfactexternal.InfoCenterFactExternalUrlHandlerActivity;

public class IDxACallbackShape4S0400000_1_I2 extends AnonymousClass1eT {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape4S0400000_1_I2(Context context, View view, Fragment fragment, UserSession userSession, int i) {
        super(false);
        this.A04 = i;
        this.A03 = view;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = context;
    }

    public final void A01() {
        if (2 - this.A04 == 0) {
            C18250wR.A1C(this.A01);
        }
    }

    public final void A03(AnonymousClass3XX r5) {
        switch (this.A04) {
            case 0:
            case 1:
                ((View) this.A03).setEnabled(true);
                C63813iO.A03((Context) this.A00, (String) null, 2131822639, 0);
                return;
            case 2:
                Throwable th = r5.A01;
                if (AnonymousClass0wJ.A1W(th)) {
                    C10450iM.A06("INFO_CENTER_FACT", "Failed to load consent flow", th);
                } else {
                    C10450iM.A03("INFO_CENTER_FACT", "Failed to load consent flow");
                }
                ((C12560m7) this.A02).A0d();
                return;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C61323St r3;
        C130667qT r0;
        switch (this.A04) {
            case 0:
            case 1:
                r3 = C61733Vd.A00(obj);
                ((View) this.A03).setEnabled(true);
                r0 = C18230wP.A0S((Fragment) this.A01, (C10300i6) this.A02);
                break;
            case 2:
                r3 = (C61323St) obj;
                r0 = (C130667qT) this.A03;
                break;
            default:
                return;
        }
        C33492Fx.A00(r0, r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape4S0400000_1_I2(C12560m7 r2, C130667qT r3, C18330wh r4, InfoCenterFactExternalUrlHandlerActivity infoCenterFactExternalUrlHandlerActivity) {
        super(false);
        this.A04 = 2;
        this.A00 = infoCenterFactExternalUrlHandlerActivity;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r4;
    }
}
