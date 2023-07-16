package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.6uF  reason: invalid class name and case insensitive filesystem */
public final class C114986uF {
    public final C146928n6 A00;
    public final ImmutableList A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114986uF) {
                C114986uF r5 = (C114986uF) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A02 != r5.A02 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        int hashCode = (this.A00.hashCode() + 31) * 31;
        if (!this.A02) {
            i = 0;
        }
        return C18220wO.A06(this.A01, (hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TitleBarInfo(isVisible=");
        A0s.append(true);
        A0s.append(", title=");
        A0s.append(this.A00);
        A0s.append(", isMainScreen=");
        A0s.append(this.A02);
        A0s.append(", rightActions=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114986uF(C146928n6 r1, ImmutableList immutableList, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = immutableList;
    }
}
