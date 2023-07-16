package X;

import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.71Z  reason: invalid class name */
public final class AnonymousClass71Z {
    public static AnonymousClass5N0 parseFromJson(MMo mMo) {
        return (AnonymousClass5N0) C86104wH.A0e(mMo, 157);
    }

    public static void A00(MMp mMp, AnonymousClass5N0 r5) {
        mMp.A0J();
        Iterator A0t = C18190wL.A0t(mMp, "templates", r5.A00);
        while (A0t.hasNext()) {
            AnonymousClass5N1 r2 = (AnonymousClass5N1) A0t.next();
            if (r2 != null) {
                mMp.A0J();
                mMp.A0d("image_url", r2.A01);
                User user = r2.A00;
                if (user != null) {
                    mMp.A0U("template_author");
                    C19527Axo.A05(mMp, user);
                }
                mMp.A0d(C18170wI.A00(46), r2.A02);
                mMp.A0G();
            }
        }
        mMp.A0F();
        mMp.A0G();
    }
}
