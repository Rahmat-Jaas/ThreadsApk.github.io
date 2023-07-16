package com.instagram.jobscheduler;

import X.AnonymousClass0fS;
import X.C05030Qo;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C558634w;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Set;

public class SchedulerNetworkChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        Set<String> stringSet;
        int A01 = C14030oh.A01(2051876086);
        C10300i6 A0W = C18200wM.A0W(this);
        if (!(A0W instanceof UserSession)) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, SchedulerNetworkChangeReceiver.class), 2, 1);
            i = 62981278;
        } else {
            if (AnonymousClass0fS.A0B(context)) {
                C558634w r5 = (C558634w) C18180wK.A0c(C05030Qo.A02(A0W), C558634w.class, 22);
                synchronized (r5) {
                    SharedPreferences sharedPreferences = r5.A00;
                    stringSet = sharedPreferences.getStringSet("services_waiting_for_connectivity_change", C18200wM.A0u());
                    C18180wK.A0u(sharedPreferences.edit(), "services_waiting_for_connectivity_change");
                }
                Iterator<String> it = stringSet.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = new ComponentName(context, C18180wK.A0k(it));
                    Intent A0B = C18230wP.A0B();
                    A0B.setComponent(componentName);
                    C10650ih.A03(context, A0B);
                }
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, SchedulerNetworkChangeReceiver.class), 2, 1);
            }
            i = 799911547;
        }
        C14030oh.A0E(i, A01, intent);
    }
}
