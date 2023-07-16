package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.71K  reason: invalid class name */
public final class AnonymousClass71K {
    public static C90615Ms parseFromJson(MMo mMo) {
        return (C90615Ms) C86104wH.A0e(mMo, 125);
    }

    public static void A00(MMp mMp, C90615Ms r3) {
        mMp.A0J();
        String str = r3.A00;
        if (str != null) {
            mMp.A0d("text", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            mMp.A0d(DialogModule.KEY_TITLE, str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            mMp.A0d("url", str3);
        }
        mMp.A0G();
    }
}
