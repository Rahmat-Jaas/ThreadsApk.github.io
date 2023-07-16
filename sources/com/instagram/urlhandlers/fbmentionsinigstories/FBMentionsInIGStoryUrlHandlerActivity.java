package com.instagram.urlhandlers.fbmentionsinigstories;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass320;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18210wN;
import X.C18250wR;
import X.C63803iN;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class FBMentionsInIGStoryUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0B;
        String A0i;
        int A00 = C14030oh.A00(1164924258);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null || (A0i = C18190wL.A0i(A0B)) == null || A0i.length() == 0) {
            finish();
            i = 1998058945;
        } else {
            if (!(getSession() instanceof UserSession)) {
                AnonymousClass3YR.A00.A02(this, A0B, getSession());
            } else {
                try {
                    String queryParameter = C15430rJ.A01(A0i).getQueryParameter("user_id");
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    if (queryParameter.length() == 0) {
                        AnonymousClass0LU.A0B("FBMentionsInIGStoryUrlHandlerActivity", "Invalid or missing user_id param");
                    } else {
                        C10300i6 session = getSession();
                        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
                        long A03 = C63803iN.A03(r5, session, 36606826602566249L);
                        if (Long.valueOf(A03) != null) {
                            if (A03 != -1) {
                                if (A03 != 0) {
                                    if (A03 == 1) {
                                        String str = "com.facebook.wakizashi";
                                        if (!(getPackageManager().getLaunchIntentForPackage(str) == null && getPackageManager().getLaunchIntentForPackage("com.facebook.katana") == null)) {
                                            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AnonymousClass00U.A0L(AnonymousClass320.A03, "profile/%s?mibextid=%s"), queryParameter, C63803iN.A0C(r5, getSession(), 36888301579338220L));
                                            C04220Ms.A06(formatStrLocaleSafe);
                                            Uri A01 = C15430rJ.A01(formatStrLocaleSafe);
                                            if (getPackageManager().getLaunchIntentForPackage(str) == null) {
                                                str = "com.facebook.katana";
                                            }
                                            Intent intent2 = C18250wR.A05("android.intent.action.VIEW").setData(A01).setPackage(str);
                                            C04220Ms.A06(intent2);
                                            C10650ih.A0A(this, intent2);
                                        }
                                    }
                                }
                                String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/profile.php?id=%s&mibextid=%s", queryParameter, C63803iN.A0C(r5, getSession(), 36888301579338220L));
                                C04220Ms.A06(formatStrLocaleSafe2);
                                C10650ih.A06(this, C15430rJ.A01(formatStrLocaleSafe2));
                            }
                        }
                        AnonymousClass0LU.A0B("FBMentionsInIGStoryUrlHandlerActivity", "Invalid deeplink option");
                    }
                } catch (SecurityException e) {
                    AnonymousClass0LU.A0E("FBMentionsInIGStoryUrlHandlerActivity", "Error parsing url", e);
                } catch (Throwable th) {
                    finish();
                    throw th;
                }
                finish();
            }
            i = -841452015;
        }
        C14030oh.A07(i, A00);
    }
}
