package X;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.zzq;
import com.google.android.gms.dynamite.zzr;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7KA  reason: invalid class name */
public final class AnonymousClass7KA {
    public static int A01 = -1;
    public static zzq A02;
    public static zzr A03;
    public static Boolean A04;
    public static String A05;
    public static boolean A06;
    public static final C143838hO A07 = new C129527m3();
    public static final C143838hO A08 = new C129517m2();
    public static final ThreadLocal A09 = new ThreadLocal();
    public static final C145408kS A0A = new C129497m0();
    public static final ThreadLocal A0B = new C1375388y();
    public final Context A00;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int A01(android.content.Context r19, java.lang.String r20) {
        /*
            r7 = 1
            r4 = r19
            java.lang.Class<X.7KA> r19 = X.AnonymousClass7KA.class
            monitor-enter(r19)     // Catch:{ all -> 0x02b7 }
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x02b0 }
            r3 = 0
            r8 = r20
            if (r0 != 0) goto L_0x0184
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            java.lang.Class r1 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r6 = r1.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            java.lang.Class r18 = r6.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            monitor-enter(r18)     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x015c }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x015c }
            if (r1 == 0) goto L_0x0043
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015c }
            if (r1 != r0) goto L_0x003d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015c }
        L_0x003a:
            monitor-exit(r18)     // Catch:{ all -> 0x015c }
            goto L_0x0182
        L_0x003d:
            A06(r1)     // Catch:{ 6CT -> 0x0040 }
        L_0x0040:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x015c }
            goto L_0x003a
        L_0x0043:
            boolean r0 = A06     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x014c
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x015c }
            boolean r0 = r9.equals(r3)     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x014c
            int r5 = A02(r4, r8)     // Catch:{ 6CT -> 0x0141 }
            java.lang.String r0 = A05     // Catch:{ 6CT -> 0x0141 }
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.isEmpty()     // Catch:{ 6CT -> 0x0141 }
            if (r0 != 0) goto L_0x0159
            java.lang.Class<X.6DI> r17 = X.AnonymousClass6DI.class
            monitor-enter(r17)     // Catch:{ 6CT -> 0x0141 }
            java.lang.ClassLoader r0 = X.AnonymousClass6DI.A00     // Catch:{ all -> 0x013e }
            if (r0 != 0) goto L_0x010d
            java.lang.Thread r0 = X.AnonymousClass6DI.A01     // Catch:{ all -> 0x0109 }
            r16 = 0
            if (r0 != 0) goto L_0x00ea
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00e2 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x00e2 }
            java.lang.ThreadGroup r11 = r0.getThreadGroup()     // Catch:{ all -> 0x00e2 }
            if (r11 != 0) goto L_0x007a
            r10 = r3
            goto L_0x00e4
        L_0x007a:
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            monitor-enter(r15)     // Catch:{ all -> 0x00e2 }
            int r14 = r11.activeGroupCount()     // Catch:{ SecurityException -> 0x00cc }
            java.lang.ThreadGroup[] r10 = new java.lang.ThreadGroup[r14]     // Catch:{ SecurityException -> 0x00cc }
            r11.enumerate(r10)     // Catch:{ SecurityException -> 0x00cc }
            r13 = 0
            r2 = 0
        L_0x0088:
            if (r2 >= r14) goto L_0x009b
            r12 = r10[r2]     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r12.getName()     // Catch:{ SecurityException -> 0x00cc }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00cc }
            if (r0 != 0) goto L_0x00a2
            int r2 = r2 + 1
            goto L_0x0088
        L_0x009b:
            java.lang.String r0 = "dynamiteLoader"
            java.lang.ThreadGroup r12 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x00cc }
            r12.<init>(r11, r0)     // Catch:{ SecurityException -> 0x00cc }
        L_0x00a2:
            int r11 = r12.activeCount()     // Catch:{ SecurityException -> 0x00cc }
            java.lang.Thread[] r2 = new java.lang.Thread[r11]     // Catch:{ SecurityException -> 0x00cc }
            r12.enumerate(r2)     // Catch:{ SecurityException -> 0x00cc }
        L_0x00ab:
            if (r13 >= r11) goto L_0x00be
            r10 = r2[r13]     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r10.getName()     // Catch:{ SecurityException -> 0x00cc }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00cc }
            if (r0 != 0) goto L_0x00dd
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x00be:
            X.88n r10 = new X.88n     // Catch:{ SecurityException -> 0x00cc }
            r10.<init>(r12)     // Catch:{ SecurityException -> 0x00cc }
            r10.setContextClassLoader(r3)     // Catch:{ SecurityException -> 0x00ca }
            r10.start()     // Catch:{ SecurityException -> 0x00ca }
            goto L_0x00dd
        L_0x00ca:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cc:
            r0 = move-exception
            r10 = r3
        L_0x00ce:
            java.lang.String r2 = "DynamiteLoaderV2CL"
            java.lang.String r1 = "Failed to enumerate thread/threadgroup "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x00df }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r15)     // Catch:{ all -> 0x00df }
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            goto L_0x0108
        L_0x00e4:
            X.AnonymousClass6DI.A01 = r10     // Catch:{ all -> 0x0109 }
            java.lang.Thread r0 = X.AnonymousClass6DI.A01     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x010b
        L_0x00ea:
            java.lang.Thread r10 = X.AnonymousClass6DI.A01     // Catch:{ all -> 0x0109 }
            monitor-enter(r10)     // Catch:{ all -> 0x0109 }
            java.lang.Thread r0 = X.AnonymousClass6DI.A01     // Catch:{ SecurityException -> 0x00f4 }
            java.lang.ClassLoader r16 = r0.getContextClassLoader()     // Catch:{ SecurityException -> 0x00f4 }
            goto L_0x0104
        L_0x00f4:
            r0 = move-exception
            java.lang.String r2 = "DynamiteLoaderV2CL"
            java.lang.String r1 = "Failed to get thread context classloader "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x0106 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0106 }
        L_0x0104:
            monitor-exit(r10)     // Catch:{ all -> 0x0106 }
            goto L_0x010b
        L_0x0106:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0106 }
        L_0x0108:
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x013e }
        L_0x010b:
            X.AnonymousClass6DI.A00 = r16     // Catch:{ all -> 0x013e }
        L_0x010d:
            java.lang.ClassLoader r2 = X.AnonymousClass6DI.A00     // Catch:{ all -> 0x013e }
            monitor-exit(r17)     // Catch:{ 6CT -> 0x0141 }
            if (r2 != 0) goto L_0x0126
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ 6CT -> 0x0141 }
            r0 = 29
            if (r1 < r0) goto L_0x012f
            java.lang.String r1 = A05     // Catch:{ 6CT -> 0x0141 }
            X.C13320nQ.A01(r1)     // Catch:{ 6CT -> 0x0141 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 6CT -> 0x0141 }
            dalvik.system.DelegateLastClassLoader r2 = new dalvik.system.DelegateLastClassLoader     // Catch:{ 6CT -> 0x0141 }
            r2.<init>(r1, r0)     // Catch:{ 6CT -> 0x0141 }
        L_0x0126:
            A06(r2)     // Catch:{ 6CT -> 0x0141 }
            r6.set(r3, r2)     // Catch:{ 6CT -> 0x0141 }
            A04 = r9     // Catch:{ 6CT -> 0x0141 }
            goto L_0x0157
        L_0x012f:
            java.lang.String r1 = A05     // Catch:{ 6CT -> 0x0141 }
            X.C13320nQ.A01(r1)     // Catch:{ 6CT -> 0x0141 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 6CT -> 0x0141 }
            X.65w r2 = new X.65w     // Catch:{ 6CT -> 0x0141 }
            r2.<init>(r1, r0)     // Catch:{ 6CT -> 0x0141 }
            goto L_0x0126
        L_0x013e:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ 6CT -> 0x0141 }
            throw r0     // Catch:{ 6CT -> 0x0141 }
        L_0x0141:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015c }
            r6.set(r3, r0)     // Catch:{ all -> 0x015c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015c }
            goto L_0x003a
        L_0x014c:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015c }
            r6.set(r3, r0)     // Catch:{ all -> 0x015c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015c }
            goto L_0x003a
        L_0x0157:
            monitor-exit(r18)     // Catch:{ all -> 0x015c }
            goto L_0x015a
        L_0x0159:
            monitor-exit(r18)     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r19)     // Catch:{ all -> 0x02b0 }
            return r5
        L_0x015c:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x015c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0163, IllegalAccessException -> 0x0161, NoSuchFieldException -> 0x015f }
        L_0x015f:
            r0 = move-exception
            goto L_0x0164
        L_0x0161:
            r0 = move-exception
            goto L_0x0164
        L_0x0163:
            r0 = move-exception
        L_0x0164:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x02b0 }
            int r0 = r2.length()     // Catch:{ all -> 0x02b0 }
            int r0 = r0 + 30
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = "Failed to load module via V2: "
            r1.append(r0)     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)     // Catch:{ all -> 0x02b0 }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x02b0 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x02b0 }
        L_0x0182:
            A04 = r0     // Catch:{ all -> 0x02b0 }
        L_0x0184:
            monitor-exit(r19)     // Catch:{ all -> 0x02b0 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02b7 }
            r5 = 0
            if (r0 == 0) goto L_0x01a2
            int r5 = A02(r4, r8)     // Catch:{ 6CT -> 0x0191 }
            return r5
        L_0x0191:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = "Failed to retrieve remote module version: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02b7 }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x02b7 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x02b7 }
            return r5
        L_0x01a2:
            com.google.android.gms.dynamite.zzq r6 = A05(r4)     // Catch:{ all -> 0x02b7 }
            if (r6 == 0) goto L_0x02af
            r0 = 1694687017(0x6502df29, float:3.8626514E22)
            int r2 = X.C14030oh.A03(r0)     // Catch:{ RemoteException -> 0x0295 }
            android.os.Parcel r1 = r6.A00()     // Catch:{ RemoteException -> 0x0295 }
            r0 = 6
            android.os.Parcel r0 = r6.A01(r1, r0)     // Catch:{ RemoteException -> 0x0295 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0295 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0295 }
            r0 = 2088150223(0x7c76a4cf, float:5.122591E36)
            X.C14030oh.A0A(r0, r2)     // Catch:{ RemoteException -> 0x0295 }
            r9 = 3
            if (r1 < r9) goto L_0x023f
            java.lang.ThreadLocal r11 = A09     // Catch:{ RemoteException -> 0x0295 }
            java.lang.Object r0 = r11.get()     // Catch:{ RemoteException -> 0x0295 }
            X.74u r0 = (X.C1193574u) r0     // Catch:{ RemoteException -> 0x0295 }
            if (r0 == 0) goto L_0x01db
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x0295 }
            if (r0 == 0) goto L_0x01db
            int r5 = r0.getInt(r5)     // Catch:{ RemoteException -> 0x0295 }
            return r5
        L_0x01db:
            com.google.android.gms.dynamic.ObjectWrapper r10 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x0295 }
            r10.<init>(r4)     // Catch:{ RemoteException -> 0x0295 }
            java.lang.ThreadLocal r0 = A0B     // Catch:{ RemoteException -> 0x0295 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0295 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0295 }
            long r0 = r0.longValue()     // Catch:{ RemoteException -> 0x0295 }
            r2 = 1043620808(0x3e3463c8, float:0.17616189)
            int r9 = X.C14030oh.A03(r2)     // Catch:{ RemoteException -> 0x0295 }
            android.os.Parcel r2 = A03(r10, r6, r8, r7)     // Catch:{ RemoteException -> 0x0295 }
            r2.writeLong(r0)     // Catch:{ RemoteException -> 0x0295 }
            r0 = 7
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.internal.common.zzb.A00(r2, r6, r0)     // Catch:{ RemoteException -> 0x0295 }
            r0 = 1079189304(0x40531f38, float:3.2987804)
            X.C14030oh.A0A(r0, r9)     // Catch:{ RemoteException -> 0x0295 }
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.A01(r1)     // Catch:{ RemoteException -> 0x0295 }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ RemoteException -> 0x0295 }
            if (r6 == 0) goto L_0x022c
            boolean r0 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            if (r0 == 0) goto L_0x022c
            int r2 = r6.getInt(r5)     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            if (r2 <= 0) goto L_0x0228
            java.lang.Object r1 = r11.get()     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            X.74u r1 = (X.C1193574u) r1     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            if (r1 == 0) goto L_0x0228
            android.database.Cursor r0 = r1.A00     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            if (r0 != 0) goto L_0x0228
            r1.A00 = r6     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            return r2
        L_0x0228:
            r6.close()     // Catch:{ all -> 0x02b7 }
            return r2
        L_0x022c:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x023c, all -> 0x0239 }
            if (r6 == 0) goto L_0x02af
            r6.close()     // Catch:{ all -> 0x02b7 }
            return r5
        L_0x0239:
            r0 = move-exception
            r3 = r6
            goto L_0x02ac
        L_0x023c:
            r0 = move-exception
            r3 = r6
            goto L_0x0296
        L_0x023f:
            r0 = 2
            if (r1 != r0) goto L_0x026c
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0295 }
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x0295 }
            r1.<init>(r4)     // Catch:{ RemoteException -> 0x0295 }
            r0 = 16985275(0x1032cbb, float:2.4092993E-38)
            int r2 = X.C14030oh.A03(r0)     // Catch:{ RemoteException -> 0x0295 }
            android.os.Parcel r1 = A03(r1, r6, r8, r7)     // Catch:{ RemoteException -> 0x0295 }
            r0 = 5
            android.os.Parcel r0 = r6.A01(r1, r0)     // Catch:{ RemoteException -> 0x0295 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0295 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0295 }
            r0 = 1484332854(0x58791f36, float:1.09564978E15)
            X.C14030oh.A0A(r0, r2)     // Catch:{ RemoteException -> 0x0295 }
            return r1
        L_0x026c:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x0295 }
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ RemoteException -> 0x0295 }
            r1.<init>(r4)     // Catch:{ RemoteException -> 0x0295 }
            r0 = 650815244(0x26caa70c, float:1.4061844E-15)
            int r2 = X.C14030oh.A03(r0)     // Catch:{ RemoteException -> 0x0295 }
            android.os.Parcel r0 = A03(r1, r6, r8, r7)     // Catch:{ RemoteException -> 0x0295 }
            android.os.Parcel r0 = r6.A01(r0, r9)     // Catch:{ RemoteException -> 0x0295 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0295 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0295 }
            r0 = -348064118(0xffffffffeb40f68a, float:-2.33278E26)
            X.C14030oh.A0A(r0, r2)     // Catch:{ RemoteException -> 0x0295 }
            return r1
        L_0x0295:
            r0 = move-exception
        L_0x0296:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = "Failed to retrieve remote module version: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x02ab }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x02ab }
            if (r3 == 0) goto L_0x02af
            r3.close()     // Catch:{ all -> 0x02b7 }
            return r5
        L_0x02ab:
            r0 = move-exception
        L_0x02ac:
            if (r3 == 0) goto L_0x02b6
            goto L_0x02b3
        L_0x02af:
            return r5
        L_0x02b0:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x02b0 }
            goto L_0x02b6
        L_0x02b3:
            r3.close()     // Catch:{ all -> 0x02b7 }
        L_0x02b6:
            throw r0     // Catch:{ all -> 0x02b7 }
        L_0x02b7:
            r3 = move-exception
            X.C13320nQ.A01(r4)     // Catch:{ Exception -> 0x02bc }
            throw r3
        L_0x02bc:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KA.A01(android.content.Context, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0092, code lost:
        if (r3 != null) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b8 A[Catch:{ all -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(android.content.Context r12, java.lang.String r13) {
        /*
            r9 = 0
            java.lang.ThreadLocal r0 = A0B     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            long r3 = r0.longValue()     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            android.content.ContentResolver r7 = r12.getContentResolver()     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            java.lang.String r2 = "api_force_staging"
            r6 = 1
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            r1.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r0)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r1.authority(r0)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            android.net.Uri$Builder r0 = r0.path(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            android.net.Uri$Builder r2 = r0.appendPath(r13)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            java.lang.String r1 = "requestStartTime"
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            android.net.Uri r8 = X.C18220wO.A0F(r2, r1, r0)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            r13 = 890682467(0x3516bc63, float:5.6153493E-7)
            r10 = r9
            r11 = r9
            r12 = r9
            android.database.Cursor r3 = X.C13960oa.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00b1, all -> 0x00c7 }
            if (r3 == 0) goto L_0x00a0
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x00af }
            if (r0 == 0) goto L_0x00a0
            r5 = 0
            int r4 = r3.getInt(r5)     // Catch:{ Exception -> 0x00af }
            if (r4 <= 0) goto L_0x0094
            java.lang.Class<X.7KA> r2 = X.AnonymousClass7KA.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00af }
            r0 = 2
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x008c }
            A05 = r0     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "loaderVersion"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x008c }
            if (r0 < 0) goto L_0x0068
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x008c }
            A01 = r0     // Catch:{ all -> 0x008c }
        L_0x0068:
            java.lang.String r0 = "disableStandaloneDynamiteLoader"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x008c }
            if (r0 < 0) goto L_0x007a
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0077
            r6 = 0
        L_0x0077:
            A06 = r6     // Catch:{ all -> 0x008c }
            r5 = r6
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            java.lang.ThreadLocal r0 = A09     // Catch:{ Exception -> 0x00af }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00af }
            X.74u r1 = (X.C1193574u) r1     // Catch:{ Exception -> 0x00af }
            if (r1 == 0) goto L_0x0090
            android.database.Cursor r0 = r1.A00     // Catch:{ Exception -> 0x00af }
            if (r0 != 0) goto L_0x0090
            r1.A00 = r3     // Catch:{ Exception -> 0x00af }
            goto L_0x008f
        L_0x008c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            goto L_0x00ae
        L_0x008f:
            r3 = r9
        L_0x0090:
            if (r5 != 0) goto L_0x0098
            if (r3 == 0) goto L_0x0097
        L_0x0094:
            r3.close()
        L_0x0097:
            return r4
        L_0x0098:
            java.lang.String r0 = "forcing fallback to container DynamiteLoader impl"
            X.6CT r1 = new X.6CT     // Catch:{ Exception -> 0x00af }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00af }
            goto L_0x00ae
        L_0x00a0:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ Exception -> 0x00af }
            java.lang.String r0 = "Failed to connect to dynamite module ContentResolver."
            X.6CT r1 = new X.6CT     // Catch:{ Exception -> 0x00af }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00af }
        L_0x00ae:
            throw r1     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            r2 = move-exception
            goto L_0x00b3
        L_0x00b1:
            r2 = move-exception
            r3 = r9
        L_0x00b3:
            boolean r0 = r2 instanceof X.AnonymousClass6CT     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b8
            throw r2     // Catch:{ all -> 0x00c0 }
        L_0x00b8:
            java.lang.String r1 = "V2 version check failed"
            X.6CT r0 = new X.6CT     // Catch:{ all -> 0x00c0 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c0 }
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            if (r3 == 0) goto L_0x00c8
            r3.close()
            throw r0
        L_0x00c7:
            r0 = move-exception
        L_0x00c8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KA.A02(android.content.Context, java.lang.String):int");
    }

    public static void A06(ClassLoader classLoader) {
        zzr zzr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            A03 = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new AnonymousClass6CT("Failed to instantiate dynamite loader", e);
        }
    }

    public static int A00(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 61);
            A0s.append("com.google.android.gms.dynamite.descriptors.");
            A0s.append(str);
            A0s.append(".");
            Class<?> loadClass = classLoader.loadClass(C18180wK.A0i("ModuleDescriptor", A0s));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C117046y2.A01(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(valueOf) + 51 + C86104wH.A0A(str));
            A0s2.append("Module descriptor id '");
            A0s2.append(valueOf);
            A0s2.append("' didn't match expected id '");
            A0s2.append(str);
            Log.e("DynamiteModule", C18180wK.A0i("'", A0s2));
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder A0s3 = C86114wI.A0s(C86104wH.A0A(str) + 45);
            A0s3.append("Local module descriptor class for ");
            A0s3.append(str);
            Log.w("DynamiteModule", C18180wK.A0i(AnonymousClass000.A00(497), A0s3));
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", C86114wI.A0p(String.valueOf(e.getMessage()), "Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static AnonymousClass7KA A04(Context context, C143838hO r20, String str) {
        AnonymousClass6CT r1;
        AnonymousClass7KA r12;
        int i;
        AnonymousClass6CT r13;
        Boolean bool;
        int i2;
        IObjectWrapper iObjectWrapper;
        int i3;
        zzr zzr;
        Boolean valueOf;
        int A032;
        IObjectWrapper A002;
        int i4;
        Class<AnonymousClass7KA> cls = AnonymousClass7KA.class;
        ThreadLocal threadLocal = A09;
        Object obj = threadLocal.get();
        C1193574u r8 = new C1193574u((C97786Ct) null);
        threadLocal.set(r8);
        ThreadLocal threadLocal2 = A0B;
        Number number = (Number) threadLocal2.get();
        long longValue = number.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            Context context2 = context;
            C143838hO r19 = r20;
            String str2 = str;
            C108976jG Cgl = r19.Cgl(context2, A0A, str2);
            String.valueOf(str2);
            String.valueOf(str2);
            int i5 = Cgl.A02;
            if (i5 != 0) {
                if (i5 != -1) {
                    if (i5 == 1) {
                        int i6 = Cgl.A01;
                        if (i6 != 0) {
                            try {
                                synchronized (cls) {
                                    try {
                                        bool = A04;
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                                if (bool == null) {
                                    th = new AnonymousClass6CT("Failed to determine which loading route to use.");
                                } else if (bool.booleanValue()) {
                                    String.valueOf(str2);
                                    synchronized (cls) {
                                        try {
                                            zzr = A03;
                                        } catch (Throwable th2) {
                                            while (true) {
                                                th = th2;
                                                break;
                                            }
                                        }
                                    }
                                    if (zzr != null) {
                                        C1193574u r2 = (C1193574u) threadLocal.get();
                                        if (r2 == null || r2.A00 == null) {
                                            th = new AnonymousClass6CT("No result cursor");
                                        } else {
                                            Context applicationContext = context2.getApplicationContext();
                                            Cursor cursor = r2.A00;
                                            new ObjectWrapper((Object) null);
                                            synchronized (cls) {
                                                try {
                                                    valueOf = Boolean.valueOf(C86114wI.A1U(A01, 2));
                                                } catch (Throwable th3) {
                                                    while (true) {
                                                        th = th3;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (valueOf.booleanValue()) {
                                                ObjectWrapper objectWrapper = new ObjectWrapper(applicationContext);
                                                ObjectWrapper objectWrapper2 = new ObjectWrapper(cursor);
                                                A032 = C14030oh.A03(1813132671);
                                                Parcel A033 = A03(objectWrapper, zzr, str2, i6);
                                                C86134wK.A16(objectWrapper2, A033);
                                                A002 = zzb.A00(A033, zzr, 3);
                                                i4 = 623525203;
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                ObjectWrapper objectWrapper3 = new ObjectWrapper(applicationContext);
                                                ObjectWrapper objectWrapper4 = new ObjectWrapper(cursor);
                                                A032 = C14030oh.A03(883784836);
                                                Parcel A034 = A03(objectWrapper3, zzr, str2, i6);
                                                C86134wK.A16(objectWrapper4, A034);
                                                A002 = zzb.A00(A034, zzr, 2);
                                                i4 = 918806785;
                                            }
                                            C14030oh.A0A(i4, A032);
                                            Context context3 = (Context) ObjectWrapper.A01(A002);
                                            if (context3 != null) {
                                                r12 = new AnonymousClass7KA(context3);
                                            } else {
                                                th = new AnonymousClass6CT("Failed to get module context");
                                            }
                                        }
                                    } else {
                                        th = new AnonymousClass6CT("DynamiteLoaderV2 was not cached.");
                                    }
                                } else {
                                    String.valueOf(str2);
                                    zzq A052 = A05(context2);
                                    if (A052 != null) {
                                        int A035 = C14030oh.A03(1694687017);
                                        Parcel A012 = A052.A01(A052.A00(), 6);
                                        int readInt = A012.readInt();
                                        A012.recycle();
                                        C14030oh.A0A(2088150223, A035);
                                        if (readInt >= 3) {
                                            C1193574u r0 = (C1193574u) threadLocal.get();
                                            if (r0 != null) {
                                                ObjectWrapper objectWrapper5 = new ObjectWrapper(context2);
                                                ObjectWrapper objectWrapper6 = new ObjectWrapper(r0.A00);
                                                i2 = C14030oh.A03(-676781313);
                                                Parcel A036 = A03(objectWrapper5, A052, str2, i6);
                                                C86134wK.A16(objectWrapper6, A036);
                                                iObjectWrapper = zzb.A00(A036, A052, 8);
                                                i3 = 898162345;
                                            } else {
                                                th = new AnonymousClass6CT("No cached result cursor holder");
                                            }
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            ObjectWrapper objectWrapper7 = new ObjectWrapper(context2);
                                            i2 = C14030oh.A03(-844493346);
                                            iObjectWrapper = zzb.A00(A03(objectWrapper7, A052, str2, i6), A052, 4);
                                            i3 = 96415761;
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            ObjectWrapper objectWrapper8 = new ObjectWrapper(context2);
                                            i2 = C14030oh.A03(-827572926);
                                            iObjectWrapper = zzb.A00(A03(objectWrapper8, A052, str2, i6), A052, 2);
                                            i3 = 1272737331;
                                        }
                                        C14030oh.A0A(i3, i2);
                                        if (ObjectWrapper.A01(iObjectWrapper) != null) {
                                            r12 = new AnonymousClass7KA((Context) ObjectWrapper.A01(iObjectWrapper));
                                        } else {
                                            th = new AnonymousClass6CT("Failed to load remote module.");
                                        }
                                    } else {
                                        th = new AnonymousClass6CT("Failed to create IDynamiteLoader.");
                                    }
                                }
                                throw th;
                            } catch (RemoteException e) {
                                r13 = new AnonymousClass6CT("Failed to load remote module.", e);
                            } catch (AnonymousClass6CT e2) {
                                throw e2;
                            } catch (AnonymousClass6CT e3) {
                                Log.w("DynamiteModule", C86104wH.A0u(e3.getMessage(), "Failed to load remote module: "));
                                int i7 = Cgl.A00;
                                if (i7 != 0) {
                                    if (r19.Cgl(context2, new C129507m1(i7), str2).A02 == -1) {
                                        String.valueOf(str2);
                                        r12 = new AnonymousClass7KA(context2.getApplicationContext());
                                    }
                                }
                                r1 = new AnonymousClass6CT("Remote load failed. No local fallback found.", e3);
                            } catch (Throwable th4) {
                                try {
                                    C13320nQ.A01(context2);
                                } catch (Exception e4) {
                                    Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
                                }
                                r13 = new AnonymousClass6CT("Failed to load remote module.", th4);
                            }
                        }
                    } else {
                        r1 = new AnonymousClass6CT(C86104wH.A10("VersionPolicy returned invalid code:", C86114wI.A0s(47), i5));
                    }
                    throw r1;
                } else if (Cgl.A00 != 0) {
                    String.valueOf(str2);
                    r12 = new AnonymousClass7KA(context2.getApplicationContext());
                }
                if (i != 0) {
                    threadLocal2.set(number);
                }
                return r12;
            }
            int i8 = Cgl.A00;
            int i9 = Cgl.A01;
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str2) + 92);
            A0s.append("No acceptable module ");
            A0s.append(str2);
            A0s.append(" found. Local version is ");
            A0s.append(i8);
            A0s.append(" and remote version is ");
            A0s.append(i9);
            r1 = new AnonymousClass6CT(C18180wK.A0i(".", A0s));
            throw r1;
            throw r13;
        } finally {
            if (longValue == 0) {
                threadLocal2.remove();
            } else {
                threadLocal2.set(number);
            }
            Cursor cursor2 = r8.A00;
            if (cursor2 != null) {
                cursor2.close();
            }
            threadLocal.set(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.zzq A05(android.content.Context r5) {
        /*
            java.lang.Class<X.7KA> r4 = X.AnonymousClass7KA.class
            monitor-enter(r4)
            com.google.android.gms.dynamite.zzq r3 = A02     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x004a
            r3 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r5.createPackageContext(r1, r0)     // Catch:{ Exception -> 0x003a }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x003a }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ Exception -> 0x003a }
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch:{ Exception -> 0x003a }
            boolean r0 = r1 instanceof com.google.android.gms.dynamite.zzq     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.dynamite.zzq r1 = (com.google.android.gms.dynamite.zzq) r1     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x004a
        L_0x002f:
            A02 = r1     // Catch:{ Exception -> 0x003a }
            goto L_0x0038
        L_0x0032:
            com.google.android.gms.dynamite.zzq r1 = new com.google.android.gms.dynamite.zzq     // Catch:{ Exception -> 0x003a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x002f
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            return r1
        L_0x003a:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x004c }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            return r3
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KA.A05(android.content.Context):com.google.android.gms.dynamite.zzq");
    }

    public AnonymousClass7KA(Context context) {
        C13320nQ.A01(context);
        this.A00 = context;
    }

    public static Parcel A03(IInterface iInterface, zza zza, String str, int i) {
        Parcel A002 = zza.A00();
        A002.writeStrongBinder(iInterface.asBinder());
        A002.writeString(str);
        A002.writeInt(i);
        return A002;
    }
}
