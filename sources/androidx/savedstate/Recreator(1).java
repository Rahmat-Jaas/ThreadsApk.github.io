package androidx.savedstate;

import X.AnonymousClass00U;
import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass06B;
import X.AnonymousClass06C;
import X.AnonymousClass070;
import X.AnonymousClass0wJ;
import X.C015006y;
import X.C04220Ms;
import X.C116026wI;
import X.C125087cP;
import X.C14260p5;
import X.C15750rp;
import X.C18180wK;
import X.C18190wL;
import X.C62793ak;
import X.C86154wM;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class Recreator implements C14260p5 {
    public final C15750rp A00;

    public final void CMI(AnonymousClass060 r10, AnonymousClass066 r11) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        if (r10 == AnonymousClass060.ON_CREATE) {
            r11.getLifecycle().A08(this);
            C15750rp r6 = this.A00;
            Bundle A002 = r6.getSavedStateRegistry().A00("androidx.savedstate.Restarter");
            if (A002 != null) {
                ArrayList<String> stringArrayList = A002.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        try {
                            Class<? extends U> asSubclass = Class.forName(A0k, false, Recreator.class.getClassLoader()).asSubclass(C015006y.class);
                            C04220Ms.A06(asSubclass);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(A1Z);
                                try {
                                    C04220Ms.A06(declaredConstructor.newInstance(new Object[0]));
                                    if (r6 instanceof AnonymousClass06C) {
                                        AnonymousClass06B viewModelStore = ((AnonymousClass06C) r6).getViewModelStore();
                                        AnonymousClass070 savedStateRegistry = r6.getSavedStateRegistry();
                                        Map map = viewModelStore.A00;
                                        for (Object next : new HashSet(map.keySet())) {
                                            C04220Ms.A0B(next, 0);
                                            C62793ak r1 = (C62793ak) map.get(next);
                                            C04220Ms.A0A(r1);
                                            C116026wI.A00(r6.getLifecycle(), r1, savedStateRegistry);
                                        }
                                        if (C18190wL.A1a(new HashSet(map.keySet()))) {
                                            savedStateRegistry.A04(C125087cP.class);
                                        }
                                    } else {
                                        throw C18180wK.A0a("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e) {
                                    throw C86154wM.A0h(AnonymousClass00U.A0L("Failed to instantiate ", A0k), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException(AnonymousClass00U.A0V("Class ", asSubclass.getSimpleName(), " must have default constructor in order to be automatically recreated"), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw C86154wM.A0h(AnonymousClass00U.A0V("Class ", A0k, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw C18180wK.A0a("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public Recreator(C15750rp r1) {
        this.A00 = r1;
    }
}
