package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2qr  reason: invalid class name and case insensitive filesystem */
public final class C49112qr {
    public static final void A00(UserSession userSession, List list) {
        AnonymousClass0wJ.A1N(userSession, list);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18190wL.A1T(A0w, it);
        }
        KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2 = new KtCSuperShape0S0100000_I2((List) A0w, 7);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("video_call/remove_users_from_allowlist/");
        A0O.A0O("users_to_remove", ktCSuperShape0S0100000_I2.toString());
        C31155GhB.A03(AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class));
    }
}
