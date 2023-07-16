package X;

/* renamed from: X.594  reason: invalid class name */
public final class AnonymousClass594 extends AnonymousClass599 {
    public final Class A00;

    public AnonymousClass594(Class cls) {
        super(cls, false);
        if (cls.isEnum()) {
            this.A00 = cls;
            return;
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(cls);
        throw C18190wL.A0a(C18180wK.A0i(" is not an Enum type.", A0r));
    }

    /* renamed from: A04 */
    public final Enum A01(String str) {
        Enum enumR;
        C04220Ms.A0B(str, 0);
        Class cls = this.A00;
        Object[] enumConstants = cls.getEnumConstants();
        C04220Ms.A06(enumConstants);
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumR = null;
                break;
            }
            enumR = enumConstants[i];
            String name = ((Enum) enumR).name();
            if (name != null && name.equalsIgnoreCase(str)) {
                break;
            }
            i++;
        }
        Enum enumR2 = enumR;
        if (enumR2 != null) {
            return enumR2;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0e("Enum value ", str, " not found for type ", cls.getName(), '.'));
    }

    public final String A02() {
        String name = this.A00.getName();
        C04220Ms.A06(name);
        return name;
    }
}
