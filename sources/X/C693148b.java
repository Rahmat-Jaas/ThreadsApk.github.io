package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;

/* renamed from: X.48b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C693148b implements C33444Hnz {
    public static final /* synthetic */ C693148b A00 = new C693148b();

    public final Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        ArrayList A0k = C18240wQ.A0k(length);
        int i = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            C04220Ms.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.messaginguser.MessagingUser");
            Long l = ((MessagingUser) obj2).A01;
            if (l != null) {
                A0k.add(l);
                i++;
            } else {
                throw C18180wK.A0a("create_secure_thread: RecipientUser has no EIMU.");
            }
        }
        return A0k;
    }
}
