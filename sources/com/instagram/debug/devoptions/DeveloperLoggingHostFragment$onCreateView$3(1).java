package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18250wR;
import android.view.View;
import android.widget.EditText;

public final class DeveloperLoggingHostFragment$onCreateView$3 implements View.OnClickListener {
    public final /* synthetic */ EditText $editText;
    public final /* synthetic */ DeveloperLoggingHostFragment this$0;

    public DeveloperLoggingHostFragment$onCreateView$3(EditText editText, DeveloperLoggingHostFragment developerLoggingHostFragment) {
        this.$editText = editText;
        this.this$0 = developerLoggingHostFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1210526227);
        C18250wR.A0t(this.$editText);
        this.this$0.setLoggingHost();
        C14030oh.A0C(-214602326, A05);
    }
}
