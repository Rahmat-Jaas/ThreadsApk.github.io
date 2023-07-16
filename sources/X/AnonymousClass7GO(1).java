package X;

import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: X.7GO  reason: invalid class name */
public final class AnonymousClass7GO {
    public static final AnonymousClass7GO A00 = new AnonymousClass7GO();
    public static final Map A01 = C18220wO.A0y();

    public static final Object A00(Object obj, Field field) {
        C04220Ms.A0B(field, 0);
        try {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            Object obj2 = null;
            Object obj3 = field.get(obj);
            if (obj3 != null) {
                obj2 = obj3;
            }
            field.setAccessible(isAccessible);
            return obj2;
        } catch (IllegalArgumentException e) {
            throw C86114wI.A0k(e);
        } catch (IllegalAccessException e2) {
            throw C86114wI.A0k(e2);
        }
    }

    public static final void A01(Object obj, Object obj2, Field field) {
        C04220Ms.A0B(field, 0);
        try {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(obj, obj2);
            field.setAccessible(isAccessible);
        } catch (IllegalArgumentException e) {
            throw C86114wI.A0k(e);
        } catch (IllegalAccessException e2) {
            throw C86114wI.A0k(e2);
        } catch (SecurityException e3) {
            throw C86114wI.A0k(e3);
        }
    }
}
