package X;

import com.facebook.common.stringformat.StringFormatUtil;
import org.json.JSONException;

/* renamed from: X.6px  reason: invalid class name and case insensitive filesystem */
public final class C112646px {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final String A00() {
        char c;
        Object[] objArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.A01;
        String str6 = this.A02;
        boolean z = this.A03;
        if (str5 != null) {
            String str7 = this.A00;
            Object[] A1Y = C18230wP.A1Y();
            A1Y[0] = Boolean.valueOf(z);
            A1Y[1] = str7;
            c = 2;
            objArr = A1Y;
        } else {
            str5 = this.A00;
            Object[] A1X = C18220wO.A1X();
            A1X[0] = Boolean.valueOf(z);
            c = 1;
            objArr = A1X;
        }
        objArr[c] = str5;
        if (!AnonymousClass3RQ.A00.contains(str6)) {
            return null;
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(StringFormatUtil.formatStrLocaleSafe("%s(", (Object) str6));
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                String str8 = (String) obj;
                try {
                    str4 = str8;
                    String replace = AnonymousClass7CH.A00(C18250wR.A0j(str8)).toString().replace("\\\\", "\\");
                    str4 = replace;
                    str3 = replace;
                } catch (JSONException unused) {
                    str3 = AnonymousClass7CH.A01(str4, false);
                }
                str2 = "'%s'";
                str = str3;
            } else if (obj instanceof Integer) {
                str2 = "%d";
                str = obj;
            } else if (obj instanceof Boolean) {
                str2 = "%b";
                str = obj;
            } else {
                throw C18250wR.A0V("Invalid bridge call parameters");
            }
            A0r.append(StringFormatUtil.formatStrLocaleSafe(str2, str));
            if (i < length - 1) {
                C86144wL.A1T(A0r);
            }
        }
        return C18180wK.A0i(");", A0r);
    }

    public C112646px(String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = str2;
        this.A01 = str3;
    }
}
