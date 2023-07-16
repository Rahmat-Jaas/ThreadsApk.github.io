package X;

/* renamed from: X.79e  reason: invalid class name and case insensitive filesystem */
public final class C1201979e {
    public final C115056uQ A00;
    public final C114076se A01;
    public final C114866u1 A02;
    public final C114446tJ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1201979e) {
                C1201979e r5 = (C1201979e) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TransitionData(fade=");
        A0s.append(this.A01);
        A0s.append(", slide=");
        A0s.append(this.A03);
        A0s.append(", changeSize=");
        A0s.append(this.A00);
        A0s.append(", scale=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C1201979e(C115056uQ r1, C114076se r2, C114866u1 r3, C114446tJ r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public C1201979e() {
        this((C115056uQ) null, (C114076se) null, (C114866u1) null, (C114446tJ) null);
    }
}
