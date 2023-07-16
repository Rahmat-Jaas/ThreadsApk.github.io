package X;

import com.instagram.quickpromotion.intf.IDxUActionShape58S0000000_1_I2;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: X.268  reason: invalid class name */
public enum AnonymousClass268 {
    ;
    
    public final String A00;

    public static AnonymousClass268 A00(String str, String str2, int i) {
        return new AnonymousClass268(str, i, str2);
    }

    public static AnonymousClass268 A01(String str, EnumSet enumSet) {
        boolean A022;
        AnonymousClass268 r5 = A0E;
        if (!enumSet.remove(r5) || !r5.A02(str)) {
            r5 = null;
            if (str != null) {
                String A0g = C18240wQ.A0g(str);
                Iterator it = enumSet.iterator();
                while (it.hasNext()) {
                    AnonymousClass268 r2 = (AnonymousClass268) it.next();
                    if (r2 instanceof IDxUActionShape58S0000000_1_I2) {
                        IDxUActionShape58S0000000_1_I2 iDxUActionShape58S0000000_1_I2 = (IDxUActionShape58S0000000_1_I2) r2;
                        if (4 - iDxUActionShape58S0000000_1_I2.A00 != 0) {
                            A022 = iDxUActionShape58S0000000_1_I2.A02(A0g);
                        } else {
                            AnonymousClass3RZ.A00();
                        }
                    } else {
                        A022 = r2.A02(A0g);
                    }
                    if (A022) {
                        return r2;
                    }
                }
            }
        }
        return r5;
    }

    public final boolean A02(String str) {
        if (!(this instanceof IDxUActionShape58S0000000_1_I2)) {
            return str.startsWith(this.A00);
        }
        IDxUActionShape58S0000000_1_I2 iDxUActionShape58S0000000_1_I2 = (IDxUActionShape58S0000000_1_I2) this;
        switch (iDxUActionShape58S0000000_1_I2.A00) {
            case 0:
                try {
                    if (!str.startsWith(iDxUActionShape58S0000000_1_I2.A00) || C15430rJ.A01(str).getQueryParameter("package_name") == null || C15430rJ.A01(str).getQueryParameter("referrer") == null) {
                        return false;
                    }
                    return true;
                } catch (NullPointerException | UnsupportedOperationException unused) {
                    return false;
                }
            case 1:
                if (!str.startsWith(iDxUActionShape58S0000000_1_I2.A00) || C15430rJ.A01(str).getQueryParameter("id") == null || C15430rJ.A01(str).getQueryParameter("referrer") == null) {
                    return false;
                }
                return true;
            case 2:
                if (!str.startsWith(iDxUActionShape58S0000000_1_I2.A00) || C15430rJ.A01(str).getQueryParameter("url") == null) {
                    return false;
                }
                return true;
            case 3:
                if (!str.startsWith(iDxUActionShape58S0000000_1_I2.A00) || C15430rJ.A01(str).getQueryParameter("qp_h") == null) {
                    return false;
                }
                return true;
            case 5:
                if (str == null) {
                    return true;
                }
                return false;
            case 6:
                if (!str.startsWith(iDxUActionShape58S0000000_1_I2.A00) || C15430rJ.A01(str).getQueryParameter("bloks_app_id") == null) {
                    return false;
                }
                return true;
            default:
                return str.startsWith(iDxUActionShape58S0000000_1_I2.A00);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass268(String str) {
        this.A00 = str;
    }
}
