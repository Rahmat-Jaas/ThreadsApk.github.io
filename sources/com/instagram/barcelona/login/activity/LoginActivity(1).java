package com.instagram.barcelona.login.activity;

import X.AnonymousClass03G;
import X.AnonymousClass2C5;
import X.AnonymousClass7JR;
import X.C05030Qo;
import X.C07530bf;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18200wM;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

public final class LoginActivity extends IgFragmentActivity implements C11630kW {
    public C07530bf A00;

    public final String getModuleName() {
        return "barcelona_login";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-675634947);
        super.onCreate(bundle);
        C10300i6 A0W = C18200wM.A0W(this);
        this.A00 = C05030Qo.A00(A0W);
        AnonymousClass2C5.A00(this, 1);
        setTheme(R.style.IgPanorama);
        setContentView((int) R.layout.barcelona_login_activity);
        ((ComposeView) requireViewById(R.id.compose_view)).setContent(AnonymousClass7JR.A03(new KtLambdaShape48S0200000_I2(27, A0W, this), 1685348533, true));
        AnonymousClass03G.A00(getWindow(), false);
        C14030oh.A07(1359762169, A002);
    }
}
