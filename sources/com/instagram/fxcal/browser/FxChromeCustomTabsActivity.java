package com.instagram.fxcal.browser;

import X.AnonymousClass00J;
import X.AnonymousClass3UQ;
import X.AnonymousClass3X4;
import X.AnonymousClass8bP;
import X.AnonymousClass8bQ;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18200wM;
import X.C18230wP;
import X.C563436u;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.redex.IDxComparatorShape302S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

public final class FxChromeCustomTabsActivity extends BaseFragmentActivity {
    public boolean A00 = true;

    public final void A0D(Bundle bundle) {
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return C18230wP.A0Z();
    }

    public final void onCreate(Bundle bundle) {
        String scheme;
        String str;
        int A002 = C14030oh.A00(434210020);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("url_param");
        if (stringExtra != null) {
            try {
                if (!AnonymousClass8bQ.A0n(stringExtra) && (scheme = C15430rJ.A01(stringExtra).getScheme()) != null && scheme.equals("https")) {
                    AnonymousClass3UQ r4 = new AnonymousClass3UQ();
                    Intent intent = r4.A01;
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    r4.A00 = ActivityOptions.makeCustomAnimation(this, R.anim.modal_slide_up_enter, R.anim.modal_empty_animation).toBundle();
                    intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit).toBundle());
                    intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                    C563436u A003 = r4.A00();
                    if (!AnonymousClass8bQ.A0n("com.opera.browser,com.sec.android.app.sbrowser,com.android.chrome")) {
                        Intent intent2 = A003.A00;
                        Context baseContext = getBaseContext();
                        C04220Ms.A06(baseContext);
                        List A0e = AnonymousClass8bP.A0e("com.opera.browser,com.sec.android.app.sbrowser,com.android.chrome", new char[]{BasicHeaderValueParser.ELEM_DELIMITER}, 0);
                        C04220Ms.A0B(A0e, 2);
                        List A004 = AnonymousClass3X4.A00(baseContext, stringExtra);
                        if (A004.isEmpty()) {
                            str = null;
                        } else {
                            str = ((ResolveInfo) AnonymousClass00J.A0C(AnonymousClass00J.A0W(A004, new IDxComparatorShape302S0100000_1_I2((Object) A0e, 3)))).activityInfo.packageName;
                        }
                        intent2.setPackage(str);
                    }
                    Uri A01 = C15430rJ.A01(stringExtra);
                    Intent intent3 = A003.A00;
                    intent3.setData(A01);
                    startActivity(intent3, A003.A01);
                    C14030oh.A07(-368703283, A002);
                    return;
                }
            } catch (Exception unused) {
                setResult(0);
                finish();
                C14030oh.A07(773692474, A002);
                return;
            }
        }
        setResult(0);
        finish();
        C14030oh.A07(-389693660, A002);
    }

    public final void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        Intent A0B = C18230wP.A0B();
        if (intent != null) {
            str = intent.getStringExtra("key_uri");
        } else {
            str = null;
        }
        C18200wM.A10(this, A0B.putExtra("KEY_URL", str));
    }

    public final void onResume() {
        int A002 = C14030oh.A00(788667379);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        C14030oh.A07(1608035570, A002);
    }
}
