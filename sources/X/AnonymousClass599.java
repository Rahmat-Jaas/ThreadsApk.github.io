package X;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: X.599  reason: invalid class name */
public class AnonymousClass599 extends AnonymousClass7A8 {
    public final Class A00;

    public AnonymousClass599(Class cls, boolean z) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.A00 = cls;
            return;
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(cls);
        throw C18190wL.A0a(C18180wK.A0i(" does not implement Serializable.", A0r));
    }

    public /* bridge */ /* synthetic */ Object A01(String str) {
        if (this instanceof AnonymousClass594) {
            return ((AnonymousClass594) this).A01(str);
        }
        throw C86134wK.A0s("Serializables don't support default values.");
    }

    public String A02() {
        String name = this.A00.getName();
        C04220Ms.A06(name);
        return name;
    }

    public final /* bridge */ /* synthetic */ void A03(Bundle bundle, Object obj, String str) {
        Serializable serializable = (Serializable) obj;
        AnonymousClass0wJ.A1N(bundle, str);
        C04220Ms.A0B(serializable, 2);
        this.A00.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass599)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((AnonymousClass599) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object A00(Bundle bundle, String str) {
        AnonymousClass0wJ.A1N(bundle, str);
        return bundle.get(str);
    }

    public AnonymousClass599(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(cls);
            throw C18190wL.A0a(C18180wK.A0i(" does not implement Serializable.", A0r));
        } else if (!cls.isEnum()) {
            this.A00 = cls;
        } else {
            StringBuilder A0r2 = C18200wM.A0r();
            A0r2.append(cls);
            throw C18190wL.A0a(C18180wK.A0i(" is an Enum. You should use EnumType instead.", A0r2));
        }
    }
}
