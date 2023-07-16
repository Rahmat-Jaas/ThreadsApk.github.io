package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass6C1;
import X.C122167Ky;
import X.C18210wN;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(74);
    public final ChannelIdValueType A00;
    public final String A01;
    public final String A02;

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1);
        
        public static final Parcelable.Creator CREATOR = null;
        public final int A00;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = C86124wJ.A0Z(73);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
        }

        /* access modifiers changed from: public */
        ChannelIdValueType(int i) {
            this.A00 = i;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (!(obj instanceof ChannelIdValue)) {
                return false;
            }
            ChannelIdValue channelIdValue = (ChannelIdValue) obj;
            ChannelIdValueType channelIdValueType = this.A00;
            if (!channelIdValueType.equals(channelIdValue.A00)) {
                return false;
            }
            int ordinal = channelIdValueType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = this.A01;
                    str2 = channelIdValue.A01;
                } else if (ordinal != 2) {
                    return false;
                } else {
                    str = this.A02;
                    str2 = channelIdValue.A02;
                }
                return str.equals(str2);
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str;
        ChannelIdValueType channelIdValueType = this.A00;
        int hashCode = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 1) {
            i = hashCode * 31;
            str = this.A01;
        } else if (ordinal != 2) {
            return hashCode;
        } else {
            i = hashCode * 31;
            str = this.A02;
        }
        return C18210wN.A05(str, i);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
                if (i == channelIdValueType.A00) {
                    this.A00 = channelIdValueType;
                    this.A01 = str;
                    this.A02 = str2;
                    return;
                }
            }
            throw new AnonymousClass6C1(i);
        } catch (AnonymousClass6C1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A00.A00);
        C122167Ky.A0H(parcel, this.A01, 3, false);
        C122167Ky.A0G(parcel, this.A02, A002, false);
    }

    public ChannelIdValue() {
        this.A00 = ChannelIdValueType.ABSENT;
        this.A02 = null;
        this.A01 = null;
    }
}
