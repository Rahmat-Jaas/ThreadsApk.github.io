package com.instagram.debug.devoptions.fbpay;

import X.C04220Ms;
import X.C14030oh;
import X.C171209wF;
import X.C18230wP;
import X.C37350Jpy;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.instagram.service.session.UserSession;

public final class IgECPPlaygroundActivity$onCreate$2$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$2$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        String str;
        int A05 = C14030oh.A05(1425300274);
        EditText editText = this.this$0.offsiteUrlInputEditText;
        if (editText == null) {
            C04220Ms.A0E("offsiteUrlInputEditText");
            throw null;
        }
        Editable text = editText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        IgECPPlaygroundActivity igECPPlaygroundActivity = this.this$0;
        UserSession A0Z = C18230wP.A0Z();
        if (str.length() <= 0) {
            str = IgECPPlaygroundActivity.OFFSITE_DEFAULT_URL;
        }
        C37350Jpy jpy = new C37350Jpy((Activity) igECPPlaygroundActivity, A0Z, C171209wF.A0v, str);
        jpy.A07(IgECPPlaygroundActivity.MODULE_NAME);
        jpy.A04();
        C14030oh.A0C(1399628834, A05);
    }
}
