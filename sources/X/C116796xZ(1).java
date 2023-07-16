package X;

import android.os.Build;

/* renamed from: X.6xZ  reason: invalid class name and case insensitive filesystem */
public final class C116796xZ {
    public static void A00() {
        if (!Build.FINGERPRINT.contains("vbox")) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(Build.MODEL);
            A0r.append(" - ");
            A0r.append(Build.VERSION.RELEASE);
            A0r.append(" - API ");
            C86144wL.A0v(A0r, Build.VERSION.SDK_INT);
        }
    }
}
