package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.02s  reason: invalid class name and case insensitive filesystem */
public final class C006102s {
    public static AnonymousClass03Y A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        AnonymousClass03Y A01 = AnonymousClass03Y.A01((View) null, rootWindowInsets);
        AnonymousClass03V r1 = A01.A00;
        r1.A0E(A01);
        r1.A0C(view.getRootView());
        return A01;
    }
}
