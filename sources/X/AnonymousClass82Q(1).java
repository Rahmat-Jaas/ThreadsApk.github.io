package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.dependencies.g;
import com.google.ar.core.p;

/* renamed from: X.82Q  reason: invalid class name */
public final class AnonymousClass82Q implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1196476g A01;
    public final /* synthetic */ C111846oW A02;

    public AnonymousClass82Q(Context context, C111846oW r2, C1196476g r3) {
        this.A01 = r3;
        this.A00 = context;
        this.A02 = r2;
    }

    public final void run() {
        Parcel A002;
        int A03;
        try {
            g gVar = this.A01.A01;
            String str = this.A00.getApplicationInfo().packageName;
            Bundle A06 = C18180wK.A06();
            A06.putCharSequence("package.name", "com.google.ar.core");
            p pVar = new p(this);
            int A032 = C14030oh.A03(-312996529);
            A002 = gVar.A00();
            A002.writeString(str);
            A002.writeInt(1);
            A06.writeToParcel(A002, 0);
            C86134wK.A16(pVar, A002);
            A03 = C14030oh.A03(-1424152465);
            gVar.A00.transact(2, A002, (Parcel) null, 1);
            A002.recycle();
            C14030oh.A0A(840700697, A03);
            C14030oh.A0A(-877390250, A032);
        } catch (RemoteException e) {
            Log.e("ARCore-InstallService", "requestInfo threw", e);
            this.A02.A00(C972668r.A06);
        } catch (Throwable th) {
            A002.recycle();
            C14030oh.A0A(-26650147, A03);
            throw th;
        }
    }
}
