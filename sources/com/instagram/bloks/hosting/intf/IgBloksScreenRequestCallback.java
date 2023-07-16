package com.instagram.bloks.hosting.intf;

import X.AnonymousClass006;
import X.AnonymousClass3XX;
import X.AnonymousClass4TP;
import X.C04220Ms;
import X.C13950oZ;
import X.C40322Lcc;
import X.C62743ad;
import X.C63583hq;
import X.C696349j;
import android.app.Dialog;
import android.os.Parcelable;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.CrosspostingBloksUpsellManager$getAppScreenConfig$1;
import com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1;
import com.instagram.wellbeing.timespent.listeners.InstagramTimeSpentLogger$TimeSpentReminderRunnable$7;

public abstract class IgBloksScreenRequestCallback implements Parcelable {
    public void A00() {
        if (this instanceof IxtTriggerController$createCallback$1) {
            C62743ad r1 = ((IxtTriggerController$createCallback$1) this).A00;
            if (!r1.A01) {
                C62743ad.A00(C40322Lcc.FETCHING_CANCELLED, r1);
            }
            r1.A08.A00();
        }
    }

    public void A01() {
        if (this instanceof IxtTriggerController$createCallback$1) {
            C62743ad r1 = ((IxtTriggerController$createCallback$1) this).A00;
            C62743ad.A00(C40322Lcc.FETCHING_DONE, r1);
            r1.A08.A04((Integer) null);
        } else if (this instanceof CrosspostingBloksUpsellManager$getAppScreenConfig$1) {
            ((CrosspostingBloksUpsellManager$getAppScreenConfig$1) this).A00.Bmk();
        }
    }

    public final void A02(AnonymousClass3XX r6) {
        if (this instanceof InstagramTimeSpentLogger$TimeSpentReminderRunnable$7) {
            InstagramTimeSpentLogger$TimeSpentReminderRunnable$7 instagramTimeSpentLogger$TimeSpentReminderRunnable$7 = (InstagramTimeSpentLogger$TimeSpentReminderRunnable$7) this;
            AnonymousClass4TP r3 = instagramTimeSpentLogger$TimeSpentReminderRunnable$7.A01;
            C696349j r2 = r3.A01;
            UserSession userSession = r2.A02;
            C04220Ms.A0B(userSession, 0);
            C63583hq.A01(userSession, AnonymousClass006.A02);
            Dialog A0G = AnonymousClass4TP.A00(instagramTimeSpentLogger$TimeSpentReminderRunnable$7.A00, r3).A0G();
            C696349j.A06(r2);
            r2.A01 = A0G;
            C13950oZ.A00(A0G);
        } else if (this instanceof IxtTriggerController$createCallback$1) {
            C62743ad r0 = ((IxtTriggerController$createCallback$1) this).A00;
            C62743ad.A01(r6, r0);
            r0.A08.A01();
        } else if (this instanceof CrosspostingBloksUpsellManager$getAppScreenConfig$1) {
            ((CrosspostingBloksUpsellManager$getAppScreenConfig$1) this).A00.Bmj();
        }
    }
}
