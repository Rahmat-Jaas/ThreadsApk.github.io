package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.197  reason: invalid class name */
public final class AnonymousClass197 extends AnonymousClass0Sf implements C41882MfV {
    public final C83354rF A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass197) {
                AnonymousClass197 r5 = (AnonymousClass197) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A08.hashCode());
    }

    public final int hashCode() {
        return (((((((AnonymousClass0wJ.A07(this.A08, (AnonymousClass0wJ.A07(this.A06, ((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31 * 31) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31 * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A00);
    }

    public /* synthetic */ AnonymousClass197(C83354rF r1, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = str4;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
