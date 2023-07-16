package X;

/* renamed from: X.2C7  reason: invalid class name */
public final class AnonymousClass2C7 {
    public static Enum A00(Class cls, String str) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            for (Enum enumR : enumArr) {
                if (enumR.name().equalsIgnoreCase(str)) {
                    return enumR;
                }
            }
        }
        return null;
    }
}
