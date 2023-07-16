package com.instagram.urlhandlers.crossapptagging;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass8bQ;
import X.C04220Ms;
import X.C10300i6;
import X.C10450iM;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C171209wF;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18250wR;
import X.C37412JrW;
import X.C63803iN;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class XATUrlHandlerActivity extends BaseFragmentActivity {
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

    private final String A00(String str, String str2) {
        String formatStrLocaleSafe;
        String A0C = C63803iN.A0C(AnonymousClass0TJ.A05, getSession(), 36884178411127152L);
        if (AnonymousClass8bQ.A0n(A0C)) {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/%s/posts/%s", str, str2);
        } else {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/%s/posts/%s?mibextid=%s", str, str2, A0C);
        }
        C04220Ms.A06(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0B;
        String A0i;
        int A00 = C14030oh.A00(1294454012);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null || (A0i = C18190wL.A0i(A0B)) == null || A0i.length() == 0) {
            finish();
            i = -647647190;
        } else {
            if (!(getSession() instanceof UserSession)) {
                AnonymousClass3YR.A00.A02(this, A0B, getSession());
            } else {
                try {
                    Uri A01 = C15430rJ.A01(A0i);
                    String queryParameter = A01.getQueryParameter("user_id");
                    String str = "";
                    if (queryParameter == null) {
                        queryParameter = str;
                    }
                    String queryParameter2 = A01.getQueryParameter("post_id");
                    if (queryParameter2 != null) {
                        str = queryParameter2;
                    }
                    if (queryParameter.length() == 0 || str.length() == 0) {
                        C10450iM.A03("XATUrlHandlerActivity", "Invalid or missing user_id and post_id params");
                        finish();
                    } else {
                        C10300i6 session = getSession();
                        AnonymousClass0TJ r7 = AnonymousClass0TJ.A05;
                        if (C63803iN.A0E(r7, session, 36321228457515646L)) {
                            String str2 = "com.facebook.wakizashi";
                            if (!(getPackageManager().getLaunchIntentForPackage(str2) == null && getPackageManager().getLaunchIntentForPackage("com.facebook.katana") == null) && C63803iN.A0E(r7, getSession(), 36321228457646719L)) {
                                Uri A012 = C15430rJ.A01(A00(queryParameter, str));
                                if (getPackageManager().getLaunchIntentForPackage(str2) == null) {
                                    str2 = "com.facebook.katana";
                                }
                                Intent intent2 = C18250wR.A05("android.intent.action.VIEW").setData(A012).setPackage(str2);
                                C04220Ms.A06(intent2);
                                C10650ih.A0A(this, intent2);
                            } else {
                                long A03 = C63803iN.A03(r7, getSession(), 36602703434289124L);
                                if (Long.valueOf(A03) != null) {
                                    if (A03 != -1) {
                                        if (A03 == 0) {
                                            String A002 = A00(queryParameter, str);
                                            C10300i6 session2 = getSession();
                                            C18200wM.A1R(session2);
                                            C37412JrW.A06(this, (UserSession) session2, C171209wF.A0r, (Long) null, A002, "cross_app_tagging_ig");
                                        } else if (A03 == 1) {
                                            C10650ih.A06(this, C15430rJ.A01(A00(queryParameter, str)));
                                        }
                                    }
                                }
                                C10450iM.A03("XATUrlHandlerActivity", "Invalid deeplink option");
                            }
                        }
                        finish();
                    }
                } catch (SecurityException e) {
                    C10450iM.A07("XATUrlHandlerActivity", e);
                } catch (Throwable th) {
                    finish();
                    throw th;
                }
            }
            i = 1625432948;
        }
        C14030oh.A07(i, A00);
    }
}
