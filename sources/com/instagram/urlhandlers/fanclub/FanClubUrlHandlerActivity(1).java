package com.instagram.urlhandlers.fanclub;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass2RK;
import X.AnonymousClass3WJ;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C23481dv;
import X.C25786Drz;
import X.C62913b8;
import X.C84624tY;
import X.CUJ;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class FanClubUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0RA.A0C.A07(AnonymousClass0wJ.A0C(this));
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String A0i;
        C25786Drz A0Q;
        Fragment r0;
        int A00 = C14030oh.A00(1295780663);
        super.onCreate(bundle);
        UserSession A07 = AnonymousClass0RA.A0C.A07(getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"));
        if (A07 == null) {
            finish();
            i = 21714128;
        } else {
            C84624tY A0I = AnonymousClass0wJ.A0Y(A07).A0I();
            if (!(A0I == null || A0I.AhE() == null)) {
                Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                if (bundleExtra == null || (A0i = C18190wL.A0i(bundleExtra)) == null) {
                    finish();
                    i = 1576108089;
                } else {
                    Uri A01 = C15430rJ.A01(A0i);
                    String lastPathSegment = A01.getLastPathSegment();
                    if (lastPathSegment != null) {
                        int hashCode = lastPathSegment.hashCode();
                        if (hashCode != -216457707) {
                            if (hashCode != 218786155) {
                                if (hashCode == 1557721666 && lastPathSegment.equals("details")) {
                                    A0Q = C18180wK.A0Q(this, A07);
                                    r0 = AnonymousClass3WJ.A00().A00(this, A07, A01.getQueryParameter("tooltip"));
                                }
                            } else if (lastPathSegment.equals("content_preview_picker")) {
                                if (C62913b8.A01(A07)) {
                                    A0Q = C18180wK.A0Q(this, A07);
                                    AnonymousClass3WJ.A00();
                                    CUJ cuj = new CUJ();
                                    cuj.setArguments(C18180wK.A09("ARG_IS_FROM_CONTENT_PREVIEW_NUDGE", false));
                                    A0Q.A03 = cuj;
                                    C18240wQ.A1B(A0Q);
                                }
                                i = 894669973;
                            }
                        } else if (lastPathSegment.equals("subscriber_list")) {
                            String queryParameter = A01.getQueryParameter("origin");
                            A0Q = C18180wK.A0Q(this, A07);
                            AnonymousClass3WJ.A02();
                            String A002 = AnonymousClass2RK.A00(queryParameter);
                            if (A002 == null) {
                                A002 = "UNKNOWN";
                            }
                            Bundle A06 = C18180wK.A06();
                            A06.putString("ARGUMENT_ENTRY_POINT", A002);
                            r0 = new C23481dv();
                            r0.setArguments(A06);
                        }
                        A0Q.A03 = r0;
                        C18240wQ.A1B(A0Q);
                        i = 894669973;
                    }
                }
            }
            finish();
            i = 894669973;
        }
        C14030oh.A07(i, A00);
    }
}
