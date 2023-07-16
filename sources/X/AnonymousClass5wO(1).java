package X;

import android.net.Uri;

/* renamed from: X.5wO  reason: invalid class name */
public final class AnonymousClass5wO extends AnonymousClass6NY {
    public final Uri A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5wO) {
                AnonymousClass5wO r5 = (AnonymousClass5wO) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18210wN.A04(this.A00));
    }

    public AnonymousClass5wO(String str, Uri uri) {
        this.A00 = uri;
        this.A01 = str;
    }
}
