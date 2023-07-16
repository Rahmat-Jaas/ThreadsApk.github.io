package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3V1  reason: invalid class name */
public final class AnonymousClass3V1 {
    public final Bundle A00 = C18180wK.A06();

    public final void A01() {
        this.A00.putBoolean(C18240wQ.A0g("WAS_FROM_RECOVERY_FLOW"), true);
    }

    public static AnonymousClass3V1 A00(Bundle bundle) {
        AnonymousClass3V1 r3 = new AnonymousClass3V1();
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                AnonymousClass267[] values = AnonymousClass267.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    AnonymousClass267 r1 = values[i];
                    String name = r1.name();
                    if (name.equals(A0k.toUpperCase(Locale.US))) {
                        Class<List> cls = r1.A00;
                        if (cls == String.class) {
                            Bundle bundle2 = r3.A00;
                            String A0g = C18240wQ.A0g(name);
                            bundle2.putString(A0g, bundle.getString(A0g));
                        } else if (cls == Boolean.class) {
                            Bundle bundle3 = r3.A00;
                            String A0g2 = C18240wQ.A0g(name);
                            bundle3.putBoolean(A0g2, bundle.getBoolean(A0g2));
                        } else if (cls == Integer.class) {
                            Bundle bundle4 = r3.A00;
                            String A0g3 = C18240wQ.A0g(name);
                            bundle4.putInt(A0g3, bundle.getInt(A0g3));
                        } else if (cls == List.class) {
                            Bundle bundle5 = r3.A00;
                            String A0g4 = C18240wQ.A0g(name);
                            bundle5.putStringArrayList(A0g4, bundle.getStringArrayList(A0g4));
                        } else {
                            throw C18180wK.A0a("Attempted to add an extra value of an unrecognizable type.");
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return r3;
    }

    public final void A02(C15730rn r10) {
        Bundle bundle = this.A00;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            AnonymousClass267[] values = AnonymousClass267.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass267 r1 = values[i];
                String name = r1.name();
                if (name.equals(A0k.toUpperCase(Locale.US))) {
                    Class<List> cls = r1.A00;
                    if (cls == String.class) {
                        String A0g = C18240wQ.A0g(name);
                        r10.A0D(A0g, bundle.getString(A0g));
                    } else if (cls == Boolean.class) {
                        String A0g2 = C18240wQ.A0g(name);
                        r10.A09(A0g2, C18210wN.A0Q(bundle, A0g2));
                    } else if (cls == Integer.class) {
                        String A0g3 = C18240wQ.A0g(name);
                        r10.A08(C18210wN.A0T(bundle, A0g3), A0g3);
                    } else if (cls == List.class) {
                        String A0g4 = C18240wQ.A0g(name);
                        r10.A0E(A0g4, bundle.getStringArrayList(A0g4));
                    } else {
                        throw C18180wK.A0a("Attempted to add an extra value of an unrecognizable type.");
                    }
                } else {
                    i++;
                }
            }
        }
    }
}
