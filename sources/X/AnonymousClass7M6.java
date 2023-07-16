package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7M6  reason: invalid class name */
public final class AnonymousClass7M6 implements ServiceConnection, AnonymousClass8eL {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final AnonymousClass7Em A04;
    public final Map A05 = AnonymousClass0wJ.A0y();
    public final /* synthetic */ AnonymousClass7H7 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r10 != null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r16) {
        /*
            r15 = this;
            r0 = 3
            r11 = r15
            r15.A00 = r0
            X.7H7 r2 = r15.A06
            X.7Gs r12 = r2.A01
            android.content.Context r9 = r2.A00
            X.7Em r3 = r15.A04
            java.lang.String r5 = "ConnectionStatusConfig"
            java.lang.String r4 = r3.A01
            if (r4 == 0) goto L_0x0039
            boolean r0 = r3.A03
            r8 = 0
            if (r0 == 0) goto L_0x005f
            android.os.Bundle r7 = X.C18180wK.A06()
            java.lang.String r0 = "serviceActionBundleKey"
            r7.putString(r0, r4)
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0044 }
            android.net.Uri r1 = X.AnonymousClass7Em.A04     // Catch:{ IllegalArgumentException -> 0x0044 }
            java.lang.String r0 = "serviceIntentCall"
            android.os.Bundle r1 = r6.call(r1, r0, r8, r7)     // Catch:{ IllegalArgumentException -> 0x0044 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r10 = r1.getParcelable(r0)
            android.content.Intent r10 = (android.content.Intent) r10
            if (r10 != 0) goto L_0x0069
            goto L_0x0052
        L_0x0039:
            android.content.Intent r1 = X.C18230wP.A0B()
            android.content.ComponentName r0 = r3.A00
            android.content.Intent r10 = r1.setComponent(r0)
            goto L_0x0069
        L_0x0044:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "Dynamic intent resolution failed: "
            java.lang.String r0 = r0.concat(r1)
            android.util.Log.w(r5, r0)
        L_0x0052:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            java.lang.String r0 = X.C86114wI.A0p(r1, r0)
            android.util.Log.w(r5, r0)
        L_0x005f:
            android.content.Intent r1 = X.C18250wR.A05(r4)
            java.lang.String r0 = r3.A02
            android.content.Intent r10 = r1.setPackage(r0)
        L_0x0069:
            r14 = 4225(0x1081, float:5.92E-42)
            r1 = 1
            r13 = r16
            boolean r0 = X.AnonymousClass7Gs.A01(r9, r10, r11, r12, r13, r14)
            r15.A03 = r0
            if (r0 == 0) goto L_0x0085
            android.os.Handler r0 = r2.A04
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            android.os.Handler r2 = r2.A04
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)
            return
        L_0x0085:
            r0 = 2
            r15.A00 = r0
            r12.A02(r9, r15)     // Catch:{ IllegalArgumentException -> 0x008b }
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M6.A00(java.lang.String):void");
    }

    public AnonymousClass7M6(AnonymousClass7Em r2, AnonymousClass7H7 r3) {
        this.A06 = r3;
        this.A04 = r2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AnonymousClass7H7 r0 = this.A06;
        synchronized (r0.A02) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator A14 = C86104wH.A14(this.A05);
            while (A14.hasNext()) {
                ((ServiceConnection) A14.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass7H7 r0 = this.A06;
        synchronized (r0.A02) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator A14 = C86104wH.A14(this.A05);
            while (A14.hasNext()) {
                ((ServiceConnection) A14.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
