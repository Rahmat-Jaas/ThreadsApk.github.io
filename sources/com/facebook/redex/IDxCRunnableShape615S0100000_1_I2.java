package com.facebook.redex;

import X.AnonymousClass00U;
import X.C63813iO;
import X.C81824oS;
import android.app.Activity;
import android.content.Context;

public class IDxCRunnableShape615S0100000_1_I2 implements C81824oS {
    public Object A00;
    public final int A01;

    public IDxCRunnableShape615S0100000_1_I2(Context context, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = context;
        } else {
            this.A00 = context;
        }
    }

    public final void CfP(int i) {
        String str;
        Object obj;
        switch (this.A01) {
            case 0:
                obj = (Context) this.A00;
                break;
            case 1:
                Context context = (Context) this.A00;
                switch (i) {
                    case 0:
                        str = "Unknown";
                        break;
                    case 1:
                        str = "Bloks dismiss action";
                        break;
                    case 2:
                        str = "Android OS back";
                        break;
                    case 3:
                        str = "Swipe to dismiss";
                        break;
                    case 4:
                        str = "Tap outside to dismiss";
                        break;
                    case 5:
                        str = "Accessibility action";
                        break;
                    default:
                        str = "Native loading screen cancel button";
                        break;
                }
                C63813iO.A01(context, AnonymousClass00U.A0L("Native dismiss callback called ", str));
                return;
            default:
                obj = this.A00;
                break;
        }
        ((Activity) obj).finish();
    }

    public IDxCRunnableShape615S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
