package X;

import android.util.Log;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Kp  reason: invalid class name and case insensitive filesystem */
public final class C03750Kp extends ClassLoader {
    public static C03750Kp A07;
    public ClassLoader A00;
    public ClassLoader A01;
    public Field A02;
    public AtomicReference A03 = new AtomicReference(new ArrayList());
    public boolean A04;
    public ThreadLocal A05 = new ThreadLocal();
    public Method A06;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|(1:18)(2:12|13)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059 A[SYNTHETIC, Splitter:B:12:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c A[Catch:{ IllegalAccessException -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(X.C03760Kq r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicReference r2 = r5.A03     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0073 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0073 }
            int r0 = r0.size()     // Catch:{ all -> 0x0073 }
            r4 = 1
            int r0 = r0 + 1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0073 }
            r1.<init>(r0)     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0073 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0073 }
            r1.addAll(r0)     // Catch:{ all -> 0x0073 }
            r1.add(r6)     // Catch:{ all -> 0x0073 }
            r2.set(r1)     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0073 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0073 }
            int r0 = r0.size()     // Catch:{ all -> 0x0073 }
            if (r0 != r4) goto L_0x0071
            java.lang.Class<com.facebook.common.dextricks.classid.ClassId> r0 = com.facebook.common.dextricks.classid.ClassId.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x0039 }
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0039 }
        L_0x0039:
            java.lang.ClassLoader r3 = r5.A00     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0073 }
            java.lang.ClassLoader r0 = r3.getParent()     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "java.lang.BootClassLoader"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = "PluginClassLoader"
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "dalvik.system.PathClassLoader"
            boolean r0 = r2.startsWith(r0)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006c
            java.lang.reflect.Field r0 = r5.A02     // Catch:{ IllegalAccessException -> 0x0066 }
            r0.set(r3, r5)     // Catch:{ IllegalAccessException -> 0x0066 }
            r5.A04 = r4     // Catch:{ IllegalAccessException -> 0x0066 }
            java.lang.String r0 = "Installed PluginClassLoader"
            android.util.Log.w(r1, r0)     // Catch:{ IllegalAccessException -> 0x0066 }
            goto L_0x0071
        L_0x0066:
            java.lang.String r0 = "Failed to install PluginClassLoader"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0071
        L_0x006c:
            java.lang.String r0 = "Non-standard class loader chain. PluginClassLoader not installed"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r5)
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03750Kp.A01(X.0Kq):void");
    }

    public static C03750Kp A00() {
        if (A07 == null) {
            try {
                A07 = new C03750Kp(C03750Kp.class.getClassLoader());
            } catch (NoSuchFieldException | NoSuchMethodException e) {
                Log.w("PluginClassLoader", "PluginClassLoader.get: failed to create instance", e);
            }
        }
        return A07;
    }

    public final Class findClass(String str) {
        ThreadLocal threadLocal = this.A05;
        Object obj = threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        Class cls = null;
        try {
            ArrayList arrayList = (ArrayList) this.A03.get();
            if (obj == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C03760Kq) it.next()).ACt(str);
                }
            }
            try {
                cls = (Class) this.A06.invoke(this.A00, new Object[]{str});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            if (cls != null) {
                if (obj == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C03760Kq) it2.next()).ACr(cls, str);
                    }
                }
                return cls;
            }
            if (obj == null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((C03760Kq) it3.next()).ACs(str);
                }
            }
            throw new ClassNotFoundException(str);
        } finally {
            if (obj == null) {
                threadLocal.remove();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginClassLoader[");
        sb.append(this.A00);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(this.A01);
        sb.append("]");
        return sb.toString();
    }

    public C03750Kp(ClassLoader classLoader) {
        super(classLoader.getParent());
        this.A00 = classLoader;
        this.A01 = classLoader.getParent();
        Class<ClassLoader> cls = ClassLoader.class;
        Method declaredMethod = cls.getDeclaredMethod("findClass", new Class[]{String.class});
        this.A06 = declaredMethod;
        declaredMethod.setAccessible(true);
        Field declaredField = cls.getDeclaredField("parent");
        this.A02 = declaredField;
        declaredField.setAccessible(true);
    }
}
