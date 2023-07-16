package com.instagram.debug.devoptions.cam;

import X.AnonymousClass06C;
import X.AnonymousClass0ZU;
import X.C012605w;
import X.C02220Ah;
import X.C04220Ms;
import X.C04530Oa;
import X.C147138nS;
import androidx.fragment.app.Fragment;

public final class MediaKitDevOptionFragment$special$$inlined$viewModels$default$5 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ C04530Oa $owner$delegate;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionFragment$special$$inlined$viewModels$default$5(Fragment fragment, C04530Oa r3) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = r3;
    }

    public final C147138nS invoke() {
        C147138nS r0;
        C012605w r1;
        AnonymousClass06C r12 = (AnonymousClass06C) this.$owner$delegate.getValue();
        if (!(r12 instanceof C012605w) || (r1 = (C012605w) r12) == null || (r0 = r1.getDefaultViewModelProviderFactory()) == null) {
            r0 = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        C04220Ms.A09(r0);
        return r0;
    }
}
