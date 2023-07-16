package X;

import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.service.session.UserSession;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.2zi  reason: invalid class name and case insensitive filesystem */
public final class C54602zi {
    public static final void A00(ScreenTimeScreenType screenTimeScreenType, UserSession userSession, long j) {
        C04220Ms.A0B(userSession, 0);
        C62803am r5 = C63043bN.A01;
        String obj = screenTimeScreenType.toString();
        C57613Bt A07 = r5.A07(userSession, obj);
        if (A07 != null) {
            A07.A00 = j;
            if (j - A07.A01 > (System.currentTimeMillis() / 1000) - (AnonymousClass0wJ.A0A() / 1000)) {
                A07.A01 = AnonymousClass0wJ.A0A() / 1000;
            }
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            C18190wL.A1W(instance);
            Date time = instance.getTime();
            C04220Ms.A06(time);
            A07.A03 = time;
            C04220Ms.A0B(obj, 1);
            C18180wK.A0v(r5.A06(userSession).edit(), AnonymousClass00U.A0L("SCREEN_TIME_BY_SCREEN_", obj), C18220wO.A0p(A07));
        }
    }
}
