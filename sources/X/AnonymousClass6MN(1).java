package X;

/* renamed from: X.6MN  reason: invalid class name */
public final class AnonymousClass6MN {
    public static final AnonymousClass68K A00(C23894D0g d0g, boolean z, boolean z2) {
        int ordinal;
        if (z2) {
            return AnonymousClass68K.UNBLOCK;
        }
        if (!(d0g == null || (ordinal = d0g.ordinal()) == -1)) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 2) {
                        return AnonymousClass68K.FOLLOW;
                    }
                    if (ordinal == 1) {
                        return AnonymousClass68K.LOADING;
                    }
                    if (ordinal != 0) {
                        throw AnonymousClass4VZ.A00();
                    }
                } else if (z) {
                    return AnonymousClass68K.REQUESTED;
                }
            } else if (z) {
                return AnonymousClass68K.FOLLOWING;
            }
            return AnonymousClass68K.CANCEL;
        }
        return AnonymousClass68K.UNKNOWN;
    }
}
