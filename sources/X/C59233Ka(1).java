package X;

/* renamed from: X.3Ka  reason: invalid class name and case insensitive filesystem */
public final class C59233Ka {
    public static C210218n parseFromJson(MMo mMo) {
        return (C210218n) AnonymousClass0wJ.A0e(mMo, 9);
    }

    public static void A00(MMp mMp, C210218n r3) {
        mMp.A0J();
        Integer num = r3.A01;
        if (num != null) {
            mMp.A0b("count", num.intValue());
        }
        Float f = r3.A00;
        if (f != null) {
            mMp.A0a("font_size", f.floatValue());
        }
        String str = r3.A02;
        if (str != null) {
            mMp.A0d("text", str);
        }
        mMp.A0G();
    }
}
