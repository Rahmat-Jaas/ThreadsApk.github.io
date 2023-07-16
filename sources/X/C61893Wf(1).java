package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: X.3Wf  reason: invalid class name and case insensitive filesystem */
public final class C61893Wf {
    public static final boolean A02(String str, String str2) {
        String str3;
        if (str == null) {
            return str2 == null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1b = C18200wM.A1b(str, i2);
            if (z) {
                if (!A1b) {
                    break;
                }
                length--;
            } else if (!A1b) {
                z = true;
            } else {
                i++;
            }
        }
        String A0s = C18220wO.A0s(str, length, i);
        if (str2 != null) {
            int length2 = str2.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length2) {
                int i4 = length2;
                if (!z2) {
                    i4 = i3;
                }
                boolean A1b2 = C18200wM.A1b(str2, i4);
                if (z2) {
                    if (!A1b2) {
                        break;
                    }
                    length2--;
                } else if (!A1b2) {
                    z2 = true;
                } else {
                    i3++;
                }
            }
            str3 = C18220wO.A0s(str2, length2, i3);
        } else {
            str3 = null;
        }
        return C04220Ms.A0I(A0s, str3);
    }

    public static final long A00(String str) {
        if (str == null) {
            return 0;
        }
        CRC32 crc32 = new CRC32();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1U = C18230wP.A1U(str.charAt(i2));
            if (z) {
                if (!A1U) {
                    break;
                }
                length--;
            } else if (!A1U) {
                z = true;
            } else {
                i++;
            }
        }
        String A0s = C18220wO.A0s(str, length, i);
        Charset forName = Charset.forName("UTF-8");
        C04220Ms.A06(forName);
        byte[] bytes = A0s.getBytes(forName);
        C04220Ms.A06(bytes);
        crc32.update(bytes);
        return crc32.getValue();
    }

    public static final String A01(Context context, CountryCodeData countryCodeData, String str, String str2, List list, List list2) {
        AnonymousClass0wJ.A1N(context, countryCodeData);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C61583Uh r7 = (C61583Uh) list.get(i);
                String str3 = null;
                try {
                    str3 = String.valueOf(PhoneNumberUtil.A01(context).A0A(r7.A01, countryCodeData.A00).A02);
                } catch (C32122Ah unused) {
                }
                A0v.add(new C61363Sx(r7.A00, A00(str3), C18180wK.A1W(i), A02(str, str3)));
            }
        }
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C61583Uh r3 = (C61583Uh) list2.get(i2);
                A0v2.add(new C61363Sx(r3.A00, A00(r3.A01), C18180wK.A1W(i2), A02(str2, r3.A01)));
            }
        }
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0t = C18190wL.A0t(A0K, "p", A0v);
            while (A0t.hasNext()) {
                C61363Sx r1 = (C61363Sx) A0t.next();
                if (r1 != null) {
                    C50682tO.A00(A0K, r1);
                }
            }
            A0K.A0F();
            Iterator A0t2 = C18190wL.A0t(A0K, "e", A0v2);
            while (A0t2.hasNext()) {
                C61363Sx r0 = (C61363Sx) A0t2.next();
                if (r0 != null) {
                    C50682tO.A00(A0K, r0);
                }
            }
            A0K.A0F();
            String A0h = C18180wK.A0h(A0K, A0d);
            C04220Ms.A06(A0h);
            return A0h;
        } catch (IOException unused2) {
            return "";
        }
    }
}
