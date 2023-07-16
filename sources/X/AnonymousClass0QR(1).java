package X;

import java.lang.reflect.Field;

/* renamed from: X.0QR  reason: invalid class name */
public final class AnonymousClass0QR extends C019509b {
    public static Class A01;
    public static boolean A02;
    public static boolean A03;
    public static Field[] A04;
    public static Field[] A05;
    public final Object A00;

    public static Field[] A00(C03410If r9, Class cls, Class cls2, String str, int i) {
        Field[] fieldArr = new Field[i];
        int i2 = 0;
        while (i2 <= i) {
            int i3 = i2 + 1;
            String A0J = AnonymousClass00U.A0J(str, i3);
            try {
                fieldArr[i2] = r9.A0H((C03400Id) null, cls, cls2, A0J);
            } catch (Exception e) {
                AnonymousClass0K9 r2 = AnonymousClass0F8.A00;
                if (i3 <= 2) {
                    r2.A0C(e, "Could not find %s class needed field %s (%d of %d) on this platform", cls, A0J, Integer.valueOf(i3), 2);
                    return null;
                }
                r2.A09(e, "Could not find %s class field %s on this platform", cls, A0J);
            }
            i2 = i3;
        }
        return fieldArr;
    }

    public final Object A03(int i) {
        Field[] fieldArr = A05;
        fieldArr.getClass();
        Field field = fieldArr[0];
        if (field != null) {
            try {
                return field.get(this.A00);
            } catch (Exception e) {
                String format = String.format("Cannot access SomeArgs obj field for %s%d.", new Object[]{"arg", 1});
                AnonymousClass0F8.A00.A03(format, e);
                throw new AnonymousClass0KI(format, e);
            }
        } else {
            throw new AnonymousClass0KI(String.format("Don't know how to access SomeArgs obj field for %s%d.", new Object[]{"arg", 1}));
        }
    }

    public final int A02(int i) {
        Field[] fieldArr = A04;
        fieldArr.getClass();
        Field field = fieldArr[i - 1];
        if (field != null) {
            try {
                return field.getInt(this.A00);
            } catch (Exception e) {
                String format = String.format("Cannot access SomeArgs int field for %s%d.", new Object[]{"argi", Integer.valueOf(i)});
                AnonymousClass0F8.A00.A03(format, e);
                throw new AnonymousClass0KI(format, e);
            }
        } else {
            throw new AnonymousClass0KI(String.format("Don't know how to access SomeArgs int field for %s%d.", new Object[]{"argi", Integer.valueOf(i)}));
        }
    }

    public AnonymousClass0QR(Object obj) {
        this.A00 = obj;
    }
}
