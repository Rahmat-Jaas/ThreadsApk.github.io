package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BU  reason: invalid class name */
public final class AnonymousClass4BU implements C82474pl {
    public final UserSession A00;

    public final void Bgn(Bundle bundle) {
        AnonymousClass20y r0;
        String str;
        C04220Ms.A0B(bundle, 0);
        UserSession userSession = this.A00;
        if (!C35072Lz.A00(userSession) || !AnonymousClass2MS.A00(userSession)) {
            if (C35072Lz.A00(userSession)) {
                r0 = AnonymousClass20y.Social;
            } else {
                r0 = AnonymousClass20y.Broadcast;
            }
            if (AnonymousClass3MD.A01(r0, userSession)) {
                str = "broadcast_chat_setup";
            } else {
                str = "broadcast_chat_nux";
            }
        } else {
            str = "broadcast_chat_chooser";
        }
        bundle.putString("interest_based_channel_entry_point", str);
    }

    public AnonymousClass4BU(UserSession userSession) {
        this.A00 = userSession;
    }
}
