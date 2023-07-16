package com.instagram.urlhandlers.createpostexternal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C170769vX;
import X.C18190wL;
import X.C25529DnJ;
import X.C25818DsX;
import X.C28923FeI;
import X.C84584tU;
import android.os.Bundle;
import com.facebook.redex.IDxHDelegateShape496S0100000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.service.session.UserSession;

public class CreatePostExternalUrlHandlerActivity extends IgFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1572622626);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 A0S = C18190wL.A0S(A0C);
        this.A00 = A0S;
        if (!(A0S instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, A0S);
        } else {
            C84584tU A02 = C25529DnJ.A02.A02(this, new IDxHDelegateShape496S0100000_1_I2(this, 6), C05030Qo.A02(A0S));
            C28923FeI feI = C28923FeI.FOLLOWERS_SHARE;
            A02.Cvr(C170769vX.EXTERNAL, new MediaCaptureConfig(new C25818DsX(feI)), feI);
            finish();
        }
        C14030oh.A07(1246694084, A002);
    }
}
