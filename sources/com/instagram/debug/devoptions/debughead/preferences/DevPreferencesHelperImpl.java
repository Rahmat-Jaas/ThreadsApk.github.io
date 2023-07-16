package com.instagram.debug.devoptions.debughead.preferences;

import X.AnonymousClass0wJ;
import X.C09120et;
import X.C18210wN;
import X.C18220wO;
import com.instagram.debug.devoptions.debughead.common.intf.DevPreferencesHelper;

public class DevPreferencesHelperImpl implements DevPreferencesHelper {
    public int getLoomQplMarkerTriggerPreference() {
        return AnonymousClass0wJ.A04(C18220wO.A0f(C09120et.A02().A1u));
    }

    public boolean isLeakDebuggingEnabled() {
        return AnonymousClass0wJ.A1V(C09120et.A02().A1J);
    }

    public void setLoomQplMarkerTriggerPreference(int i) {
        C18210wN.A1I(C09120et.A02().A1u, i);
    }
}
