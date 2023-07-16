package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.5IJ  reason: invalid class name */
public final class AnonymousClass5IJ extends AnonymousClass0Sf {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IJ) {
                AnonymousClass5IJ r5 = (AnonymousClass5IJ) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || this.A06 != r5.A06 || this.A07 != r5.A07 || !C04220Ms.A0I(this.A00, r5.A00) || this.A04 != r5.A04 || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass68K A01() {
        if (!this.A06) {
            return AnonymousClass68K.FOLLOW;
        }
        if (!this.A04) {
            return AnonymousClass68K.CANCEL;
        }
        if (this.A05) {
            return AnonymousClass68K.REQUESTED;
        }
        return AnonymousClass68K.FOLLOWING;
    }

    public final int hashCode() {
        int A072 = (AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A02)) + AnonymousClass0wJ.A06(this.A01)) * 31;
        boolean z = this.A06;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A07;
        if (z2) {
            z2 = true;
        }
        int A073 = (((i2 + (z2 ? 1 : 0)) * 31) + C18200wM.A07(this.A00)) * 31;
        boolean z3 = this.A04;
        if (z3) {
            z3 = true;
        }
        int i3 = (A073 + (z3 ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return i3 + i;
    }

    public AnonymousClass5IJ(ImageUrl imageUrl, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = imageUrl;
        this.A04 = z3;
        this.A05 = z4;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (C04220Ms.A0I(((AnonymousClass5IJ) next).A02, obj)) {
            abstractCollection.add(next);
        }
    }
}
