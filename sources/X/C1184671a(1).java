package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

/* renamed from: X.71a  reason: invalid class name and case insensitive filesystem */
public final class C1184671a {
    public static void A00(MMp mMp, AnonymousClass5N2 r3, boolean z) {
        if (z) {
            mMp.A0J();
        }
        ImageUrl imageUrl = r3.A00;
        mMp.A0U("image_url");
        C59533Le.A01(mMp, imageUrl);
        ImageUrl imageUrl2 = r3.A01;
        if (imageUrl2 != null) {
            mMp.A0U("image_url_dark_mode");
            C59533Le.A01(mMp, imageUrl2);
        }
        mMp.A0d(FXPFAccessLibraryDebugFragment.NAME, r3.A02);
        if (z) {
            mMp.A0G();
        }
    }

    public static AnonymousClass5N2 parseFromJson(MMo mMo) {
        return (AnonymousClass5N2) C86104wH.A0e(mMo, 159);
    }
}
