package X;

/* renamed from: X.5Hn  reason: invalid class name and case insensitive filesystem */
public final class C89915Hn extends AnonymousClass0Sf {
    public final float A00;
    public final long A01;
    public final long A02;
    public final C142638fL A03;
    public final C142638fL A04;
    public final AnonymousClass7KC A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final AnonymousClass0ZU A09;
    public final AnonymousClass0ZU A0A;
    public final AnonymousClass0YP A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89915Hn) {
                C89915Hn r8 = (C89915Hn) obj;
                if (!C04220Ms.A0I(this.A07, r8.A07) || !C04220Ms.A0I(this.A06, r8.A06) || !C04220Ms.A0I(this.A08, r8.A08) || this.A01 != r8.A01 || this.A02 != r8.A02 || !C18180wK.A1W(Float.compare(this.A00, r8.A00)) || !C04220Ms.A0I(this.A0A, r8.A0A) || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A09, r8.A09) || !C04220Ms.A0I(this.A05, r8.A05) || !C04220Ms.A0I(this.A0B, r8.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int A052 = AnonymousClass0wJ.A05(this.A09, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A0A, C86104wH.A05(C86104wH.A06(C86104wH.A06(AnonymousClass0wJ.A07(this.A08, AnonymousClass0wJ.A07(this.A06, C18180wK.A03(this.A07))), this.A01), this.A02), this.A00)))));
        AnonymousClass7KC r0 = this.A05;
        if (r0 == null) {
            i = 0;
        } else {
            long j = r0.A00;
            i = (int) (j ^ (j >>> 32));
        }
        return C18220wO.A06(this.A0B, (A052 + i) * 31);
    }

    public C89915Hn(C142638fL r1, C142638fL r2, AnonymousClass7KC r3, String str, String str2, String str3, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YP r9, float f, long j, long j2) {
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A0A = r7;
        this.A04 = r1;
        this.A03 = r2;
        this.A09 = r8;
        this.A05 = r3;
        this.A0B = r9;
    }
}
