package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.7GW  reason: invalid class name */
public final class AnonymousClass7GW {
    public static final C141888dO A00 = new C124907bw();
    public static final C141888dO A01 = new C124917bx();
    public static final C141888dO A02 = new C124927by();

    public static final C881156u A01(AnonymousClass06C r6) {
        C04220Ms.A0B(r6, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Class<C881156u> cls = C881156u.class;
        A0v.add(new C106906fp(AnonymousClass724.A00(C18210wN.A0l(cls)), AnonymousClass8MS.A00));
        C106906fp[] r1 = (C106906fp[]) A0v.toArray(new C106906fp[0]);
        return (C881156u) AnonymousClass7IU.A00(new C124107aW((C106906fp[]) Arrays.copyOf(r1, r1.length)), r6).A02(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C121177En A00(C111686o9 r7) {
        C125097cR r5;
        Bundle bundle;
        C15750rp r2 = (C15750rp) r7.A00(A01);
        if (r2 != null) {
            AnonymousClass06C r1 = (AnonymousClass06C) r7.A00(A02);
            if (r1 != null) {
                Bundle bundle2 = (Bundle) r7.A00(A00);
                String str = (String) r7.A00(C124877bt.A01);
                if (str != null) {
                    C015106z A012 = r2.getSavedStateRegistry().A01();
                    if (!(A012 instanceof C125097cR) || (r5 = (C125097cR) A012) == null) {
                        throw C18180wK.A0a("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    }
                    Map map = A01(r1).A00;
                    C121177En r0 = (C121177En) map.get(str);
                    if (r0 != null) {
                        return r0;
                    }
                    if (!r5.A01) {
                        r5.A00 = r5.A02.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
                        r5.A01 = true;
                        r5.A03.getValue();
                    }
                    Bundle bundle3 = r5.A00;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle(str);
                    } else {
                        bundle = null;
                    }
                    Bundle bundle4 = r5.A00;
                    if (bundle4 != null) {
                        bundle4.remove(str);
                    }
                    Bundle bundle5 = r5.A00;
                    if (bundle5 != null && bundle5.isEmpty()) {
                        r5.A00 = null;
                    }
                    C121177En A002 = C98366Ff.A00(bundle, bundle2);
                    map.put(str, A002);
                    return A002;
                }
                throw C18190wL.A0a("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw C18190wL.A0a("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw C18190wL.A0a("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void A02(C15750rp r4) {
        AnonymousClass061 r1 = ((C14340pE) r4.getLifecycle()).A00;
        if (r1 != AnonymousClass061.INITIALIZED && r1 != AnonymousClass061.CREATED) {
            throw C18190wL.A0a("Failed requirement.");
        } else if (r4.getSavedStateRegistry().A01() == null) {
            C125097cR r2 = new C125097cR((AnonymousClass06C) r4, r4.getSavedStateRegistry());
            r4.getSavedStateRegistry().A03(r2, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            r4.getLifecycle().A07(new SavedStateHandleAttacher(r2));
        }
    }
}
