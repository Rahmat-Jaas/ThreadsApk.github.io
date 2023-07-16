package X;

import com.facebook.redex.IDxComparatorShape303S0100000_2_I2;
import java.util.Comparator;

/* renamed from: X.722  reason: invalid class name */
public final class AnonymousClass722 {
    public static final Comparator A01(AnonymousClass0YY... r2) {
        if (r2.length > 0) {
            return new IDxComparatorShape303S0100000_2_I2(r2, 13);
        }
        throw C18190wL.A0a("Failed requirement.");
    }

    public static final int A00(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
