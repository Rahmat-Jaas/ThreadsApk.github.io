package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2BI  reason: invalid class name */
public final class AnonymousClass2BI {
    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof AnonymousClass2BI);
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A03(0) + 31) * 31) + C18200wM.A07(false);
    }

    public final String toString() {
        String format = String.format((Locale) null, "%d defer:%b", Arrays.copyOf(new Object[]{0, false}, 2));
        C04220Ms.A06(format);
        return format;
    }
}
