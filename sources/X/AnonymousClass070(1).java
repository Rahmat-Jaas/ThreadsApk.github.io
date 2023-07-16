package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.070  reason: invalid class name */
public final class AnonymousClass070 {
    public Bundle A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public C125107cS A04;
    public final MNg A05 = new MNg();

    public final Bundle A00(String str) {
        C04220Ms.A0B(str, 0);
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.A00;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.A00 = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void A03(C015106z r3, String str) {
        C04220Ms.A0B(str, 0);
        C04220Ms.A0B(r3, 1);
        if (this.A05.A04(str, r3) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void A04(Class cls) {
        if (this.A02) {
            C125107cS r0 = this.A04;
            if (r0 == null) {
                r0 = new C125107cS(this);
            }
            this.A04 = r0;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                C125107cS r1 = this.A04;
                if (r1 != null) {
                    String name = cls.getName();
                    C04220Ms.A06(name);
                    r1.A00(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException(AnonymousClass00U.A0V("Class ", cls.getSimpleName(), " must have default constructor in order to be automatically recreated"), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final C015106z A01() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C04220Ms.A04(entry);
            Object key = entry.getKey();
            C015106z r1 = (C015106z) entry.getValue();
            if (C04220Ms.A0I(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return r1;
            }
        }
        return null;
    }

    public final void A02(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        L8S A022 = this.A05.A02();
        while (A022.hasNext()) {
            Map.Entry entry = (Map.Entry) A022.next();
            bundle2.putBundle((String) entry.getKey(), ((C015106z) entry.getValue()).Cfz());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
