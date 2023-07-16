package com.facebook;

import X.AnonymousClass00U;
import X.AnonymousClass2Ar;
import X.AnonymousClass32F;
import X.AnonymousClass3UQ;
import X.AnonymousClass3XO;
import X.AnonymousClass457;
import X.AnonymousClass458;
import X.C14030oh;
import X.C15430rJ;
import X.C16100sU;
import X.C18180wK;
import X.C18220wO;
import X.C38040KHr;
import X.C563436u;
import X.C62843aw;
import X.C82394pY;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;

public final class CustomTabMainActivity extends Activity {
    public C82394pY A00 = null;
    public boolean A01 = true;

    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        int A002 = C14030oh.A00(-1184881461);
        super.onCreate(bundle);
        if (!C16100sU.A00().A01(this, getIntent(), this)) {
            finish();
        }
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            i = 1246552308;
        } else {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action");
                Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
                String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
                if (bundleExtra == null) {
                    bundleExtra = C18180wK.A06();
                }
                Uri A003 = C62843aw.A00(bundleExtra, String.format("m.%s", new Object[]{"facebook.com"}), AnonymousClass00U.A0d("v2.3", "/", "dialog/", stringExtra));
                C563436u A004 = new AnonymousClass3UQ((AnonymousClass2Ar) null).A00();
                Intent intent = A004.A00;
                intent.setPackage(stringExtra2);
                try {
                    intent.setData(A003);
                    startActivity(intent, A004.A01);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                    z = false;
                }
                this.A01 = false;
                if (!z) {
                    setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                    finish();
                    i = -1785440123;
                } else {
                    IDxEListenerShape223S0100000_1_I2 A0P = C18220wO.A0P(this, 0);
                    this.A00 = A0P;
                    C38040KHr.A01.A03(A0P, AnonymousClass457.class);
                }
            }
            i = -313143066;
        }
        C14030oh.A07(i, A002);
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(2006141850);
        C82394pY r2 = this.A00;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass457.class);
        }
        super.onDestroy();
        C14030oh.A07(-1052043915, A002);
    }

    public final void onNewIntent(Intent intent) {
        Bundle A06;
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            C38040KHr.A01.CWx(new AnonymousClass458());
        } else if (!"CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
        if (stringExtra != null) {
            Uri A012 = C15430rJ.A01(stringExtra);
            A06 = C62843aw.A01(A012.getQuery());
            A06.putAll(C62843aw.A01(A012.getFragment()));
        } else {
            A06 = C18180wK.A06();
        }
        Intent A002 = AnonymousClass3XO.A00(getIntent(), A06, (AnonymousClass32F) null);
        if (A002 != null) {
            intent = A002;
        }
        setResult(-1, intent);
        finish();
    }

    public final void onResume() {
        int A002 = C14030oh.A00(-2121318846);
        super.onResume();
        if (this.A01) {
            setResult(0, AnonymousClass3XO.A00(getIntent(), C18180wK.A06(), (AnonymousClass32F) null));
            finish();
        }
        this.A01 = true;
        C14030oh.A07(-223282094, A002);
    }
}
