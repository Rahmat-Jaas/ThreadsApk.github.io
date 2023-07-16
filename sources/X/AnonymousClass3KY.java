package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3KY  reason: invalid class name */
public final class AnonymousClass3KY {
    public static C210018l parseFromJson(MMo mMo) {
        return (C210018l) AnonymousClass0wJ.A0e(mMo, 6);
    }

    public static void A00(MMp mMp, C210018l r5) {
        mMp.A0J();
        String str = r5.A01;
        if (str != null) {
            mMp.A0d(DatePickerDialogModule.ARG_DATE, str);
        }
        BKU bku = r5.A00;
        if (bku != null) {
            mMp.A0U("profile_pic_media_dict");
            BKU.A1R(mMp, bku);
        }
        List list = r5.A03;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "published_media_dicts", list);
            while (A0t.hasNext()) {
                BKU bku2 = (BKU) A0t.next();
                if (bku2 != null) {
                    BKU.A1R(mMp, bku2);
                }
            }
            mMp.A0F();
        }
        String str2 = r5.A02;
        if (str2 != null) {
            mMp.A0d(AnonymousClass3QK.A00(22, 8, 123), str2);
        }
        mMp.A0G();
    }
}
