package com.instagram.debug.devoptions;

import X.AnonymousClass4MA;
import X.C14030oh;
import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;

public final class PinnedDeveloperOptionsUtil$getPinnedDevOptions$1$rageShakeItem$1 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4MA $menuItem;
    public final /* synthetic */ DeveloperOptionsPlugin.OnPinnedDevOptionInteraction $onPinnedDevOptionInteraction;

    public PinnedDeveloperOptionsUtil$getPinnedDevOptions$1$rageShakeItem$1(DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction, AnonymousClass4MA r2) {
        this.$onPinnedDevOptionInteraction = onPinnedDevOptionInteraction;
        this.$menuItem = r2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1172159081);
        this.$onPinnedDevOptionInteraction.onPinnedDevOptionSelected();
        this.$menuItem.A03.onClick(view);
        C14030oh.A0C(1805673720, A05);
    }
}
