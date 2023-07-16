package com.instagram.direct.avatar.socialstickers.ui;

import X.AnonymousClass0wJ;
import X.AnonymousClass1wX;
import X.C04530Oa;
import X.C10300i6;
import X.C18190wL;
import X.C25786Drz;
import X.C62373Zc;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

public final class AvatarOptionsActivity extends BaseFragmentActivity {
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape61S0100000_I2_41(this, 0));

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final void A0D(Bundle bundle) {
        C18190wL.A10();
        AnonymousClass1wX r1 = new AnonymousClass1wX();
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this, AnonymousClass0wJ.A0U(this.A00));
        A0Q.A03 = r1;
        A0Q.A05();
    }

    public final void onBackPressed() {
        finish();
    }
}
