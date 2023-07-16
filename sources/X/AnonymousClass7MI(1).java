package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7MI  reason: invalid class name */
public final class AnonymousClass7MI implements Handler.Callback {
    public static AnonymousClass7MI A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = C86144wL.A0d();
    public long A00 = 10000;
    public C93505li A01 = null;
    public C148628ra A02;
    public boolean A03 = false;
    public TelemetryData A04;
    public final Context A05;
    public final Handler A06;
    public final GoogleApiAvailability A07;
    public final AnonymousClass77f A08;
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A0A = new C001000m(0);
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final Set A0D = new C001000m(0);
    public volatile boolean A0E = true;

    public static Status A00(ConnectionResult connectionResult, C113816sC r7) {
        String str = r7.A00.A02;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 63 + C86104wH.A0A(valueOf));
        A0s.append("API: ");
        A0s.append(str);
        A0s.append(" is not available on this device. Connection failed with: ");
        String A0i = C18180wK.A0i(valueOf, A0s);
        return new Status(connectionResult.A02, connectionResult, A0i, 1, 17);
    }

    public static AnonymousClass7MI A01(Context context) {
        AnonymousClass7MI r3;
        HandlerThread handlerThread;
        synchronized (A0I) {
            r3 = A0F;
            if (r3 == null) {
                synchronized (AnonymousClass7H7.A07) {
                    handlerThread = AnonymousClass7H7.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        AnonymousClass7H7.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = AnonymousClass7H7.A05;
                    }
                }
                r3 = new AnonymousClass7MI(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.A00);
                A0F = r3;
            }
        }
        return r3;
    }

    private final AnonymousClass7lO A02(C129167lR r4) {
        C113816sC r2 = r4.A06;
        Map map = this.A09;
        AnonymousClass7lO r1 = (AnonymousClass7lO) map.get(r2);
        if (r1 == null) {
            r1 = new AnonymousClass7lO(r4, this);
            map.put(r2, r1);
        }
        if (r1.A04.CeJ()) {
            this.A0D.add(r2);
        }
        r1.A09();
        return r1;
    }

    private final void A03() {
        TelemetryData telemetryData = this.A04;
        if (telemetryData != null) {
            if (telemetryData.A01 > 0 || A06()) {
                C148628ra r0 = this.A02;
                if (r0 == null) {
                    r0 = new C93265lH(this.A05, C129087lG.A00);
                    this.A02 = r0;
                }
                r0.Bb9(telemetryData);
            }
            this.A04 = null;
        }
    }

    public final void A05(C93505li r4) {
        synchronized (A0I) {
            if (this.A01 != r4) {
                this.A01 = r4;
                this.A0A.clear();
            }
            this.A0A.addAll(r4.A00);
        }
    }

    public final boolean A06() {
        if (this.A03) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = AnonymousClass7DN.A00().A00;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.A03) {
            return false;
        }
        int i = this.A08.A01.get(203400000, -1);
        if (i == -1 || i == 0) {
            return true;
        }
        return false;
    }

    public final boolean A07(ConnectionResult connectionResult, int i) {
        boolean z;
        PendingIntent pendingIntent;
        Intent A032;
        Boolean bool;
        GoogleApiAvailability googleApiAvailability = this.A07;
        Context context = this.A05;
        synchronized (C103426Zd.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = C103426Zd.A00;
            if (context2 == null || (bool = C103426Zd.A01) == null || context2 != applicationContext) {
                C103426Zd.A01 = null;
                z = applicationContext.getPackageManager().isInstantApp();
                C103426Zd.A01 = Boolean.valueOf(z);
                C103426Zd.A00 = applicationContext;
            } else {
                z = bool.booleanValue();
            }
        }
        if (z) {
            return false;
        }
        int i2 = connectionResult.A01;
        if ((i2 == 0 || (pendingIntent = connectionResult.A02) == null) && ((A032 = googleApiAvailability.A03(context, (String) null, i2)) == null || (pendingIntent = PendingIntent.getActivity(context, 0, A032, C102966Xg.A00 | 134217728)) == null)) {
            return false;
        }
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        googleApiAvailability.A06(PendingIntent.getActivity(context, 0, intent, C102956Xf.A00 | 134217728), context, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023f, code lost:
        if (r1.A02 != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0241, code lost:
        r1.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0244, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0391, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e7, code lost:
        r2.AI8(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ea, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            int r7 = r12.what
            r8 = 13
            r1 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "GoogleApiManager"
            r5 = 17
            r3 = 1
            r6 = 0
            switch(r7) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0020;
                case 3: goto L_0x0054;
                case 4: goto L_0x035d;
                case 5: goto L_0x0074;
                case 6: goto L_0x00e0;
                case 7: goto L_0x0130;
                case 8: goto L_0x035d;
                case 9: goto L_0x0224;
                case 10: goto L_0x0138;
                case 11: goto L_0x015a;
                case 12: goto L_0x01aa;
                case 13: goto L_0x035d;
                case 14: goto L_0x01ef;
                case 15: goto L_0x01f6;
                case 16: goto L_0x0245;
                case 17: goto L_0x02d7;
                case 18: goto L_0x02db;
                case 19: goto L_0x0398;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = 31
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Unknown message id: "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r7)
            android.util.Log.w(r4, r0)
            return r6
        L_0x0020:
            java.lang.String r0 = "zab"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0027:
            java.lang.Object r0 = r12.obj
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r3 != r0) goto L_0x0031
            r1 = 10000(0x2710, double:4.9407E-320)
        L_0x0031:
            r11.A00 = r1
            android.os.Handler r6 = r11.A06
            r5 = 12
            r6.removeMessages(r5)
            java.util.Map r0 = r11.A09
            java.util.Iterator r4 = X.C18220wO.A0x(r0)
        L_0x0040:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0391
            java.lang.Object r0 = r4.next()
            android.os.Message r2 = r6.obtainMessage(r5, r0)
            long r0 = r11.A00
            r6.sendMessageDelayed(r2, r0)
            goto L_0x0040
        L_0x0054:
            java.util.Map r0 = r11.A09
            java.util.Iterator r2 = X.C86104wH.A14(r0)
        L_0x005a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0391
            java.lang.Object r1 = r2.next()
            X.7lO r1 = (X.AnonymousClass7lO) r1
            X.7MI r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C13320nQ.A00(r0)
            r0 = 0
            r1.A01 = r0
            r1.A09()
            goto L_0x005a
        L_0x0074:
            int r7 = r12.arg1
            java.lang.Object r2 = r12.obj
            com.google.android.gms.common.ConnectionResult r2 = (com.google.android.gms.common.ConnectionResult) r2
            java.util.Map r0 = r11.A09
            java.util.Iterator r1 = X.C86104wH.A14(r0)
        L_0x0080:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r6 = r1.next()
            X.7lO r6 = (X.AnonymousClass7lO) r6
            int r0 = r6.A03
            if (r0 != r7) goto L_0x0080
            int r0 = r2.A01
            if (r0 != r8) goto L_0x00b9
            java.lang.String r4 = "CANCELED"
            java.lang.String r2 = r2.A03
            int r0 = X.C86104wH.A0A(r4)
            int r1 = X.C86104wH.A0A(r2)
            int r0 = r0 + 69
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Error resolution was canceled by the user, original error message: "
            X.C86154wM.A1V(r0, r4, r1)
            java.lang.String r1 = X.C18180wK.A0i(r2, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r5, r1)
        L_0x00b5:
            X.AnonymousClass7lO.A01(r0, r6)
            return r3
        L_0x00b9:
            X.6sC r0 = r6.A05
            com.google.android.gms.common.api.Status r0 = A00(r2, r0)
            goto L_0x00b5
        L_0x00c0:
            r0 = 76
            java.lang.StringBuilder r2 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Could not find API instance "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r2.append(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r0 = r2.toString()
            android.util.Log.wtf(r4, r0, r1)
            return r3
        L_0x00e0:
            android.content.Context r4 = r11.A05
            android.content.Context r0 = r4.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x0391
            android.content.Context r0 = r4.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.google.android.gms.common.api.internal.BackgroundDetector.A00(r0)
            com.google.android.gms.common.api.internal.BackgroundDetector r6 = com.google.android.gms.common.api.internal.BackgroundDetector.A04
            X.7lX r4 = new X.7lX
            r4.<init>(r11)
            monitor-enter(r6)
            java.util.ArrayList r0 = r6.A01     // Catch:{ all -> 0x012d }
            r0.add(r4)     // Catch:{ all -> 0x012d }
            monitor-exit(r6)     // Catch:{ all -> 0x012d }
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A03
            boolean r0 = r5.get()
            if (r0 != 0) goto L_0x0122
            android.app.ActivityManager$RunningAppProcessInfo r4 = new android.app.ActivityManager$RunningAppProcessInfo
            r4.<init>()
            android.app.ActivityManager.getMyMemoryState(r4)
            boolean r0 = r5.getAndSet(r3)
            if (r0 != 0) goto L_0x0122
            int r4 = r4.importance
            r0 = 100
            if (r4 <= r0) goto L_0x0122
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A02
            r0.set(r3)
        L_0x0122:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0391
            r11.A00 = r1
            return r3
        L_0x012d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x012d }
            throw r0
        L_0x0130:
            java.lang.Object r0 = r12.obj
            X.7lR r0 = (X.C129167lR) r0
            r11.A02(r0)
            return r3
        L_0x0138:
            java.util.Set r4 = r11.A0D
            java.util.Iterator r2 = r4.iterator()
        L_0x013e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r11.A09
            java.lang.Object r0 = r0.remove(r1)
            X.7lO r0 = (X.AnonymousClass7lO) r0
            if (r0 == 0) goto L_0x013e
            r0.A0A()
            goto L_0x013e
        L_0x0156:
            r4.clear()
            return r3
        L_0x015a:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0391
            java.lang.Object r0 = r12.obj
            java.lang.Object r4 = r1.get(r0)
            X.7lO r4 = (X.AnonymousClass7lO) r4
            X.7MI r5 = r4.A0C
            android.os.Handler r2 = r5.A06
            X.C13320nQ.A00(r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0391
            r0 = 11
            X.6sC r1 = r4.A05
            r2.removeMessages(r0, r1)
            r0 = 9
            r2.removeMessages(r0, r1)
            r4.A02 = r6
            com.google.android.gms.common.GoogleApiAvailability r2 = r5.A07
            android.content.Context r1 = r5.A05
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A02(r1, r0)
            r0 = 18
            if (r1 != r0) goto L_0x01a5
            r2 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
        L_0x0198:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.AnonymousClass7lO.A01(r0, r4)
            X.8rX r2 = r4.A04
            java.lang.String r0 = "Timing out connection while resuming."
            goto L_0x01e7
        L_0x01a5:
            r2 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            goto L_0x0198
        L_0x01aa:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0391
            java.lang.Object r0 = r12.obj
            java.lang.Object r4 = r1.get(r0)
            X.7lO r4 = (X.AnonymousClass7lO) r4
            X.7MI r0 = r4.A0C
            android.os.Handler r0 = r0.A06
            X.C13320nQ.A00(r0)
            X.8rX r2 = r4.A04
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0391
            java.util.Map r0 = r4.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0391
            X.75Z r1 = r4.A06
            java.util.Map r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01eb
            java.util.Map r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = "Timing out service connection."
        L_0x01e7:
            r2.AI8(r0)
            return r3
        L_0x01eb:
            X.AnonymousClass7lO.A05(r4)
            return r3
        L_0x01ef:
            java.lang.String r0 = "zaa"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x01f6:
            java.lang.Object r2 = r12.obj
            X.6tr r2 = (X.C114766tr) r2
            java.util.Map r1 = r11.A09
            X.6sC r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0391
            X.6sC r0 = r2.A01
            java.lang.Object r1 = r1.get(r0)
            X.7lO r1 = (X.AnonymousClass7lO) r1
            java.util.List r0 = r1.A07
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0391
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0391
            X.8rX r0 = r1.A04
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0241
            X.AnonymousClass7lO.A03(r1)
            return r3
        L_0x0224:
            java.util.Map r1 = r11.A09
            java.lang.Object r0 = r12.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0391
            java.lang.Object r0 = r12.obj
            java.lang.Object r1 = r1.get(r0)
            X.7lO r1 = (X.AnonymousClass7lO) r1
            X.7MI r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C13320nQ.A00(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0391
        L_0x0241:
            r1.A09()
            return r3
        L_0x0245:
            java.lang.Object r2 = r12.obj
            X.6tr r2 = (X.C114766tr) r2
            java.util.Map r1 = r11.A09
            X.6sC r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0391
            X.6sC r0 = r2.A01
            java.lang.Object r8 = r1.get(r0)
            X.7lO r8 = (X.AnonymousClass7lO) r8
            java.util.List r0 = r8.A07
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x0391
            X.7MI r0 = r8.A0C
            android.os.Handler r1 = r0.A06
            r0 = 15
            r1.removeMessages(r0, r2)
            r0 = 16
            r1.removeMessages(r0, r2)
            com.google.android.gms.common.Feature r7 = r2.A00
            java.util.Queue r6 = r8.A09
            int r0 = r6.size()
            java.util.ArrayList r5 = X.C18240wQ.A0k(r0)
            java.util.Iterator r10 = r6.iterator()
        L_0x0281:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r9 = r10.next()
            X.6rM r9 = (X.C113416rM) r9
            boolean r0 = r9 instanceof X.C93485lg
            if (r0 == 0) goto L_0x0281
            r1 = r9
            X.5lg r1 = (X.C93485lg) r1
            boolean r0 = r1 instanceof X.C93465le
            if (r0 == 0) goto L_0x029f
            java.util.Map r1 = r8.A08
            r0 = 0
            r1.get(r0)
            goto L_0x0281
        L_0x029f:
            X.5lf r1 = (X.C93475lf) r1
            X.76Q r0 = r1.A00
            com.google.android.gms.common.Feature[] r4 = r0.A02
            if (r4 == 0) goto L_0x0281
            int r2 = r4.length
            r1 = 0
        L_0x02a9:
            if (r1 >= r2) goto L_0x0281
            r0 = r4[r1]
            boolean r0 = X.C117046y2.A01(r0, r7)
            if (r0 == 0) goto L_0x02b9
            if (r1 < 0) goto L_0x0281
            r5.add(r9)
            goto L_0x0281
        L_0x02b9:
            int r1 = r1 + 1
            goto L_0x02a9
        L_0x02bc:
            int r4 = r5.size()
            r2 = 0
        L_0x02c1:
            if (r2 >= r4) goto L_0x0391
            java.lang.Object r1 = r5.get(r2)
            X.6rM r1 = (X.C113416rM) r1
            r6.remove(r1)
            X.897 r0 = new X.897
            r0.<init>(r7)
            r1.A01(r0)
            int r2 = r2 + 1
            goto L_0x02c1
        L_0x02d7:
            r11.A03()
            return r3
        L_0x02db:
            java.lang.Object r6 = r12.obj
            X.6ki r6 = (X.C109846ki) r6
            long r1 = r6.A02
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x030b
            int r1 = r6.A00
            com.google.android.gms.common.internal.MethodInvocation r0 = r6.A03
            com.google.android.gms.common.internal.MethodInvocation[] r0 = new com.google.android.gms.common.internal.MethodInvocation[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData
            r4.<init>(r0, r1)
            X.8ra r0 = r11.A02
            if (r0 != 0) goto L_0x0307
            android.content.Context r2 = r11.A05
            X.7lG r1 = X.C129087lG.A00
            X.5lH r0 = new X.5lH
            r0.<init>(r2, r1)
            r11.A02 = r0
        L_0x0307:
            r0.Bb9(r4)
            return r3
        L_0x030b:
            com.google.android.gms.common.internal.TelemetryData r0 = r11.A04
            if (r0 == 0) goto L_0x0329
            java.util.List r2 = r0.A00
            int r1 = r0.A01
            int r0 = r6.A00
            if (r1 != r0) goto L_0x0321
            if (r2 == 0) goto L_0x034b
            int r1 = r2.size()
            int r0 = r6.A01
            if (r1 < r0) goto L_0x034b
        L_0x0321:
            android.os.Handler r0 = r11.A06
            r0.removeMessages(r5)
            r11.A03()
        L_0x0329:
            com.google.android.gms.common.internal.TelemetryData r0 = r11.A04
            if (r0 != 0) goto L_0x0391
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            com.google.android.gms.common.internal.MethodInvocation r0 = r6.A03
            r2.add(r0)
            int r1 = r6.A00
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            r0.<init>(r2, r1)
            r11.A04 = r0
            android.os.Handler r4 = r11.A06
            android.os.Message r2 = r4.obtainMessage(r5)
            long r0 = r6.A02
            r4.sendMessageDelayed(r2, r0)
            return r3
        L_0x034b:
            com.google.android.gms.common.internal.TelemetryData r2 = r11.A04
            com.google.android.gms.common.internal.MethodInvocation r1 = r6.A03
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x0359
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r2.A00 = r0
        L_0x0359:
            r0.add(r1)
            goto L_0x0329
        L_0x035d:
            java.lang.Object r4 = r12.obj
            X.6jE r4 = (X.C108956jE) r4
            java.util.Map r1 = r11.A09
            X.7lR r0 = r4.A01
            X.6sC r0 = r0.A06
            java.lang.Object r2 = r1.get(r0)
            X.7lO r2 = (X.AnonymousClass7lO) r2
            if (r2 != 0) goto L_0x0375
            X.7lR r0 = r4.A01
            X.7lO r2 = r11.A02(r0)
        L_0x0375:
            X.8rX r0 = r2.A04
            boolean r0 = r0.CeJ()
            if (r0 == 0) goto L_0x0392
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A0C
            int r1 = r0.get()
            int r0 = r4.A00
            if (r1 == r0) goto L_0x0392
            X.6rM r1 = r4.A02
            com.google.android.gms.common.api.Status r0 = A0G
            r1.A00(r0)
            r2.A0A()
        L_0x0391:
            return r3
        L_0x0392:
            X.6rM r0 = r4.A02
            r2.A0C(r0)
            return r3
        L_0x0398:
            r11.A03 = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7MI.handleMessage(android.os.Message):boolean");
    }

    public AnonymousClass7MI(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.A05 = context;
        C86854zE r3 = new C86854zE(looper, this);
        this.A06 = r3;
        this.A07 = googleApiAvailability;
        this.A08 = new AnonymousClass77f(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = C103716ab.A03;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature(AnonymousClass000.A00(286)));
            C103716ab.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        r3.sendMessage(r3.obtainMessage(6));
    }

    public final void A04(ConnectionResult connectionResult, int i) {
        if (!A07(connectionResult, i)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
