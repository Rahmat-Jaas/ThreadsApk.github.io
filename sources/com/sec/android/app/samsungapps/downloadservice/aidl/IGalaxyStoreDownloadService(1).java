package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.C14030oh;
import X.C86104wH;
import X.C86114wI;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;

public interface IGalaxyStoreDownloadService extends IInterface {

    public abstract class Stub extends Binder implements IGalaxyStoreDownloadService {

        public final class Proxy implements IGalaxyStoreDownloadService {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(-995180281);
                this.A00 = iBinder;
                C14030oh.A0A(-2134208954, A03);
            }

            public final void ACD(String str) {
                int A03 = C14030oh.A03(1126411774);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                    obtain.writeString(str);
                    C86104wH.A19(this.A00, obtain, obtain2, 2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-380424201, A03);
                }
            }

            public final void AIa(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
                int A03 = C14030oh.A03(-1433854231);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                    if (bundle != null) {
                        C86114wI.A12(obtain, bundle, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(iGalaxyStoreDownloadCallback);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-733732898, A03);
                }
            }

            public final void BPQ(Bundle bundle) {
                int A03 = C14030oh.A03(-1804808989);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                    if (bundle != null) {
                        C86114wI.A12(obtain, bundle, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.A00.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    C14030oh.A0A(-1816901655, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(2113744178);
                IBinder iBinder = this.A00;
                C14030oh.A0A(1009501896, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C14030oh.A03(-76534373);
            attachInterface(this, "com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            C14030oh.A0A(566013934, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(911817834, C14030oh.A03(1129977348));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            IGalaxyStoreDownloadCallback proxy;
            int A03 = C14030oh.A03(-316135644);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                    if (i == 1) {
                        Bundle bundle = (Bundle) C86114wI.A0d(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            proxy = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGalaxyStoreDownloadCallback)) {
                                proxy = new IGalaxyStoreDownloadCallback.Stub.Proxy(readStrongBinder);
                            } else {
                                proxy = (IGalaxyStoreDownloadCallback) queryLocalInterface;
                            }
                        }
                        AIa(bundle, proxy);
                    } else if (i == 2) {
                        ACD(parcel.readString());
                    } else if (i == 3) {
                        BPQ((Bundle) C86114wI.A0d(parcel, Bundle.CREATOR));
                    }
                    parcel2.writeNoException();
                    i3 = -1060520117;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                    i3 = 1440508335;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(449848808, A03);
            return onTransact;
        }
    }

    void ACD(String str);

    void AIa(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback);

    void BPQ(Bundle bundle);
}
