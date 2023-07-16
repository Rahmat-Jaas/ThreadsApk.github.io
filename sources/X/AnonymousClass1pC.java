package X;

import java.util.List;

/* renamed from: X.1pC  reason: invalid class name */
public final class AnonymousClass1pC extends AnonymousClass2O4 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1pC() {
        /*
            r16 = this;
            r1 = 0
            r14 = 1
            X.0ZV r9 = X.AnonymousClass0ZV.A00
            r15 = 0
            r0 = r16
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1pC.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1pC) {
                AnonymousClass1pC r5 = (AnonymousClass1pC) obj;
                if (this.A0E != r5.A0E || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A0B, r5.A0B) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A0C, r5.A0C) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A08, r5.A08) || this.A0D != r5.A0D) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A0E;
        int i = 1;
        if (z) {
            z = true;
        }
        List list = this.A09;
        List list2 = this.A0B;
        List list3 = this.A0C;
        int A052 = AnonymousClass0wJ.A05(this.A08, (((AnonymousClass0wJ.A05(list3, (((AnonymousClass0wJ.A05(list2, (((AnonymousClass0wJ.A05(list, (((((((z ? 1 : 0) * true) + AnonymousClass0wJ.A03(this.A0A)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A00)) * 31);
        if (!this.A0D) {
            i = 0;
        }
        return A052 + i;
    }

    public AnonymousClass1pC(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, List list5, boolean z, boolean z2) {
        this.A0E = z;
        this.A0A = list;
        this.A03 = str;
        this.A02 = str2;
        this.A09 = list2;
        this.A05 = str3;
        this.A04 = str4;
        this.A0B = list3;
        this.A07 = str5;
        this.A06 = str6;
        this.A0C = list4;
        this.A01 = str7;
        this.A00 = str8;
        this.A08 = list5;
        this.A0D = z2;
    }
}
