package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0cn  reason: invalid class name and case insensitive filesystem */
public final class C08120cn extends AnonymousClass0Uk {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C08120cn() {
        super("profilo_atrace");
    }

    public final void disable() {
        Method method;
        int A03 = C14030oh.A03(1420678510);
        if (Atrace.hasHacks(A03())) {
            Atrace.restoreSystraceNative();
            Field field = AnonymousClass0VS.A00;
            if (!(field == null || (method = AnonymousClass0VS.A01) == null)) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
        C14030oh.A0A(-1450636393, A03);
    }

    public final void enable() {
        Method method;
        int A03 = C14030oh.A03(2059097745);
        if (Atrace.hasHacks(A03())) {
            Atrace.enableSystraceNative();
            Field field = AnonymousClass0VS.A00;
            if (!(field == null || (method = AnonymousClass0VS.A01) == null)) {
                try {
                    field.set((Object) null, method.invoke((Object) null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
        C14030oh.A0A(-252517447, A03);
    }

    public final int getSupportedProviders() {
        return A00;
    }

    public final int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
