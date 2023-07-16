package com.instagram.urlhandlers.usageinsights;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass3UZ;
import X.C10300i6;
import X.C14030oh;
import X.C16240si;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C25786Drz;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class UsageInsightsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A00 = C14030oh.A00(-228067465);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            i = 788910210;
        } else {
            Bundle A0B = C18210wN.A0B(intent);
            if (A0B == null) {
                finish();
                i = 273764332;
            } else {
                UserSession A0V = C18180wK.A0V(A0B);
                try {
                    C18190wL.A0J().A00(this, getIntent(), (C16240si) null);
                    AnonymousClass3UZ r0 = AnonymousClass3UZ.A02;
                    if (r0 != null) {
                        C25786Drz A0Q = C18180wK.A0Q(this, A0V);
                        A0Q.A03 = r0.A00().A02(A0V, AnonymousClass006.A15);
                        A0Q.A08();
                        C18240wQ.A1B(A0Q);
                    }
                } catch (SecurityException e) {
                    e = e;
                    str = "Security issue with caller";
                    AnonymousClass0LU.A0E("usage_insights_url_handler", str, e);
                    finish();
                    i = -96932578;
                    C14030oh.A07(i, A00);
                } catch (IllegalStateException e2) {
                    e = e2;
                    str = "Failed to verify caller";
                    AnonymousClass0LU.A0E("usage_insights_url_handler", str, e);
                    finish();
                    i = -96932578;
                    C14030oh.A07(i, A00);
                }
                i = -96932578;
            }
        }
        C14030oh.A07(i, A00);
    }
}
