package androidx.room;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C14030oh;
import X.C18220wO;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

public interface IMultiInstanceInvalidationService extends IInterface {

    public abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        public Stub() {
            int A03 = C14030oh.A03(-534289645);
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
            C14030oh.A0A(-2061017608, A03);
        }

        public final IBinder asBinder() {
            C14030oh.A0A(1698239304, C14030oh.A03(-1788130953));
            return this;
        }

        /* JADX INFO: finally extract failed */
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            IInterface queryLocalInterface;
            int i4;
            IInterface queryLocalInterface2;
            int i5;
            int A03;
            Parcel obtain;
            int A032 = C14030oh.A03(1241636157);
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel3.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (i == 1) {
                        IBinder readStrongBinder = parcel3.readStrongBinder();
                        if (readStrongBinder == null) {
                            queryLocalInterface = null;
                        } else {
                            queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                                queryLocalInterface = new IMultiInstanceInvalidationCallback$Stub$Proxy(readStrongBinder);
                            }
                        }
                        String readString = parcel3.readString();
                        MultiInstanceInvalidationService$binder$1 multiInstanceInvalidationService$binder$1 = (MultiInstanceInvalidationService$binder$1) this;
                        int A00 = AnonymousClass0wJ.A00(1756970826, queryLocalInterface);
                        int i6 = 0;
                        if (readString == null) {
                            i4 = 557018806;
                        } else {
                            MultiInstanceInvalidationService multiInstanceInvalidationService = multiInstanceInvalidationService$binder$1.A00;
                            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
                            synchronized (remoteCallbackList) {
                                try {
                                    int i7 = multiInstanceInvalidationService.A00 + 1;
                                    multiInstanceInvalidationService.A00 = i7;
                                    Integer valueOf = Integer.valueOf(i7);
                                    if (remoteCallbackList.register(queryLocalInterface, valueOf)) {
                                        multiInstanceInvalidationService.A02.put(valueOf, readString);
                                        i6 = i7;
                                    } else {
                                        multiInstanceInvalidationService.A00--;
                                    }
                                } catch (Throwable th) {
                                    C14030oh.A0A(935918832, A00);
                                    throw th;
                                }
                            }
                            i4 = 37833664;
                        }
                        C14030oh.A0A(i4, A00);
                        parcel4.writeNoException();
                        parcel4.writeInt(i6);
                    } else if (i == 2) {
                        IBinder readStrongBinder2 = parcel3.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            queryLocalInterface2 = null;
                        } else {
                            queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                                queryLocalInterface2 = new IMultiInstanceInvalidationCallback$Stub$Proxy(readStrongBinder2);
                            }
                        }
                        int readInt = parcel3.readInt();
                        int A002 = AnonymousClass0wJ.A00(685382538, queryLocalInterface2);
                        MultiInstanceInvalidationService multiInstanceInvalidationService2 = ((MultiInstanceInvalidationService$binder$1) this).A00;
                        RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.A01;
                        synchronized (remoteCallbackList2) {
                            try {
                                remoteCallbackList2.unregister(queryLocalInterface2);
                                multiInstanceInvalidationService2.A02.remove(Integer.valueOf(readInt));
                            } catch (Throwable th2) {
                                C14030oh.A0A(273753889, A002);
                                throw th2;
                            }
                        }
                        C14030oh.A0A(1519209530, A002);
                        parcel4.writeNoException();
                    } else if (i == 3) {
                        int readInt2 = parcel3.readInt();
                        String[] createStringArray = parcel3.createStringArray();
                        int A033 = C14030oh.A03(-140073984);
                        C04220Ms.A0B(createStringArray, 1);
                        MultiInstanceInvalidationService multiInstanceInvalidationService3 = ((MultiInstanceInvalidationService$binder$1) this).A00;
                        RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.A01;
                        synchronized (remoteCallbackList3) {
                            try {
                                Map map = multiInstanceInvalidationService3.A02;
                                String A0r = C18220wO.A0r(Integer.valueOf(readInt2), map);
                                if (A0r == null) {
                                    Log.w("ROOM", "Remote invalidation client ID not registered");
                                    i5 = -1045868061;
                                } else {
                                    int beginBroadcast = remoteCallbackList3.beginBroadcast();
                                    int i8 = 0;
                                    while (i8 < beginBroadcast) {
                                        try {
                                            Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i8);
                                            C04220Ms.A0C(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                            int intValue = ((Integer) broadcastCookie).intValue();
                                            String A0r2 = C18220wO.A0r(Integer.valueOf(intValue), map);
                                            if (readInt2 != intValue && A0r.equals(A0r2)) {
                                                try {
                                                    IMultiInstanceInvalidationCallback$Stub$Proxy iMultiInstanceInvalidationCallback$Stub$Proxy = (IMultiInstanceInvalidationCallback$Stub$Proxy) ((IMultiInstanceInvalidationCallback) remoteCallbackList3.getBroadcastItem(i8));
                                                    A03 = C14030oh.A03(1388715494);
                                                    obtain = Parcel.obtain();
                                                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                                    obtain.writeStringArray(createStringArray);
                                                    iMultiInstanceInvalidationCallback$Stub$Proxy.A00.transact(1, obtain, (Parcel) null, 1);
                                                    obtain.recycle();
                                                    C14030oh.A0A(1465223271, A03);
                                                } catch (RemoteException e) {
                                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                                } catch (Throwable th3) {
                                                    obtain.recycle();
                                                    C14030oh.A0A(-1710716750, A03);
                                                    throw th3;
                                                }
                                            }
                                            i8++;
                                        } catch (Throwable th4) {
                                            remoteCallbackList3.finishBroadcast();
                                            C14030oh.A0A(396209090, A033);
                                            throw th4;
                                        }
                                    }
                                    remoteCallbackList3.finishBroadcast();
                                    i5 = 236870985;
                                }
                            } catch (Throwable th5) {
                                C14030oh.A0A(1899608479, A033);
                                throw th5;
                            }
                        }
                        C14030oh.A0A(i5, A033);
                    }
                    i3 = 1261623556;
                } else if (i == 1598968902) {
                    parcel4.writeString("androidx.room.IMultiInstanceInvalidationService");
                    i3 = -238232284;
                }
                C14030oh.A0A(i3, A032);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel3, parcel4, i2);
            C14030oh.A0A(-1270099336, A032);
            return onTransact;
        }
    }
}
