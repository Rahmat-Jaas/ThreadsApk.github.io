package X;

import java.util.List;

/* renamed from: X.7g3  reason: invalid class name and case insensitive filesystem */
public final class C126857g3 implements C146608mW {
    public final float A00;
    public final float A01;
    public final long A02;
    public final AnonymousClass8rP A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public /* synthetic */ C126857g3(AnonymousClass8rP r5, Integer num, Integer num2, String str, float f, int i, long j, boolean z, boolean z2) {
        AnonymousClass0ZV r2 = null;
        r5 = (i & 32) != 0 ? null : r5;
        r2 = (i & 64) != 0 ? AnonymousClass0ZV.A00 : r2;
        boolean A1R = C18240wQ.A1R(i & 256, z);
        boolean A1R2 = C18240wQ.A1R(i & 512, z2);
        C04220Ms.A0B(str, 1);
        C18190wL.A1S(num, 3, num2);
        C04220Ms.A0B(r2, 7);
        this.A06 = str;
        this.A05 = num;
        this.A02 = j;
        this.A04 = num2;
        this.A03 = r5;
        this.A07 = r2;
        this.A09 = A1R;
        this.A08 = A1R2;
        this.A00 = f;
        this.A01 = f * 100.0f;
    }

    public final List Ac8() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ C142118dt Agq() {
        return this.A03;
    }

    public final boolean AjQ() {
        return this.A08;
    }

    public final String AqJ() {
        return this.A06;
    }

    public final boolean AxB() {
        return this.A09;
    }

    public final String Ayu() {
        return null;
    }

    public final float B16() {
        return this.A00;
    }

    public final Integer BDn() {
        return this.A05;
    }

    public final long BGk() {
        return this.A02;
    }
}
