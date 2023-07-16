package X;

/* renamed from: X.6u4  reason: invalid class name and case insensitive filesystem */
public final class C114896u4 {
    public final int A00;
    public final int A01;
    public final C145758l2 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114896u4) {
                C114896u4 r5 = (C114896u4) obj;
                if (!(C04220Ms.A0I(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A02) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ParagraphIntrinsicInfo(intrinsics=");
        A0s.append(this.A02);
        A0s.append(", startIndex=");
        A0s.append(this.A01);
        A0s.append(", endIndex=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114896u4(C145758l2 r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }
}
