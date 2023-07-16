package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.7Eo  reason: invalid class name and case insensitive filesystem */
public final class C121187Eo {
    public C146928n6 A00;
    public C146928n6 A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public C121187Eo() {
        this((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
    }

    public /* synthetic */ C121187Eo(C146928n6 r6, C146928n6 r7, Integer num, int i, boolean z, boolean z2, boolean z3) {
        num = (i & 1) != 0 ? AnonymousClass006.A00 : num;
        boolean z4 = false;
        boolean A1R = C18240wQ.A1R(i & 2, z);
        r6 = (i & 4) != 0 ? null : r6;
        r7 = (i & 8) != 0 ? null : r7;
        boolean A1R2 = C18240wQ.A1R(i & 16, z2);
        z4 = (i & 32) == 0 ? z3 : z4;
        C04220Ms.A0B(num, 1);
        this.A02 = num;
        this.A04 = A1R;
        this.A01 = r6;
        this.A00 = r7;
        this.A06 = A1R2;
        this.A05 = z4;
        this.A03 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121187Eo) {
                C121187Eo r5 = (C121187Eo) obj;
                if (!(this.A02 == r5.A02 && this.A04 == r5.A04 && C04220Ms.A0I(this.A01, r5.A01) && C04220Ms.A0I(this.A00, r5.A00) && this.A06 == r5.A06 && this.A05 == r5.A05 && C04220Ms.A0I(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C121187Eo r1, Object[] objArr, int i) {
        r1.A01 = new C128097is(objArr, i);
    }

    public final int hashCode() {
        Integer num = this.A02;
        int hashCode = (C116146wV.A00(num).hashCode() + num.intValue()) * 31;
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int A032 = (((((hashCode + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31;
        boolean z2 = this.A06;
        if (z2) {
            z2 = true;
        }
        int i2 = (A032 + (z2 ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return ((i2 + i) * 31) + C18200wM.A07(this.A03);
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("Builder(role=");
        Integer num = this.A02;
        if (num != null) {
            str = C116146wV.A00(num);
        } else {
            str = "null";
        }
        A0s.append(str);
        A0s.append(", isClickable=");
        A0s.append(this.A04);
        A0s.append(AnonymousClass000.A00(230));
        A0s.append(this.A01);
        A0s.append(", clickDescription=");
        A0s.append(this.A00);
        A0s.append(", isSelected=");
        A0s.append(this.A06);
        A0s.append(", isHeading=");
        A0s.append(this.A05);
        A0s.append(", traversalAfterId=");
        return C86104wH.A0y(this.A03, A0s);
    }
}
