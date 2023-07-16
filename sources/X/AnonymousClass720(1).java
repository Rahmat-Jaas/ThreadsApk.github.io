package X;

import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.720  reason: invalid class name */
public final class AnonymousClass720 {
    public static AnonymousClass7EW parseFromJson(MMo mMo) {
        return (AnonymousClass7EW) C86104wH.A0e(mMo, HttpStatus.SC_MULTI_STATUS);
    }

    public static void A00(MMp mMp, AnonymousClass7EW r3) {
        mMp.A0J();
        String str = r3.A01;
        if (str != null) {
            mMp.A0d("short_name", str);
        }
        String str2 = r3.A00;
        if (str2 != null) {
            mMp.A0d("picture_url", str2);
        }
        mMp.A0e("is_verified", r3.A02);
        mMp.A0G();
    }
}
