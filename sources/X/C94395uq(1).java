package X;

import java.util.List;

/* renamed from: X.5uq  reason: invalid class name and case insensitive filesystem */
public final class C94395uq extends AnonymousClass6LQ {
    public final int A00;
    public final String A01;
    public final List A02;

    public C94395uq(List list, int i, String str) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94395uq) {
                C94395uq r5 = (C94395uq) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, (C18180wK.A03(this.A01) + this.A00) * 31);
    }
}
