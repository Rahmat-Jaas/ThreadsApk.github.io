package X;

import android.net.Uri;

/* renamed from: X.6pQ  reason: invalid class name and case insensitive filesystem */
public final class C112346pQ {
    public final Uri A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("NavDeepLinkRequest");
        A0s.append("{");
        Uri uri = this.A00;
        if (uri != null) {
            A0s.append(" uri=");
            A0s.append(String.valueOf(uri));
        }
        String str = this.A01;
        if (str != null) {
            A0s.append(" action=");
            A0s.append(str);
        }
        String str2 = this.A02;
        if (str2 != null) {
            A0s.append(" mimetype=");
            A0s.append(str2);
        }
        String A0i = C18180wK.A0i(" }", A0s);
        C04220Ms.A06(A0i);
        return A0i;
    }

    public C112346pQ(Uri uri, String str, String str2) {
        this.A00 = uri;
        this.A01 = str;
        this.A02 = str2;
    }
}
