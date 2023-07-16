package com.facebook.redex;

import X.AnonymousClass601;
import X.AnonymousClass7CJ;
import X.AnonymousClass7GY;
import X.C144608im;
import X.C62413Zr;
import X.C63893iY;
import X.C971568d;
import android.app.Activity;
import android.content.Context;
import java.util.Map;

public class IDxPCallbackShape32S0400000_2_I2 implements C144608im {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxPCallbackShape32S0400000_2_I2(Activity activity, Context context, AnonymousClass601 r3, C63893iY r4, int i) {
        this.A04 = i;
        if (i != 0) {
            this.A02 = context;
            this.A03 = r3;
            this.A01 = r4;
            this.A00 = activity;
            return;
        }
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = activity;
    }

    public final void CAi(Map map) {
        Activity activity;
        int i;
        switch (this.A04) {
            case 0:
                Context context = (Context) this.A00;
                AnonymousClass601 r3 = (AnonymousClass601) this.A01;
                C63893iY r2 = (C63893iY) this.A02;
                activity = (Activity) this.A03;
                Object obj = map.get(AnonymousClass7CJ.A00(context));
                if (obj == C971568d.GRANTED) {
                    AnonymousClass7CJ.A02(context, r3, r2);
                    return;
                } else if (obj != C971568d.DENIED_DONT_ASK_AGAIN) {
                    return;
                }
                break;
            case 1:
                Object obj2 = map.get("android.permission.CAMERA");
                if (obj2 == C971568d.GRANTED) {
                    AnonymousClass7CJ.A01((Context) this.A02, (AnonymousClass601) this.A03, (C63893iY) this.A01);
                    return;
                } else if (obj2 == C971568d.DENIED_DONT_ASK_AGAIN) {
                    activity = (Activity) this.A00;
                    i = 2131822933;
                    break;
                } else {
                    return;
                }
            default:
                Object obj3 = map.get("android.permission.READ_EXTERNAL_STORAGE");
                if (obj3 == C971568d.GRANTED) {
                    AnonymousClass7GY.A00((Context) this.A02, (AnonymousClass601) this.A03, (C63893iY) this.A01);
                    return;
                } else if (obj3 == C971568d.DENIED_DONT_ASK_AGAIN) {
                    activity = (Activity) this.A00;
                    break;
                } else {
                    return;
                }
        }
        i = 2131836144;
        C62413Zr.A01(activity, i);
    }
}
