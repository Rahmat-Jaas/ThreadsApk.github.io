package X;

import com.facebook.forker.Process;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.7Fj  reason: invalid class name and case insensitive filesystem */
public final class C121297Fj {
    public static int A00(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? Process.WAIT_RESULT_TIMEOUT : (int) j;
    }

    public static int A01(int... iArr) {
        int length = iArr.length;
        AnonymousClass7Ko.A0B(C18180wK.A1X(length));
        int i = iArr[0];
        for (int i2 = 1; i2 < length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public static int A02(int... iArr) {
        int length = iArr.length;
        AnonymousClass7Ko.A0B(C18180wK.A1X(length));
        int i = iArr[0];
        for (int i2 = 1; i2 < length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    public static int[] A03(Collection collection) {
        if (collection instanceof AnonymousClass89J) {
            AnonymousClass89J r4 = (AnonymousClass89J) collection;
            return Arrays.copyOfRange(r4.A02, r4.A01, r4.A00);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = AnonymousClass0wJ.A04(obj);
        }
        return iArr;
    }
}
