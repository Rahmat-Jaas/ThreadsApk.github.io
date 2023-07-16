package X;

import android.net.Uri;

/* renamed from: X.31h  reason: invalid class name and case insensitive filesystem */
public final class C550031h {
    public static final Uri A00;
    public static final String A01;

    static {
        String A0L = AnonymousClass00U.A0L("com.facebook.appmanager", ".modules");
        A01 = A0L;
        A00 = new Uri.Builder().scheme("content").authority(A0L).build();
    }
}
