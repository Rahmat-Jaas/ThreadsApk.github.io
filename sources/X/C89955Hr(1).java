package X;

import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Hr  reason: invalid class name and case insensitive filesystem */
public final class C89955Hr extends AnonymousClass0Sf {
    public final Uri A00;
    public final C22168CKc A01;
    public final ImageUrl A02;
    public final C23922D1k A03;
    public final C23894D0g A04;
    public final Double A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final AnonymousClass8s2 A0C;
    public final AnonymousClass8s2 A0D;
    public final AnonymousClass8s2 A0E;
    public final AnonymousClass8s2 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89955Hr) {
                C89955Hr r5 = (C89955Hr) obj;
                if (!C04220Ms.A0I(this.A06, r5.A06) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A0E, r5.A0E) || !C04220Ms.A0I(this.A0F, r5.A0F) || !C04220Ms.A0I(this.A0D, r5.A0D) || !C04220Ms.A0I(this.A0C, r5.A0C) || !C04220Ms.A0I(this.A0B, r5.A0B) || this.A0G != r5.A0G || this.A04 != r5.A04 || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || this.A0I != r5.A0I || this.A0H != r5.A0H) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = C18180wK.A03(this.A06);
        int A052 = (AnonymousClass0wJ.A05(this.A0C, AnonymousClass0wJ.A05(this.A0D, AnonymousClass0wJ.A05(this.A0F, (((((((((((AnonymousClass0wJ.A05(this.A03, A032) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A0A)) * 31) + AnonymousClass0wJ.A06(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A0E)) * 31))) + AnonymousClass0wJ.A06(this.A0B)) * 31;
        boolean z = this.A0G;
        int i = 1;
        if (z) {
            z = true;
        }
        int A033 = (((((((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z2 = this.A0I;
        if (z2) {
            z2 = true;
        }
        int i2 = (A033 + (z2 ? 1 : 0)) * 31;
        if (!this.A0H) {
            i = 0;
        }
        return i2 + i;
    }

    public C89955Hr(Uri uri, C22168CKc cKc, ImageUrl imageUrl, C23922D1k d1k, C23894D0g d0g, Double d, String str, String str2, String str3, String str4, String str5, AnonymousClass8s2 r13, AnonymousClass8s2 r14, AnonymousClass8s2 r15, AnonymousClass8s2 r16, boolean z, boolean z2, boolean z3) {
        AnonymousClass0wJ.A1O(str, d1k);
        AnonymousClass8s2 r0 = r16;
        C86104wH.A1Q(r14, r15, r0);
        this.A06 = str;
        this.A03 = d1k;
        this.A02 = imageUrl;
        this.A0A = str2;
        this.A09 = str3;
        this.A05 = d;
        this.A08 = str4;
        this.A0E = r13;
        this.A0F = r14;
        this.A0D = r15;
        this.A0C = r0;
        this.A0B = str5;
        this.A0G = z;
        this.A04 = d0g;
        this.A00 = uri;
        this.A01 = cKc;
        this.A0I = z2;
        this.A0H = z3;
        this.A07 = AnonymousClass00U.A0L("activityfeed_", str);
    }
}
