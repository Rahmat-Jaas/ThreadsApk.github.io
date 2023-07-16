package X;

import android.util.Log;
import android.util.SparseArray;
import com.instagram.react.modules.base.IgNetworkingModule;

/* renamed from: X.0fA  reason: invalid class name and case insensitive filesystem */
public final class C09280fA implements AnonymousClass0WP {
    public Object A00;
    public final SparseArray A01 = new SparseArray(8);
    public final C15030qb A02;

    private Object A00(int i) {
        int i2;
        String str;
        Object obj = this.A00;
        if (obj != null) {
            switch (i) {
                case 1:
                    i2 = 0;
                    str = IgNetworkingModule.REQUEST_BODY_KEY_STRING;
                    break;
                case 2:
                case 3:
                    i2 = 1;
                    str = "int";
                    break;
                case 4:
                    i2 = 7;
                    str = "string_array";
                    break;
                case 6:
                    i2 = 4;
                    str = "double";
                    break;
                case 7:
                    i2 = 5;
                    str = "double_array";
                    break;
                case 8:
                    i2 = 2;
                    str = "bool";
                    break;
                case 9:
                    i2 = 3;
                    str = "bool_array";
                    break;
                default:
                    i2 = 6;
                    str = "int_array";
                    break;
            }
            SparseArray sparseArray = this.A01;
            Object obj2 = sparseArray.get(i2);
            if (obj2 != null) {
                return obj2;
            }
            C15680ri r0 = new C15680ri();
            ((C15680ri) obj).A07(r0, str);
            sparseArray.put(i2, r0);
            return r0;
        }
        throw new NullPointerException("Attempting to use visitor without destination");
    }

    public final void DAn(String str, String str2, int i) {
        if (str2 != null) {
            switch (i) {
                case 1:
                    ((C15680ri) A00(i)).A0D(str, str2);
                    return;
                case 2:
                    ((C15680ri) A00(i)).A09(Integer.valueOf(Integer.parseInt(str2)), str);
                    return;
                case 3:
                    ((C15680ri) A00(i)).A0C(str, Long.valueOf(Long.parseLong(str2)));
                    return;
                case 4:
                    this.A02.A03(A00(i), str, str2.split(",,,"));
                    return;
                case 5:
                case 10:
                    this.A02.A02(A00(i), str, str2.split(",,,"));
                    return;
                case 6:
                    ((C15680ri) A00(i)).A0B(str, Double.valueOf(Double.parseDouble(str2)));
                    return;
                case 7:
                    this.A02.A01(A00(i), str, str2.split(",,,"));
                    return;
                case 8:
                    ((C15680ri) A00(i)).A0A(str, Boolean.valueOf(Boolean.parseBoolean(str2)));
                    return;
                case 9:
                    this.A02.A00(A00(i), str, str2.split(",,,"));
                    return;
                default:
                    try {
                        throw new IllegalArgumentException(AnonymousClass00U.A0J("Unsupported type: ", i));
                    } catch (NumberFormatException e) {
                        Log.w("QPL", "Failed to parse int annotation", e);
                        return;
                    }
            }
        }
    }

    public C09280fA(C15030qb r3) {
        this.A02 = r3;
    }
}
