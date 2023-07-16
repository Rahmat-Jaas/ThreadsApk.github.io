package X;

import com.instagram.model.shopping.merchant.MicroMerchantDict;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.71M  reason: invalid class name */
public final class AnonymousClass71M {
    public static C90625Mt parseFromJson(MMo mMo) {
        return (C90625Mt) C86104wH.A0e(mMo, 130);
    }

    public static void A00(MMp mMp, C90625Mt r4) {
        mMp.A0J();
        String str = r4.A03;
        if (str != null) {
            mMp.A0d("id", str);
        }
        Long l = r4.A01;
        if (l != null) {
            mMp.A0c("media_id", l.longValue());
        }
        MicroMerchantDict microMerchantDict = r4.A00;
        if (microMerchantDict != null) {
            mMp.A0U("merchant");
            C41059Lvf.A00(mMp, microMerchantDict);
        }
        List list = r4.A07;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "stickers", list);
            while (A0t.hasNext()) {
                AnonymousClass5LA r0 = (AnonymousClass5LA) A0t.next();
                if (r0 != null) {
                    mMp.A0J();
                    String str2 = r0.A00;
                    if (str2 != null) {
                        mMp.A0d("id", str2);
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        String str3 = r4.A04;
        if (str3 != null) {
            mMp.A0d("text", str3);
        }
        String str4 = r4.A05;
        if (str4 != null) {
            mMp.A0d("text_format", str4);
        }
        Long l2 = r4.A02;
        if (l2 != null) {
            mMp.A0c("user_id", l2.longValue());
        }
        String str5 = r4.A06;
        if (str5 != null) {
            mMp.A0d("vibrant_text_color", str5);
        }
        mMp.A0G();
    }
}
