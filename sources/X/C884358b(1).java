package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.58b  reason: invalid class name and case insensitive filesystem */
public class C884358b extends C124877bt {
    public static C884358b A01;
    public static final C141888dO A02 = C124937bz.A00;
    public final Application A00;

    private final C62793ak A00(Application application, Class cls) {
        if (!AnonymousClass10X.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            C62793ak r0 = (C62793ak) C86134wK.A0h(Application.class, cls, application);
            C04220Ms.A04(r0);
            return r0;
        } catch (NoSuchMethodException e) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e);
        } catch (IllegalAccessException e2) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e2);
        } catch (InstantiationException e3) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e3);
        } catch (InvocationTargetException e4) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e4);
        }
    }

    public C884358b(Application application) {
        this.A00 = application;
    }

    public final C62793ak create(Class cls, C111686o9 r3) {
        AnonymousClass0wJ.A1N(cls, r3);
        if (this.A00 != null) {
            return create(cls);
        }
        Application application = (Application) r3.A00(A02);
        if (application != null) {
            return A00(application, cls);
        }
        if (!AnonymousClass10X.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        throw C18190wL.A0a("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public C884358b() {
        this.A00 = null;
    }

    public C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return A00(application, cls);
        }
        throw C86134wK.A0s("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
