package X;

import android.content.SharedPreferences;
import com.instagram.preferences.common.Nux;
import com.instagram.service.session.UserSession;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.64f  reason: invalid class name and case insensitive filesystem */
public final class C962964f extends C696949q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C962964f(AnonymousClass0gW r2, UserSession userSession) {
        super(r2, userSession);
        C04220Ms.A0B(userSession, 1);
    }

    public final SharedPreferences A01(D2R d2r) {
        C04220Ms.A0B(d2r, 0);
        if (d2r == D2R.A2Z) {
            return A02(d2r, C28161tl.class);
        }
        return super.A01(d2r);
    }

    public final SharedPreferences A02(D2R d2r, Class cls) {
        Field[] declaredFields;
        C04220Ms.A0B(d2r, 0);
        SharedPreferences A01 = super.A01(d2r);
        LinkedHashMap A0y = C18220wO.A0y();
        LinkedHashMap A0y2 = C18220wO.A0y();
        if (!(cls == null || (declaredFields = cls.getDeclaredFields()) == null)) {
            ArrayList<Field> A0v = AnonymousClass0wJ.A0v();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Nux.class) && C04220Ms.A0I(field.getType(), String.class)) {
                    A0v.add(field);
                }
            }
            for (Field field2 : A0v) {
                field2.setAccessible(true);
                Annotation annotation = field2.getAnnotation(Nux.class);
                C04220Ms.A06(annotation);
                Nux nux = (Nux) annotation;
                Object obj = field2.get((Object) null);
                if (obj instanceof String) {
                    A0y.put(obj, Boolean.valueOf(nux.getBooleanAlwaysReturn()));
                    C86134wK.A1P(obj, A0y2, nux.getIntAlwaysReturn());
                }
            }
        }
        return new C37461Jt7(A01, A0y, A0y2);
    }
}
