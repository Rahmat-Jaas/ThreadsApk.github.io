package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.internal.zzby;
import com.google.android.play.core.internal.zzca;
import com.google.android.play.core.splitinstall.zzbc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.83L  reason: invalid class name */
public abstract class AnonymousClass83L implements Runnable {
    public final C111836oV A00;

    public AnonymousClass83L() {
        this.A00 = null;
    }

    public AnonymousClass83L(C111836oV r1) {
        this.A00 = r1;
    }

    public final void run() {
        List<AnonymousClass83L> list;
        IInterface iInterface;
        Parcel obtain;
        int A03;
        try {
            if (this instanceof AnonymousClass5r0) {
                AnonymousClass5r0 r4 = (AnonymousClass5r0) this;
                try {
                    AnonymousClass75s r6 = r4.A00;
                    zzca zzca = (zzca) r6.A00.A01;
                    String str = r6.A01;
                    List list2 = r4.A02;
                    ArrayList A0k = C18240wQ.A0k(list2.size());
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String A0k2 = C18180wK.A0k(it);
                        Bundle A06 = C18180wK.A06();
                        A06.putString("module_name", A0k2);
                        A0k.add(A06);
                    }
                    Bundle A062 = C18180wK.A06();
                    A062.putInt("playcore_version_code", 11003);
                    zzbc zzbc = new zzbc(r6, r4.A01);
                    zzby zzby = (zzby) zzca;
                    int A032 = C14030oh.A03(981688771);
                    int A033 = C14030oh.A03(-98290276);
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
                    C14030oh.A0A(1463886487, A033);
                    obtain.writeString(str);
                    obtain.writeTypedList(A0k);
                    obtain.writeInt(1);
                    A062.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(zzbc);
                    A03 = C14030oh.A03(21590939);
                    zzby.A00.transact(7, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    C14030oh.A0A(-726091533, A03);
                    C14030oh.A0A(531372807, A032);
                } catch (RemoteException e) {
                    AnonymousClass78d r5 = AnonymousClass75s.A02;
                    Object[] objArr = {r4.A02};
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", AnonymousClass78d.A00(r5.A00, "deferredUninstall(%s)", objArr), e);
                    }
                    r4.A01.A00(C86114wI.A0k(e));
                } catch (Throwable th) {
                    obtain.recycle();
                    C14030oh.A0A(-2013408188, A03);
                    throw th;
                }
            } else if (this instanceof C93715qx) {
                C121087Eb r42 = ((C93715qx) this).A00.A00;
                r42.A06.A01("unlinkToDeath", new Object[0]);
                r42.A01.asBinder().unlinkToDeath(r42.A05, 0);
                r42.A01 = null;
                r42.A02 = false;
            } else {
                if (this instanceof C93735qz) {
                    C93735qz r43 = (C93735qz) this;
                    C121087Eb r62 = r43.A01.A00;
                    IBinder iBinder = r43.A00;
                    if (iBinder == null) {
                        iInterface = null;
                    } else {
                        iInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
                        if (!(iInterface instanceof zzca)) {
                            iInterface = new zzby(iBinder);
                        }
                    }
                    r62.A01 = iInterface;
                    AnonymousClass78d r7 = r62.A06;
                    r7.A01("linkToDeath", new Object[0]);
                    try {
                        r62.A01.asBinder().linkToDeath(r62.A05, 0);
                    } catch (RemoteException e2) {
                        Object[] objArr2 = new Object[0];
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", AnonymousClass78d.A00(r7.A00, "linkToDeath failed", objArr2), e2);
                        }
                    }
                    r62.A02 = false;
                    list = r62.A0B;
                    for (Runnable run : list) {
                        run.run();
                    }
                } else if (this instanceof C93705qw) {
                    C121087Eb r44 = ((C93705qw) this).A00;
                    if (r44.A01 != null) {
                        r44.A06.A01("Unbind from service.", new Object[0]);
                        r44.A03.unbindService(r44.A00);
                        r44.A02 = false;
                        r44.A01 = null;
                        r44.A00 = null;
                    }
                    C121087Eb.A00(r44);
                    return;
                } else {
                    C93725qy r45 = (C93725qy) this;
                    C121087Eb r52 = r45.A01;
                    AnonymousClass83L r3 = r45.A00;
                    if (r52.A01 == null && !r52.A02) {
                        AnonymousClass78d r46 = r52.A06;
                        r46.A01("Initiate binding to the service.", new Object[0]);
                        list = r52.A0B;
                        list.add(r3);
                        C122247Lt r32 = new C122247Lt(r52);
                        r52.A00 = r32;
                        r52.A02 = true;
                        if (!r52.A03.bindService(r52.A04, r32, 1)) {
                            r46.A01("Failed to bind to the service.", new Object[0]);
                            r52.A02 = false;
                            for (AnonymousClass83L r0 : list) {
                                AnonymousClass88P r1 = new AnonymousClass88P();
                                C111836oV r02 = r0.A00;
                                if (r02 != null) {
                                    r02.A00(r1);
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (r52.A02) {
                        r52.A06.A01("Waiting to bind to the service.", new Object[0]);
                        r52.A0B.add(r3);
                        return;
                    } else {
                        r3.run();
                        return;
                    }
                }
                list.clear();
            }
        } catch (Exception e3) {
            C111836oV r03 = this.A00;
            if (r03 != null) {
                r03.A00(e3);
            }
        }
    }
}
