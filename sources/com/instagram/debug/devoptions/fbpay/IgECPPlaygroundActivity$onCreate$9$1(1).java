package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C10650ih;
import X.C14030oh;
import X.C18190wL;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public final class IgECPPlaygroundActivity$onCreate$9$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$9$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        String str;
        int A05 = C14030oh.A05(1180212003);
        EditText editText = this.this$0.deeplinkE2EUrlInputEditText;
        if (editText == null) {
            C04220Ms.A0E("deeplinkE2EUrlInputEditText");
            throw null;
        }
        Editable text = editText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            Intent A0B = C18190wL.A0B(str);
            AnonymousClass7Kz.A0N();
            C10650ih.A00.A08(IgECPPlaygroundActivity.DOMAIN_E2E).A08(this.this$0, A0B, 10);
        }
        C14030oh.A0C(-1876500321, A05);
    }
}
