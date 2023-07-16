package X;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.6nE  reason: invalid class name and case insensitive filesystem */
public final class C111376nE {
    public final void A00(View view) {
        try {
            if (!AnonymousClass50g.A0G) {
                AnonymousClass50g.A0G = true;
                Class<Class> cls = Class.class;
                Class<String> cls2 = String.class;
                Class<View> cls3 = View.class;
                AnonymousClass50g.A0F = C86154wM.A0p("updateDisplayListIfDirty", cls3, cls.getDeclaredMethod("getDeclaredMethod", new Class[]{cls2, new Class[0].getClass()}));
                AnonymousClass50g.A0E = (Field) C86154wM.A0Z("mRecreateDisplayList", cls3, cls.getDeclaredMethod("getDeclaredField", new Class[]{cls2}));
                Method method = AnonymousClass50g.A0F;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = AnonymousClass50g.A0E;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = AnonymousClass50g.A0E;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = AnonymousClass50g.A0F;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            AnonymousClass50g.A0H = true;
        }
    }
}
