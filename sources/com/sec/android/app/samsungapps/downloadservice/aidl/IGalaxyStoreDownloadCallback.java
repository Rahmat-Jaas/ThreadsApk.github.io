package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.C14030oh;
import X.C86154wM;
import X.C86164wN;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IGalaxyStoreDownloadCallback extends IInterface {

    public abstract class Stub extends Binder implements IGalaxyStoreDownloadCallback {

        public final class Proxy implements IGalaxyStoreDownloadCallback {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(486272370);
                this.A00 = iBinder;
                C14030oh.A0A(606119398, A03);
            }

            public final void Bwi(String str, int i) {
                int A03 = C14030oh.A03(1262266218);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    C86154wM.A1F(this.A00, obtain, 2);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(1793551453, A03);
                }
            }

            public final void CDU(String str, long j, float f) {
                int A03 = C14030oh.A03(-1116893604);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    C86154wM.A1F(this.A00, obtain, 3);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(609468397, A03);
                }
            }

            public final void CMF(String str, int i, String str2) {
                int A03 = C14030oh.A03(1513386760);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C86164wN.A18(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-103999645, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(-1284916534);
                IBinder iBinder = this.A00;
                C14030oh.A0A(-1826486074, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(1964293957);
            attachInterface(this, "com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            C14030oh.A0A(1552819372, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(485096436, C14030oh.A03(-1077808869));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C14030oh.A03(-509569779);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                    if (i == 1) {
                        CMF(parcel.readString(), parcel.readInt(), parcel.readString());
                    } else if (i == 2) {
                        Bwi(parcel.readString(), parcel.readInt());
                    } else if (i == 3) {
                        CDU(parcel.readString(), parcel.readLong(), parcel.readFloat());
                    }
                    i3 = -461081625;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                    i3 = -1435321624;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(-1117603650, A03);
            return onTransact;
        }
    }

    void Bwi(String str, int i);

    void CDU(String str, long j, float f);

    void CMF(String str, int i, String str2);
}
