package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7sx  reason: invalid class name and case insensitive filesystem */
public final class C131877sx implements C41882MfV {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C131877sx(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, boolean z) {
        C04220Ms.A0B(str3, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A00 = imageUrl2;
        this.A05 = z;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131877sx r3 = (C131877sx) obj;
        C04220Ms.A0B(r3, 0);
        if (!C04220Ms.A0I(this.A04, r3.A04) || !C04220Ms.A0I(this.A01, r3.A01) || !C04220Ms.A0I(this.A00, r3.A00) || this.A05 != r3.A05 || !C04220Ms.A0I(this.A02, r3.A02)) {
            return false;
        }
        return true;
    }
}
