package X;

/* renamed from: X.6J6  reason: invalid class name */
public final class AnonymousClass6J6 {
    public static String A00(String str, Object... objArr) {
        int length;
        String A0z;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                A0z = "null";
            } else {
                try {
                    A0z = obj.toString();
                } catch (Exception e) {
                    A0z = C86104wH.A0z(obj, e);
                }
            }
            objArr[i2] = A0z;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A0s = C86114wI.A0s((length << 4) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0s.append(str, i3, indexOf);
            A0s.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0s.append(str, i3, length2);
        if (i < length) {
            A0s.append(" [");
            A0s.append(objArr[i]);
            for (int i4 = i + 1; i4 < length; i4++) {
                C86144wL.A1T(A0s);
                A0s.append(objArr[i4]);
            }
            A0s.append(']');
        }
        return A0s.toString();
    }
}
