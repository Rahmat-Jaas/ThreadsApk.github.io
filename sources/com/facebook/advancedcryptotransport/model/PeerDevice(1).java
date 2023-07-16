package com.facebook.advancedcryptotransport.model;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape0S0000000_I2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PeerDevice implements Parcelable {
    public static volatile Integer A0E;
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape0S0000000_I2(66);
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerDevice) {
                PeerDevice peerDevice = (PeerDevice) obj;
                if (!AnonymousClass3ZT.A03(this.A06, peerDevice.A06) || !AnonymousClass3ZT.A03(this.A03, peerDevice.A03) || !AnonymousClass3ZT.A03(this.A07, peerDevice.A07) || !AnonymousClass3ZT.A03(this.A08, peerDevice.A08) || this.A0D != peerDevice.A0D || !AnonymousClass3ZT.A03(this.A04, peerDevice.A04) || !AnonymousClass3ZT.A03(this.A00, peerDevice.A00) || !AnonymousClass3ZT.A03(this.A09, peerDevice.A09) || !AnonymousClass3ZT.A03(this.A01, peerDevice.A01) || !AnonymousClass3ZT.A03(this.A0A, peerDevice.A0A) || !AnonymousClass3ZT.A03(this.A0B, peerDevice.A0B) || A00() != peerDevice.A00() || !AnonymousClass3ZT.A03(this.A05, peerDevice.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A0C.contains("platform")) {
            return this.A02;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = AnonymousClass006.A00;
                }
            }
        }
        return A0E;
    }

    public final int hashCode() {
        int intValue;
        int A002 = (((((((((((AnonymousClass3ZT.A00(((((((AnonymousClass0wJ.A03(this.A06) + 31) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A08), this.A0D) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A0A)) * 31) + AnonymousClass0wJ.A03(this.A0B);
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((A002 * 31) + intValue) * 31) + AnonymousClass0wJ.A03(this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A06, 0, 1);
        C18240wQ.A0v(parcel, this.A03);
        parcel.writeString(this.A07);
        C18190wL.A16(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A0D ? 1 : 0);
        C18240wQ.A0v(parcel, this.A04);
        Double d = this.A00;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        C18190wL.A16(parcel, this.A09, 0, 1);
        Double d2 = this.A01;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        C18190wL.A16(parcel, this.A0A, 0, 1);
        C18190wL.A16(parcel, this.A0B, 0, 1);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        C18240wQ.A0v(parcel, this.A05);
        Set set = this.A0C;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(C18180wK.A0k(it));
        }
    }

    public PeerDevice(Parcel parcel) {
        getClass().getClassLoader();
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A03 = C18250wR.A0T(parcel);
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A0D = C18230wP.A1V(parcel.readInt());
        this.A04 = C18250wR.A0T(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? C18210wN.A0U(parcel, 4) : num;
        this.A05 = C18250wR.A0T(parcel);
        HashSet A0u = C18200wM.A0u();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0u.add(parcel.readString());
        }
        this.A0C = Collections.unmodifiableSet(A0u);
    }
}
