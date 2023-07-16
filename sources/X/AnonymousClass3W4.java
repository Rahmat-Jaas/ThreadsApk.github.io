package X;

import android.os.BaseBundle;
import android.os.Bundle;

/* renamed from: X.3W4  reason: invalid class name */
public final class AnonymousClass3W4 {
    public static void A01(Bundle bundle, String str) {
        Class<byte[]> cls = byte[].class;
        Object obj = bundle.get(str);
        if (obj != null) {
            A02(str, obj, cls);
            return;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Missing required key: ", str));
    }

    public static void A02(String str, Object obj, Class cls) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A0s = C18190wL.A0s("Expecting: ");
            A0s.append(cls);
            A0s.append(" under key ");
            A0s.append(str);
            A0s.append(" but was: ");
            throw C18190wL.A0a(C18200wM.A0m(cls2, A0s));
        }
    }

    public static void A00(BaseBundle baseBundle, Class cls, String str) {
        A02(str, baseBundle.get(str), cls);
    }
}
