package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ME  reason: invalid class name */
public final class AnonymousClass3ME {
    public static AnonymousClass79P A00(ImageUrl imageUrl, User user, String str, List list, boolean z) {
        ImageUrl B4M;
        ImageUrl imageUrl2 = null;
        if (list.isEmpty()) {
            if (z) {
                return new AnonymousClass79P(user.B4M(), (Object) null);
            }
            B4M = user.B4M();
        } else if (list.size() == 1) {
            B4M = ((C83154qs) C18240wQ.A0b(list)).B4M();
            if (z) {
                return new AnonymousClass79P(B4M, (Object) null);
            }
        } else {
            Iterator it = list.iterator();
            if (str == null || imageUrl == null || str.equals(user.getId())) {
                imageUrl = ((C83154qs) it.next()).B4M();
            }
            while (it.hasNext() && (imageUrl2 == null || imageUrl.equals(imageUrl2))) {
                imageUrl2 = ((C83154qs) it.next()).B4M();
            }
            return new AnonymousClass79P(imageUrl, imageUrl2);
        }
        return new AnonymousClass79P(B4M, user.B4M());
    }

    public static List A01(UserSession userSession, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C83144qr r3 = (C83144qr) list.get(i);
            if (userSession.getUserId().equals(r3.getId())) {
                if (list.size() > 1) {
                    C10450iM.A04("DirectUserListUtil_filtered_current_user", AnonymousClass00U.A0J("Filtered current user from list of size: ", list.size()), 1);
                }
                ArrayList A0s = C18200wM.A0s(list);
                A0s.remove(r3);
                return A0s;
            }
        }
        return list;
    }
}
