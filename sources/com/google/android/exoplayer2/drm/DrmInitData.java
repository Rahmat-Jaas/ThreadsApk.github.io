package com.google.android.exoplayer2.drm;

import X.AnonymousClass0wJ;
import X.C18210wN;
import X.C36669Jca;
import X.C86124wJ;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(24);
    public int A00;
    public final int A01;
    public final String A02;
    public final SchemeData[] A03;

    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(25);
        public int A00;
        public final String A01;
        public final String A02;
        public final UUID A03;
        public final byte[] A04;

        public final int describeContents() {
            return 0;
        }

        public final boolean A00(UUID uuid) {
            UUID uuid2 = C36669Jca.A03;
            UUID uuid3 = this.A03;
            if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!Util.A0C(this.A01, schemeData.A01) || !Util.A0C(this.A02, schemeData.A02) || !Util.A0C(this.A03, schemeData.A03) || !Arrays.equals(this.A04, schemeData.A04)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.A00;
            if (i != 0) {
                return i;
            }
            int A07 = C86164wN.A07(this.A04, AnonymousClass0wJ.A07(this.A02, (C18210wN.A04(this.A03) + AnonymousClass0wJ.A06(this.A01)) * 31));
            this.A00 = A07;
            return A07;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.A03;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
        }

        public SchemeData(Parcel parcel) {
            this.A03 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
        }

        public SchemeData(String str, String str2, UUID uuid, byte[] bArr) {
            this.A03 = uuid;
            this.A01 = str;
            this.A02 = str2;
            this.A04 = bArr;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DrmInitData drmInitData = (DrmInitData) obj;
            if (!Util.A0C(this.A02, drmInitData.A02) || !Arrays.equals(this.A03, drmInitData.A03)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = C36669Jca.A03;
        UUID uuid2 = ((SchemeData) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((SchemeData) obj2).A03;
        if (!equals) {
            return uuid2.compareTo(uuid3);
        }
        if (uuid.equals(uuid3)) {
            return 0;
        }
        return 1;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A06 = (AnonymousClass0wJ.A06(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = A06;
        return A06;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public DrmInitData(String str, SchemeData[] schemeDataArr, boolean z) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(String str, List list) {
        this(str, (SchemeData[]) list.toArray(new SchemeData[list.size()]), false);
    }
}
