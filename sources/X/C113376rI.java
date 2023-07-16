package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.6rI  reason: invalid class name and case insensitive filesystem */
public abstract class C113376rI {
    public final C04560Oe A00;

    public abstract Fragment A01(Bundle bundle, String str);

    public Fragment A00(Bundle bundle, String str) {
        C04560Oe r0 = this.A00;
        r0.getClass();
        Fragment fragment = (Fragment) r0.get();
        str.getClass();
        Bundle A06 = C18180wK.A06();
        A06.putBundle("CHILD_FRAGMENT_BUNDLE", bundle);
        A06.putString("CHILD_FRAGMENT_IDENTIFIER", str);
        fragment.setArguments(A06);
        return fragment;
    }

    public C113376rI(C04560Oe r1) {
        this.A00 = r1;
    }
}
