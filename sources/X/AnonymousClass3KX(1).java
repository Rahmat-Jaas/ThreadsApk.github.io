package X;

import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.3KX  reason: invalid class name */
public final class AnonymousClass3KX {
    public static AnonymousClass18j parseFromJson(MMo mMo) {
        return (AnonymousClass18j) AnonymousClass0wJ.A0e(mMo, 0);
    }

    public static void A00(MMp mMp, AnonymousClass18j r3) {
        mMp.A0J();
        mMp.A0d("id", r3.A01);
        Iterator A0t = C18190wL.A0t(mMp, "mentioned_users", r3.A03);
        while (A0t.hasNext()) {
            User A0c = C18220wO.A0c(A0t);
            if (A0c != null) {
                C19527Axo.A05(mMp, A0c);
            }
        }
        mMp.A0F();
        Integer num = r3.A00;
        if (num != null) {
            mMp.A0b("sticker_style", num.intValue());
        }
        String str = r3.A02;
        if (str != null) {
            mMp.A0d("text", str);
        }
        mMp.A0G();
    }
}
