package X;

import java.util.List;

/* renamed from: X.7HD  reason: invalid class name */
public final class AnonymousClass7HD {
    public static final C141738cs A03;
    public final long A00;
    public final C134747yH A01;
    public final C121767Ia A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7HD)) {
            return false;
        }
        AnonymousClass7HD r7 = (AnonymousClass7HD) obj;
        return this.A00 == r7.A00 && C04220Ms.A0I(this.A02, r7.A02) && C04220Ms.A0I(this.A01, r7.A01);
    }

    static {
        AnonymousClass8X9 r2 = AnonymousClass8X9.A00;
        AnonymousClass8MP r1 = AnonymousClass8MP.A00;
        AnonymousClass0wJ.A1N(r2, r1);
        A03 = new AnonymousClass7Wc(r1, r2);
    }

    public final int hashCode() {
        int i;
        int A06 = C86104wH.A06(C18210wN.A04(this.A01), this.A00);
        C121767Ia r0 = this.A02;
        if (r0 != null) {
            long j = r0.A00;
            i = (int) (j ^ (j >>> 32));
        } else {
            i = 0;
        }
        return A06 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TextFieldValue(text='");
        A0s.append(this.A01);
        A0s.append("', selection=");
        long j = this.A00;
        A0s.append(C86134wK.A0l(C86104wH.A07(j), C86104wH.A08(j), "TextRange(", ", "));
        A0s.append(", composition=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public AnonymousClass7HD(C134747yH r13, C121767Ia r14, long j) {
        C121767Ia r0;
        this.A01 = r13;
        int A022 = C134747yH.A02(r13);
        int i = (int) (j >> 32);
        int A023 = AnonymousClass8bI.A02(i, 0, A022);
        int i2 = (int) (j & 4294967295L);
        int A024 = AnonymousClass8bI.A02(i2, 0, A022);
        this.A00 = (A023 == i && A024 == i2) ? j : AnonymousClass6FM.A00(A023, A024);
        if (r14 != null) {
            long j2 = r14.A00;
            int i3 = (int) (j2 >> 32);
            int A025 = AnonymousClass8bI.A02(i3, 0, A022);
            int i4 = (int) (j2 & 4294967295L);
            int A026 = AnonymousClass8bI.A02(i4, 0, A022);
            r0 = new C121767Ia((A025 == i3 && A026 == i4) ? j2 : AnonymousClass6FM.A00(A025, A026));
        } else {
            r0 = null;
        }
        this.A02 = r0;
    }

    public static long A00(C81784oM r1) {
        return ((AnonymousClass7HD) r1.getValue()).A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass7HD(String str, int i, long j) {
        this(new C134747yH((List) null, 6, (i & 1) != 0 ? "" : str), (C121767Ia) null, (i & 2) != 0 ? C121767Ia.A01 : j);
    }
}
