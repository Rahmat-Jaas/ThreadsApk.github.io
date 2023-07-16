package X;

import android.content.Context;

/* renamed from: X.3yG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66783yG implements C81834oT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62823ao A01;

    public /* synthetic */ C66783yG(Context context, C62823ao r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final boolean Bno(Integer num) {
        int i;
        C62823ao r5 = this.A01;
        Context context = this.A00;
        if (num != AnonymousClass006.A01) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        i = 5;
                    }
                    return true;
                }
                i = 4;
                r5.A00 = i;
                return true;
            }
            r5.A00 = 3;
            return true;
        }
        r5.A03(context);
        r5.A00 = 2;
        return false;
    }
}
