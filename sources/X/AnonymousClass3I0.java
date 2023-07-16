package X;

import java.util.Arrays;

/* renamed from: X.3I0  reason: invalid class name */
public final class AnonymousClass3I0 {
    public final int A00;
    public final Object[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C18190wL.A1Y(this, obj)) {
                AnonymousClass3I0 r5 = (AnonymousClass3I0) obj;
                if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("StringResWithArgs(stringRes=");
        A0s.append(this.A00);
        A0s.append(", formatArgs=");
        String arrays = Arrays.toString(this.A01);
        C04220Ms.A06(arrays);
        A0s.append(arrays);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass3I0(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
