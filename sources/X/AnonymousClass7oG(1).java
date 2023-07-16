package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7oG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7oG implements C143998hf {
    public final String A00;

    public AnonymousClass7oG(String str) {
        this.A00 = str;
    }

    public final Object get() {
        String str = this.A00;
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return C86134wK.A0g(cls);
            }
            throw new C1373288d(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new C1373288d(C86164wN.A0i(str, "Could not instantiate %s."), e);
        } catch (InstantiationException e2) {
            throw new C1373288d(C86164wN.A0i(str, "Could not instantiate %s."), e2);
        } catch (NoSuchMethodException e3) {
            throw new C1373288d(C86164wN.A0i(str, "Could not instantiate %s"), e3);
        } catch (InvocationTargetException e4) {
            throw new C1373288d(C86164wN.A0i(str, "Could not instantiate %s"), e4);
        }
    }
}
