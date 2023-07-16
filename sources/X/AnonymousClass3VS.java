package X;

/* renamed from: X.3VS  reason: invalid class name */
public final class AnonymousClass3VS {
    public long A00;
    public String A01;

    public AnonymousClass3VS(String str, long j) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3VS) {
                AnonymousClass3VS r8 = (AnonymousClass3VS) obj;
                if (!C04220Ms.A0I(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A01) + C18190wL.A02(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FxRawDestinationIdentityWithTimestamp(destinationIdentityId=");
        A0s.append(this.A01);
        A0s.append(", lastUpdateTimeMs=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass3VS() {
        this("", System.currentTimeMillis());
    }
}
