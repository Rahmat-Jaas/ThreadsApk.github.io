package com.instagram.debug.devoptions;

import android.view.KeyEvent;
import android.widget.TextView;

public final class DeveloperLoggingHostFragment$onCreateView$1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ DeveloperLoggingHostFragment this$0;

    public DeveloperLoggingHostFragment$onCreateView$1(DeveloperLoggingHostFragment developerLoggingHostFragment) {
        this.this$0 = developerLoggingHostFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.this$0.setLoggingHost();
        return true;
    }
}
