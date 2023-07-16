package com.facebook.advancedcryptotransport.model;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C18250wR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape0S0000000_I2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecurityAlert implements Parcelable {
    public static volatile Integer A07;
    public static volatile Integer A08;
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape0S0000000_I2(67);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SecurityAlert) {
                SecurityAlert securityAlert = (SecurityAlert) obj;
                if (!AnonymousClass3ZT.A03(this.A03, securityAlert.A03) || A00() != securityAlert.A00() || !AnonymousClass3ZT.A03(this.A01, securityAlert.A01) || !AnonymousClass3ZT.A03(this.A04, securityAlert.A04) || !AnonymousClass3ZT.A03(this.A05, securityAlert.A05) || A01() != securityAlert.A01()) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A06.contains("deviceChangeType")) {
            return this.A00;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = AnonymousClass006.A00;
                }
            }
        }
        return A07;
    }

    public final Integer A01() {
        if (this.A06.contains("platform")) {
            return this.A02;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = AnonymousClass006.A00;
                }
            }
        }
        return A08;
    }

    public final int hashCode() {
        int intValue;
        int A032 = AnonymousClass0wJ.A03(this.A03) + 31;
        int i = -1;
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        int A033 = (((((((A032 * 31) + intValue) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A05);
        if (A01() != null) {
            i = A01().intValue();
        }
        return (A033 * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18240wQ.A0v(parcel, this.A03);
        C18180wK.A0y(parcel, this.A00, 0, 1);
        parcel.writeInt(this.A01.intValue());
        C18190wL.A16(parcel, this.A04, 0, 1);
        C18190wL.A16(parcel, this.A05, 0, 1);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        Set set = this.A06;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(C18180wK.A0k(it));
        }
    }

    public SecurityAlert(Parcel parcel) {
        getClass().getClassLoader();
        this.A03 = C18250wR.A0T(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = C18210wN.A0U(parcel, 4);
        }
        this.A01 = Integer.valueOf(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? C18210wN.A0U(parcel, 4) : num;
        HashSet A0u = C18200wM.A0u();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0u.add(parcel.readString());
        }
        this.A06 = Collections.unmodifiableSet(A0u);
    }
}
