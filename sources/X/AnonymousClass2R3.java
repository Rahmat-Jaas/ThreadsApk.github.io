package X;

import com.instagram.model.business.PublicPhoneContact;
import java.io.StringWriter;

/* renamed from: X.2R3  reason: invalid class name */
public final class AnonymousClass2R3 {
    public static String A00(PublicPhoneContact publicPhoneContact) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        String str = publicPhoneContact.A03;
        if (str != null) {
            A0K.A0d("public_phone_number", str);
        }
        String str2 = publicPhoneContact.A00;
        if (str2 != null) {
            A0K.A0d("business_contact_method", str2);
        }
        return C18180wK.A0h(A0K, A0d);
    }
}
