package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Oz  reason: invalid class name and case insensitive filesystem */
public final class C60423Oz {
    public static final void A00(Activity activity, Context context, AnonymousClass2AC r9, UserSession userSession, C83004qd r11) {
        AnonymousClass0wJ.A1M(userSession, 1, r9);
        AnonymousClass1v3.A06.A03(activity, context, r9, userSession, r11, true);
    }

    public static /* synthetic */ boolean A01(Activity activity, Context context, AnonymousClass2AC r10, UserSession userSession, C83004qd r12, int i, boolean z) {
        Context context2 = context;
        C83004qd r6 = null;
        if ((i & 16) != 0) {
            context2 = null;
        }
        if ((i & 32) == 0) {
            r6 = r12;
        }
        AnonymousClass2AC r4 = r10;
        UserSession userSession2 = userSession;
        AnonymousClass0wJ.A1O(userSession, r10);
        if (!C67373zR.A08(userSession)) {
            return false;
        }
        if (r6 == null) {
            r6 = AnonymousClass4LI.A00;
        }
        boolean z2 = z;
        Activity activity2 = activity;
        if (C63363hM.A06(userSession, z)) {
            return AnonymousClass1v4.A0A.A04(activity, r10, userSession, r6, z2);
        }
        if (C63363hM.A05(userSession)) {
            return AnonymousClass1v3.A06.A03(activity2, context2, r4, userSession2, r6, false);
        }
        return false;
    }
}
