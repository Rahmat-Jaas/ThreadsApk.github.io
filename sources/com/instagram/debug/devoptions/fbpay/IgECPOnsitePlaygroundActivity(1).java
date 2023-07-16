package com.instagram.debug.devoptions.fbpay;

import X.C04220Ms;
import X.C113996sW;
import X.C14030oh;
import X.C18230wP;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgECPOnsitePlaygroundActivity extends IgFragmentActivity {
    public static final Companion Companion = new Companion();
    public C113996sW ecpLauncher;

    public static final Intent getActivityIntent(Context context) {
        return Companion.getActivityIntent(context);
    }

    public void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(2113669700);
        super.onCreate(bundle);
        this.ecpLauncher = new C113996sW(this);
        setContentView((int) R.layout.ig_ecp_onsite_playground_activity);
        findViewById(R.id.express_checkout_button).setOnClickListener(new IgECPOnsitePlaygroundActivity$onCreate$1$1(this));
        findViewById(R.id.express_checkout_button_nux).setOnClickListener(new IgECPOnsitePlaygroundActivity$onCreate$2$1(this));
        C14030oh.A07(-1940336513, A00);
    }

    public final class Companion {
        public final Intent getActivityIntent(Context context) {
            C04220Ms.A0B(context, 0);
            return new Intent(context, IgECPPlaygroundActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public UserSession getSession() {
        return C18230wP.A0Z();
    }
}
