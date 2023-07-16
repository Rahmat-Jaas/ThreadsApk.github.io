package X;

import android.util.Log;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Lj  reason: invalid class name and case insensitive filesystem */
public final class C03930Lj implements C03880Le {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public boolean A03;
    public final Choreographer A04;
    public final C03870Ld A05;
    public final Runnable A06;
    public final Method A07;
    public final Method A08;
    public final Method A09;

    public final void AHx() {
        this.A02 = false;
        Runnable runnable = this.A06;
        Method method = this.A09;
        if (method != null) {
            try {
                method.invoke(this.A04, new Object[]{0, runnable, null});
            } catch (IllegalAccessException | InvocationTargetException e) {
                A00(this, e);
            }
        }
    }

    public final void AJS() {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        A01(this, this.A06);
    }

    public static void A01(C03930Lj r4, Runnable runnable) {
        if (!r4.A03) {
            try {
                Method method = r4.A08;
                if (method != null) {
                    method.invoke(r4.A04, new Object[]{0, runnable, null});
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                A00(r4, e);
            }
        }
    }

    public C03930Lj(Choreographer choreographer, C03870Ld r8) {
        Method method;
        Method method2;
        Method method3;
        this.A05 = r8;
        this.A04 = choreographer;
        try {
            method = Choreographer.class.getDeclaredMethod("postCallback", new Class[]{Integer.TYPE, Runnable.class, Object.class});
        } catch (NoSuchMethodException e) {
            A00(this, e);
            method = null;
        }
        this.A08 = method;
        try {
            method2 = Choreographer.class.getDeclaredMethod("removeCallbacks", new Class[]{Integer.TYPE, Runnable.class, Object.class});
        } catch (NoSuchMethodException e2) {
            A00(this, e2);
            method2 = null;
        }
        this.A09 = method2;
        try {
            method3 = Choreographer.class.getDeclaredMethod("getFrameTimeNanos", new Class[0]);
        } catch (NoSuchMethodException e3) {
            A00(this, e3);
            method3 = null;
        }
        this.A07 = method3;
        this.A06 = new C03890Lf(this);
    }

    public static void A00(C03930Lj r2, Exception exc) {
        Log.e(r2.getClass().getSimpleName(), "Choreographer reflection failed.", exc);
        r2.A03 = true;
    }
}
