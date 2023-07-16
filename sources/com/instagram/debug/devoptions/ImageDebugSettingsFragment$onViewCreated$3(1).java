package com.instagram.debug.devoptions;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C09120et;
import X.C18210wN;
import kotlin.Unit;

public final class ImageDebugSettingsFragment$onViewCreated$3 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C09120et $preferences;
    public final /* synthetic */ ImageDebugSettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageDebugSettingsFragment$onViewCreated$3(C09120et r2, ImageDebugSettingsFragment imageDebugSettingsFragment) {
        super(1);
        this.$preferences = r2;
        this.this$0 = imageDebugSettingsFragment;
    }

    public final void invoke(int i) {
        C18210wN.A1I(this.$preferences.A0T, i);
        this.this$0.updateModules();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(AnonymousClass0wJ.A04(obj));
        return Unit.A00;
    }
}
