package X;

import android.os.Bundle;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;

/* renamed from: X.596  reason: invalid class name */
public final class AnonymousClass596 extends AnonymousClass7A8 {
    public final Class A00;

    public AnonymousClass596(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                Class<?> cls2 = Class.forName(AnonymousClass00U.A0M("[L", cls.getName(), BasicHeaderValueParser.PARAM_DELIMITER));
                if (cls2 != null) {
                    this.A00 = cls2;
                    return;
                }
                throw C18210wN.A0W("null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
            } catch (ClassNotFoundException e) {
                throw C86114wI.A0k(e);
            }
        } else {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(cls);
            throw C18190wL.A0a(C18180wK.A0i(" does not implement Parcelable.", A0r));
        }
    }

    public final /* bridge */ /* synthetic */ Object A01(String str) {
        throw C86134wK.A0s("Arrays don't support default values.");
    }

    public final String A02() {
        String name = this.A00.getName();
        C04220Ms.A06(name);
        return name;
    }

    public final /* bridge */ /* synthetic */ void A03(Bundle bundle, Object obj, String str) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        AnonymousClass0wJ.A1N(bundle, str);
        this.A00.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18190wL.A1Y(this, obj)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((AnonymousClass596) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object A00(Bundle bundle, String str) {
        AnonymousClass0wJ.A1N(bundle, str);
        return bundle.get(str);
    }
}
