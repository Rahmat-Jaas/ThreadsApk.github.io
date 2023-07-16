package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.barcelona.login.activity.LoginActivity;

/* renamed from: X.3YR  reason: invalid class name */
public abstract class AnonymousClass3YR {
    public static AnonymousClass3YR A00;

    public final void A02(Activity activity, Bundle bundle, C10300i6 r4) {
        A03(activity, bundle, r4, true);
    }

    public static void A00(Activity activity, Bundle bundle, C10300i6 r3) {
        A00.A02(activity, bundle, r3);
    }

    public static void A01(Activity activity, C10300i6 r4) {
        A00.A02(activity, activity.getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), r4);
    }

    public final void A03(Activity activity, Bundle bundle, C10300i6 r7, boolean z) {
        Intent A04;
        if (this instanceof C26911rS) {
            KK7 A002 = KK7.A00(r7);
            if (activity != null) {
                A002.A09(activity, (String) null);
            }
            A04 = C18230wP.A0B();
            String str = "com.instagram.nux.activity.SignedOutFragmentActivity";
            if ((bundle == null || !bundle.getBoolean("IS_ADD_ACCOUNT_FLOW", false)) && new AnonymousClass3Y9(activity, r7).A02(AnonymousClass006.A00)) {
                str = "com.instagram.nux.activity.BloksSignedOutFragmentActivity";
            }
            A04.setClassName(activity, str);
        } else {
            AnonymousClass0wJ.A1N(activity, r7);
            KK7.A00(r7).A09(activity, (String) null);
            A04 = C18250wR.A04(activity, LoginActivity.class);
        }
        A04.setFlags(67108864);
        if (bundle != null) {
            A04.putExtras(bundle);
        }
        C10650ih.A02(activity, A04);
        if (z) {
            activity.finish();
        }
    }
}
