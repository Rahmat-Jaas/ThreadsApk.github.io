package X;

import android.util.SparseArray;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6Ov  reason: invalid class name and case insensitive filesystem */
public final class C100836Ov {
    public static Object A00(AnonymousClass601 r17, C63893iY r18) {
        User user;
        User user2;
        AnonymousClass7EW r10;
        Object A0B = C63893iY.A0B(r18, 0);
        A0B.getClass();
        C127397h3 r5 = (C127397h3) A0B;
        AnonymousClass601 r3 = r17;
        UserSession A0J = C63913ic.A0J(r3);
        SparseArray sparseArray = r5.A04;
        C1193774x r0 = (C1193774x) sparseArray.get(38);
        if (r0 != null) {
            user = r0.A00;
        } else {
            user = null;
        }
        user.getClass();
        AnonymousClass7EW r11 = new AnonymousClass7EW(user.BK7(), user.B4M().getUrl(), user.BZi());
        C1193774x r02 = (C1193774x) sparseArray.get(46);
        if (r02 != null) {
            user2 = r02.A00;
        } else {
            user2 = null;
        }
        if (user2 != null) {
            r10 = new AnonymousClass7EW(user2.BK7(), user2.B4M().getUrl(), user2.BZi());
        } else {
            r10 = new AnonymousClass7EW(r5.A0O(51, ""), r5.A0O(52, ""), false);
        }
        String A0O = r5.A0O(42, "");
        String A0O2 = r5.A0O(41, "");
        AnonymousClass792 r8 = new AnonymousClass792((NewFundraiserInfo) null, r10, r11, r5.A0O(36, ""), r5.A0O(48, ""), r5.A0O(43, ""), r5.A0O(40, ""), A0O2, A0O, r5.A0H(50, 0));
        C171799zz r4 = C171799zz.A3B;
        C04220Ms.A0B(r3, 0);
        C19286Atp.A01(C63913ic.A05(r3), r4, A0J, r8);
        return null;
    }
}
