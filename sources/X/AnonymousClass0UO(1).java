package X;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0UO  reason: invalid class name */
public final class AnonymousClass0UO implements C04050Mb {
    public static final AnonymousClass0ON A02 = AnonymousClass0MU.A80;
    public static final AnonymousClass0ON A03 = AnonymousClass0MU.A81;
    public final C12300lf A00;
    public final File[] A01;

    public static void A00(AnonymousClass0vY r8, File file) {
        List list;
        List list2;
        List list3;
        List list4;
        try {
            C18130wE r1 = new C18130wE();
            r1.A0A = true;
            for (AnonymousClass011 r7 : C12300lf.A01(r1, file)) {
                r8.DAl(r7.A05);
                List list5 = r7.A02;
                if (list5 != null) {
                    list = Collections.unmodifiableList(list5);
                } else {
                    list = null;
                }
                List list6 = r7.A03;
                if (list6 != null) {
                    list2 = Collections.unmodifiableList(list6);
                } else {
                    list2 = null;
                }
                if (!(list == null || list2 == null)) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        r8.DAc((String) it.next(), (String) it2.next());
                    }
                }
                List list7 = r7.A00;
                if (list7 != null) {
                    list3 = Collections.unmodifiableList(list7);
                } else {
                    list3 = null;
                }
                List list8 = r7.A01;
                if (list8 != null) {
                    list4 = Collections.unmodifiableList(list8);
                } else {
                    list4 = null;
                }
                if (!(list3 == null || list4 == null)) {
                    Iterator it3 = list3.iterator();
                    Iterator it4 = list4.iterator();
                    while (it3.hasNext() && it4.hasNext()) {
                        r8.DAb((String) it3.next(), (Integer) it4.next());
                    }
                }
            }
        } catch (Throwable unused) {
            C04790Pd.A00();
        }
    }

    public final void CWp(C04170Mn r6, AnonymousClass0ND r7) {
        int length;
        File[] fileArr = this.A01;
        if (fileArr != null && (length = fileArr.length) != 0) {
            AnonymousClass0UC r2 = new AnonymousClass0UC();
            if (length == 1) {
                A00(r2, fileArr[0]);
            } else {
                int i = 0;
                do {
                    A00(r2, fileArr[i]);
                    i++;
                } while (i < length);
            }
            AnonymousClass0ON r1 = A02;
            String obj = r2.A01.toString();
            if (obj == null) {
                obj = "[]";
            }
            r6.A03(r1, obj);
            r6.A03(A03, r2.A00.A02.toString());
        }
    }

    public AnonymousClass0UO(C12300lf r1, File... fileArr) {
        this.A00 = r1;
        this.A01 = fileArr;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0T;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
