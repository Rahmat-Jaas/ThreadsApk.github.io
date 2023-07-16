package X;

/* renamed from: X.3yT  reason: invalid class name and case insensitive filesystem */
public final class C66873yT implements C81864oW {
    public final Object A00;
    public final int A01;
    public final C81864oW A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66873yT) {
                C66873yT r5 = (C66873yT) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int B91() {
        return this.A01;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A02) + AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ConfigWithLayoutData(config=");
        A0s.append(this.A02);
        A0s.append(", layoutData=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C66873yT(C81864oW r2, Object obj) {
        this.A02 = r2;
        this.A00 = obj;
        this.A01 = r2.B91();
    }
}
