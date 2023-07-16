package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C64543mW;
import X.C83874s8;
import android.widget.TextView;

public final class DeveloperOptionsFragment$typeAheadDelegate$1 implements C83874s8 {
    public final /* synthetic */ DeveloperOptionsFragment this$0;

    public void registerTextViewLogging(TextView textView) {
        C04220Ms.A0B(textView, 0);
        textView.addTextChangedListener(C64543mW.A00(this.this$0.getSession()));
    }

    public void searchTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        this.this$0.settingSearchDebouncer.A01(str);
    }

    public DeveloperOptionsFragment$typeAheadDelegate$1(DeveloperOptionsFragment developerOptionsFragment) {
        this.this$0 = developerOptionsFragment;
    }
}
