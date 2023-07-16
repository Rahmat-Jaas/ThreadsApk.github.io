package com.instagram.contacts.ccu.impl;

import X.C691847d;
import X.C692547o;
import android.content.Context;
import com.instagram.service.session.UserSession;

public class CCUPluginImpl {
    public void initScheduler(Context context, UserSession userSession) {
        Class<C692547o> cls = C692547o.class;
        if (userSession.A00(cls) == null) {
            C692547o r0 = new C692547o(context, userSession);
            C691847d.A02(r0);
            userSession.A04(cls, r0);
        }
    }

    public CCUPluginImpl(int i) {
    }

    public CCUPluginImpl() {
    }
}
