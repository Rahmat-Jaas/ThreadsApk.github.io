package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.58d  reason: invalid class name and case insensitive filesystem */
public final class C884558d extends C98386Fh implements C147138nS {
    public AnonymousClass062 A00;
    public AnonymousClass070 A01;
    public Application A02;
    public Bundle A03;
    public final C147138nS A04;

    public final C62793ak A00(Class cls, String str) {
        List list;
        Object[] objArr;
        Application application;
        AnonymousClass062 r6 = this.A00;
        if (r6 != null) {
            boolean isAssignableFrom = AnonymousClass10X.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.A02 == null) {
                list = C120777Cl.A01;
            } else {
                list = C120777Cl.A00;
            }
            Constructor A012 = C120777Cl.A01(cls, list);
            if (A012 != null) {
                AnonymousClass070 r3 = this.A01;
                C04220Ms.A0A(r3);
                Bundle bundle = this.A03;
                C04220Ms.A0B(r3, 0);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(C98366Ff.A00(r3.A00(str), bundle), str);
                savedStateHandleController.A00(r6, r3);
                C116026wI.A01(r6, r3);
                if (!isAssignableFrom || (application = this.A02) == null) {
                    objArr = new Object[]{savedStateHandleController.A01};
                } else {
                    objArr = new Object[]{application, savedStateHandleController.A01};
                }
                C62793ak A002 = C120777Cl.A00(cls, A012, objArr);
                A002.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                return A002;
            } else if (this.A02 != null) {
                return this.A04.create(cls);
            } else {
                C124877bt r0 = C124877bt.A00;
                if (r0 == null) {
                    r0 = new C124877bt();
                    C124877bt.A00 = r0;
                }
                C04220Ms.A0A(r0);
                return r0.create(cls);
            }
        } else {
            throw C86134wK.A0s("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public C884558d(Application application, Bundle bundle, C15750rp r4) {
        C884358b r0;
        this.A01 = r4.getSavedStateRegistry();
        this.A00 = r4.getLifecycle();
        this.A03 = bundle;
        this.A02 = application;
        if (application != null) {
            r0 = C884358b.A01;
            if (r0 == null) {
                r0 = new C884358b(application);
                C884358b.A01 = r0;
            }
            C04220Ms.A0A(r0);
        } else {
            r0 = new C884358b();
        }
        this.A04 = r0;
    }

    public final C62793ak create(Class cls, C111686o9 r6) {
        List list;
        Object[] objArr;
        AnonymousClass0wJ.A1N(cls, r6);
        String str = (String) r6.A00(C124877bt.A01);
        if (str == null) {
            throw C18180wK.A0a("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (r6.A00(AnonymousClass7GW.A01) != null && r6.A00(AnonymousClass7GW.A02) != null) {
            Object A002 = r6.A00(C884358b.A02);
            boolean isAssignableFrom = AnonymousClass10X.class.isAssignableFrom(cls);
            if (!isAssignableFrom || A002 == null) {
                list = C120777Cl.A01;
            } else {
                list = C120777Cl.A00;
            }
            Constructor A012 = C120777Cl.A01(cls, list);
            if (A012 == null) {
                return this.A04.create(cls, r6);
            }
            if (!isAssignableFrom || A002 == null) {
                objArr = new Object[]{AnonymousClass7GW.A00(r6)};
            } else {
                objArr = new Object[]{A002, AnonymousClass7GW.A00(r6)};
            }
            return C120777Cl.A00(cls, A012, objArr);
        } else if (this.A00 != null) {
            return A00(cls, str);
        } else {
            throw C18180wK.A0a("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public C884558d() {
        this.A04 = new C884358b();
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A00(cls, canonicalName);
        }
        throw C18190wL.A0a("Local and anonymous classes can not be ViewModels");
    }
}
