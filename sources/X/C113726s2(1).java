package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6s2  reason: invalid class name and case insensitive filesystem */
public final class C113726s2 {
    public Context A00;
    public ILoadedInstanceCreator A01;
    public final C114776ts A02;

    public C113726s2(C114776ts r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Context A00(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            X.6ts r0 = r2.A02     // Catch:{ NameNotFoundException -> 0x0011 }
            java.lang.String r1 = r0.A00     // Catch:{ NameNotFoundException -> 0x0011 }
            r0 = 3
            android.content.Context r0 = r3.createPackageContext(r1, r0)     // Catch:{ NameNotFoundException -> 0x0011 }
            r2.A00 = r0     // Catch:{ NameNotFoundException -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            X.6CJ r0 = new X.6CJ     // Catch:{ all -> 0x0019 }
            r0.<init>()     // Catch:{ all -> 0x0019 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113726s2.A00(android.content.Context):android.content.Context");
    }

    public final synchronized ILoadedInstanceCreator A01(Context context) {
        ILoadedInstanceCreator iLoadedInstanceCreator;
        IllegalStateException illegalStateException;
        iLoadedInstanceCreator = this.A01;
        if (iLoadedInstanceCreator == null) {
            try {
                IBinder iBinder = (IBinder) C86134wK.A0g(A00(context).getClassLoader().loadClass("com.google.vr.dynamite.LoadedInstanceCreator"));
                if (iBinder == null) {
                    iLoadedInstanceCreator = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                    if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                        iLoadedInstanceCreator = (ILoadedInstanceCreator) queryLocalInterface;
                    } else {
                        iLoadedInstanceCreator = new a(iBinder);
                    }
                }
                this.A01 = iLoadedInstanceCreator;
            } catch (NoSuchMethodException e) {
                illegalStateException = new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e);
                throw illegalStateException;
            } catch (InvocationTargetException e2) {
                illegalStateException = new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
                throw illegalStateException;
            } catch (ClassNotFoundException e3) {
                illegalStateException = new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
                throw illegalStateException;
            } catch (InstantiationException e4) {
                illegalStateException = new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
                throw illegalStateException;
            } catch (IllegalAccessException e5) {
                illegalStateException = new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
                throw illegalStateException;
            }
        }
        return iLoadedInstanceCreator;
    }
}
