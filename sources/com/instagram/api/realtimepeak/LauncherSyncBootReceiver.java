package com.instagram.api.realtimepeak;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C28161tl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.UserSession;

public class LauncherSyncBootReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(-237503784);
        if (!AnonymousClass000.A00(287).equals(intent.getAction())) {
            i = -1586774300;
        } else {
            C10300i6 A0W = C18200wM.A0W(this);
            if (!(A0W instanceof UserSession)) {
                i = -458661443;
            } else {
                AnonymousClass0wJ.A12(C28161tl.A02(AnonymousClass3WS.A01(C05030Qo.A02(A0W))), "mobile_config_last_sync_time_peak", 0);
                i = -8011186;
            }
        }
        C14030oh.A0E(i, A01, intent);
    }
}
