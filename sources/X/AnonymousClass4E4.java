package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4E4  reason: invalid class name */
public final class AnonymousClass4E4 implements C84344sz {
    public final /* synthetic */ C30925GbF A00;

    public final boolean BR1(Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00.A03(context, userSession);
        return true;
    }

    public AnonymousClass4E4(C30925GbF gbF) {
        this.A00 = gbF;
    }

    public final void Bj5(Context context, C15730rn r4, UserSession userSession) {
        r4.A09("video_call_in_progress", Boolean.valueOf(this.A00.A03(context, userSession)));
    }

    public final String AOU(Context context, UserSession userSession, boolean z) {
        int i = 2131837208;
        if (z) {
            i = 2131837202;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }

    public final String AOV(Context context, UserSession userSession, boolean z) {
        int i = 2131837209;
        if (z) {
            i = 2131837203;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }
}
