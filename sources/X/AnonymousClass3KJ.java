package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3KJ  reason: invalid class name */
public final class AnonymousClass3KJ {
    public static AnonymousClass18U parseFromJson(MMo mMo) {
        return (AnonymousClass18U) AnonymousClass0wJ.A0f(mMo, 131);
    }

    public static void A00(MMp mMp, AnonymousClass18U r3) {
        mMp.A0J();
        List list = r3.A03;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "facepile_top_participants", list);
            while (A0t.hasNext()) {
                User A0c = C18220wO.A0c(A0t);
                if (A0c != null) {
                    C19527Axo.A05(mMp, A0c);
                }
            }
            mMp.A0F();
        }
        mMp.A0b("participant_count", r3.A00);
        mMp.A0d("prompt_id", r3.A01);
        mMp.A0d("text", r3.A02);
        mMp.A0G();
    }
}
