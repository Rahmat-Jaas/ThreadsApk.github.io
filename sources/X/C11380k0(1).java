package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0k0  reason: invalid class name and case insensitive filesystem */
public final class C11380k0 extends AnonymousClass0Sf {
    public static final List A02 = new ArrayList(Arrays.asList(new Integer[]{-16777216, -16777216}));
    public int A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11380k0) {
                C11380k0 r5 = (C11380k0) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public C11380k0(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public C11380k0() {
        this(new ArrayList(), 0);
    }
}
