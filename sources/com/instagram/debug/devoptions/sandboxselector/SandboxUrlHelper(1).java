package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass000;
import X.AnonymousClass3h3;
import X.C04220Ms;

public final class SandboxUrlHelper {
    public final String getParsedHostServerUrl(String str) {
        C04220Ms.A0B(str, 0);
        String A03 = AnonymousClass3h3.A03(str);
        C04220Ms.A06(A03);
        return A03;
    }

    public final void clearCachedDevServerSetting() {
        synchronized (AnonymousClass3h3.class) {
            AnonymousClass3h3.A00 = null;
        }
    }

    public final String getDefaultInstagramHost() {
        return AnonymousClass000.A00(370);
    }
}
