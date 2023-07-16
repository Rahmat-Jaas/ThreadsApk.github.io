package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.7ei  reason: invalid class name and case insensitive filesystem */
public final class C126177ei implements C142098do {
    public final Uri A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C126177ei) {
                C126177ei r5 = (C126177ei) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SingleImageSource(uri=");
        A0s.append(this.A00);
        A0s.append(", extras=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C126177ei(Uri uri, Map map) {
        this.A00 = uri;
        this.A01 = map;
    }
}
