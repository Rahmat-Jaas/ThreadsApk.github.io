package X;

import com.instagram.api.schemas.ProfileTheme;
import java.util.Iterator;

/* renamed from: X.3KO  reason: invalid class name */
public final class AnonymousClass3KO {
    public static ProfileTheme parseFromJson(MMo mMo) {
        return (ProfileTheme) AnonymousClass0wJ.A0f(mMo, 163);
    }

    public static void A00(MMp mMp, ProfileTheme profileTheme) {
        mMp.A0J();
        String str = profileTheme.A01;
        if (str != null) {
            mMp.A0d("alternative_background_url", str);
        }
        String str2 = profileTheme.A02;
        if (str2 != null) {
            mMp.A0d("alternative_thumbnail_url", str2);
        }
        String str3 = profileTheme.A03;
        if (str3 != null) {
            mMp.A0d(C28174Ezk.A00(12), str3);
        }
        Iterator A0t = C18190wL.A0t(mMp, "gradient_colors", profileTheme.A06);
        while (A0t.hasNext()) {
            String A0k = C18180wK.A0k(A0t);
            if (A0k != null) {
                mMp.A0Y(A0k);
            }
        }
        mMp.A0F();
        mMp.A0d("theme_id", profileTheme.A04);
        mMp.A0d("theme_type", profileTheme.A00.A00);
        String str4 = profileTheme.A05;
        if (str4 != null) {
            mMp.A0d("thumbnail_url", str4);
        }
        mMp.A0G();
    }
}
