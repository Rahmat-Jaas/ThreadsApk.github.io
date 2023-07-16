package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.s;
import com.google.android.play.integrity.internal.f;
import com.google.android.play.integrity.internal.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.83O  reason: invalid class name */
public abstract class AnonymousClass83O implements Runnable {
    public final C113426rN A00;

    public AnonymousClass83O() {
        this.A00 = null;
    }

    public AnonymousClass83O(C113426rN r1) {
        this.A00 = r1;
    }

    public final void run() {
        List<AnonymousClass83O> list;
        Parcel obtain;
        int A03;
        IInterface iInterface;
        try {
            if (this instanceof AnonymousClass5rC) {
                AnonymousClass7EO r4 = ((AnonymousClass5rC) this).A00.A00;
                r4.A06.A01("unlinkToDeath", new Object[0]);
                r4.A01.asBinder().unlinkToDeath(r4.A05, 0);
                r4.A01 = null;
                r4.A02 = false;
                return;
            }
            if (this instanceof AnonymousClass5rE) {
                AnonymousClass5rE r6 = (AnonymousClass5rE) this;
                AnonymousClass7EO r5 = r6.A01.A00;
                IBinder iBinder = r6.A00;
                if (iBinder == null) {
                    iInterface = null;
                } else {
                    iInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (!(iInterface instanceof h)) {
                        iInterface = new f(iBinder);
                    }
                }
                r5.A01 = iInterface;
                AnonymousClass77Q r7 = r5.A06;
                r7.A01("linkToDeath", new Object[0]);
                try {
                    r5.A01.asBinder().linkToDeath(r5.A05, 0);
                } catch (RemoteException e) {
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", AnonymousClass77Q.A00(r7.A00, "linkToDeath failed", objArr), e);
                    }
                }
                r5.A02 = false;
                list = r5.A09;
                for (Runnable run : list) {
                    run.run();
                }
            } else if (this instanceof AnonymousClass5rB) {
                AnonymousClass7EO r42 = ((AnonymousClass5rB) this).A00;
                if (r42.A01 != null) {
                    r42.A06.A01("Unbind from service.", new Object[0]);
                    r42.A03.unbindService(r42.A00);
                    r42.A02 = false;
                    r42.A01 = null;
                    r42.A00 = null;
                }
                AnonymousClass7EO.A00(r42);
                return;
            } else if (this instanceof AnonymousClass5rD) {
                AnonymousClass5rD r62 = (AnonymousClass5rD) this;
                AnonymousClass7EO r43 = r62.A01;
                AnonymousClass83O r3 = r62.A00;
                if (r43.A01 == null && !r43.A02) {
                    AnonymousClass77Q r52 = r43.A06;
                    r52.A01("Initiate binding to the service.", new Object[0]);
                    list = r43.A09;
                    list.add(r3);
                    C122257Lu r32 = new C122257Lu(r43);
                    r43.A00 = r32;
                    r43.A02 = true;
                    if (!r43.A03.bindService(r43.A04, r32, 1)) {
                        r52.A01("Failed to bind to the service.", new Object[0]);
                        r43.A02 = false;
                        for (AnonymousClass83O A002 : list) {
                            A002.A00(new AnonymousClass88Q());
                        }
                    } else {
                        return;
                    }
                } else if (r43.A02) {
                    r43.A06.A01("Waiting to bind to the service.", new Object[0]);
                    r43.A09.add(r3);
                    return;
                } else {
                    r3.run();
                    return;
                }
            } else {
                AnonymousClass5rF r63 = (AnonymousClass5rF) this;
                try {
                    C108996jI r53 = r63.A02;
                    IInterface iInterface2 = r53.A01.A01;
                    byte[] bArr = r63.A03;
                    Bundle A06 = C18180wK.A06();
                    A06.putString("package.name", r53.A02);
                    A06.putByteArray("nonce", bArr);
                    A06.putInt("playcore.integrity.version.major", 1);
                    A06.putInt("playcore.integrity.version.minor", 1);
                    A06.putInt("playcore.integrity.version.patch", 0);
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    A0v.add(new AnonymousClass5r9(System.currentTimeMillis()));
                    ArrayList A0v2 = AnonymousClass0wJ.A0v();
                    Iterator it = A0v.iterator();
                    while (it.hasNext()) {
                        Bundle A062 = C18180wK.A06();
                        A062.putInt("event_type", 3);
                        A062.putLong("event_timestamp", ((AnonymousClass5r9) ((AnonymousClass6JF) it.next())).A00);
                        A0v2.add(A062);
                    }
                    A06.putParcelableArrayList("event_timestamps", C18200wM.A0s(A0v2));
                    s sVar = new s(r63.A00, r53);
                    f fVar = (f) iInterface2;
                    int A032 = C14030oh.A03(-1142241991);
                    int A033 = C14030oh.A03(495236924);
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    C14030oh.A0A(-1299367711, A033);
                    obtain.writeInt(1);
                    A06.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(sVar);
                    A03 = C14030oh.A03(581613889);
                    fVar.A00.transact(2, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    C14030oh.A0A(-2122573271, A03);
                    C14030oh.A0A(-1909476450, A032);
                    return;
                } catch (RemoteException e2) {
                    AnonymousClass77Q r44 = r63.A02.A00;
                    Object[] objArr2 = {r63.A01};
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", AnonymousClass77Q.A00(r44.A00, "requestIntegrityToken(%s)", objArr2), e2);
                    }
                    r63.A00.A00(new C93195lA(-100, e2));
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    C14030oh.A0A(-1965590401, A03);
                    throw th;
                }
            }
            list.clear();
        } catch (Exception e3) {
            A00(e3);
        }
    }

    public void A00(Exception exc) {
        C113426rN r0 = this.A00;
        if (r0 != null) {
            r0.A00(exc);
        }
    }
}
