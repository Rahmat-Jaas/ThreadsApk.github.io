package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Lt  reason: invalid class name and case insensitive filesystem */
public final class C90375Lt extends AnonymousClass0Sf implements C147068nL {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final C36483JXj A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90375Lt) {
                C90375Lt r5 = (C90375Lt) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AOQ() {
        return this.A04;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getId() {
        return this.A05;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A03, (((((C18180wK.A03(this.A05) + this.A01) * 31) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C18200wM.A07(this.A02);
    }

    public C90375Lt(ImageUrl imageUrl, C36483JXj jXj, String str, String str2, int i, int i2) {
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str2;
        this.A03 = jXj;
        this.A02 = imageUrl;
    }
}
