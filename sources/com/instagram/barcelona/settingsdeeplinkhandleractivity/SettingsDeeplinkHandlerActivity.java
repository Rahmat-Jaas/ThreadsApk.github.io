package com.instagram.barcelona.settingsdeeplinkhandleractivity;

import X.C04220Ms;
import X.C10650ih;
import X.C14030oh;
import X.C28174Ezk;
import X.C62333Yi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class SettingsDeeplinkHandlerActivity extends Activity {
    public final void onNewIntent(Intent intent) {
        C04220Ms.A0B(intent, 0);
        setIntent(intent);
        A00();
    }

    private final void A00() {
        String str;
        Uri data = getIntent().getData();
        if (data != null) {
            str = data.getHost();
        } else {
            str = null;
        }
        if (!C04220Ms.A0I(str, "settings") || !C04220Ms.A0I(data.getScheme(), C28174Ezk.A00(168))) {
            finish();
        }
        Intent intent = getIntent();
        Intent data2 = C62333Yi.A00(this).setData(intent.getData());
        C04220Ms.A06(data2);
        data2.putExtra("SettingsDeeplinkHandlerActivity.EXTRA_DEEPLINK_INTENT", intent);
        C10650ih.A00.A07().A09(this, data2);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(209260643);
        super.onCreate(bundle);
        A00();
        C14030oh.A07(-238051923, A00);
    }
}
