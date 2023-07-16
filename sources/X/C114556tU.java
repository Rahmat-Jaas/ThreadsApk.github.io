package X;

import android.content.res.Resources;

/* renamed from: X.6tU  reason: invalid class name and case insensitive filesystem */
public final class C114556tU {
    public final int A00;
    public final Resources.Theme A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114556tU) {
                C114556tU r5 = (C114556tU) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Key(theme=");
        A0s.append(this.A01);
        A0s.append(", id=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114556tU(Resources.Theme theme, int i) {
        this.A01 = theme;
        this.A00 = i;
    }
}
