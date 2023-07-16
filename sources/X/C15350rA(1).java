package X;

import android.content.Context;

/* renamed from: X.0rA  reason: invalid class name and case insensitive filesystem */
public final class C15350rA {
    public Context A00 = null;

    public final synchronized Context A00() {
        Context context;
        context = this.A00;
        if (context == null) {
            throw new IllegalStateException("ContextHolder not initialized, cannot get context");
        }
        return context;
    }
}
