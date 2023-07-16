package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.6FT  reason: invalid class name */
public final class AnonymousClass6FT {
    public static final C123747Yk A00(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = C86114wI.A0B(context).fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new C123747Yk(i);
    }
}
