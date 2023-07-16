package X;

/* renamed from: X.6u1  reason: invalid class name and case insensitive filesystem */
public final class C114866u1 {
    public final float A00;
    public final long A01;
    public final C147218oz A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114866u1) {
                C114866u1 r8 = (C114866u1) obj;
                if (!(Float.compare(this.A00, r8.A00) == 0 && this.A01 == r8.A01 && C04220Ms.A0I(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, C86104wH.A06(C86134wK.A03(this.A00), this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Scale(scale=");
        A0s.append(this.A00);
        A0s.append(", transformOrigin=");
        A0s.append(AnonymousClass00U.A0G("TransformOrigin(packedValue=", ')', this.A01));
        A0s.append(", animationSpec=");
        A0s.append(this.A02);
        return C86114wI.A0q(A0s, ')');
    }

    public C114866u1(C147218oz r1, float f, long j) {
        this.A00 = f;
        this.A01 = j;
        this.A02 = r1;
    }
}
