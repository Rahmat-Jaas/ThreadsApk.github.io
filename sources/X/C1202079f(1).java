package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.79f  reason: invalid class name and case insensitive filesystem */
public final class C1202079f {
    public C146678mg A00 = null;
    public C146868n0 A01 = null;
    public C147018nF A02 = null;
    public AnonymousClass7XA A03 = null;

    public /* synthetic */ C1202079f(C146678mg r2, C146868n0 r3, C147018nF r4, AnonymousClass7XA r5, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1202079f) {
                C1202079f r5 = (C1202079f) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BorderCache(imageBitmap=");
        A0s.append(this.A01);
        A0s.append(", canvas=");
        A0s.append(this.A00);
        A0s.append(", canvasDrawScope=");
        A0s.append(this.A03);
        A0s.append(", borderPath=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C1202079f() {
    }
}
