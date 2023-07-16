package com.instagram.urlhandlers.rtceffect;

import X.AnonymousClass00U;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass7Ja;
import X.AnonymousClass8bb;
import X.C04220Ms;
import X.C10300i6;
import X.C10650ih;
import X.C11630kW;
import X.C14030oh;
import X.C146958n9;
import X.C148838sG;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18250wR;
import X.C25073DfE;
import X.C25235DiG;
import X.C25237DiI;
import X.C27952Ew2;
import X.C30925GbF;
import X.C36982Tk;
import X.C62333Yi;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.camera.effect.helper.RtcUrlHandlerEffectPreviewHelper$makeAndHandleEffectRequest$1;
import com.instagram.service.session.UserSession;

public final class RtcEffectUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "RtcEffectUrlHandlerActivity";
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
        String string;
        String str;
        String str2;
        String str3;
        int A00 = C14030oh.A00(2104890826);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null || (string = bundleExtra.getString("original_url")) == null || string.length() == 0) {
            finish();
            i = -231231314;
        } else {
            String string2 = bundleExtra.getString("original_url");
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Bundle A0C = C18190wL.A0C(this);
            if (A0C != null) {
                A0C.putString("uri", string2);
                C10300i6 session = getSession();
                if (!(session instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, session);
                } else {
                    String str4 = null;
                    Uri A01 = C15430rJ.A01(A0C.getString("uri"));
                    if (A01.isHierarchical()) {
                        str = A01.getQueryParameter("effect_id");
                        if (str == null) {
                            str = getIntent().getStringExtra("effect_id");
                        }
                        str3 = A01.getQueryParameter("ch");
                        str4 = A01.getQueryParameter("rev_id");
                        str2 = A01.getQueryParameter("utm_source");
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    Bundle bundleExtra2 = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                    if (!(bundleExtra2 == null || str == null || str.length() == 0)) {
                        C18180wK.A0w(bundleExtra2, session);
                        C30925GbF A002 = C36982Tk.A00();
                        if (str2 == null) {
                            A002.A03(this, (UserSession) session);
                        }
                        if (isTaskRoot()) {
                            Uri.Builder A0E = C18220wO.A0E(AnonymousClass00U.A0M("https://www.instagram.com/ar/", str, '/'));
                            A0E.appendQueryParameter("effect_id", str);
                            if (str2 != null) {
                                A0E.appendQueryParameter("utm_source", str2);
                            }
                            if (str3 != null) {
                                A0E.appendQueryParameter("ch", str3);
                            }
                            if (str4 != null) {
                                A0E.appendQueryParameter("rev_id", str4);
                            }
                            A0E.appendQueryParameter("src", "vc");
                            Intent A03 = C62333Yi.A01().A03(this, 0);
                            A03.setData(A0E.build());
                            C10650ih.A02(this, A03);
                        } else {
                            C25073DfE dfE = new C25073DfE();
                            UserSession userSession = (UserSession) session;
                            C04220Ms.A0B(userSession, 2);
                            if (str3 == null && str4 == null) {
                                C25237DiI.A00((Integer) null, (C27952Ew2) null, new RtcUrlHandlerEffectPreviewHelper$makeAndHandleEffectRequest$1(this, this, dfE, userSession, str, str3, str4, (C146958n9) null), AnonymousClass7Ja.A03(C25235DiG.A01(C18250wR.A0J((AnonymousClass0gW) null, 3).A03, new AnonymousClass8bb((C148838sG) null))), 3);
                            } else {
                                C25073DfE.A00(this, userSession, str, str3, str4);
                            }
                        }
                    }
                    finish();
                }
                i = 350444374;
            } else {
                IllegalStateException A0b = AnonymousClass0wJ.A0b();
                C14030oh.A07(-1648920836, A00);
                throw A0b;
            }
        }
        C14030oh.A07(i, A00);
    }
}
