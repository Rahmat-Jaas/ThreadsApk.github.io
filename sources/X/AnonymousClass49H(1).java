package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.49H  reason: invalid class name */
public final class AnonymousClass49H implements AnonymousClass0i4 {
    public final AnonymousClass49R A00;
    public final UserSession A01;

    public AnonymousClass49H(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = (AnonymousClass49R) userSession.A01(AnonymousClass49R.class, new KtLambdaShape75S0100000_I2_55(userSession, 38));
    }

    public final Map A00(CallerContext callerContext, List list) {
        AnonymousClass49R r1 = this.A00;
        if (!r1.A07() || !r1.A08("ig_android_service_cache_crossposting_setting") || r1.A00 == null) {
            return AnonymousClass4To.A00();
        }
        AnonymousClass49V.A00(callerContext, r1, "ig_android_service_cache_crossposting_setting", list);
        Map map = r1.A00;
        if (map == null) {
            C04220Ms.A0E("customServiceObjectData");
            throw null;
        }
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            C18190wL.A1V(A0y, list, C18180wK.A0o(A0z));
        }
        return A0y;
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49H.class);
    }

    public AnonymousClass49H() {
    }
}
