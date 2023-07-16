package com.fbpay.w3c;

import X.C14030oh;
import X.C86114wI;
import X.C86154wM;
import X.C86164wN;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.fbpay.w3c.FBPaymentServiceAddCardCallback;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.fbpay.w3c.FBPaymentServiceContactCallback;

public interface FBPaymentService extends IInterface {

    public abstract class Stub extends Binder implements FBPaymentService {

        public final class Proxy implements FBPaymentService {
            public IBinder A00;

            public Proxy(IBinder iBinder) {
                int A03 = C14030oh.A03(1394179736);
                this.A00 = iBinder;
                C14030oh.A0A(1561766818, A03);
            }

            public final void A5Z(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback) {
                int A03 = C14030oh.A03(-955696107);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
                    obtain.writeStrongInterface(fBPaymentServiceAddressCallback);
                    C86154wM.A1F(this.A00, obtain, 5);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-1973957525, A03);
                }
            }

            public final void A5k(CardDetails cardDetails, FBPaymentServiceAddCardCallback fBPaymentServiceAddCardCallback) {
                int A03 = C14030oh.A03(1970968573);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
                    if (cardDetails != null) {
                        C86114wI.A12(obtain, cardDetails, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(fBPaymentServiceAddCardCallback);
                    C86164wN.A18(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-1605456731, A03);
                }
            }

            public final void A5l(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback) {
                int A03 = C14030oh.A03(-59338796);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
                    obtain.writeStrongInterface(fBPaymentServiceCardDetailsCallback);
                    C86154wM.A1F(this.A00, obtain, 3);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-385348589, A03);
                }
            }

            public final void A5q(FBPaymentServiceContactCallback fBPaymentServiceContactCallback) {
                int A03 = C14030oh.A03(562771180);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
                    obtain.writeStrongInterface(fBPaymentServiceContactCallback);
                    C86154wM.A1F(this.A00, obtain, 4);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(-1841593028, A03);
                }
            }

            public final void CbZ(String str, FBPaymentServiceRemoveCardCallback$Stub$Proxy fBPaymentServiceRemoveCardCallback$Stub$Proxy) {
                int A03 = C14030oh.A03(-1988073246);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.fbpay.w3c.FBPaymentService");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(fBPaymentServiceRemoveCardCallback$Stub$Proxy);
                    C86154wM.A1F(this.A00, obtain, 2);
                } finally {
                    obtain.recycle();
                    C14030oh.A0A(1838090504, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = C14030oh.A03(1947392523);
                IBinder iBinder = this.A00;
                C14030oh.A0A(-472117834, A03);
                return iBinder;
            }
        }

        public static FBPaymentService A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.fbpay.w3c.FBPaymentService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof FBPaymentService)) {
                return new Proxy(iBinder);
            }
            return (FBPaymentService) queryLocalInterface;
        }

        public Stub() {
            int A03 = C14030oh.A03(1080421960);
            attachInterface(this, "com.fbpay.w3c.FBPaymentService");
            C14030oh.A0A(1959518567, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(-96941445, C14030oh.A03(-1508727806));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            FBPaymentServiceAddCardCallback proxy;
            FBPaymentServiceRemoveCardCallback$Stub$Proxy fBPaymentServiceRemoveCardCallback$Stub$Proxy;
            FBPaymentServiceCardDetailsCallback proxy2;
            FBPaymentServiceContactCallback proxy3;
            FBPaymentServiceAddressCallback proxy4;
            int A03 = C14030oh.A03(-188823690);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.fbpay.w3c.FBPaymentService");
                    if (i == 1) {
                        CardDetails cardDetails = (CardDetails) C86114wI.A0d(parcel, CardDetails.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            proxy = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.fbpay.w3c.FBPaymentServiceAddCardCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof FBPaymentServiceAddCardCallback)) {
                                proxy = new FBPaymentServiceAddCardCallback.Stub.Proxy(readStrongBinder);
                            } else {
                                proxy = (FBPaymentServiceAddCardCallback) queryLocalInterface;
                            }
                        }
                        A5k(cardDetails, proxy);
                    } else if (i == 2) {
                        String readString = parcel.readString();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            fBPaymentServiceRemoveCardCallback$Stub$Proxy = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.fbpay.w3c.FBPaymentServiceRemoveCardCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof FBPaymentServiceRemoveCardCallback$Stub$Proxy)) {
                                fBPaymentServiceRemoveCardCallback$Stub$Proxy = new FBPaymentServiceRemoveCardCallback$Stub$Proxy(readStrongBinder2);
                            } else {
                                fBPaymentServiceRemoveCardCallback$Stub$Proxy = (FBPaymentServiceRemoveCardCallback$Stub$Proxy) queryLocalInterface2;
                            }
                        }
                        CbZ(readString, fBPaymentServiceRemoveCardCallback$Stub$Proxy);
                    } else if (i == 3) {
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 == null) {
                            proxy2 = null;
                        } else {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.fbpay.w3c.FBPaymentServiceCardDetailsCallback");
                            if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof FBPaymentServiceCardDetailsCallback)) {
                                proxy2 = new FBPaymentServiceCardDetailsCallback.Stub.Proxy(readStrongBinder3);
                            } else {
                                proxy2 = (FBPaymentServiceCardDetailsCallback) queryLocalInterface3;
                            }
                        }
                        A5l(proxy2);
                    } else if (i == 4) {
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        if (readStrongBinder4 == null) {
                            proxy3 = null;
                        } else {
                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.fbpay.w3c.FBPaymentServiceContactCallback");
                            if (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof FBPaymentServiceContactCallback)) {
                                proxy3 = new FBPaymentServiceContactCallback.Stub.Proxy(readStrongBinder4);
                            } else {
                                proxy3 = (FBPaymentServiceContactCallback) queryLocalInterface4;
                            }
                        }
                        A5q(proxy3);
                    } else if (i == 5) {
                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                        if (readStrongBinder5 == null) {
                            proxy4 = null;
                        } else {
                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.fbpay.w3c.FBPaymentServiceAddressCallback");
                            if (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof FBPaymentServiceAddressCallback)) {
                                proxy4 = new FBPaymentServiceAddressCallback.Stub.Proxy(readStrongBinder5);
                            } else {
                                proxy4 = (FBPaymentServiceAddressCallback) queryLocalInterface5;
                            }
                        }
                        A5Z(proxy4);
                    }
                    i3 = -742914841;
                } else if (i == 1598968902) {
                    parcel2.writeString("com.fbpay.w3c.FBPaymentService");
                    i3 = 1493318019;
                }
                C14030oh.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C14030oh.A0A(1308785614, A03);
            return onTransact;
        }
    }

    void A5Z(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback);

    void A5k(CardDetails cardDetails, FBPaymentServiceAddCardCallback fBPaymentServiceAddCardCallback);

    void A5l(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback);

    void A5q(FBPaymentServiceContactCallback fBPaymentServiceContactCallback);

    void CbZ(String str, FBPaymentServiceRemoveCardCallback$Stub$Proxy fBPaymentServiceRemoveCardCallback$Stub$Proxy);
}
