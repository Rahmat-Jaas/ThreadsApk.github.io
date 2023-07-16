package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass4JZ;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C144608im;
import X.C62193Xs;
import X.C63913ic;
import X.C971568d;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.Map;

public class IDxPCallbackShape31S0400000_1_I2 implements C144608im {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxPCallbackShape31S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    public final void CAi(Map map) {
        if (this.A04 != 0) {
            View view = (View) this.A01;
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            AnonymousClass4JZ.A02((Activity) this.A00, (UserSession) this.A03, (EditPhoneNumberView) this.A02);
            return;
        }
        C04220Ms.A0B(map, 0);
        if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == C971568d.GRANTED) {
            C62193Xs.A00((Fragment) this.A02, (AnonymousClass3HX) this.A00, (AnonymousClass601) this.A01, (C109326jp) this.A03);
            return;
        }
        C63913ic.A0K((AnonymousClass601) this.A01, (C109326jp) this.A03, (AnonymousClass3HX) this.A00, false);
    }
}
