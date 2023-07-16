package X;

import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5KW  reason: invalid class name */
public final class AnonymousClass5KW extends AnonymousClass0Sf implements C144078hn {
    public final AssetRecommendationType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final AnonymousClass5KW Cy4() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KW) {
                AnonymousClass5KW r5 = (AnonymousClass5KW) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A02))) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A09(this.A04);
    }

    public AnonymousClass5KW(AssetRecommendationType assetRecommendationType, ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(assetRecommendationType, 3);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = assetRecommendationType;
        this.A01 = imageUrl;
        this.A04 = str3;
    }
}
