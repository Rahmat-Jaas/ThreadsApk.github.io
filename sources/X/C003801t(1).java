package X;

import android.content.ClipData;
import android.os.Build;

/* renamed from: X.01t  reason: invalid class name and case insensitive filesystem */
public final class C003801t {
    public final C003901u A00;

    public C003801t(ClipData clipData, int i) {
        C003901u r0;
        if (Build.VERSION.SDK_INT >= 31) {
            r0 = new C008003l(clipData, i);
        } else {
            r0 = new C007403f(clipData, i);
        }
        this.A00 = r0;
    }
}
