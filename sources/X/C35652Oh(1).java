package X;

import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.StringWriter;

/* renamed from: X.2Oh  reason: invalid class name and case insensitive filesystem */
public final class C35652Oh {
    public static String A00(AnonymousClass3TD r4) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        FxcalAccountType fxcalAccountType = r4.A00;
        if (fxcalAccountType != null) {
            A0K.A0d("account_type", fxcalAccountType.A00);
        }
        A0K.A0b("token_id", 0);
        String str = r4.A04;
        if (str != null) {
            A0K.A0d("token_str", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            A0K.A0d("user_fbid", str2);
        }
        AnonymousClass25F r0 = r4.A01;
        if (r0 != null) {
            A0K.A0d("token_type", r0.A00);
        }
        String str3 = r4.A02;
        if (str3 != null) {
            A0K.A0d("token_app", str3);
        }
        String str4 = r4.A03;
        if (str4 != null) {
            A0K.A0d("token_source", str4);
        }
        return C18180wK.A0h(A0K, A0d);
    }
}
