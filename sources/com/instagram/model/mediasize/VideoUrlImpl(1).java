package com.instagram.model.mediasize;

import X.C18180wK;
import X.C18230wP;
import X.C18250wR;
import X.C21562BwR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.concurrent.TimeUnit;

public class VideoUrlImpl implements Parcelable, C21562BwR {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(88);
    public Long A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1.equals(r0) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x004c
            r2 = 0
            if (r5 == 0) goto L_0x003a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x003a
            com.instagram.model.mediasize.VideoUrlImpl r5 = (com.instagram.model.mediasize.VideoUrlImpl) r5
            int r1 = r4.A03
            int r0 = r5.A03
            if (r1 != r0) goto L_0x003a
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x003a
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x003a
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Long r1 = r4.A00
            java.lang.Long r0 = r5.A00
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003e
        L_0x003a:
            return r2
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r2
        L_0x003e:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L_0x0049
            boolean r3 = r1.equals(r0)
            return r3
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            r3 = 0
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.mediasize.VideoUrlImpl.equals(java.lang.Object):boolean");
    }

    public final Long AgU() {
        Long l = this.A00;
        if (l != null) {
            return Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AhB() {
        return null;
    }

    public final int hashCode() {
        int i = 0;
        int A032 = (C18180wK.A03(this.A05) + C18230wP.A05(this.A00)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((A032 + i) * 31) + this.A03) * 31) + this.A01) * 31) + this.A02;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        parcel.writeString(this.A05);
        Long l = this.A00;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }

    public VideoUrlImpl(Parcel parcel) {
        Long l;
        this.A05 = parcel.readString();
        long readLong = parcel.readLong();
        if (readLong != -1) {
            l = Long.valueOf(readLong);
        } else {
            l = null;
        }
        this.A00 = l;
        this.A04 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public VideoUrlImpl(String str, int i, int i2, int i3, String str2) {
        if (str != null) {
            this.A05 = str;
            this.A04 = str2;
            this.A03 = i;
            this.A01 = i2;
            this.A02 = i3;
            return;
        }
        throw C18250wR.A0V("trying to created a VideoUrl object with null url");
    }
}
