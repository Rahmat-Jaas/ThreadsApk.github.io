package com.instagram.debug.devoptions.fbpay;

import X.C04220Ms;
import X.C14030oh;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public final class IgECPPlaygroundActivity$onCreate$10$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$10$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-878775855);
        EditText editText = this.this$0.deeplinkE2EUrlInputEditText;
        if (editText == null) {
            C04220Ms.A0E("deeplinkE2EUrlInputEditText");
            throw null;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        C14030oh.A0C(166765097, A05);
    }
}
