package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import android.view.View;
import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;

public final class PublicDeveloperOptions$addMainOptions$91 implements View.OnClickListener {
    public static final PublicDeveloperOptions$addMainOptions$91 INSTANCE = new PublicDeveloperOptions$addMainOptions$91();

    public final void onClick(View view) {
        int A05 = C14030oh.A05(715047909);
        if (DebugHeadPlugin.isAvailable()) {
            DebugHeadPlugin debugHeadPlugin = DebugHeadPlugin.sInstance;
            if (debugHeadPlugin != null) {
                debugHeadPlugin.showDebugHead();
            } else {
                IllegalStateException A0b = AnonymousClass0wJ.A0b();
                C14030oh.A0C(-1839130498, A05);
                throw A0b;
            }
        }
        C14030oh.A0C(1025606242, A05);
    }
}
