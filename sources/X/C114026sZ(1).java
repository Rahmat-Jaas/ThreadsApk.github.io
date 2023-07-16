package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

/* renamed from: X.6sZ  reason: invalid class name and case insensitive filesystem */
public final class C114026sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DialogInterface.OnClickListener A06;
    public final DialogInterface.OnClickListener A07;
    public final DialogInterface.OnClickListener A08;
    public final DialogInterface.OnClickListener A09;
    public final DialogInterface.OnDismissListener A0A;
    public final Drawable A0B;
    public final Boolean A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final CharSequence[] A0H;
    public final int A0I;
    public final int A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114026sZ) {
                C114026sZ r5 = (C114026sZ) obj;
                if (!AnonymousClass3ZT.A03(this.A0D, r5.A0D) || this.A00 != r5.A00 || !AnonymousClass3ZT.A03(this.A0A, r5.A0A) || !AnonymousClass3ZT.A03(this.A0B, r5.A0B) || !AnonymousClass3ZT.A03(this.A0C, r5.A0C) || !AnonymousClass3ZT.A03(this.A06, r5.A06) || !AnonymousClass3ZT.A03(this.A0H, r5.A0H) || !AnonymousClass3ZT.A03(this.A07, r5.A07) || this.A0I != r5.A0I || !AnonymousClass3ZT.A03(this.A0E, r5.A0E) || this.A01 != r5.A01 || !AnonymousClass3ZT.A03(this.A08, r5.A08) || this.A02 != r5.A02 || !AnonymousClass3ZT.A03(this.A09, r5.A09) || this.A0J != r5.A0J || this.A03 != r5.A03 || !AnonymousClass3ZT.A03(this.A0F, r5.A0F) || this.A04 != r5.A04 || !AnonymousClass3ZT.A03(this.A0G, r5.A0G) || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((C86124wJ.A0E(this.A0D) * 31) + this.A00) * 31) + AnonymousClass0wJ.A03(this.A0A)) * 31) + AnonymousClass0wJ.A03(this.A0B)) * 31) + AnonymousClass0wJ.A03(this.A0C)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A0H)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + this.A0I) * 31) + 1) * 31) + AnonymousClass0wJ.A03(this.A0E)) * 31) + this.A01) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31 * 31) + 1) * 31 * 31) + this.A02) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + this.A0J) * 31) + this.A03) * 31) + AnonymousClass0wJ.A03(this.A0F)) * 31) + this.A04) * 31) + AnonymousClass0wJ.A03(this.A0G)) * 31) + this.A05;
    }

    public C114026sZ(C111306n7 r3) {
        this.A0D = r3.A0F;
        this.A00 = r3.A00;
        this.A0A = r3.A0C;
        this.A0B = r3.A0D;
        Boolean bool = r3.A0E;
        AnonymousClass3ZT.A02(bool, "isCancelable");
        this.A0C = bool;
        this.A06 = r3.A08;
        this.A0H = r3.A0J;
        this.A07 = r3.A09;
        this.A0I = r3.A01;
        this.A0E = r3.A0G;
        this.A01 = r3.A02;
        this.A08 = r3.A0A;
        this.A02 = r3.A03;
        this.A09 = r3.A0B;
        this.A0J = r3.A04;
        this.A03 = r3.A05;
        this.A0F = r3.A0H;
        this.A04 = r3.A06;
        this.A0G = r3.A0I;
        this.A05 = r3.A07;
    }
}
