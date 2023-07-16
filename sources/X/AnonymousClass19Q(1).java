package X;

/* renamed from: X.19Q  reason: invalid class name */
public final class AnonymousClass19Q extends AnonymousClass0Sf implements C81664oA {
    public String A00;
    public long A01;
    public String A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19Q) {
                AnonymousClass19Q r8 = (AnonymousClass19Q) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A00, r8.A00) || this.A01 != r8.A01 || !C04220Ms.A0I(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31) + C18190wL.A02(this.A01)) * 31) + C18200wM.A07(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RtcScreenCaptureModel(actorId=");
        A0s.append(this.A02);
        A0s.append(", username=");
        A0s.append(this.A00);
        A0s.append(", actionTimeMs=");
        A0s.append(this.A01);
        A0s.append(", isInitiator=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass19Q(Boolean bool, String str, String str2, long j) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = j;
        this.A03 = bool;
    }
}
