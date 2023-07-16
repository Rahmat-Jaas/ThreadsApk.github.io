package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7Cl  reason: invalid class name and case insensitive filesystem */
public final class C120777Cl {
    public static final List A00;
    public static final List A01;

    public static final C62793ak A00(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (C62793ak) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw C86154wM.A0h(AnonymousClass0wJ.A0t("Failed to access ", cls), e);
        } catch (InstantiationException e2) {
            StringBuilder A0s = C18190wL.A0s("A ");
            A0s.append(cls);
            throw C86154wM.A0h(C18180wK.A0i(" cannot be instantiated.", A0s), e2);
        } catch (InvocationTargetException e3) {
            throw C86154wM.A0h(AnonymousClass0wJ.A0t("An exception happened in constructor of ", cls), e3.getCause());
        }
    }

    static {
        Class<C121177En> cls = C121177En.class;
        A00 = C06750aI.A17(Application.class, cls);
        A01 = C18180wK.A0n(cls);
    }

    public static final Constructor A01(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        C04220Ms.A06(constructors);
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C04220Ms.A06(parameterTypes);
            List A0B = AnonymousClass8AP.A0B(parameterTypes);
            if (list.equals(A0B)) {
                return constructor;
            }
            if (list.size() != A0B.size() || !A0B.containsAll(list)) {
                i++;
            } else {
                StringBuilder A0s = C18190wL.A0s("Class ");
                A0s.append(cls.getSimpleName());
                throw C86134wK.A0s(C86104wH.A0x(list, " must have parameters in the proper order: ", A0s));
            }
        }
        return null;
    }
}
