package X;

/* renamed from: X.71s  reason: invalid class name and case insensitive filesystem */
public final class C1186471s {
    public static C110806mJ parseFromJson(MMo mMo) {
        return (C110806mJ) C86104wH.A0e(mMo, 195);
    }

    public static void A00(MMp mMp, C110806mJ r4) {
        mMp.A0J();
        String str = r4.A04;
        if (str != null) {
            mMp.A0d("replay_broadcast_id", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            mMp.A0d("user_id", str2);
        }
        mMp.A0c("publish_time_seconds", r4.A00);
        mMp.A0c("timestamp_seconds", r4.A01);
        mMp.A0G();
    }
}
