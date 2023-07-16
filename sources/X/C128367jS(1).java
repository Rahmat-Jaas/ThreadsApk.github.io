package X;

import android.os.Bundle;

/* renamed from: X.7jS  reason: invalid class name and case insensitive filesystem */
public final class C128367jS implements AnonymousClass8e7 {
    public final Bundle A00;
    public final String A01;

    public /* synthetic */ C128367jS(Bundle bundle, String str) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128367jS) {
                C128367jS r5 = (C128367jS) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A01)) * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FragmentTransitionInfo(identifier=");
        A0s.append(this.A01);
        A0s.append(", bundle=");
        A0s.append(this.A00);
        A0s.append(", requestKey=");
        A0s.append((String) null);
        A0s.append(", resultListener=");
        return C86104wH.A0y((Object) null, A0s);
    }
}
