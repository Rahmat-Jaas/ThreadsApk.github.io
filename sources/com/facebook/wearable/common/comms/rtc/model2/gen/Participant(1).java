package com.facebook.wearable.common.comms.rtc.model2.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;

public class Participant implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape2S0000000_I2_2(55);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1.equals(r0) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.facebook.wearable.common.comms.rtc.model2.gen.Participant
            r2 = 0
            if (r0 == 0) goto L_0x0019
            com.facebook.wearable.common.comms.rtc.model2.gen.Participant r4 = (com.facebook.wearable.common.comms.rtc.model2.gen.Participant) r4
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            if (r1 != 0) goto L_0x001a
            if (r0 == 0) goto L_0x0020
        L_0x0019:
            return r2
        L_0x001a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
        L_0x0020:
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            if (r1 != 0) goto L_0x0029
            if (r0 == 0) goto L_0x002f
            return r2
        L_0x0029:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0019
        L_0x002f:
            boolean r1 = r3.A03
            boolean r0 = r4.A03
            if (r1 != r0) goto L_0x0019
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.rtc.model2.gen.Participant.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((C18210wN.A00(this.A00.hashCode()) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A02)) * 31) + (this.A03 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Participant{id=");
        A0s.append(this.A00);
        A0s.append(",name=");
        A0s.append(this.A01);
        A0s.append(",profileImageUrl=");
        A0s.append(this.A02);
        A0s.append(",isSelf=");
        A0s.append(this.A03);
        return C18180wK.A0i("}", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        String str = this.A01;
        if (str != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(str);
        } else {
            parcel.writeByte((byte) 0);
        }
        String str2 = this.A02;
        if (str2 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(str2);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public Participant(Parcel parcel) {
        this.A00 = parcel.readString();
        if (parcel.readByte() != 0) {
            this.A01 = parcel.readString();
        }
        if (parcel.readByte() != 0) {
            this.A02 = parcel.readString();
        }
        this.A03 = C18180wK.A1Y(parcel);
    }
}
