package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: X.597  reason: invalid class name */
public final class AnonymousClass597 extends AnonymousClass7A8 {
    public final Class A00;

    public AnonymousClass597(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.A00 = cls;
            return;
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(cls);
        throw C18190wL.A0a(C18180wK.A0i(" does not implement Parcelable or Serializable.", A0r));
    }

    public final Object A01(String str) {
        throw C86134wK.A0s("Parcelables don't support default values.");
    }

    public final String A02() {
        String name = this.A00.getName();
        C04220Ms.A06(name);
        return name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18190wL.A1Y(this, obj)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((AnonymousClass597) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object A00(Bundle bundle, String str) {
        AnonymousClass0wJ.A1N(bundle, str);
        return bundle.get(str);
    }

    public final void A03(Bundle bundle, Object obj, String str) {
        AnonymousClass0wJ.A1N(bundle, str);
        this.A00.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }
}
