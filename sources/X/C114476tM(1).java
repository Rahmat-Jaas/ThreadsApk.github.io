package X;

/* renamed from: X.6tM  reason: invalid class name and case insensitive filesystem */
public final class C114476tM {
    public final long A00;
    public final C145068jm A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C04220Ms.A0I(getClass(), C86144wL.A0a(obj))) {
                C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                C114476tM r8 = (C114476tM) obj;
                if (this.A00 != r8.A00 || !C04220Ms.A0I(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18190wL.A02(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("OverscrollConfiguration(glowColor=");
        C86154wM.A18(this.A00, A0s);
        A0s.append(", drawPadding=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public /* synthetic */ C114476tM() {
        long A02 = C121657He.A02(4284900966L);
        float f = (float) 0;
        AnonymousClass7V9 r0 = new AnonymousClass7V9(f, f, f, f);
        this.A00 = A02;
        this.A01 = r0;
    }
}
