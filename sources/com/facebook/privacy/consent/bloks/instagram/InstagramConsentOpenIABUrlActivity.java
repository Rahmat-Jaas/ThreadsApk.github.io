package com.facebook.privacy.consent.bloks.instagram;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0hH;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C103396Za;
import X.C107886hT;
import X.C109326jp;
import X.C14030oh;
import X.C171209wF;
import X.C37350Jpy;
import X.C61043Rr;
import X.C63893iY;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.concurrent.locks.ReentrantLock;

public final class InstagramConsentOpenIABUrlActivity extends IgFragmentActivity {
    public C10300i6 A00;
    public boolean A01;

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("already_opened", this.A01);
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("session");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        int A002 = C14030oh.A00(429384915);
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        C04220Ms.A06(intent);
        this.A00 = r1.A02(AnonymousClass0hH.A00(intent));
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (bundle != null) {
            this.A01 = bundle2.getBoolean("already_opened");
        }
        if (this.A01) {
            i = -753294861;
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null) {
                str = intent2.getStringExtra("redirect_url");
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                setResult(0);
                finish();
                i = 1331769361;
            } else {
                C10300i6 r12 = this.A00;
                if (r12 == null) {
                    C04220Ms.A0E("session");
                    throw null;
                }
                if (r12.isLoggedIn()) {
                    C37350Jpy jpy = new C37350Jpy((Activity) this, C05030Qo.A02(r12), C171209wF.A0H, str);
                    jpy.A07("instagram_consent_open_iab_url_activity");
                    jpy.A04();
                } else {
                    SimpleWebViewActivity.A01.A02(this, r12, new SimpleWebViewConfig(str, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false));
                }
                i = 2100497717;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onPause() {
        int A002 = C14030oh.A00(-1183122572);
        super.onPause();
        this.A01 = true;
        C14030oh.A07(1231191861, A002);
    }

    public final void onResume() {
        int A002 = C14030oh.A00(-843153825);
        super.onResume();
        if (this.A01) {
            String stringExtra = getIntent().getStringExtra("callback_key");
            if (stringExtra != null) {
                ReentrantLock reentrantLock = C103396Za.A01;
                reentrantLock.lock();
                try {
                    C107886hT r0 = (C107886hT) C103396Za.A00.remove(stringExtra);
                    if (r0 != null) {
                        C109326jp r2 = r0.A01;
                        C61043Rr.A00(r0.A00, C63893iY.A01, r2);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            finish();
        }
        C14030oh.A07(-924416587, A002);
    }
}
