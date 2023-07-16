package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Id  reason: invalid class name and case insensitive filesystem */
public final class C121787Id {
    public static final Object A09 = C86144wL.A0d();
    public static final Map A0A = new C013306f();
    public static final Executor A0B = new AnonymousClass85B();
    public final Context A00;
    public final C115266um A01;
    public final AnonymousClass5rs A02;
    public final AnonymousClass7oM A03;
    public final String A04;
    public final List A05 = new CopyOnWriteArrayList();
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final List A07 = new CopyOnWriteArrayList();
    public final AtomicBoolean A08 = new AtomicBoolean();

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C121787Id A00() {
        /*
            java.lang.Object r5 = A09
            monitor-enter(r5)
            java.util.Map r1 = A0A     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "[DEFAULT]"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0071 }
            X.7Id r0 = (X.C121787Id) r0     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0011:
            java.lang.String r4 = "Default FirebaseApp is not initialized in this process "
            java.lang.String r3 = X.AnonymousClass6DH.A01     // Catch:{ all -> 0x0071 }
            if (r3 != 0) goto L_0x0066
            int r2 = X.AnonymousClass6DH.A00     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x0021
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x0071 }
            X.AnonymousClass6DH.A00 = r2     // Catch:{ all -> 0x0071 }
        L_0x0021:
            r3 = 0
            if (r2 <= 0) goto L_0x0064
            r0 = 25
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch:{ all -> 0x0062 }
            r1.append(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "/cmdline"
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)     // Catch:{ all -> 0x0062 }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0062 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x005d }
            r0.<init>(r1)     // Catch:{ all -> 0x005d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x005d }
            r1.<init>(r0)     // Catch:{ all -> 0x005d }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0054, all -> 0x0058 }
            X.C13320nQ.A01(r0)     // Catch:{ IOException -> 0x0054, all -> 0x0058 }
            java.lang.String r3 = r0.trim()     // Catch:{ IOException -> 0x0054, all -> 0x0058 }
        L_0x0054:
            r1.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0064
        L_0x0058:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0063
        L_0x005d:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
        L_0x0063:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0064:
            X.AnonymousClass6DH.A01 = r3     // Catch:{ all -> 0x0071 }
        L_0x0066:
            java.lang.String r0 = ". Make sure to call FirebaseApp.initializeApp(Context) first."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r4, r3, r0)     // Catch:{ all -> 0x0071 }
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121787Id.A00():X.7Id");
    }

    public static void A01(C121787Id r1) {
        C13320nQ.A07(!r1.A08.get(), "FirebaseApp was deleted");
    }

    public static void A02(C121787Id r4) {
        HashMap A0j;
        Context context = r4.A00;
        if (!((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            A01(r4);
            AtomicReference atomicReference = AnonymousClass4x4.A01;
            if (atomicReference.get() == null) {
                AnonymousClass4x4 r2 = new AnonymousClass4x4(context);
                if (atomicReference.compareAndSet((Object) null, r2)) {
                    context.registerReceiver(r2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        A01(r4);
        String str = r4.A04;
        AnonymousClass5rs r3 = r4.A02;
        A01(r4);
        if (r3.A04.compareAndSet((Object) null, Boolean.valueOf("[DEFAULT]".equals(str)))) {
            synchronized (r3) {
                A0j = C86164wN.A0j(r3.A01);
            }
            AnonymousClass5rs.A00(r3, A0j);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C121787Id)) {
            return false;
        }
        String str = this.A04;
        C121787Id r3 = (C121787Id) obj;
        A01(r3);
        return str.equals(r3.A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        r2.A00(this.A04, FXPFAccessLibraryDebugFragment.NAME);
        r2.A00(this.A01, "options");
        return r2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa A[LOOP:1: B:23:0x00a4->B:25:0x00aa, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121787Id(android.content.Context r9, X.C115266um r10, java.lang.String r11) {
        /*
            r8 = this;
            r8.<init>()
            r3 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r8.A06 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A08 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.A05 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.A07 = r0
            X.C13320nQ.A01(r9)
            r8.A00 = r9
            X.C13320nQ.A03(r11)
            r8.A04 = r11
            X.C13320nQ.A01(r10)
            r8.A01 = r10
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r5 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.lang.String r4 = "ComponentDiscovery"
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r2 != 0) goto L_0x0043
            java.lang.String r0 = "Context has no PackageManager."
        L_0x003f:
            android.util.Log.w(r4, r0)     // Catch:{ NameNotFoundException -> 0x0092 }
            goto L_0x0097
        L_0x0043:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0092 }
            r1.<init>(r9, r5)     // Catch:{ NameNotFoundException -> 0x0092 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ NameNotFoundException -> 0x0092 }
            r1.append(r5)     // Catch:{ NameNotFoundException -> 0x0092 }
            java.lang.String r0 = " has no service info."
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)     // Catch:{ NameNotFoundException -> 0x0092 }
            goto L_0x003f
        L_0x005e:
            android.os.Bundle r5 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r5 == 0) goto L_0x0097
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r7 = X.C86144wL.A0x(r5)
        L_0x006a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.String r2 = X.C18180wK.A0k(r7)
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 31
            java.lang.String r0 = r2.substring(r0)
            r4.add(r0)
            goto L_0x006a
        L_0x0092:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r4, r0)
        L_0x0097:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r4, r0)
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x00a0:
            java.util.Iterator r2 = r4.iterator()
        L_0x00a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = X.C18180wK.A0k(r2)
            X.7oG r0 = new X.7oG
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x00a4
        L_0x00b7:
            java.util.concurrent.Executor r5 = A0B
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r4.addAll(r6)
            com.google.firebase.FirebaseCommonRegistrar r1 = new com.google.firebase.FirebaseCommonRegistrar
            r1.<init>()
            com.facebook.redex.IDxProviderShape853S0100000_2_I2 r0 = new com.facebook.redex.IDxProviderShape853S0100000_2_I2
            r0.<init>(r1, r3)
            r4.add(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            X.78C r0 = X.AnonymousClass78C.A00(r1, r9, r0)
            r2.add(r0)
            java.lang.Class<X.7Id> r1 = X.C121787Id.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            X.78C r0 = X.AnonymousClass78C.A00(r1, r8, r0)
            r2.add(r0)
            java.lang.Class<X.6um> r1 = X.C115266um.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            X.78C r0 = X.AnonymousClass78C.A00(r1, r10, r0)
            r2.add(r0)
            X.5rs r0 = new X.5rs
            r0.<init>(r4, r2, r5)
            r8.A02 = r0
            com.facebook.redex.IDxProviderShape309S0200000_2_I2 r1 = new com.facebook.redex.IDxProviderShape309S0200000_2_I2
            r1.<init>(r3, r9, r8)
            X.7oM r0 = new X.7oM
            r0.<init>(r1)
            r8.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121787Id.<init>(android.content.Context, X.6um, java.lang.String):void");
    }
}
