package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass5jB;
import X.C04220Ms;
import X.C113996sW;
import X.C14030oh;
import X.C18230wP;
import X.C18250wR;
import X.C30975Gcb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebookpay.webview.WebViewActivity;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgECPPlaygroundActivity extends IgFragmentActivity {
    public static final Companion Companion = new Companion();
    public static final String DEEPLINK_URL = "instagram://ecp_checkout?product_id=235936865236184&receiver_id=283912516944685&order_id=1003374073922800";
    public static final String DOMAIN = "ECP_CHECKOUT";
    public static final String DOMAIN_E2E = "ECP_E2E";
    public static final String MODULE_NAME = "ecp_playground";
    public static final String OFFSITE_DEFAULT_URL = "https://fb-qa-test-store.myshopify.com/";
    public static final int REQUEST_CODE_ECP_AVAILABLE = 10;
    public EditText deeplinkE2EUrlInputEditText;
    public C113996sW ecpLauncher;
    public EditText offsiteUrlInputEditText;

    public static final Intent getActivityIntent(Context context) {
        return Companion.getActivityIntent(context);
    }

    public void onAttachFragment(Fragment fragment) {
        C04220Ms.A0B(fragment, 0);
        if (fragment instanceof AnonymousClass5jB) {
            AnonymousClass5jB r2 = (AnonymousClass5jB) fragment;
            C113996sW r0 = this.ecpLauncher;
            if (r0 == null) {
                C04220Ms.A0E("ecpLauncher");
                throw null;
            } else {
                r2.A0F(r0.A05);
            }
        }
    }

    private final void expandTouchArea(View view, View view2, int i) {
        view.post(new IgECPPlaygroundActivity$expandTouchArea$1(view2, i, view));
    }

    public final class Companion {
        public final Intent getActivityIntent(Context context) {
            C04220Ms.A0B(context, 0);
            return C18250wR.A04(context, IgECPPlaygroundActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(1625164523);
        super.onCreate(bundle);
        C30975Gcb.A01(this);
        this.ecpLauncher = new C113996sW(this);
        setContentView((int) R.layout.ig_ecp_playground_activity);
        View findViewById = findViewById(R.id.express_checkout_edittext_offsite_url_input);
        C04220Ms.A06(findViewById);
        this.offsiteUrlInputEditText = (EditText) findViewById;
        View findViewById2 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_input);
        C04220Ms.A06(findViewById2);
        this.deeplinkE2EUrlInputEditText = (EditText) findViewById2;
        findViewById(R.id.express_checkout_button).setOnClickListener(new IgECPPlaygroundActivity$onCreate$1$1(this));
        findViewById(R.id.express_checkout_button_offsite).setOnClickListener(new IgECPPlaygroundActivity$onCreate$2$1(this));
        View findViewById3 = findViewById(R.id.clear_url_input_text);
        View findViewById4 = findViewById(R.id.express_checkout_edittext_offsite_url_layout);
        C04220Ms.A06(findViewById4);
        C04220Ms.A04(findViewById3);
        expandTouchArea(findViewById4, findViewById3, 100);
        findViewById3.setOnClickListener(new IgECPPlaygroundActivity$onCreate$3$1(this));
        findViewById(R.id.express_checkout_button_onsite).setOnClickListener(new IgECPPlaygroundActivity$onCreate$4$1(this));
        findViewById(R.id.express_checkout_button_nux).setOnClickListener(new IgECPPlaygroundActivity$onCreate$5$1(this));
        findViewById(R.id.express_checkout_confirmation).setOnClickListener(new IgECPPlaygroundActivity$onCreate$6$1(this));
        View findViewById5 = findViewById(R.id.web_view);
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("WEB_VIEW_URL", "https://google.com");
        findViewById5.setOnClickListener(new IgECPPlaygroundActivity$onCreate$7$1(intent, this));
        findViewById(R.id.express_checkout_deeplink).setOnClickListener(new IgECPPlaygroundActivity$onCreate$8$1(this));
        findViewById(R.id.express_checkout_deeplink_e2e).setOnClickListener(new IgECPPlaygroundActivity$onCreate$9$1(this));
        View findViewById6 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_input_text);
        View findViewById7 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_layout);
        C04220Ms.A06(findViewById7);
        C04220Ms.A04(findViewById6);
        expandTouchArea(findViewById7, findViewById6, 100);
        findViewById6.setOnClickListener(new IgECPPlaygroundActivity$onCreate$10$1(this));
        FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) findViewById(R.id.pay_button);
        fBPayAnimationButton.setEnabled(true);
        fBPayAnimationButton.setOnClickListener(new IgECPPlaygroundActivity$onCreate$11$1(fBPayAnimationButton));
        findViewById(R.id.pay_button_confirm).setOnClickListener(new IgECPPlaygroundActivity$onCreate$12$1(fBPayAnimationButton));
        findViewById(R.id.pay_button_cancel).setOnClickListener(new IgECPPlaygroundActivity$onCreate$13$1(fBPayAnimationButton));
        findViewById(R.id.pay_button_reset).setOnClickListener(new IgECPPlaygroundActivity$onCreate$14$1(fBPayAnimationButton));
        C14030oh.A07(1746430926, A00);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public UserSession getSession() {
        return C18230wP.A0Z();
    }
}
