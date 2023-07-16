package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.5lq  reason: invalid class name and case insensitive filesystem */
public final class C93585lq extends C93625lu {
    public final Bundle A00 = C18180wK.A06();

    public final int Ave() {
        return 12451000;
    }

    public C93585lq(Context context, Looper looper, C145398kR r11, C143778hI r12, C110886mR r13) {
        super(context, looper, r11, r12, r13, 16);
    }

    public final boolean CeJ() {
        C110886mR r2 = this.A00;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            r2.A04.get(C103706aa.A01);
            if (r2.A05.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
