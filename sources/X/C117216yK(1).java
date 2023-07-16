package X;

import com.instagram.api.schemas.CreatorSegmentation;

/* renamed from: X.6yK  reason: invalid class name and case insensitive filesystem */
public final class C117216yK {
    public static AnonymousClass5Kh parseFromJson(MMo mMo) {
        return (AnonymousClass5Kh) C86104wH.A0d(mMo, 39);
    }

    public static void A00(MMp mMp, AnonymousClass5Kh r3) {
        mMp.A0J();
        CreatorSegmentation creatorSegmentation = r3.A00;
        if (creatorSegmentation != null) {
            mMp.A0d(C28174Ezk.A00(179), creatorSegmentation.A00);
        }
        Boolean bool = r3.A01;
        if (bool != null) {
            mMp.A0e("is_creator", bool.booleanValue());
        }
        mMp.A0G();
    }
}
