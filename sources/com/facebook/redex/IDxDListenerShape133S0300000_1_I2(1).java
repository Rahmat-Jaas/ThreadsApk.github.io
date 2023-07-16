package com.facebook.redex;

import X.BKU;
import X.BTX;
import X.C26681r2;
import X.C26811rF;
import android.content.DialogInterface;
import com.instagram.model.upcomingevents.UpcomingEvent;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxDListenerShape133S0300000_1_I2 implements DialogInterface.OnDismissListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxDListenerShape133S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A03) {
            case 0:
                C26811rF.A00((C26811rF) ((IDxCCallbackShape124S0300000_1_I2) this.A00).A00, (UserSession) this.A01, (User) this.A02);
                return;
            case 1:
                C26681r2.A00((C26681r2) this.A00, (UserSession) this.A02, (User) this.A01);
                return;
            default:
                BTX.A00((BKU) this.A00, (UpcomingEvent) this.A01, (BTX) this.A02);
                return;
        }
    }
}
