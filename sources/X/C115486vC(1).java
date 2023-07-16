package X;

/* renamed from: X.6vC  reason: invalid class name and case insensitive filesystem */
public final class C115486vC {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C115486vC(Object obj, String str, int i, int i2) {
        C04220Ms.A0B(str, 4);
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115486vC) {
                C115486vC r5 = (C115486vC) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass7HE A00(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        } else if (i == Integer.MIN_VALUE) {
            throw C18180wK.A0a("Item.end should be set first");
        }
        return new AnonymousClass7HE(this.A02, this.A03, this.A01, i);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A03, ((((AnonymousClass0wJ.A03(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MutableRange(item=");
        A0s.append(this.A02);
        A0s.append(", start=");
        A0s.append(this.A01);
        A0s.append(", end=");
        A0s.append(this.A00);
        A0s.append(", tag=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
