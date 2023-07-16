package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5MP  reason: invalid class name */
public final class AnonymousClass5MP extends AnonymousClass0Sf implements C41882MfV {
    public final C111036mg A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass5MP(C111036mg r2, ImageUrl imageUrl, String str, String str2, String str3) {
        C04220Ms.A0B(str3, 3);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = imageUrl;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MP) {
                AnonymousClass5MP r5 = (AnonymousClass5MP) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A03)))) + AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PartnerPromotionMediaPreviewViewModel(mediaId=");
        A0s.append(this.A03);
        A0s.append(AnonymousClass000.A00(HttpStatus.SC_SERVICE_UNAVAILABLE));
        A0s.append(this.A02);
        A0s.append(", sponsorId=");
        A0s.append(this.A04);
        A0s.append(", previewUrl=");
        A0s.append(this.A01);
        A0s.append(", adDetail=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
