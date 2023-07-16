package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3VR;
import X.C09660ft;
import X.C18180wK;
import X.C22491Yh;
import X.C58773Hd;
import X.C63863iT;
import X.C83594rf;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.modal.ModalActivity;

public class IDxCallbackShape695S0100000_1_I2 implements C83594rf {
    public Object A00;
    public final int A01;

    public IDxCallbackShape695S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onActionClicked() {
        if (this.A01 != 0) {
            C22491Yh r5 = (C22491Yh) this.A00;
            Bundle A09 = C18180wK.A09("BIRTHDAY_NOTIFICATION_TITLE_ARGUMENT", r5.getString(2131822312));
            C63863iT.A0D(r5, C63863iT.A04(r5.requireActivity(), A09, AnonymousClass0wJ.A0U(r5.A05), ModalActivity.class, "birthday_notification"));
            return;
        }
        C58773Hd r3 = (C58773Hd) this.A00;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(AnonymousClass3VR.A00(r3.A06), "ig_push_notification_settings_banner"), 1402);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("event_type", "click");
            A0I.Bb4();
        }
        C09660ft.A00(r3.A02);
    }

    public final void onBannerDismissed() {
    }
}
