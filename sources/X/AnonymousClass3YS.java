package X;

import android.content.Context;
import org.json.JSONArray;

/* renamed from: X.3YS  reason: invalid class name */
public final class AnonymousClass3YS {
    public static final AnonymousClass3YS A00 = new AnonymousClass3YS();

    public final String A01(Context context, String str, String str2) {
        int i;
        Object[] objArr;
        if (str != null && str.length() != 0) {
            i = 2131822846;
            objArr = new Object[1];
        } else if (str2 == null || str2.length() == 0) {
            return null;
        } else {
            i = 2131822847;
            objArr = new Object[1];
            str = A00(str2);
        }
        objArr[0] = str;
        return context.getString(i, objArr);
    }

    public static final String A00(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            C04220Ms.A06(string);
            strArr[i] = string;
        }
        return AnonymousClass8AP.A06(", ", (CharSequence) null, (CharSequence) null, C80184lK.A00, strArr, 30);
    }

    public final String A02(Context context, String str, String str2, String str3, boolean z) {
        int i;
        if (str2 != null && str2.length() != 0) {
            i = 2131822849;
            if (z) {
                i = 2131822844;
            }
        } else if (str3 == null || str3.length() == 0) {
            return null;
        } else {
            i = 2131822850;
            if (z) {
                i = 2131822845;
            }
            str2 = A00(str3);
        }
        return context.getString(i, new Object[]{str, str2});
    }
}
