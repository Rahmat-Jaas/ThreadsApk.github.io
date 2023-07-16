package com.instagram.push;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass7GV;
import X.C05030Qo;
import X.C10300i6;
import X.C10600ic;
import X.C14030oh;
import X.C18200wM;
import X.C61613Un;
import X.C63803iN;
import X.KJ8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.instagram.service.session.UserSession;

public class InstagramAppUpgradeEventReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(-760917670);
        KJ8.A0G.A0G(intent, AnonymousClass006.A1C);
        AnonymousClass7GV.A01();
        C10300i6 A0W = C18200wM.A0W(this);
        if ((A0W instanceof UserSession) && Build.VERSION.SDK_INT >= 29) {
            UserSession A02 = C05030Qo.A02(A0W);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, A02, 36325549194355855L)) {
                C61613Un.A00(C10600ic.A00, A02).A01();
            }
        }
        C14030oh.A0E(-373187546, A01, intent);
    }
}
