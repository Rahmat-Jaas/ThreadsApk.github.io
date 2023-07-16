package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import java.util.List;

/* renamed from: X.5IS  reason: invalid class name */
public final class AnonymousClass5IS extends AnonymousClass0Sf {
    public final KtCSuperShape0S1000000_I2 A00;
    public final C970367r A01;
    public final C970367r A02;
    public final C970367r A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass5IS(KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2, C970367r r3, C970367r r4, C970367r r5, List list, boolean z, boolean z2) {
        C18190wL.A1S(r3, 4, r4);
        C04220Ms.A0B(r5, 7);
        this.A04 = list;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = ktCSuperShape0S1000000_I2;
        this.A03 = r5;
    }

    public static /* synthetic */ AnonymousClass5IS A00(KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2, C970367r r6, C970367r r7, C970367r r8, AnonymousClass5IS r9, List list, int i, boolean z, boolean z2) {
        C970367r r4 = r8;
        KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I22 = ktCSuperShape0S1000000_I2;
        C970367r r3 = r7;
        C970367r r2 = r6;
        boolean z3 = z2;
        boolean z4 = z;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = r9.A04;
        }
        if ((i & 2) != 0) {
            z4 = r9.A06;
        }
        if ((i & 4) != 0) {
            z3 = r9.A05;
        }
        if ((i & 8) != 0) {
            r2 = r9.A01;
        }
        if ((i & 16) != 0) {
            r3 = r9.A02;
        }
        if ((i & 32) != 0) {
            ktCSuperShape0S1000000_I22 = r9.A00;
        }
        if ((i & 64) != 0) {
            r4 = r9.A03;
        }
        C04220Ms.A0B(list2, 0);
        AnonymousClass0wJ.A1R(r2, r3);
        C04220Ms.A0B(r4, 6);
        return new AnonymousClass5IS(ktCSuperShape0S1000000_I22, r2, r3, r4, list2, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IS) {
                AnonymousClass5IS r5 = (AnonymousClass5IS) obj;
                if (!(C04220Ms.A0I(this.A04, r5.A04) && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A01 == r5.A01 && this.A02 == r5.A02 && C04220Ms.A0I(this.A00, r5.A00) && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A04);
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A042 + (z ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        int A052 = AnonymousClass0wJ.A05(this.A01, (i2 + i) * 31);
        return C18220wO.A06(this.A03, (AnonymousClass0wJ.A05(this.A02, A052) + AnonymousClass0wJ.A03(this.A00)) * 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5IS() {
        /*
            r8 = this;
            r1 = 0
            X.0ZV r5 = X.AnonymousClass0ZV.A00
            r6 = 0
            X.67r r2 = X.C970367r.None
            r0 = r8
            r3 = r2
            r4 = r2
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IS.<init>():void");
    }
}
