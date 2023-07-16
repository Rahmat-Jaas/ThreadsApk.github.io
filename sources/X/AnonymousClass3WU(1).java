package X;

import java.util.Iterator;

/* renamed from: X.3WU  reason: invalid class name */
public final class AnonymousClass3WU {
    public static C62303Ye parseFromJson(MMo mMo) {
        return (C62303Ye) AnonymousClass0wJ.A0h(mMo, 138);
    }

    public static void A00(MMp mMp, C62303Ye r4) {
        mMp.A0J();
        String str = r4.A02;
        if (str != null) {
            mMp.A0d("userId", str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            mMp.A0d("promotionId", str2);
        }
        if (r4.A05 != null) {
            mMp.A0U("primaryActionTimes");
            mMp.A0I();
            Iterator it = r4.A05.iterator();
            while (it.hasNext()) {
                A01(mMp, it);
            }
            mMp.A0F();
        }
        if (r4.A06 != null) {
            mMp.A0U("secondaryActionTimes");
            mMp.A0I();
            Iterator it2 = r4.A06.iterator();
            while (it2.hasNext()) {
                A01(mMp, it2);
            }
            mMp.A0F();
        }
        if (r4.A04 != null) {
            mMp.A0U("dismissActionTimes");
            mMp.A0I();
            Iterator it3 = r4.A04.iterator();
            while (it3.hasNext()) {
                A01(mMp, it3);
            }
            mMp.A0F();
        }
        if (r4.A03 != null) {
            mMp.A0U("impressionTimes");
            mMp.A0I();
            Iterator it4 = r4.A03.iterator();
            while (it4.hasNext()) {
                A01(mMp, it4);
            }
            mMp.A0F();
        }
        if (r4.A07 != null) {
            mMp.A0U("totalDismissTimes");
            mMp.A0I();
            Iterator it5 = r4.A07.iterator();
            while (it5.hasNext()) {
                A01(mMp, it5);
            }
            mMp.A0F();
        }
        Long l = r4.A00;
        if (l != null) {
            mMp.A0c("endTime", l.longValue());
        }
        mMp.A0G();
    }

    public static void A01(MMp mMp, Iterator it) {
        Number number = (Number) it.next();
        if (number != null) {
            mMp.A0O(number.longValue());
        }
    }
}
