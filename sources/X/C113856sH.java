package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.redex.IDxLCallbacksShape579S0100000_2_I2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6sH  reason: invalid class name and case insensitive filesystem */
public final class C113856sH {
    public final WeakReference A00;
    public final List A01 = AnonymousClass0wJ.A0v();
    public final Application.ActivityLifecycleCallbacks A02;
    public volatile boolean A03;

    public final void A00() {
        int i;
        Runnable[] runnableArr;
        List list = this.A01;
        synchronized (list) {
            this.A03 = true;
        }
        Context context = (Context) this.A00.get();
        if (context != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A02);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable run : runnableArr) {
            run.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public final void A01(Runnable runnable) {
        if (runnable != null) {
            List list = this.A01;
            synchronized (list) {
                if (this.A03) {
                    C30967GcS.A02("BloksContextBindManager", "Subsctiption added after destroy");
                } else {
                    list.add(runnable);
                    runnable = null;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C113856sH(Context context) {
        IDxLCallbacksShape579S0100000_2_I2 iDxLCallbacksShape579S0100000_2_I2 = new IDxLCallbacksShape579S0100000_2_I2(this, 2);
        this.A02 = iDxLCallbacksShape579S0100000_2_I2;
        Context context2 = context;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        this.A00 = C86144wL.A0w(context2);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(iDxLCallbacksShape579S0100000_2_I2);
    }
}
