package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.AccessToken;

/* renamed from: X.3kN  reason: invalid class name and case insensitive filesystem */
public final class C64383kN implements ServiceConnection {
    public Messenger A00 = null;
    public C49232r3 A01;
    public final Messenger A02;
    public final /* synthetic */ AnonymousClass148 A03;

    public C64383kN(AccessToken accessToken, AnonymousClass148 r4, C49232r3 r5, String str) {
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = new Messenger(new C18600xS(accessToken, this, str));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        this.A00 = new Messenger(iBinder);
        Bundle A06 = C18180wK.A06();
        AnonymousClass148 r2 = this.A03;
        AccessToken accessToken = r2.A00;
        if (accessToken != null) {
            str = accessToken.A02;
        } else {
            str = null;
        }
        A06.putString("access_token", str);
        Message obtain = Message.obtain();
        obtain.setData(A06);
        obtain.replyTo = this.A02;
        try {
            this.A00.send(obtain);
        } catch (RemoteException unused) {
            if (r2.A01 == this) {
                r2.A01 = null;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass148 r1 = this.A03;
        if (r1.A01 == this) {
            r1.A01 = null;
        }
        try {
            C60943Re.A00.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }
}
