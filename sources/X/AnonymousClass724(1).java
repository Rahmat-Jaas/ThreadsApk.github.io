package X;

/* renamed from: X.724  reason: invalid class name */
public final class AnonymousClass724 {
    public static final Class A01(AnonymousClass0W7 r2) {
        String name;
        C04220Ms.A0B(r2, 0);
        Class AqX = ((AnonymousClass0XL) r2).AqX();
        if (AqX.isPrimitive() && (name = AqX.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return AqX;
    }

    public static final Class A00(AnonymousClass0W7 r1) {
        Class AqX = ((AnonymousClass0XL) r1).AqX();
        C04220Ms.A0C(AqX, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return AqX;
    }
}
