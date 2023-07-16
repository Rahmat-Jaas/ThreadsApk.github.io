package X;

import java.lang.reflect.Executable;

/* renamed from: X.0N8  reason: invalid class name */
public final class AnonymousClass0N8 {
    public static final String A00(Class cls) {
        String str;
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Executable enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod == null && (enclosingMethod = cls.getEnclosingConstructor()) == null) {
                    C04220Ms.A06(simpleName);
                    return AnonymousClass8bP.A0U(simpleName, '$');
                }
                C04220Ms.A06(simpleName);
                return AnonymousClass8bP.A0Z(simpleName, AnonymousClass00U.A0A(enclosingMethod.getName(), '$'), simpleName);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive() || (str = (String) C02230Ai.A03.get(componentType.getName())) == null || (str2 = AnonymousClass00U.A0L(str, "Array")) == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) C02230Ai.A03.get(cls.getName());
                if (str3 == null) {
                    return cls.getSimpleName();
                }
                return str3;
            }
        }
        return str2;
    }
}
