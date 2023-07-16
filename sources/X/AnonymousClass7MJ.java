package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel$Stub$Proxy;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7MJ  reason: invalid class name */
public final class AnonymousClass7MJ implements Handler.Callback, ServiceConnection {
    public Set A00 = C18200wM.A0u();
    public final Context A01;
    public final Handler A02;
    public final Map A03 = AnonymousClass0wJ.A0y();
    public final HandlerThread A04;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r12.A03 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.C110246lM r12) {
        /*
            r11 = this;
            java.lang.String r3 = "NotifManCompat"
            r5 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L_0x000e
            java.util.ArrayDeque r0 = r12.A02
            r0.size()
        L_0x000e:
            java.util.ArrayDeque r4 = r12.A02
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x007c
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = X.C18250wR.A05(r0)
            android.content.ComponentName r6 = r12.A04
            android.content.Intent r2 = r0.setComponent(r6)
            android.content.Context r1 = r11.A01
            r0 = 33
            boolean r0 = r1.bindService(r2, r11, r0)
            r12.A03 = r0
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            r12.A00 = r0
        L_0x0035:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x003d
        L_0x0039:
            android.support.v4.app.INotificationSideChannel r0 = r12.A01
            if (r0 != 0) goto L_0x007d
        L_0x003d:
            android.os.Handler r7 = r11.A02
            android.content.ComponentName r6 = r12.A04
            boolean r0 = r7.hasMessages(r5, r6)
            if (r0 != 0) goto L_0x007c
            int r0 = r12.A00
            r2 = 1
            int r1 = r0 + 1
            r12.A00 = r1
            r0 = 6
            if (r1 <= r0) goto L_0x00ff
            java.lang.String r0 = "Giving up on delivering "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = " tasks to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " after "
            r1.append(r0)
            int r0 = r12.A00
            r1.append(r0)
            java.lang.String r0 = " retries"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            android.util.Log.w(r3, r0)
            r4.clear()
        L_0x007c:
            return
        L_0x007d:
            java.lang.Object r0 = r4.peek()
            X.8dJ r0 = (X.C141858dJ) r0
            if (r0 == 0) goto L_0x00e9
            android.util.Log.isLoggable(r3, r5)     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            android.support.v4.app.INotificationSideChannel r10 = r12.A01     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            X.7ZQ r0 = (X.AnonymousClass7ZQ) r0     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            java.lang.String r9 = r0.A02     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            int r8 = r0.A00     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            java.lang.String r2 = r0.A03     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            android.app.Notification r1 = r0.A01     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            android.support.v4.app.INotificationSideChannel$Stub$Proxy r10 = (android.support.v4.app.INotificationSideChannel$Stub$Proxy) r10     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            r0 = -2076004475(0xffffffff8442af85, float:-2.2885185E-36)
            int r7 = X.C14030oh.A03(r0)     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            java.lang.String r0 = android.support.v4.app.INotificationSideChannel.A00     // Catch:{ all -> 0x00ca }
            r6.writeInterfaceToken(r0)     // Catch:{ all -> 0x00ca }
            r6.writeString(r9)     // Catch:{ all -> 0x00ca }
            r6.writeInt(r8)     // Catch:{ all -> 0x00ca }
            r6.writeString(r2)     // Catch:{ all -> 0x00ca }
            r0 = 0
            r2 = 1
            r6.writeInt(r2)     // Catch:{ all -> 0x00ca }
            r1.writeToParcel(r6, r0)     // Catch:{ all -> 0x00ca }
            android.os.IBinder r1 = r10.A00     // Catch:{ all -> 0x00ca }
            r0 = 0
            r1.transact(r2, r6, r0, r2)     // Catch:{ all -> 0x00ca }
            r6.recycle()     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            r0 = -969527797(0xffffffffc6362e0b, float:-11659.511)
            X.C14030oh.A0A(r0, r7)     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            r4.remove()     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            goto L_0x007d
        L_0x00ca:
            r1 = move-exception
            r6.recycle()     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            r0 = 1140712066(0x43fde282, float:507.7696)
            X.C14030oh.A0A(r0, r7)     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
            throw r1     // Catch:{ DeadObjectException -> 0x00d5, RemoteException -> 0x00d9 }
        L_0x00d5:
            android.util.Log.isLoggable(r3, r5)
            goto L_0x00e9
        L_0x00d9:
            r2 = move-exception
            java.lang.String r0 = "RemoteException communicating with "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            android.content.ComponentName r0 = r12.A04
            java.lang.String r0 = X.C18200wM.A0m(r0, r1)
            android.util.Log.w(r3, r0, r2)
        L_0x00e9:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x007c
            goto L_0x003d
        L_0x00f1:
            java.lang.String r0 = "Unable to bind to listener "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r6)
            android.util.Log.w(r3, r0)
            r1.unbindService(r11)
            goto L_0x0035
        L_0x00ff:
            int r1 = r1 - r2
            int r2 = r2 << r1
            int r0 = r2 * 1000
            android.util.Log.isLoggable(r3, r5)
            android.os.Message r2 = r7.obtainMessage(r5, r6)
            long r0 = (long) r0
            r7.sendMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7MJ.A00(X.6lM):void");
    }

    public final boolean handleMessage(Message message) {
        Set set;
        C110246lM r3;
        INotificationSideChannel iNotificationSideChannel$Stub$Proxy;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                C106896fo r0 = (C106896fo) message.obj;
                ComponentName componentName = r0.A00;
                IBinder iBinder = r0.A01;
                r3 = (C110246lM) this.A03.get(componentName);
                if (r3 == null) {
                    return true;
                }
                if (iBinder == null) {
                    iNotificationSideChannel$Stub$Proxy = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.A00);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                        iNotificationSideChannel$Stub$Proxy = new INotificationSideChannel$Stub$Proxy(iBinder);
                    } else {
                        iNotificationSideChannel$Stub$Proxy = (INotificationSideChannel) queryLocalInterface;
                    }
                }
                r3.A01 = iNotificationSideChannel$Stub$Proxy;
                r3.A00 = 0;
            } else if (i == 2) {
                C110246lM r1 = (C110246lM) this.A03.get(message.obj);
                if (r1 == null) {
                    return true;
                }
                if (r1.A03) {
                    this.A01.unbindService(this);
                    r1.A03 = false;
                }
                r1.A01 = null;
                return true;
            } else if (i != 3) {
                return false;
            } else {
                r3 = (C110246lM) this.A03.get(message.obj);
                if (r3 == null) {
                    return true;
                }
            }
            A00(r3);
            return true;
        }
        Object obj = message.obj;
        Context context = this.A01;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (AnonymousClass7EV.A05) {
            if (string != null) {
                if (!string.equals(AnonymousClass7EV.A03)) {
                    HashSet hashSet = new HashSet(r3);
                    for (String unflattenFromString : string.split(":", -1)) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    AnonymousClass7EV.A04 = hashSet;
                    AnonymousClass7EV.A03 = string;
                }
            }
            set = AnonymousClass7EV.A04;
        }
        if (!set.equals(this.A00)) {
            this.A00 = set;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(C18230wP.A0B().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet A0u = C18200wM.A0u();
            for (ResolveInfo next : queryIntentServices) {
                if (set.contains(next.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = next.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (next.serviceInfo.permission != null) {
                        StringBuilder A0s = C18190wL.A0s("Permission present on component ");
                        A0s.append(componentName2);
                        Log.w("NotifManCompat", C18180wK.A0i(", not adding listener record.", A0s));
                    } else {
                        A0u.add(componentName2);
                    }
                }
            }
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                Map map = this.A03;
                if (!map.containsKey(componentName3)) {
                    Log.isLoggable("NotifManCompat", 3);
                    map.put(componentName3, new C110246lM(componentName3));
                }
            }
            Iterator A0z = AnonymousClass0wJ.A0z(this.A03);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                if (!A0u.contains(A0o.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        A0o.getKey();
                    }
                    C110246lM r12 = (C110246lM) A0o.getValue();
                    if (r12.A03) {
                        context.unbindService(this);
                        r12.A03 = false;
                    }
                    r12.A01 = null;
                    A0z.remove();
                }
            }
        }
        Iterator A14 = C86104wH.A14(this.A03);
        while (A14.hasNext()) {
            C110246lM r13 = (C110246lM) A14.next();
            r13.A02.add(obj);
            A00(r13);
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("NotifManCompat", 3);
        this.A02.obtainMessage(1, new C106896fo(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("NotifManCompat", 3);
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }

    public AnonymousClass7MJ(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        C13820oM.A00(handlerThread);
        this.A04 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(handlerThread.getLooper(), this);
    }
}
