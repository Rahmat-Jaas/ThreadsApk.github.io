package X;

import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2N0  reason: invalid class name */
public final class AnonymousClass2N0 {
    public static final void A00(List list, String str) {
        C04220Ms.A0B(str, 1);
        ArrayList A0t = C18200wM.A0t(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0c = C18220wO.A0c(it);
            boolean A0I = C04220Ms.A0I(A0c.getId(), str);
            String id = A0c.getId();
            String A04 = C31095Gfd.A04(A0c);
            int i = 0;
            if (A0I) {
                i = 2131825772;
            }
            A0t.add(new ReactionViewModel(A0c.B4M(), new MessagingUser(A0c.AvT(), A0c.getId(), A0c.Apb()), id, A04, i, A0I));
        }
        C04220Ms.A06(Collections.unmodifiableList(A0t));
    }
}
