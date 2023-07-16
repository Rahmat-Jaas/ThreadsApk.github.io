package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.71r  reason: invalid class name and case insensitive filesystem */
public final class C1186371r {
    public static C106556fE parseFromJson(MMo mMo) {
        return (C106556fE) C86104wH.A0e(mMo, 193);
    }

    public static void A00(MMp mMp, C106556fE r6) {
        mMp.A0J();
        if (r6.A00 != null) {
            mMp.A0U(DialogModule.KEY_ITEMS);
            mMp.A0I();
            for (C110956mY r3 : r6.A00) {
                if (r3 != null) {
                    mMp.A0J();
                    String str = r3.A05;
                    if (str != null) {
                        mMp.A0d("reel_id", str);
                    }
                    String str2 = r3.A02;
                    if (str2 != null) {
                        mMp.A0d("media_id", str2);
                    }
                    String str3 = r3.A06;
                    if (str3 != null) {
                        mMp.A0d("user_id", str3);
                    }
                    mMp.A0c("taken_at_seconds", r3.A01);
                    mMp.A0c("timestamp_seconds", r3.A00);
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        mMp.A0G();
    }
}
