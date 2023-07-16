package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.3Nw  reason: invalid class name and case insensitive filesystem */
public final class C60143Nw {
    public static AnonymousClass3CQ parseFromJson(MMo mMo) {
        return (AnonymousClass3CQ) AnonymousClass0wJ.A0h(mMo, 114);
    }

    public static void A00(MMp mMp, AnonymousClass3CQ r3) {
        mMp.A0J();
        if (r3.A00 != null) {
            mMp.A0U(DialogModule.KEY_TITLE);
            C28251tw r0 = r3.A00;
            mMp.A0J();
            String str = r0.A00;
            if (str != null) {
                mMp.A0d("text", str);
            }
            mMp.A0G();
        }
        Integer num = r3.A02;
        if (num != null) {
            mMp.A0b("limit", num.intValue());
        }
        String str2 = r3.A03;
        if (str2 != null) {
            mMp.A0d("url", str2);
        }
        mMp.A0e("dismiss_promotion", r3.A04);
        mMp.A0G();
    }
}
