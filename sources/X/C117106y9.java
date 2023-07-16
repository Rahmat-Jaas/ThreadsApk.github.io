package X;

/* renamed from: X.6y9  reason: invalid class name and case insensitive filesystem */
public final class C117106y9 {
    public static AnonymousClass5KP parseFromJson(MMo mMo) {
        return (AnonymousClass5KP) C86104wH.A0d(mMo, 2);
    }

    public static void A00(MMp mMp, AnonymousClass5KP r3) {
        mMp.A0J();
        mMp.A0d("app_id", r3.A01);
        String str = r3.A02;
        if (str != null) {
            mMp.A0d("app_logo_url", str);
        }
        String str2 = r3.A03;
        if (str2 != null) {
            mMp.A0d("button_label", str2);
        }
        String str3 = r3.A04;
        if (str3 != null) {
            mMp.A0d("category_type", str3);
        }
        String str4 = r3.A05;
        if (str4 != null) {
            mMp.A0d("display_category_name", str4);
        }
        mMp.A0d("partner_name", r3.A06);
        mMp.A0d("partner_type", r3.A00.A00);
        mMp.A0d("url", r3.A07);
        mMp.A0G();
    }
}
