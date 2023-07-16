package X;

import android.app.Application;

/* renamed from: X.0Cp  reason: invalid class name and case insensitive filesystem */
public final class C02720Cp {
    public static volatile Application A00;

    public static Application A00() {
        if (A00 != null) {
            return A00;
        }
        throw new IllegalStateException("ApplicationHolder#set never called");
    }
}
