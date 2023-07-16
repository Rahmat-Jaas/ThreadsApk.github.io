package X;

/* renamed from: X.3Jl  reason: invalid class name and case insensitive filesystem */
public final class C59083Jl {
    public static AnonymousClass18N parseFromJson(MMo mMo) {
        return (AnonymousClass18N) AnonymousClass0wJ.A0f(mMo, 61);
    }

    public static void A00(MMp mMp, AnonymousClass18N r3) {
        mMp.A0J();
        Integer num = r3.A00;
        if (num != null) {
            mMp.A0b("scheduled_publish_time", num.intValue());
        }
        String str = r3.A01;
        if (str != null) {
            mMp.A0d("uuc_id", str);
        }
        mMp.A0G();
    }
}
