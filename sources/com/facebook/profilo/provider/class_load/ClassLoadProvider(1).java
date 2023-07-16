package com.facebook.profilo.provider.class_load;

import X.AnonymousClass0Uk;
import X.C03750Kp;
import X.C03760Kq;
import X.C08140cp;
import X.C14030oh;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class ClassLoadProvider extends AnonymousClass0Uk {
    public static final int A01 = ProvidersRegistry.A00.A02("class_load");
    public C03760Kq A00 = new C08140cp(A03());

    public ClassLoadProvider() {
        super((String) null);
    }

    public final void disable() {
        int A03 = C14030oh.A03(-1042262447);
        C03750Kp A002 = C03750Kp.A00();
        if (A002 != null) {
            C03760Kq r6 = this.A00;
            synchronized (A002) {
                AtomicReference atomicReference = A002.A03;
                ArrayList arrayList = new ArrayList(((ArrayList) atomicReference.get()).size() - 1);
                Iterator it = ((ArrayList) atomicReference.get()).iterator();
                while (it.hasNext()) {
                    C03760Kq r0 = (C03760Kq) it.next();
                    if (r0 != r6) {
                        arrayList.add(r0);
                    }
                }
                atomicReference.set(arrayList);
                if (((ArrayList) atomicReference.get()).isEmpty()) {
                    ClassLoader classLoader = A002.A00;
                    if (!classLoader.toString().startsWith("dalvik.system.PathClassLoader") || !(classLoader.getParent() instanceof C03750Kp)) {
                        Log.w("PluginClassLoader", "Non-standard class loader chain. PluginClassLoader will not be uninstalled");
                    } else {
                        try {
                            A002.A02.set(classLoader, A002.A01);
                            A002.A04 = false;
                            Log.w("PluginClassLoader", "Uninstalled PluginClassLoader");
                        } catch (IllegalAccessException unused) {
                            Log.w("PluginClassLoader", "Failed to uninstall PluginClassLoader");
                        }
                    }
                }
            }
        }
        C14030oh.A0A(-1174448314, A03);
    }

    public final void enable() {
        int A03 = C14030oh.A03(849025068);
        C03750Kp A002 = C03750Kp.A00();
        if (A002 != null) {
            A002.A01(this.A00);
        }
        C14030oh.A0A(-1867853427, A03);
    }

    public final int getSupportedProviders() {
        return A01;
    }

    public final int getTracingProviders() {
        boolean z;
        C03750Kp A002 = C03750Kp.A00();
        int i = A01;
        if (!TraceEvents.isEnabled(i) || A002 == null) {
            return 0;
        }
        synchronized (A002) {
            z = A002.A04;
        }
        if (z) {
            return i;
        }
        return 0;
    }
}
