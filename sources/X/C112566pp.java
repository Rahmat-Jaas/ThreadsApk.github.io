package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.6pp  reason: invalid class name and case insensitive filesystem */
public final class C112566pp {
    public int A00 = 0;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public CharSequence A03 = null;

    public final C109576kE A00() {
        boolean A1V;
        if (!TextUtils.isEmpty(this.A03)) {
            int i = this.A00;
            if (i == 15) {
                A1V = C18180wK.A1V(0);
            } else if (i == 0) {
                A1V = false;
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A03(Build.VERSION.SDK_INT, "Authenticator combination is unsupported on API ", ": ", String.valueOf(i)));
            }
            if (TextUtils.isEmpty(this.A02) && !A1V) {
                throw C18190wL.A0a("Negative text must be set and non-empty.");
            } else if (TextUtils.isEmpty(this.A02) || !A1V) {
                return new C109576kE(this.A03, this.A01, this.A02, this.A00);
            } else {
                throw C18190wL.A0a("Negative text must not be set if device credential authentication is allowed.");
            }
        } else {
            throw C18190wL.A0a("Title must be set and non-empty.");
        }
    }
}
