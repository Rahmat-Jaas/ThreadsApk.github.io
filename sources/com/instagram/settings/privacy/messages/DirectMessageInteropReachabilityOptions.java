package com.instagram.settings.privacy.messages;

import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;

public enum DirectMessageInteropReachabilityOptions implements Parcelable {
    A0C("inbox", 0, 2131830475, 2131830475),
    A0F("message_requests", 1, 2131830483, 2131830484),
    A09("do_not_receive", 2, 2131830468, 2131830469),
    A0E("primary", 3, 2131830481, 2131830482),
    A0B("general", 4, 2131830473, 2131830474),
    A0D("people_i_follow", 5, 2131830461, 2131830461),
    A0A("everyone", 6, 2131830458, 2131830458);
    
    public static final DirectMessageInteropReachabilityOptions[] A04 = null;
    public static final DirectMessageInteropReachabilityOptions[] A05 = null;
    public static final DirectMessageInteropReachabilityOptions[] A06 = null;
    public static final DirectMessageInteropReachabilityOptions[] A07 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7;
        CREATOR = new PCreatorCreatorShape16S0000000_I2_16(49);
        A05 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A06 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions4, directMessageInteropReachabilityOptions5, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A07 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A04 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions7, directMessageInteropReachabilityOptions6};
    }

    /* access modifiers changed from: public */
    DirectMessageInteropReachabilityOptions(String str, int i, int i2, int i3) {
        this.A03 = str;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A15(parcel, this);
    }
}
