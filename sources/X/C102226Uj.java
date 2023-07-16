package X;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: X.6Uj  reason: invalid class name and case insensitive filesystem */
public final class C102226Uj {
    public static final void A00(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        }
    }
}
