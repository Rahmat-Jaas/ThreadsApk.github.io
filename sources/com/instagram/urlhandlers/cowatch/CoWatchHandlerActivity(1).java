package com.instagram.urlhandlers.cowatch;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C11630kW;
import X.C13330nS;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C63803iN;
import X.C63863iT;
import X.KK7;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.service.session.UserSession;

public class CoWatchHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "direct_cowatch_deep_link_video_call";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int i;
        int A002 = C14030oh.A00(-375239729);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        A0C.getClass();
        C10300i6 A0S = C18190wL.A0S(A0C);
        this.A00 = A0S;
        if (!(A0S instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, A0S);
            i = 2126684259;
        } else if (!C63803iN.A0E(AnonymousClass0TJ.A05, A0S, 36310370779922473L)) {
            finish();
            i = -1307751424;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = -969580436;
            } else {
                Uri A01 = C15430rJ.A01(A0i);
                String queryParameter = A01.getQueryParameter("media_id");
                if (queryParameter == null) {
                    finish();
                    i = 1107622459;
                } else {
                    if ("ig".equals(A01.getQueryParameter("media_source"))) {
                        num = AnonymousClass006.A00;
                    } else {
                        num = AnonymousClass006.A01;
                    }
                    RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = new RtcStartCoWatchPlaybackArguments(num, AnonymousClass006.A01, AnonymousClass006.A00, (Integer) null, queryParameter, A01.getQueryParameter("preview_video_id"));
                    Bundle A06 = C18180wK.A06();
                    A06.putBoolean("DirectVideoCallRecipientsPickerFragment.EXTRA_IS_COWATCH_PICKER", true);
                    A06.putParcelable("DirectVideoCallRecipientsPickerFragment.EXTRA_COWATCH_ARGUMENTS", rtcStartCoWatchPlaybackArguments);
                    C63863iT.A0B(getApplicationContext(), A06, ModalActivity.class, "direct_pick_video_call_recipients");
                    String queryParameter2 = A01.getQueryParameter("source");
                    String str = rtcStartCoWatchPlaybackArguments.A04;
                    USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A00), "direct_composer_impression"), 521);
                    A0I.A0T("reason", queryParameter2);
                    A0I.A0T("cowatch_media_id", str);
                    A0I.Bb4();
                    KK7.A00(this.A00).A09(this, (String) null);
                    finish();
                    i = -2098160171;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
