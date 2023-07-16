package com.instagram.urlhandlers.businessconversionexternal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C05050Qq;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C18200wM;
import X.C18250wR;
import X.C34502Ju;
import X.C62883b4;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public class BusinessConversionExternalUrlHandlerActivity extends IgFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-805269175);
        super.onCreate(bundle);
        this.A00 = C18200wM.A0W(this);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, r1);
        } else {
            UserSession A02 = C05030Qo.A02(r1);
            A0C.getClass();
            C05050Qq.A00(A0C, A02);
            C34502Ju.A00();
            Intent A003 = C62883b4.A00(this);
            A0C.putString("entry_point", "deep_link");
            A0C.putInt("intro_entry_position", 0);
            C18250wR.A0o(A003, 3, A0C);
            C10650ih.A08(this, A003, 11);
            finish();
        }
        C14030oh.A07(644335758, A002);
    }
}
