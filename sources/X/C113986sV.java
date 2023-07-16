package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.6sV  reason: invalid class name and case insensitive filesystem */
public final class C113986sV {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final View.OnClickListener A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C113986sV(Drawable drawable, View.OnClickListener onClickListener, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A02 = drawable;
        this.A00 = i;
        this.A03 = onClickListener;
        this.A04 = str;
        this.A01 = i2;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113986sV) {
                C113986sV r5 = (C113986sV) obj;
                if (!(this.A06 == r5.A06 && this.A07 == r5.A07 && this.A08 == r5.A08 && AnonymousClass3ZT.A03(this.A02, r5.A02) && this.A00 == r5.A00 && AnonymousClass3ZT.A03(this.A03, r5.A03) && AnonymousClass3ZT.A03(this.A04, r5.A04) && this.A01 == r5.A01 && AnonymousClass3ZT.A03(this.A05, r5.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return (((((((((((AnonymousClass3ZT.A00(AnonymousClass3ZT.A00(i + 31, this.A07), this.A08) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + this.A00) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + this.A01) * 31) + AnonymousClass0wJ.A03(this.A05);
    }
}
