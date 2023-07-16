package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.Map;

/* renamed from: X.2Hp  reason: invalid class name and case insensitive filesystem */
public final class C33932Hp {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        String str;
        String str2;
        Object A0B = C63893iY.A0B(r6, AnonymousClass0wJ.A1Y(r6, r5) ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A0B;
        Object obj = map.get("tag_id");
        if (obj != null) {
            str = C63913ic.A0M(obj);
        } else {
            str = null;
        }
        Object obj2 = map.get("destination_id");
        if (obj2 != null) {
            str2 = C63913ic.A0M(obj2);
        } else {
            str2 = null;
        }
        Object obj3 = map.get(DialogModule.KEY_TITLE);
        if (obj3 != null) {
            C63913ic.A0M(obj3);
        }
        Object obj4 = map.get("subtitle");
        if (obj4 != null) {
            C63913ic.A0M(obj4);
        }
        C63913ic.A0G(r5);
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        throw C18200wM.A0d();
    }
}
