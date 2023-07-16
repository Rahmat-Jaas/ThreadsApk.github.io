package X;

import java.math.BigInteger;

/* renamed from: X.7yR  reason: invalid class name and case insensitive filesystem */
public final class C134827yR implements Comparable {
    public static final C134827yR A05 = new C134827yR(0, 1, "", 0);
    public static final C134827yR A06;
    public static final C134827yR A07 = new C134827yR(0, 0, "", 0);
    public static final C134827yR A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final C04530Oa A03 = C86114wI.A0w(this, 12);
    public final String A04;

    static {
        C134827yR r0 = new C134827yR(1, 0, "", 0);
        A08 = r0;
        A06 = r0;
    }

    /* renamed from: A00 */
    public final int compareTo(C134827yR r3) {
        C04220Ms.A0B(r3, 0);
        return ((BigInteger) C18190wL.A0f(this.A03)).compareTo((BigInteger) C18190wL.A0f(r3.A03));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C134827yR)) {
            return false;
        }
        C134827yR r4 = (C134827yR) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((C18210wN.A00(this.A00) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        String str;
        String str2 = this.A04;
        if (AnonymousClass8bQ.A0m(str2)) {
            str = C04220Ms.A01("-", str2);
        } else {
            str = "";
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A00);
        A0r.append('.');
        A0r.append(this.A01);
        A0r.append('.');
        A0r.append(this.A02);
        return C18180wK.A0i(str, A0r);
    }

    public C134827yR(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str;
    }
}
