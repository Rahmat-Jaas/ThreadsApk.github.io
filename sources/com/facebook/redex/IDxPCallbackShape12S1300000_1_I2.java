package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass601;
import X.C10300i6;
import X.C109326jp;
import X.C144608im;
import X.C18180wK;
import X.C63103bV;
import X.C63913ic;
import X.C971568d;
import android.app.Activity;
import java.util.Map;

public class IDxPCallbackShape12S1300000_1_I2 implements C144608im {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxPCallbackShape12S1300000_1_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public final void CAi(Map map) {
        if (this.A04 != 0) {
            String str = this.A03;
            ((C63103bV) this.A00).A04((Activity) this.A02, (C10300i6) this.A01, str, map);
            return;
        }
        C63913ic.A0K((AnonymousClass601) this.A01, (C109326jp) this.A02, (AnonymousClass3HX) this.A00, Boolean.valueOf(C18180wK.A1Z(map.get(this.A03), C971568d.GRANTED)));
    }
}
