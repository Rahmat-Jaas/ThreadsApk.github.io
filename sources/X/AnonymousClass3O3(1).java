package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

/* renamed from: X.3O3  reason: invalid class name */
public final class AnonymousClass3O3 {
    public static AnonymousClass3Gy parseFromJson(MMo mMo) {
        return (AnonymousClass3Gy) AnonymousClass0wJ.A0h(mMo, 133);
    }

    public static void A00(MMp mMp, AnonymousClass3Gy r3) {
        mMp.A0J();
        String str = r3.A00;
        if (str != null) {
            mMp.A0d(FXPFAccessLibraryDebugFragment.NAME, str);
        }
        if (r3.A01 != null) {
            mMp.A0U("parameters");
            mMp.A0I();
            for (C58473Fu r0 : r3.A01) {
                if (r0 != null) {
                    AnonymousClass3O2.A00(mMp, r0);
                }
            }
            mMp.A0F();
        }
        mMp.A0G();
    }
}
