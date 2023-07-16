package X;

import java.util.Iterator;

/* renamed from: X.715  reason: invalid class name */
public final class AnonymousClass715 {
    public static AnonymousClass754 parseFromJson(MMo mMo) {
        return (AnonymousClass754) C86104wH.A0e(mMo, 96);
    }

    public static void A00(MMp mMp, AnonymousClass754 r3) {
        mMp.A0J();
        if (r3.A00 != null) {
            mMp.A0U("whitelist_country_codes");
            mMp.A0I();
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                if (A0k != null) {
                    mMp.A0Y(A0k);
                }
            }
            mMp.A0F();
        }
        mMp.A0G();
    }
}
