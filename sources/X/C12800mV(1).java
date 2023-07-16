package X;

import android.content.Context;

/* renamed from: X.0mV  reason: invalid class name and case insensitive filesystem */
public final class C12800mV {
    public Context A00;

    public final C12790mU A00(Integer num) {
        int i;
        Context context = this.A00;
        String A0L = AnonymousClass00U.A0L("rti.mqtt.", AnonymousClass0XT.A00(num));
        switch (num.intValue()) {
            case 1:
            case 2:
            case 4:
            case 5:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        return new C12790mU(context.getSharedPreferences(A0L, i));
    }

    public C12800mV(Context context) {
        this.A00 = context;
    }
}
