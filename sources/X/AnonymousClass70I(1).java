package X;

/* renamed from: X.70I  reason: invalid class name */
public final class AnonymousClass70I {
    public static AnonymousClass5HM parseFromJson(MMo mMo) {
        return (AnonymousClass5HM) C86104wH.A0e(mMo, 10);
    }

    public static void A00(MMp mMp, AnonymousClass5HM r4) {
        mMp.A0J();
        C112506pi r2 = r4.A01;
        mMp.A0U("layout");
        if (r2 instanceof C95255zj) {
            C95255zj.A01.A01(mMp, ((C95255zj) r2).A00);
        } else {
            C10450iM.A03("bloks_serialize", "BloksDataAdapter does not support serialization. Use SerializableBloksAdapter instead");
        }
        mMp.A0G();
    }
}
