package X;

/* renamed from: X.176  reason: invalid class name */
public final class AnonymousClass176 extends AnonymousClass0Sf {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass176) {
                AnonymousClass176 r8 = (AnonymousClass176) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C18190wL.A02(this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ContentFilterDictionaryClientAvailabilityEntity(dictionaryId=");
        A0s.append(this.A01);
        A0s.append(", clientId=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass176(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
