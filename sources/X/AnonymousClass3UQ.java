package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;

/* renamed from: X.3UQ  reason: invalid class name */
public final class AnonymousClass3UQ {
    public Bundle A00;
    public final Intent A01 = C18250wR.A05("android.intent.action.VIEW");

    public final C563436u A00() {
        String str;
        Bundle A06;
        Intent intent = this.A01;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle A062 = C18180wK.A06();
            A062.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            intent.putExtras(A062);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(C18180wK.A06());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            str = adjustedDefault.get(0).toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                A06 = intent.getBundleExtra("com.android.browser.headers");
            } else {
                A06 = C18180wK.A06();
            }
            String A002 = I17.A00(355);
            if (!A06.containsKey(A002)) {
                A06.putString(A002, str);
                intent.putExtra("com.android.browser.headers", A06);
            }
        }
        return new C563436u(intent, this.A00);
    }

    public AnonymousClass3UQ(AnonymousClass2Ar r2) {
    }

    public AnonymousClass3UQ() {
    }
}
