package X;

import java.util.Arrays;

/* renamed from: X.8AR  reason: invalid class name */
public class AnonymousClass8AR extends C102556Vq {
    public static final boolean A0I(Object[] objArr, Object[] objArr2) {
        int length;
        boolean equals;
        if (objArr != objArr2) {
            if (!(objArr == null || objArr2 == null || (length = objArr.length) != objArr2.length)) {
                for (int i = 0; i < length; i++) {
                    Object[] objArr3 = objArr[i];
                    Object[] objArr4 = objArr2[i];
                    if (objArr3 != objArr4) {
                        if (!(objArr3 == null || objArr4 == null)) {
                            if ((objArr3 instanceof Object[]) && (objArr4 instanceof Object[])) {
                                equals = A0I(objArr3, objArr4);
                            } else if ((objArr3 instanceof byte[]) && (objArr4 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) objArr3, (byte[]) objArr4);
                            } else if ((objArr3 instanceof short[]) && (objArr4 instanceof short[])) {
                                equals = Arrays.equals((short[]) objArr3, (short[]) objArr4);
                            } else if ((objArr3 instanceof int[]) && (objArr4 instanceof int[])) {
                                equals = Arrays.equals((int[]) objArr3, (int[]) objArr4);
                            } else if ((objArr3 instanceof long[]) && (objArr4 instanceof long[])) {
                                equals = Arrays.equals((long[]) objArr3, (long[]) objArr4);
                            } else if ((objArr3 instanceof float[]) && (objArr4 instanceof float[])) {
                                equals = Arrays.equals((float[]) objArr3, (float[]) objArr4);
                            } else if ((objArr3 instanceof double[]) && (objArr4 instanceof double[])) {
                                equals = Arrays.equals((double[]) objArr3, (double[]) objArr4);
                            } else if ((objArr3 instanceof char[]) && (objArr4 instanceof char[])) {
                                equals = Arrays.equals((char[]) objArr3, (char[]) objArr4);
                            } else if (!(objArr3 instanceof boolean[]) || !(objArr4 instanceof boolean[])) {
                                equals = objArr3.equals(objArr4);
                            } else {
                                equals = Arrays.equals((boolean[]) objArr3, (boolean[]) objArr4);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
