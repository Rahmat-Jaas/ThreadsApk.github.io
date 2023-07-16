package X;

/* renamed from: X.3Je  reason: invalid class name and case insensitive filesystem */
public final class C59023Je {
    public static AnonymousClass422 parseFromJson(MMo mMo) {
        return (AnonymousClass422) AnonymousClass0wJ.A0f(mMo, 45);
    }

    public static void A00(MMp mMp, AnonymousClass422 r3) {
        mMp.A0J();
        BKU bku = r3.A00;
        mMp.A0U("media");
        BKU.A1R(mMp, bku);
        Integer num = r3.A01;
        if (num != null) {
            mMp.A0b("type", num.intValue());
        }
        mMp.A0G();
    }
}
