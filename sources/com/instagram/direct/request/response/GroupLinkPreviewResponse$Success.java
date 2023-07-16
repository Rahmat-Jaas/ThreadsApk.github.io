package com.instagram.direct.request.response;

import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import X.C18240wQ;
import X.C81434nn;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class GroupLinkPreviewResponse$Success implements Parcelable, C81434nn {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(0);
    public final int A00;
    public final int A01;
    public final GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public GroupLinkPreviewResponse$Success(GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C04220Ms.A0B(str, 1);
        C18180wK.A1R(str2, str3);
        C18210wN.A1M(str4, 6, str5);
        this.A0A = str;
        this.A0F = z;
        this.A00 = i;
        this.A05 = str2;
        this.A08 = str3;
        this.A04 = str4;
        this.A0E = z2;
        this.A06 = str5;
        this.A07 = str6;
        this.A0K = z3;
        this.A0H = z4;
        this.A03 = l;
        this.A0G = z5;
        this.A0C = z6;
        this.A0B = z7;
        this.A0D = z8;
        this.A09 = str7;
        this.A0J = z9;
        this.A0I = z10;
        this.A02 = groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo;
        this.A01 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        Long l = this.A03;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C18240wQ.A0v(parcel, l);
        }
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo = this.A02;
        if (groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
    }
}
