package com.facebook.exoplayer.ipc;

import X.C18180wK;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ExoServiceVideoCacheAnalytics implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(67);
    public int A00;
    public Map[] A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        parcel.writeInt(i2);
        Map[] mapArr = this.A01;
        if (mapArr != null) {
            for (int i3 = 0; i3 < i2; i3++) {
                Map map = mapArr[i3];
                if (map != null) {
                    parcel.writeInt(map.size());
                    Iterator A0x = C18220wO.A0x(map);
                    while (A0x.hasNext()) {
                        String A0k = C18180wK.A0k(A0x);
                        parcel.writeString(A0k);
                        parcel.writeString(C18220wO.A0r(A0k, map));
                    }
                } else {
                    parcel.writeInt(0);
                }
            }
        }
    }

    public ExoServiceVideoCacheAnalytics(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A00 = readInt;
        this.A01 = new HashMap[readInt];
        for (int i = 0; i < this.A00; i++) {
            int readInt2 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            this.A01[i] = hashMap;
        }
    }

    public ExoServiceVideoCacheAnalytics() {
    }
}
