package X;

import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.6zU  reason: invalid class name and case insensitive filesystem */
public final class C117936zU {
    public static final List A00(PendingMedia pendingMedia, UserSession userSession, List list) {
        int i;
        C04220Ms.A0B(list, 0);
        AnonymousClass5I1 r3 = new AnonymousClass5I1(AnonymousClass77D.A00.A00(pendingMedia, userSession, (User) null), AnonymousClass006.A01);
        ListIterator A10 = C86144wL.A10(list);
        while (true) {
            if (A10.hasPrevious()) {
                if (((AnonymousClass5I1) A10.previous()).A01 == AnonymousClass006.A00) {
                    i = A10.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = i + 1;
        return AnonymousClass00J.A0V(list.subList(i2, list.size()), AnonymousClass00J.A0V(C18180wK.A0n(r3), list.subList(0, i2)));
    }

    public static final List A01(PendingMedia pendingMedia, UserSession userSession, List list, boolean z) {
        String str;
        BKU A0W;
        AnonymousClass0wJ.A1M(list, 0, pendingMedia);
        User user = null;
        if (!(!z || (str = pendingMedia.A2w) == null || (A0W = C86114wI.A0W(userSession, str)) == null)) {
            user = A0W.A2Z(userSession);
        }
        return AnonymousClass00J.A0V(list, C18180wK.A0n(new AnonymousClass5I1(AnonymousClass77D.A00.A00(pendingMedia, userSession, user), AnonymousClass006.A00)));
    }
}
