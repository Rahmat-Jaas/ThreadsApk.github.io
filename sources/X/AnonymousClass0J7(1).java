package X;

import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* renamed from: X.0J7  reason: invalid class name */
public final class AnonymousClass0J7 implements InvocationHandler {
    public final Object A00;
    public final Object A01;
    public final String A02;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        List<AnonymousClass0J5> list = AnonymousClass0J4.A00;
        if (!list.isEmpty()) {
            for (AnonymousClass0J5 AUx : list) {
                AnonymousClass0J6 AUx2 = AUx.AUx(this, this.A02, method, objArr);
                if (AUx2 != null) {
                    return AUx2.A00;
                }
            }
        }
        return A01(method, objArr);
    }

    public AnonymousClass0J7(Class cls, Object obj, String str, boolean z) {
        this.A02 = str;
        this.A01 = obj;
        this.A00 = Proxy.newProxyInstance(AnonymousClass0J7.class.getClassLoader(), new Class[]{cls}, this);
        if (z) {
            AnonymousClass0J4.A01.add(str);
        }
    }

    public final AnonymousClass0J6 A00(Method method, Object[] objArr) {
        boolean z;
        try {
            return new AnonymousClass0J6(A01(method, objArr));
        } catch (Throwable unused) {
            int i = 0;
            if (method.getReturnType() == Boolean.TYPE) {
                z = false;
            } else {
                if (method.getReturnType() == Integer.TYPE) {
                    i = -1;
                } else if (method.getReturnType() != Long.TYPE) {
                    z = null;
                }
                z = Integer.valueOf(i);
            }
            return new AnonymousClass0J6(z);
        }
    }

    public final Object A01(Method method, Object[] objArr) {
        Throwable targetException;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Method method2 = method;
            Object[] objArr2 = objArr;
            Object invoke = method.invoke(this.A01, objArr);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            List<AnonymousClass0J5> list = AnonymousClass0J4.A00;
            if (!list.isEmpty()) {
                for (AnonymousClass0J5 BxA : list) {
                    BxA.BxA(invoke, this.A02, method2, objArr2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            return invoke;
        } catch (InvocationTargetException e) {
            if (e.getCause() != null) {
                targetException = e.getCause();
            } else {
                targetException = e.getTargetException();
            }
            if (targetException != null) {
                throw targetException;
            }
            throw e;
        }
    }
}
