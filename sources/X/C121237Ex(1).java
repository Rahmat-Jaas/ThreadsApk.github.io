package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ex  reason: invalid class name and case insensitive filesystem */
public final class C121237Ex {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final AnonymousClass79A A04;
    public final C114276sy A05;
    public final C114316t2 A06;
    public final AnonymousClass795 A07;
    public final C121117Ee A08;
    public final C114326t3 A09;
    public final AnonymousClass79W A0A;
    public final AnonymousClass79X A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121237Ex) {
                C121237Ex r8 = (C121237Ex) obj;
                if (!C04220Ms.A0I(this.A08, r8.A08) || !C04220Ms.A0I(this.A09, r8.A09) || this.A03 != r8.A03 || !C04220Ms.A0I(this.A0A, r8.A0A) || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A07, r8.A07) || !C04220Ms.A0I(this.A06, r8.A06) || !C04220Ms.A0I(this.A05, r8.A05) || !C04220Ms.A0I(this.A0B, r8.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A01(C121237Ex r2, StringBuilder sb) {
        sb.append(r2.A08);
        sb.append(", textDirection=");
        sb.append(r2.A09);
        sb.append(", lineHeight=");
        sb.append(AnonymousClass7HC.A01(r2.A03));
        sb.append(", textIndent=");
        sb.append(r2.A0A);
        sb.append(", platformStyle=");
    }

    public final C121237Ex A02(C121237Ex r12) {
        if (r12 == null) {
            return this;
        }
        long j = r12.A03;
        if (AnonymousClass7Hi.A04(j)) {
            j = this.A03;
        }
        AnonymousClass79W r7 = r12.A0A;
        if (r7 == null) {
            r7 = this.A0A;
        }
        C121117Ee r5 = r12.A08;
        if (r5 == null) {
            r5 = this.A08;
        }
        C114326t3 r6 = r12.A09;
        if (r6 == null) {
            r6 = this.A09;
        }
        AnonymousClass79A r0 = r12.A04;
        AnonymousClass79A r1 = this.A04;
        if (r1 == null || r0 != null) {
            r1 = r0;
        }
        AnonymousClass795 r4 = r12.A07;
        if (r4 == null) {
            r4 = this.A07;
        }
        C114316t2 r3 = r12.A06;
        if (r3 == null) {
            r3 = this.A06;
        }
        C114276sy r2 = r12.A05;
        if (r2 == null) {
            r2 = this.A05;
        }
        AnonymousClass79X r8 = r12.A0B;
        if (r8 == null) {
            r8 = this.A0B;
        }
        return new C121237Ex(r1, r2, r3, r4, r5, r6, r7, r8, j);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C121117Ee r0 = this.A08;
        int i5 = 0;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        int i6 = i * 31;
        C114326t3 r02 = this.A09;
        if (r02 != null) {
            i2 = r02.A00;
        } else {
            i2 = 0;
        }
        int A062 = (((((C86104wH.A06((i6 + i2) * 31, this.A03) + C18230wP.A05(this.A0A)) * 31) + C18230wP.A05(this.A04)) * 31) + C18230wP.A05(this.A07)) * 31;
        C114316t2 r03 = this.A06;
        if (r03 != null) {
            i3 = r03.A00;
        } else {
            i3 = 0;
        }
        int i7 = (A062 + i3) * 31;
        C114276sy r04 = this.A05;
        if (r04 != null) {
            i4 = r04.A00;
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        AnonymousClass79X r05 = this.A0B;
        if (r05 != null) {
            i5 = r05.hashCode();
        }
        return i8 + i5;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ParagraphStyle(textAlign=");
        A01(this, A0s);
        return C86104wH.A0y(A00(this, this.A04, A0s), A0s);
    }

    public C121237Ex(AnonymousClass79A r4, C114276sy r5, C114316t2 r6, AnonymousClass795 r7, C121117Ee r8, C114326t3 r9, AnonymousClass79W r10, AnonymousClass79X r11, long j) {
        int i;
        int i2;
        int i3;
        this.A08 = r8;
        this.A09 = r9;
        this.A03 = j;
        this.A0A = r10;
        this.A04 = r4;
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A0B = r11;
        if (r8 != null) {
            i = r8.A00;
        } else {
            i = 5;
        }
        this.A02 = i;
        if (r6 != null) {
            i2 = r6.A00;
        } else {
            i2 = 66305;
        }
        this.A01 = i2;
        if (r5 != null) {
            i3 = r5.A00;
        } else {
            i3 = 1;
        }
        this.A00 = i3;
        if (j != AnonymousClass7HC.A01) {
            float intBitsToFloat = Float.intBitsToFloat(C86104wH.A08(j));
            if (intBitsToFloat < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                throw C18180wK.A0a(AnonymousClass00U.A0C("lineHeight can't be negative (", ')', intBitsToFloat));
            }
        }
    }

    public static AnonymousClass79X A00(C121237Ex r1, Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", lineHeightStyle=");
        sb.append(r1.A07);
        sb.append(", lineBreak=");
        sb.append(r1.A06);
        sb.append(", hyphens=");
        sb.append(r1.A05);
        sb.append(", textMotion=");
        return r1.A0B;
    }
}
