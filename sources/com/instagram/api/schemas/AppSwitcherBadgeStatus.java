package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape6S0000000_I2_6;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AppSwitcherBadgeStatus implements Parcelable {
    UNRECOGNIZED("AppSwitcherBadgeStatus_unspecified"),
    HIDE_TEXT_POST_APP_SWITCHER_BADGE("hide_text_post_app_switcher_badge"),
    SHOW_TEXT_POST_APP_SWITCHER_BADGE("show_text_post_app_switcher_badge"),
    HIDE_IG_APP_SWITCHER_BADGE("hide_ig_app_switcher_badge");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AppSwitcherBadgeStatus appSwitcherBadgeStatus : values()) {
            A0v.put(appSwitcherBadgeStatus.A00, appSwitcherBadgeStatus);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape6S0000000_I2_6(90);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AppSwitcherBadgeStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
