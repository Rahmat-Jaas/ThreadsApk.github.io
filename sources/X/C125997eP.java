package X;

import android.content.SharedPreferences;
import com.facebook.redex.IDxComparatorShape95S0000000_2_I2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7eP  reason: invalid class name and case insensitive filesystem */
public final class C125997eP implements C147058nK {
    public final C03700Kj A00;
    public final C1200878l A01;

    public C125997eP(C03700Kj r2, C1200878l r3) {
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final AnonymousClass5Id CZ7(String str, int i) {
        C04220Ms.A0B(str, 0);
        AnonymousClass5Id A002 = A00(str, i);
        try {
            Iterable<AnonymousClass5HH> iterable = (Iterable) A002.A00;
            ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
            for (AnonymousClass5HH r0 : iterable) {
                A0w.add(AnonymousClass0wJ.A0d((String) r0.A02));
            }
            return AnonymousClass5Id.A01(A0w, A002.A01, A002.A02);
        } catch (NumberFormatException unused) {
            return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "Number format exception when using toLong()", false);
        }
    }

    private final List A01() {
        C1200878l r6 = this.A01;
        Set<String> keySet = r6.A00.getAll().keySet();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (T next : keySet) {
            String str = (String) next;
            C04220Ms.A04(str);
            if (C18220wO.A1V(AnonymousClass00U.A0A(r6.A01, '_'), 1, str)) {
                A0v.add(next);
            }
        }
        ArrayList A0x = AnonymousClass0wJ.A0x(A0v, 10);
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            C18240wQ.A1I(A0k);
            A0x.add(AnonymousClass8bP.A0Q(AnonymousClass00U.A0A(r6.A01, '_'), A0k));
        }
        ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
        Iterator it2 = A0x.iterator();
        while (it2.hasNext()) {
            A0x2.add(AnonymousClass8bP.A0Q("sig_", C18180wK.A0k(it2)));
        }
        return A0x2;
    }

    private final void A02(String str, List list) {
        String A0n;
        C1200878l r7 = this.A01;
        C04220Ms.A0B(str, 0);
        String A0L = AnonymousClass00U.A0L("sig_", str);
        if (list.isEmpty()) {
            A0n = "";
        } else {
            StringBuilder A0r = C18200wM.A0r();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass5HH r3 = (AnonymousClass5HH) it.next();
                A0r.append((String) r3.A02);
                A0r.append(";");
                A0r.append(r3.A00);
                A0r.append(";");
                A0r.append(r3.A01);
                A0r.append(";");
            }
            A0r.deleteCharAt(A0r.length() - 1);
            A0n = C18190wL.A0n(A0r);
        }
        AnonymousClass0wJ.A1N(A0L, A0n);
        SharedPreferences.Editor edit = r7.A00.edit();
        String str2 = r7.A01;
        C04220Ms.A0B(str2, 0);
        C18180wK.A0v(edit, AnonymousClass00U.A0N(str2, A0L, '_'), A0n);
    }

    private final AnonymousClass5Id A00(String str, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C1200878l r3 = this.A01;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        String A0L = AnonymousClass00U.A0L("sig_", str2);
        String str3 = "";
        C04220Ms.A0B(A0L, 0);
        String string = r3.A00.getString(C1200878l.A00(r3, A0L), str3);
        if (string != null) {
            str3 = string;
        }
        try {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            int i2 = 0;
            if (str3.length() != 0) {
                List A0f = AnonymousClass8bP.A0f(str3, new String[]{";"}, 0, 6);
                int A002 = C102586Vt.A00(0, C86104wH.A0B(A0f), 3);
                if (A002 >= 0) {
                    while (true) {
                        Object obj = A0f.get(i2);
                        long parseLong = Long.parseLong(C18190wL.A0p(A0f, i2 + 1));
                        long parseLong2 = Long.parseLong(C18190wL.A0p(A0f, i2 + 2));
                        if (currentTimeMillis <= parseLong + parseLong2) {
                            A0v.add(new AnonymousClass5HH(obj, parseLong, parseLong2));
                        }
                        if (i2 == A002) {
                            break;
                        }
                        i2 += 3;
                    }
                }
                if (A0v.size() > 1) {
                    C001300p.A0y(A0v, new IDxComparatorShape95S0000000_2_I2(6));
                }
                if (i > 0) {
                    ArrayList A0v2 = AnonymousClass0wJ.A0v();
                    int size = A0v.size();
                    for (int max = Math.max(0, A0v.size() - i); max < size; max++) {
                        A0v2.add(A0v.get(max));
                    }
                    A0v = A0v2;
                }
            }
            return AnonymousClass5Id.A01(A0v, (String) null, true);
        } catch (IndexOutOfBoundsException unused) {
            return AnonymousClass5Id.A01(AnonymousClass0wJ.A0v(), "signal fields not  3", false);
        }
    }

    public final void BaA(int i) {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A02(A0k, (List) A00(A0k, i).A00);
        }
    }

    public final void CbU() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            C1200878l r3 = this.A01;
            C04220Ms.A0B(A0k, 0);
            String A0L = AnonymousClass00U.A0L("sig_", A0k);
            C04220Ms.A0B(A0L, 0);
            C18180wK.A0u(r3.A00.edit(), C1200878l.A00(r3, A0L));
        }
    }

    public final void DBI(String str, long j, long j2) {
        List list;
        C04220Ms.A0B(str, 0);
        String obj = Long.valueOf(j).toString();
        AnonymousClass5Id A002 = A00(str, 0);
        AnonymousClass5HH r2 = new AnonymousClass5HH(obj, System.currentTimeMillis(), 604800000);
        if (!A002.A02) {
            list = C18180wK.A0n(r2);
        } else {
            Object obj2 = A002.A00;
            ((AbstractCollection) obj2).add(r2);
            list = (List) obj2;
        }
        A02(str, list);
    }
}
