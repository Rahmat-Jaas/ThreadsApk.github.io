package com.instagram.bloks.hosting.intf;

import X.AnonymousClass01V;
import X.AnonymousClass3LY;
import X.C04220Ms;
import X.C24431ij;
import X.C67323zM;
import X.C687745k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import com.instagram.business.promote.util.PromoteCtwaLinkUtil$Companion$openWhatsAppLinkingFlow$fragment$1;
import com.instagram.caa.login.helper.CAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1;
import com.instagram.fanclub.impl.FanClubFragmentFactoryImpl$newFanClubFanOnboardingWelcomeFragment$1;
import com.instagram.login.callback.LoginCallbacks$2;
import com.instagram.service.session.UserSession;
import com.instagram.wellbeing.accountstatus.impl.AccountStatusPluginImpl$IXTScreenExitCallback;
import com.instagram.wellbeing.scc.impl.SensitiveContentControlPluginImpl$IXTScreenExitCallback;
import com.instagram.wellbeing.timespent.listeners.InstagramTimeSpentLogger$TimeSpentReminderRunnable$6;
import com.instagram.wellbeing.viewergeogating.impl.ViewerGeoGatingPluginImpl$IXTScreenExitCallback;

public class IgBloksScreenExitCallback implements Parcelable {
    public static final PCreatorCreatorShape9S0000000_I2_9 CREATOR = new PCreatorCreatorShape9S0000000_I2_9(87);

    public final int describeContents() {
        return 0;
    }

    public void A00(UserSession userSession) {
        AnonymousClass01V r3;
        int i;
        if (this instanceof ViewerGeoGatingPluginImpl$IXTScreenExitCallback) {
            r3 = AnonymousClass01V.A0p;
            i = 291191452;
        } else if (this instanceof InstagramTimeSpentLogger$TimeSpentReminderRunnable$6) {
            ((InstagramTimeSpentLogger$TimeSpentReminderRunnable$6) this).A00.A01.A0L();
            return;
        } else if (this instanceof SensitiveContentControlPluginImpl$IXTScreenExitCallback) {
            r3 = AnonymousClass01V.A0p;
            i = 790826917;
        } else if (this instanceof AccountStatusPluginImpl$IXTScreenExitCallback) {
            AnonymousClass01V.A0p.markerEnd(387849633, 615);
            return;
        } else if (this instanceof LoginCallbacks$2) {
            LoginCallbacks$2 loginCallbacks$2 = (LoginCallbacks$2) this;
            C24431ij r1 = loginCallbacks$2.A00;
            if (userSession == null) {
                userSession = loginCallbacks$2.A01;
            }
            r1.A03(userSession, loginCallbacks$2.A02);
            return;
        } else if (this instanceof FanClubFragmentFactoryImpl$newFanClubFanOnboardingWelcomeFragment$1) {
            if (userSession != null) {
                AnonymousClass3LY.A00(userSession).CWx(new C687745k());
                return;
            }
            return;
        } else if (this instanceof CAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1) {
            CAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1 cAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1 = (CAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1) this;
            C67323zM.A04(cAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1.A00, cAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1.A01, cAABloksIgLoginWithFbNavHelper$Companion$launchLoginWithFbNuxScreen$appScreenConfig$1.A02, userSession);
            return;
        } else if (this instanceof PromoteCtwaLinkUtil$Companion$openWhatsAppLinkingFlow$fragment$1) {
            ((PromoteCtwaLinkUtil$Companion$openWhatsAppLinkingFlow$fragment$1) this).A00.Bmi();
            return;
        } else {
            return;
        }
        r3.markerEnd(i, 0, 615);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if ((this instanceof ViewerGeoGatingPluginImpl$IXTScreenExitCallback) || (this instanceof SensitiveContentControlPluginImpl$IXTScreenExitCallback) || (this instanceof AccountStatusPluginImpl$IXTScreenExitCallback)) {
            C04220Ms.A0B(parcel, 0);
            parcel.writeInt(1);
        }
    }
}
