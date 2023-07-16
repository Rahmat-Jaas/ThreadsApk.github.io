package X;

/* renamed from: X.5Kd  reason: invalid class name and case insensitive filesystem */
public final class C90025Kd extends AnonymousClass0Sf implements C144148hu {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final String A03;

    public C90025Kd(Integer num, String str, long j, long j2) {
        C04220Ms.A0B(str, 3);
        this.A00 = j;
        this.A02 = num;
        this.A03 = str;
        this.A01 = j2;
    }

    public final C90025Kd CyF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90025Kd) {
                C90025Kd r8 = (C90025Kd) obj;
                if (this.A00 != r8.A00 || !C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A03, r8.A03) || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(AnonymousClass0wJ.A07(this.A03, (C86154wM.A04(this.A00) + AnonymousClass0wJ.A03(this.A02)) * 31), this.A01);
    }
}
