package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3Le  reason: invalid class name and case insensitive filesystem */
public final class C59533Le {
    public static ImageUrl A00(MMo mMo) {
        String str = null;
        if (mMo.A0f() == C40318LcR.VALUE_NULL) {
            return null;
        }
        try {
            str = mMo.A0p();
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (str == null || str.isEmpty()) {
            str = "";
        }
        return C18250wR.A0K(str);
    }

    public static void A01(MMp mMp, ImageUrl imageUrl) {
        mMp.A0Y(imageUrl.getUrl());
    }
}
