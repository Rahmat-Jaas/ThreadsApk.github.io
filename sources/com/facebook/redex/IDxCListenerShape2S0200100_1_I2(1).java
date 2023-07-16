package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C14030oh;
import X.C60113Ns;
import X.C62803am;
import X.C63043bN;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape2S0200100_1_I2 implements View.OnClickListener {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape2S0200100_1_I2(int i, long j, Object obj, Object obj2) {
        this.A03 = i;
        this.A02 = obj2;
        this.A00 = j;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                C14030oh.A05(-1996115389);
                USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) this.A01;
                C04220Ms.A05(uSLEBaseShape0S0000000);
                EditProfileFieldsController.A00(uSLEBaseShape0S0000000, (EditProfileFieldsController) this.A02, "tap", this.A00);
                C60113Ns.A00();
                throw null;
            case 1:
                int A05 = C14030oh.A05(-544442839);
                AnonymousClass0wJ.A12(C62803am.A00(C63043bN.A01, (UserSession) this.A02), "TAKE_A_BREAK", this.A00);
                ComponentActivity componentActivity = (ComponentActivity) this.A01;
                if (componentActivity != null) {
                    componentActivity.onBackPressed();
                }
                C14030oh.A0C(646878517, A05);
                return;
            default:
                return;
        }
    }
}
