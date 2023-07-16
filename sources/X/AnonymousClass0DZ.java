package X;

/* renamed from: X.0DZ  reason: invalid class name */
public abstract class AnonymousClass0DZ {
    public static boolean A01(C002000x r7, C002000x r8) {
        boolean equals;
        if (r7 != r8) {
            int size = r7.size();
            if (size == r8.size()) {
                int i = 0;
                while (i < size) {
                    Object[] objArr = r7.A02;
                    int i2 = i << 1;
                    Object obj = objArr[i2];
                    Object obj2 = objArr[i2 + 1];
                    Object obj3 = r8.get(obj);
                    if (obj2 != null) {
                        equals = obj2.equals(obj3);
                    } else if (obj3 == null) {
                        equals = r8.containsKey(obj);
                    }
                    if (equals) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }
}
