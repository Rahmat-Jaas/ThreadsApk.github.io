package com.instagram.fbpay.shoppay;

import X.AnonymousClass3UQ;
import X.C04220Ms;
import X.C14030oh;
import X.C15430rJ;
import X.C16100sU;
import X.C563436u;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class IGShopPayCustomTabsActivity extends Activity {
    public boolean A00 = true;

    public final void onNewIntent(Intent intent) {
        C04220Ms.A0B(intent, 0);
        intent.setAction("action_custom_tab_redirect");
        super.onNewIntent(intent);
        int i = 0;
        if ("action_custom_tab_redirect".equals(intent.getAction())) {
            i = -1;
        }
        setResult(i, intent);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-1940133220);
        super.onCreate(bundle);
        if (!C16100sU.A00().A01(this, getIntent(), this)) {
            finish();
            i = -1782795821;
        } else {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("extra_url");
                if (stringExtra == null) {
                    finish();
                    i = -350200869;
                } else {
                    C563436u A003 = new AnonymousClass3UQ().A00();
                    Uri A01 = C15430rJ.A01(stringExtra);
                    Intent intent = A003.A00;
                    intent.setData(A01);
                    startActivity(intent, A003.A01);
                    this.A00 = true;
                }
            }
            i = -133691908;
        }
        C14030oh.A07(i, A002);
    }

    public final void onResume() {
        int A002 = C14030oh.A00(-1358194371);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        C14030oh.A07(623441748, A002);
    }
}
