package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.2Ha  reason: invalid class name and case insensitive filesystem */
public final class C33782Ha {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        Object A0B = C63893iY.A0B(r10, 0);
        Object A0B2 = C63893iY.A0B(r10, A1Z ? 1 : 0);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A0B2;
        if (!C04220Ms.A0I(A0B, "ig_ig_feed_cross_posting")) {
            return null;
        }
        C10300i6 A0F = C63913ic.A0F(r9);
        C18200wM.A1R(A0F);
        Context context = C63913ic.A0D(r9).A00;
        C04220Ms.A06(context);
        Object obj = map.get("linked_id");
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get(C61973Wo.A01(229, 8, 73));
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        AnonymousClass49M A00 = C35812Ox.A00((UserSession) A0F);
        AnonymousClass0wJ.A1M(str, A1Z, str2);
        C63733iD A002 = C63733iD.A00();
        A002.A0A = AnonymousClass0wJ.A0l(context, str2, 2131828482);
        A002.A0C();
        AnonymousClass0wJ.A0F().postDelayed(new C73534Su(A00, A002.A0B(), str, str2), 1000);
        return null;
    }
}
