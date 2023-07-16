package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C09990hX;
import android.view.View;

public final class DeveloperOptionsFragment$settingSearchDebouncer$1 implements C09990hX {
    public final /* synthetic */ DeveloperOptionsFragment this$0;

    public DeveloperOptionsFragment$settingSearchDebouncer$1(DeveloperOptionsFragment developerOptionsFragment) {
        this.this$0 = developerOptionsFragment;
    }

    public final void onDebouncedValue(String str) {
        C04220Ms.A0B(str, 0);
        View AXO = this.this$0.getScrollingViewProxy().AXO(0);
        if (AXO != null) {
            AXO.requestFocus();
        }
        this.this$0.applyFilter(str);
    }
}
