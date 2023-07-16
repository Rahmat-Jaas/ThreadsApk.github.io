package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6yf  reason: invalid class name and case insensitive filesystem */
public final class C117426yf {
    public static AnonymousClass5LH parseFromJson(MMo mMo) {
        return (AnonymousClass5LH) C86104wH.A0d(mMo, 131);
    }

    public static void A00(MMp mMp, AnonymousClass5LH r3) {
        mMp.A0J();
        Boolean bool = r3.A01;
        if (bool != null) {
            mMp.A0e("enable_indexing", bool.booleanValue());
        }
        Boolean bool2 = r3.A02;
        if (bool2 != null) {
            mMp.A0e("enable_navigation", bool2.booleanValue());
        }
        AnonymousClass5LG r1 = r3.A00;
        if (r1 != null) {
            mMp.A0U("extra_question");
            C117416ye.A00(mMp, r1);
        }
        Boolean bool3 = r3.A03;
        if (bool3 != null) {
            mMp.A0e("has_submit", bool3.booleanValue());
        }
        String str = r3.A07;
        if (str != null) {
            mMp.A0d("id", str);
        }
        Boolean bool4 = r3.A04;
        if (bool4 != null) {
            mMp.A0e("log_on_each_answer", bool4.booleanValue());
        }
        String str2 = r3.A08;
        if (str2 != null) {
            mMp.A0d("module_type", str2);
        }
        List list = r3.A09;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "questions", list);
            while (A0t.hasNext()) {
                AnonymousClass5LG r0 = (AnonymousClass5LG) A0t.next();
                if (r0 != null) {
                    C117416ye.A00(mMp, r0);
                }
            }
            mMp.A0F();
        }
        Integer num = r3.A05;
        if (num != null) {
            mMp.A0b("unlock_question", num.intValue());
        }
        Integer num2 = r3.A06;
        if (num2 != null) {
            mMp.A0b("vertical_padding", num2.intValue());
        }
        mMp.A0G();
    }
}
