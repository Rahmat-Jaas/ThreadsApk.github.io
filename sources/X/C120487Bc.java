package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7Bc  reason: invalid class name and case insensitive filesystem */
public final class C120487Bc {
    public static final String A02(Context context, AnonymousClass5L4 r12) {
        C04220Ms.A0B(context, 0);
        if (r12 == null) {
            return null;
        }
        int i = r12.A00;
        String str = r12.A01;
        if (i <= 0 || str.length() <= 0) {
            return null;
        }
        String A00 = C120737Cg.A00(context.getResources(), Integer.valueOf(i), 1000, true, false, false);
        C04220Ms.A06(A00);
        return context.getResources().getQuantityString(R.plurals.number_of_comments_with_specific_emoji, i, new Object[]{A00, str});
    }

    public static final AnonymousClass5L4 A00(AnonymousClass5L3 r3, UserSession userSession) {
        List list;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324634366911051L) || (list = r3.A04) == null) {
            return null;
        }
        return (AnonymousClass5L4) AnonymousClass00J.A0D(list);
    }

    public static final AnonymousClass5L4 A01(BKU bku, UserSession userSession) {
        List<AnonymousClass5L3> list;
        if (!(C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36324634366911051L) || bku == null || (list = bku.A0f.A5R) == null)) {
            for (AnonymousClass5L3 r0 : list) {
                C04220Ms.A04(r0);
                AnonymousClass5L4 A00 = A00(r0, userSession);
                if (A00 != null) {
                    return A00;
                }
            }
        }
        return null;
    }
}
