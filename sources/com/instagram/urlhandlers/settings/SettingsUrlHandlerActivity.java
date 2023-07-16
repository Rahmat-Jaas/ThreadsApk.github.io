package com.instagram.urlhandlers.settings;

import X.AnonymousClass0wJ;
import X.AnonymousClass1wV;
import X.AnonymousClass1x2;
import X.C05030Qo;
import X.C07530bf;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C29131wm;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;

public final class SettingsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Fragment r1;
        int A002 = C14030oh.A00(-231556105);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1026708987;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 581041273;
            } else {
                this.A00 = C18190wL.A0S(A0C);
                String host = C15430rJ.A01(A0i).getHost();
                if (host == null || (this.A00 instanceof C07530bf)) {
                    i = 1694022551;
                } else {
                    int hashCode = host.hashCode();
                    if (hashCode == -2134566383) {
                        if (host.equals("settings_account")) {
                            C18190wL.A10();
                            r1 = new C29131wm();
                        }
                        i = 2083504708;
                    } else if (hashCode != -1271745684) {
                        if (hashCode == 1434631203 && host.equals("settings")) {
                            C18190wL.A10();
                            r1 = new AnonymousClass1x2();
                        }
                        i = 2083504708;
                    } else {
                        if (host.equals("settings_privacy")) {
                            C18190wL.A10();
                            r1 = new AnonymousClass1wV();
                        }
                        i = 2083504708;
                    }
                    C10300i6 r0 = this.A00;
                    if (r0 != null) {
                        C18230wP.A19(r1, C18180wK.A0Q(this, C05030Qo.A02(r0)));
                        i = 94902463;
                    } else {
                        IllegalStateException A0b = AnonymousClass0wJ.A0b();
                        C14030oh.A07(-617055062, A002);
                        throw A0b;
                    }
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
