package com.instagram.direct.rooms.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;
import java.util.Iterator;
import java.util.List;

public final class RoomsLinkModel extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(4);
    public String A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final MessengerRoomOwnerExtras A04;
    public final RoomOwner A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RoomsLinkModel) {
                RoomsLinkModel roomsLinkModel = (RoomsLinkModel) obj;
                if (!C04220Ms.A0I(this.A08, roomsLinkModel.A08) || !C04220Ms.A0I(this.A0B, roomsLinkModel.A0B) || !C04220Ms.A0I(this.A09, roomsLinkModel.A09) || !C04220Ms.A0I(this.A05, roomsLinkModel.A05) || !C04220Ms.A0I(this.A0E, roomsLinkModel.A0E) || !C04220Ms.A0I(this.A0A, roomsLinkModel.A0A) || !C04220Ms.A0I(this.A07, roomsLinkModel.A07) || !C04220Ms.A0I(this.A0D, roomsLinkModel.A0D) || this.A02 != roomsLinkModel.A02 || this.A03 != roomsLinkModel.A03 || this.A0Q != roomsLinkModel.A0Q || this.A0V != roomsLinkModel.A0V || this.A01 != roomsLinkModel.A01 || !C04220Ms.A0I(this.A0G, roomsLinkModel.A0G) || !C04220Ms.A0I(this.A0I, roomsLinkModel.A0I) || !C04220Ms.A0I(this.A0K, roomsLinkModel.A0K) || !C04220Ms.A0I(this.A06, roomsLinkModel.A06) || this.A0S != roomsLinkModel.A0S || this.A0T != roomsLinkModel.A0T || this.A0M != roomsLinkModel.A0M || this.A0P != roomsLinkModel.A0P || !C04220Ms.A0I(this.A0C, roomsLinkModel.A0C) || this.A0U != roomsLinkModel.A0U || this.A0O != roomsLinkModel.A0O || this.A0R != roomsLinkModel.A0R || this.A0N != roomsLinkModel.A0N || !C04220Ms.A0I(this.A00, roomsLinkModel.A00) || !C04220Ms.A0I(this.A0J, roomsLinkModel.A0J) || this.A0L != roomsLinkModel.A0L || !C04220Ms.A0I(this.A0F, roomsLinkModel.A0F) || !C04220Ms.A0I(this.A0H, roomsLinkModel.A0H) || !C04220Ms.A0I(this.A04, roomsLinkModel.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        this.A05.writeToParcel(parcel, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A01);
        Iterator A0v = C18200wM.A0v(parcel, this.A0G);
        while (A0v.hasNext()) {
            ((RoomsUser) A0v.next()).writeToParcel(parcel, i);
        }
        Iterator A0v2 = C18200wM.A0v(parcel, this.A0I);
        while (A0v2.hasNext()) {
            ((RoomsHashtag) A0v2.next()).writeToParcel(parcel, i);
        }
        Iterator A0v3 = C18200wM.A0v(parcel, this.A0K);
        while (A0v3.hasNext()) {
            ((RoomsUser) A0v3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A00);
        Iterator A0v4 = C18200wM.A0v(parcel, this.A0J);
        while (A0v4.hasNext()) {
            ((RoomsUser) A0v4.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeString(this.A0F);
        Iterator A0v5 = C18200wM.A0v(parcel, this.A0H);
        while (A0v5.hasNext()) {
            ((RoomsUser) A0v5.next()).writeToParcel(parcel, i);
        }
        MessengerRoomOwnerExtras messengerRoomOwnerExtras = this.A04;
        if (messengerRoomOwnerExtras == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        messengerRoomOwnerExtras.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A07(this.A0B, C18180wK.A03(this.A08)));
        long j = this.A02;
        long j2 = this.A03;
        int A052 = (((((((((((AnonymousClass0wJ.A05(this.A05, A072) + AnonymousClass0wJ.A06(this.A0E)) * 31) + AnonymousClass0wJ.A06(this.A0A)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A0D)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.A0Q;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A0V;
        if (z2) {
            z2 = true;
        }
        int A053 = (AnonymousClass0wJ.A05(this.A0K, AnonymousClass0wJ.A05(this.A0I, AnonymousClass0wJ.A05(this.A0G, (((i2 + (z2 ? 1 : 0)) * 31) + this.A01) * 31))) + AnonymousClass0wJ.A06(this.A06)) * 31;
        boolean z3 = this.A0S;
        if (z3) {
            z3 = true;
        }
        int i3 = (A053 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0T;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A0M;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0P;
        if (z6) {
            z6 = true;
        }
        int A062 = (((i5 + (z6 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A0C)) * 31;
        boolean z7 = this.A0U;
        if (z7) {
            z7 = true;
        }
        int i6 = (A062 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.A0O;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.A0R;
        if (z9) {
            z9 = true;
        }
        int i8 = (i7 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.A0N;
        if (z10) {
            z10 = true;
        }
        int A054 = AnonymousClass0wJ.A05(this.A0J, (((i8 + (z10 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31);
        if (!this.A0L) {
            i = 0;
        }
        return AnonymousClass0wJ.A05(this.A0H, (((A054 + i) * 31) + AnonymousClass0wJ.A06(this.A0F)) * 31) + C18200wM.A07(this.A04);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RoomsLinkModel(id=");
        A0s.append(this.A08);
        A0s.append(", linkUrl=");
        A0s.append(this.A0B);
        A0s.append(", linkHash=");
        A0s.append(this.A09);
        A0s.append(", linkOwner=");
        A0s.append(this.A05);
        A0s.append(", shortLinkUrl=");
        A0s.append(this.A0E);
        A0s.append(", linkSurface=");
        A0s.append(this.A0A);
        A0s.append(", emoji=");
        A0s.append(this.A07);
        A0s.append(", name=");
        A0s.append(this.A0D);
        A0s.append(", creationTime=");
        A0s.append(this.A02);
        A0s.append(", expectedStartTimeSeconds=");
        A0s.append(this.A03);
        A0s.append(", isOpen=");
        A0s.append(this.A0Q);
        A0s.append(", shouldAllowGuests=");
        A0s.append(this.A0V);
        A0s.append(", activeCallParticipantCount=");
        A0s.append(this.A01);
        A0s.append(", activeParticipants=");
        A0s.append(this.A0G);
        A0s.append(", hashtags=");
        A0s.append(this.A0I);
        A0s.append(", invitees=");
        A0s.append(this.A0K);
        A0s.append(", conferenceName=");
        A0s.append(this.A06);
        A0s.append(", isOwnerInCall=");
        A0s.append(this.A0S);
        A0s.append(", isRevoked=");
        A0s.append(this.A0T);
        A0s.append(", canViewerReport=");
        A0s.append(this.A0M);
        A0s.append(", isJoinRequestsEnabled=");
        A0s.append(this.A0P);
        A0s.append(", lockStatus=");
        A0s.append(this.A0C);
        A0s.append(", isThreadRoom=");
        A0s.append(this.A0U);
        A0s.append(", isE2EE=");
        A0s.append(this.A0O);
        A0s.append(", isOwner=");
        A0s.append(this.A0R);
        A0s.append(", isAudioOnly=");
        A0s.append(this.A0N);
        A0s.append(", roomType=");
        A0s.append(this.A00);
        A0s.append(", interestedParticipants=");
        A0s.append(this.A0J);
        A0s.append(", allowAnyoneWithLinkToJoin=");
        A0s.append(this.A0L);
        A0s.append(", visibilityMode=");
        A0s.append(this.A0F);
        A0s.append(", allowListedParticipants=");
        A0s.append(this.A0H);
        A0s.append(", messengerRoomOwnerExtras=");
        A0s.append(this.A04);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public RoomsLinkModel(MessengerRoomOwnerExtras messengerRoomOwnerExtras, RoomOwner roomOwner, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, List list4, List list5, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, roomOwner);
        this.A08 = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A05 = roomOwner;
        this.A0E = str4;
        this.A0A = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A02 = j;
        this.A03 = j2;
        this.A0Q = z;
        this.A0V = z2;
        this.A01 = i;
        this.A0G = list;
        this.A0I = list2;
        this.A0K = list3;
        this.A06 = str8;
        this.A0S = z3;
        this.A0T = z4;
        this.A0M = z5;
        this.A0P = z6;
        this.A0C = str9;
        this.A0U = z7;
        this.A0O = z8;
        this.A0R = z9;
        this.A0N = z10;
        this.A00 = str10;
        this.A0J = list4;
        this.A0L = z11;
        this.A0F = str11;
        this.A0H = list5;
        this.A04 = messengerRoomOwnerExtras;
    }
}
