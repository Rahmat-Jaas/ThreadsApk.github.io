package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.0L7  reason: invalid class name */
public final class AnonymousClass0L7 {
    public final C16080sS A00;

    public final boolean A00(Context context, Intent intent, Object obj) {
        C16080sS r1 = this.A00;
        if (!r1.CsD()) {
            return true;
        }
        if (!AnonymousClass3YE.A00(context, intent, obj, r1.Aby())) {
            for (C16090sT r7 : r1.ApU()) {
                String str = r7.A02;
                if (str == null || str.equals(obj.getClass().getName())) {
                    IntentFilter intentFilter = r7.A01;
                    if (intentFilter != null) {
                        boolean z = false;
                        if (intentFilter.match(r7.A00, intent, false, "TAG") > 0) {
                            z = true;
                        }
                        if (r7.A03) {
                            if (!z) {
                            }
                        } else if (z) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0L7(C16080sS r1) {
        this.A00 = r1;
    }

    public final boolean A01(Context context, Intent intent, Object obj) {
        C16100sU.A03(context);
        C16100sU.A03(context);
        return A00(context, intent, obj);
    }
}
