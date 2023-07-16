package com.instagram.debug.devoptions;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C09120et;
import X.C18240wQ;
import kotlin.Unit;

public final class ImageDebugSettingsFragment$onViewCreated$13 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C09120et $preferences;
    public final /* synthetic */ ImageDebugSettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageDebugSettingsFragment$onViewCreated$13(C09120et r2, ImageDebugSettingsFragment imageDebugSettingsFragment) {
        super(1);
        this.$preferences = r2;
        this.this$0 = imageDebugSettingsFragment;
    }

    public final void invoke(String str) {
        C04220Ms.A0B(str, 0);
        C18240wQ.A1D(this.$preferences.A0L, str);
        this.this$0.updateModules();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.A00;
    }
}
