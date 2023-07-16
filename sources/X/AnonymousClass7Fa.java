package X;

import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.7Fa  reason: invalid class name */
public final class AnonymousClass7Fa {
    public static final boolean A00(SparseArray sparseArray, SparseArray sparseArray2) {
        int size;
        if (sparseArray != sparseArray2) {
            if (!(sparseArray == null || sparseArray2 == null || (size = sparseArray.size()) != sparseArray2.size())) {
                int i = 0;
                while (i < size) {
                    if (C04220Ms.A0I(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(Object obj, Object obj2) {
        int compare;
        boolean z = true;
        if (obj != obj2) {
            int i = 0;
            if (!(obj == null || obj2 == null)) {
                Class<?> cls = obj.getClass();
                if (C04220Ms.A0I(cls, obj2.getClass())) {
                    if (obj instanceof Float) {
                        compare = Float.compare(C18240wQ.A00(obj), C18240wQ.A00(obj2));
                    } else if (obj instanceof Double) {
                        compare = Double.compare(C86124wJ.A00(obj), C86124wJ.A00(obj2));
                    } else if (obj instanceof C143498gq) {
                        return ((C143498gq) obj).BTb(obj2);
                    } else {
                        if (cls.isArray()) {
                            if (obj instanceof byte[]) {
                                return Arrays.equals((byte[]) obj, (byte[]) obj2);
                            }
                            if (obj instanceof short[]) {
                                return Arrays.equals((short[]) obj, (short[]) obj2);
                            }
                            if (obj instanceof char[]) {
                                return Arrays.equals((char[]) obj, (char[]) obj2);
                            }
                            if (obj instanceof int[]) {
                                return Arrays.equals((int[]) obj, (int[]) obj2);
                            }
                            if (obj instanceof long[]) {
                                return Arrays.equals((long[]) obj, (long[]) obj2);
                            }
                            if (obj instanceof float[]) {
                                return Arrays.equals((float[]) obj, (float[]) obj2);
                            }
                            if (obj instanceof double[]) {
                                return Arrays.equals((double[]) obj, (double[]) obj2);
                            }
                            if (obj instanceof boolean[]) {
                                return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                            }
                            Object[] objArr = (Object[]) obj;
                            Object[] objArr2 = (Object[]) obj2;
                            int length = objArr.length;
                            if (length != objArr2.length) {
                                return false;
                            }
                            while (i < length) {
                                if (!A02(objArr[i], objArr2[i])) {
                                    return false;
                                }
                                i++;
                            }
                            return true;
                        } else if ((obj instanceof List) && (obj instanceof RandomAccess)) {
                            List list = (List) obj;
                            List list2 = (List) obj2;
                            z = false;
                            if (list.size() == list2.size()) {
                                int size = list.size();
                                while (i < size) {
                                    if (A02(list.get(i), list2.get(i))) {
                                        i++;
                                    }
                                }
                                return true;
                            }
                        } else if (!(obj instanceof Collection)) {
                            return obj.equals(obj2);
                        } else {
                            Collection<Object> collection = (Collection) obj;
                            Collection collection2 = (Collection) obj2;
                            z = false;
                            if (collection.size() == collection2.size()) {
                                Iterator it = collection2.iterator();
                                for (Object A02 : collection) {
                                    if (!A02(A02, it.next())) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                    if (compare == 0) {
                        return z;
                    }
                    return false;
                }
            }
            return false;
        }
        return z;
    }

    public static final boolean A03(Object obj, Object obj2) {
        if (obj != obj2) {
            Class<?> cls = obj.getClass();
            if (C04220Ms.A0I(cls, obj2.getClass())) {
                Field[] declaredFields = cls.getDeclaredFields();
                C04220Ms.A06(declaredFields);
                int length = declaredFields.length;
                int i = 0;
                while (i < length) {
                    Field field = declaredFields[i];
                    try {
                        boolean isAccessible = field.isAccessible();
                        if (!isAccessible) {
                            field.setAccessible(true);
                        }
                        Object obj3 = field.get(obj);
                        Object obj4 = field.get(obj2);
                        if (!isAccessible) {
                            field.setAccessible(false);
                        }
                        if (A02(obj3, obj4)) {
                            i++;
                        }
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(AnonymousClass000.A00(738), e);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A01(C143498gq r0, C143498gq r1) {
        if (r0 == r1) {
            return true;
        }
        if (r0 == null || r1 == null) {
            return false;
        }
        return r0.BTb(r1);
    }
}
