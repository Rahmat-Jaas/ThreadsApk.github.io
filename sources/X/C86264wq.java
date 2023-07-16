package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.4wq  reason: invalid class name and case insensitive filesystem */
public abstract class C86264wq extends Service {
    public Messenger A00;
    public ExecutorService A01;
    public int A02;
    public final Set A03 = C18200wM.A0u();

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A08(X.C113546rb r12) {
        /*
            r11 = this;
            r8 = r11
            com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat r8 = (com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat) r8
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.String r3 = r12.A01
            r0 = 1
            X.76m r1 = X.C1196976m.A00(r8, r0)
            java.lang.String r0 = "[0-9]+"
            boolean r0 = r3.matches(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0048
            int r7 = java.lang.Integer.parseInt(r3)
        L_0x001b:
            java.lang.Class r4 = r8.getClass()
            android.util.SparseArray r0 = r1.A02
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0078
            X.7di r6 = new X.7di
            r6.<init>()
            android.os.Bundle r1 = r12.A00
            if (r1 != 0) goto L_0x0038
            android.os.Bundle r1 = android.os.Bundle.EMPTY
        L_0x0038:
            X.6r0 r0 = r8.A09()
            boolean r0 = r0.A01(r1, r6, r7)
            if (r0 == 0) goto L_0x00f1
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r9
            goto L_0x004a
        L_0x0048:
            r7 = 0
            goto L_0x001b
        L_0x004a:
            long r2 = com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.A01     // Catch:{ TimeoutException -> 0x006c }
            long r2 = r2 - r0
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x006c }
            long r4 = r4 + r2
        L_0x0052:
            java.util.concurrent.CountDownLatch r1 = r6.A00     // Catch:{ InterruptedException -> 0x0065 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0065 }
            boolean r0 = r1.await(r2, r0)     // Catch:{ InterruptedException -> 0x0065 }
            if (r0 == 0) goto L_0x005f
            boolean r1 = r6.A01     // Catch:{ InterruptedException -> 0x0065 }
            goto L_0x0074
        L_0x005f:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x0065 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0065 }
            throw r0     // Catch:{ InterruptedException -> 0x0065 }
        L_0x0065:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x006c }
            long r2 = r4 - r0
            goto L_0x0052
        L_0x006c:
            X.6r0 r0 = r8.A09()
            boolean r1 = r0.A00(r7)
        L_0x0074:
            r0 = 1
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f1
        L_0x0078:
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            java.lang.String r1 = "GcmTaskServiceCompat"
            java.lang.String r0 = "Invalid GCM task id, cancelling: %s"
            X.AnonymousClass0LU.A0N(r1, r0, r2)
            X.7IO r1 = X.AnonymousClass7IO.A01(r8)     // Catch:{ IllegalArgumentException -> 0x00ae }
            android.content.Context r6 = r1.A00     // Catch:{ IllegalArgumentException -> 0x00ae }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ IllegalArgumentException -> 0x00ae }
            r2.<init>(r6, r4)     // Catch:{ IllegalArgumentException -> 0x00ae }
            com.facebook.common.gcmcompat.Task.A01(r3)     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.String r0 = r2.getClassName()     // Catch:{ IllegalArgumentException -> 0x00ae }
            X.AnonymousClass7IO.A02(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.String r0 = "CANCEL_TASK"
            android.content.Intent r1 = X.AnonymousClass7IO.A00(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x00ae }
            if (r1 == 0) goto L_0x00b7
            java.lang.String r0 = "tag"
            r1.putExtra(r0, r3)     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.String r0 = "component"
            r1.putExtra(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00ae }
            r6.sendBroadcast(r1)     // Catch:{ IllegalArgumentException -> 0x00ae }
            goto L_0x00b7
        L_0x00ae:
            r1 = move-exception
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r8, r4)
            X.AnonymousClass6GX.A00(r0, r8, r1)
        L_0x00b7:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r4)
            java.lang.String r0 = "com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r3)
            android.content.Intent r1 = r1.setAction(r0)
            java.lang.String r0 = r8.getPackageName()
            android.content.Intent r1 = r1.setPackage(r0)
            X.0sh r4 = new X.0sh
            r4.<init>()
            r0 = 0
            r4.A06(r1, r0)
            long r2 = r4.A01
            r0 = 8
            long r2 = r2 | r0
            r4.A01 = r2
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r1 = r4.A03(r8, r5, r0)
            if (r1 == 0) goto L_0x00f1
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            r0.cancel(r1)
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86264wq.A08(X.6rb):int");
    }

    public static AnonymousClass83P A05(Bundle bundle, C86264wq r5, C143278gS r6, String str) {
        Set set = r5.A03;
        synchronized (set) {
            if (set.add(str)) {
                return new AnonymousClass83P(bundle, r5, r6, str);
            }
            AnonymousClass0LU.A0O("GcmTaskService", "%s: Task already running, won't start another", r5.getPackageName());
            return null;
        }
    }

    private void A06(int i) {
        Set set = this.A03;
        synchronized (set) {
            this.A02 = i;
            if (set.isEmpty()) {
                stopSelf(this.A02);
            }
        }
    }

    public static void A07(C86264wq r2, String str) {
        Set set = r2.A03;
        synchronized (set) {
            set.remove(str);
            if (set.isEmpty()) {
                r2.stopSelf(r2.A02);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        if (intent == null || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        synchronized (this) {
            messenger = this.A00;
            if (messenger == null) {
                messenger = new Messenger(new C86834zC(new ComponentName(this, getClass()), Looper.getMainLooper(), this));
                this.A00 = messenger;
            }
        }
        return messenger.getBinder();
    }

    public void onCreate() {
        int A04 = C14030oh.A04(-1748514931);
        super.onCreate();
        C14030oh.A0B(1901157359, A04);
    }

    public final void onDestroy() {
        ExecutorService executorService;
        int A04 = C14030oh.A04(-2049527650);
        super.onDestroy();
        synchronized (this) {
            executorService = this.A01;
            if (executorService == null) {
                executorService = Executors.newFixedThreadPool(2, new AnonymousClass85J());
                this.A01 = executorService;
            }
        }
        if (executorService != null) {
            List<Runnable> shutdownNow = executorService.shutdownNow();
            if (!shutdownNow.isEmpty()) {
                AnonymousClass0LU.A0N("GcmTaskService", "Shutting down, but not all tasks are finished executing. Remaining: %d", C18210wN.A1X(shutdownNow.size()));
            }
        }
        C14030oh.A0B(96572628, A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.AnonymousClass6X9.A00 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = -1794414635(0xffffffff950b67d5, float:-2.8152735E-26)
            int r4 = X.C14030oh.A04(r0)
            r6 = r19
            r2 = r20
            r0 = r21
            r5 = r22
            super.onStartCommand(r2, r0, r5)     // Catch:{ all -> 0x01c5 }
            r18 = 2
            if (r20 != 0) goto L_0x0020
            r6.A06(r5)
            r0 = -359466611(0xffffffffea92f98d, float:-8.884082E25)
        L_0x001c:
            X.C14030oh.A0B(r0, r4)
            return r18
        L_0x0020:
            java.lang.String r1 = r2.getAction()     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "com.google.android.gms.gcm.ACTION_TASK_READY"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01a1
            android.os.Bundle r0 = r2.getExtras()     // Catch:{ all -> 0x01c5 }
            r11 = 0
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = "GcmTaskService"
            java.lang.String r0 = "Null Intent passed, terminating"
            X.AnonymousClass0LU.A0B(r1, r0)     // Catch:{ all -> 0x01c5 }
            goto L_0x01b0
        L_0x003c:
            android.os.Bundle r10 = X.C18180wK.A06()     // Catch:{ all -> 0x01c5 }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ all -> 0x01c5 }
            r9 = 0
            r0.writeToParcel(r2, r9)     // Catch:{ all -> 0x01c5 }
            r2.setDataPosition(r9)     // Catch:{ all -> 0x01c5 }
            int r0 = r2.readInt()     // Catch:{ all -> 0x01c0 }
            java.lang.String r8 = "No callback received, terminating"
            r7 = 0
            if (r0 > 0) goto L_0x005b
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.AnonymousClass0LU.A0C(r0, r8)     // Catch:{ all -> 0x01c0 }
            goto L_0x017c
        L_0x005b:
            int r1 = r2.readInt()     // Catch:{ all -> 0x01c0 }
            r0 = 1279544898(0x4c444e42, float:5.146036E7)
            if (r1 == r0) goto L_0x006b
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.AnonymousClass0LU.A0C(r0, r8)     // Catch:{ all -> 0x01c0 }
            goto L_0x017c
        L_0x006b:
            int r17 = r2.readInt()     // Catch:{ all -> 0x01c0 }
            r3 = 0
            r1 = r11
        L_0x0071:
            r0 = r17
            if (r3 >= r0) goto L_0x0170
            java.lang.Class<X.6X9> r16 = X.AnonymousClass6X9.class
            monitor-enter(r16)     // Catch:{ all -> 0x01c0 }
            java.lang.Boolean r0 = X.AnonymousClass6X9.A00     // Catch:{ all -> 0x01bd }
            if (r0 != 0) goto L_0x00cf
            android.os.Bundle r14 = X.C18180wK.A06()     // Catch:{ all -> 0x01bd }
            java.lang.String r13 = "key"
            java.lang.String r0 = "value"
            r14.putString(r13, r0)     // Catch:{ all -> 0x01bd }
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ all -> 0x01bd }
            r14.writeToParcel(r12, r9)     // Catch:{ all -> 0x01bd }
            r12.setDataPosition(r9)     // Catch:{ all -> 0x01bd }
            int r0 = r12.readInt()     // Catch:{ RuntimeException -> 0x00c8 }
            r14 = 1
            if (r0 <= 0) goto L_0x00bc
            int r15 = r12.readInt()     // Catch:{ RuntimeException -> 0x00c8 }
            r0 = 1279544898(0x4c444e42, float:5.146036E7)
            if (r15 != r0) goto L_0x00c2
            int r0 = r12.readInt()     // Catch:{ RuntimeException -> 0x00c8 }
            if (r0 != r14) goto L_0x00b6
            java.lang.String r0 = r12.readString()     // Catch:{ RuntimeException -> 0x00c8 }
            boolean r0 = r13.equals(r0)     // Catch:{ RuntimeException -> 0x00c8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ RuntimeException -> 0x00c8 }
            X.AnonymousClass6X9.A00 = r0     // Catch:{ RuntimeException -> 0x00c8 }
            goto L_0x00cc
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RuntimeException -> 0x00c8 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x00c8 }
            goto L_0x00c7
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RuntimeException -> 0x00c8 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x00c8 }
            goto L_0x00c7
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RuntimeException -> 0x00c8 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x00c8 }
        L_0x00c7:
            throw r0     // Catch:{ RuntimeException -> 0x00c8 }
        L_0x00c8:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01b8 }
            X.AnonymousClass6X9.A00 = r0     // Catch:{ all -> 0x01b8 }
        L_0x00cc:
            r12.recycle()     // Catch:{ all -> 0x01bd }
        L_0x00cf:
            java.lang.Boolean r0 = X.AnonymousClass6X9.A00     // Catch:{ all -> 0x01bd }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01bd }
            monitor-exit(r16)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r12 = r2.readString()     // Catch:{ all -> 0x01c0 }
            goto L_0x00ef
        L_0x00dd:
            java.lang.Object r12 = r2.readValue(r11)     // Catch:{ all -> 0x01c0 }
            boolean r0 = r12 instanceof java.lang.String     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x00ed
            java.lang.String r12 = "GooglePlayCallbackExtractor"
            java.lang.String r0 = "Bad callback received, terminating"
            X.AnonymousClass0LU.A0C(r12, r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x00ed:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01c0 }
        L_0x00ef:
            if (r12 == 0) goto L_0x0166
            if (r1 != 0) goto L_0x0121
            java.lang.String r0 = "callback"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0121
            int r1 = r2.readInt()     // Catch:{ all -> 0x01c0 }
            r0 = 4
            java.lang.String r12 = "Bad callback received, terminating"
            if (r1 == r0) goto L_0x0105
            goto L_0x016a
        L_0x0105:
            java.lang.String r1 = r2.readString()     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = "com.google.android.gms.gcm.PendingCallback"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c0 }
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.AnonymousClass0LU.A0C(r0, r12)     // Catch:{ all -> 0x01c0 }
            goto L_0x017c
        L_0x0117:
            android.os.IBinder r0 = r2.readStrongBinder()     // Catch:{ all -> 0x01c0 }
            X.3zT r1 = new X.3zT     // Catch:{ all -> 0x01c0 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x0121:
            java.lang.Object r13 = r2.readValue(r11)     // Catch:{ all -> 0x01c0 }
            boolean r0 = r13 instanceof java.lang.String     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x012f
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x01c0 }
            r10.putString(r12, r13)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x012f:
            boolean r0 = r13 instanceof java.lang.Boolean     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x013b
            boolean r0 = X.AnonymousClass0wJ.A1X(r13)     // Catch:{ all -> 0x01c0 }
            r10.putBoolean(r12, r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x013b:
            boolean r0 = r13 instanceof java.lang.Integer     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0149
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x01c0 }
            int r0 = r13.intValue()     // Catch:{ all -> 0x01c0 }
            r10.putInt(r12, r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x0149:
            boolean r0 = r13 instanceof java.util.ArrayList     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0153
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x01c0 }
            r10.putParcelableArrayList(r12, r13)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x0153:
            boolean r0 = r13 instanceof android.os.Bundle     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x015d
            android.os.Bundle r13 = (android.os.Bundle) r13     // Catch:{ all -> 0x01c0 }
            r10.putBundle(r12, r13)     // Catch:{ all -> 0x01c0 }
            goto L_0x0166
        L_0x015d:
            boolean r0 = r13 instanceof android.os.Parcelable     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0166
            android.os.Parcelable r13 = (android.os.Parcelable) r13     // Catch:{ all -> 0x01c0 }
            r10.putParcelable(r12, r13)     // Catch:{ all -> 0x01c0 }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0071
        L_0x016a:
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.AnonymousClass0LU.A0C(r0, r12)     // Catch:{ all -> 0x01c0 }
            goto L_0x017c
        L_0x0170:
            if (r1 != 0) goto L_0x0178
            java.lang.String r0 = "GooglePlayCallbackExtractor"
            X.AnonymousClass0LU.A0C(r0, r8)     // Catch:{ all -> 0x01c0 }
            goto L_0x017c
        L_0x0178:
            android.util.Pair r7 = android.util.Pair.create(r1, r10)     // Catch:{ all -> 0x01c0 }
        L_0x017c:
            r2.recycle()     // Catch:{ all -> 0x01c5 }
            if (r7 == 0) goto L_0x01b0
            java.lang.Object r3 = r7.first     // Catch:{ all -> 0x01c5 }
            X.8gS r3 = (X.C143278gS) r3     // Catch:{ all -> 0x01c5 }
            java.lang.Object r2 = r7.second     // Catch:{ all -> 0x01c5 }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "tag"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x01c5 }
            if (r1 == 0) goto L_0x01b0
            java.lang.String r0 = "extras"
            android.os.Bundle r0 = r2.getBundle(r0)     // Catch:{ all -> 0x01c5 }
            X.83P r0 = A05(r0, r6, r3, r1)     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01b0
            r0.A01()     // Catch:{ all -> 0x01c5 }
            goto L_0x01b0
        L_0x01a1:
            java.lang.String r0 = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c5 }
            if (r0 != 0) goto L_0x01b0
            java.lang.String r1 = "GcmTaskService"
            java.lang.String r0 = "Unknown action received, terminating"
            X.AnonymousClass0LU.A0B(r1, r0)     // Catch:{ all -> 0x01c5 }
        L_0x01b0:
            r6.A06(r5)
            r0 = -1436985591(0xffffffffaa595709, float:-1.9303668E-13)
            goto L_0x001c
        L_0x01b8:
            r0 = move-exception
            r12.recycle()     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            r2.recycle()     // Catch:{ all -> 0x01c5 }
            throw r0     // Catch:{ all -> 0x01c5 }
        L_0x01c5:
            r1 = move-exception
            r6.A06(r5)
            r0 = -812906177(0xffffffffcf8c093f, float:-4.6988324E9)
            X.C14030oh.A0B(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86264wq.onStartCommand(android.content.Intent, int, int):int");
    }
}
