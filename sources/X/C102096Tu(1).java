package X;

import android.content.Intent;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.service.session.UserSession;

/* renamed from: X.6Tu  reason: invalid class name and case insensitive filesystem */
public final class C102096Tu {
    public static final void A00(Intent intent, PushChannelType pushChannelType, UserSession userSession) {
        C31084GfL A00 = C31084GfL.A00(intent, (String) null, false);
        HGC A002 = C29620FrP.A00();
        String obj = pushChannelType.toString();
        A002.A0F(A00, userSession, obj, obj, 0);
        if (userSession != null && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321705198689270L)) {
            C29620FrP.A00().A0C(A00, pushChannelType);
        }
    }
}
