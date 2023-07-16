package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3O5  reason: invalid class name */
public final class AnonymousClass3O5 {
    public static final Set A00(AnonymousClass0IB r6, String str) {
        Object obj;
        List A06 = C81074n3.A06(str);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            try {
                obj = QuickPromotionSurface.valueOf(C18180wK.A0k(it));
            } catch (Throwable th) {
                obj = new AnonymousClass0OW(th);
            }
            Throwable A00 = AnonymousClass0OV.A00(obj);
            if (A00 != null) {
                r6.CuY("InstagramFetchExperimentationHelper", "Error parsing experiment surface token", A00);
            }
            if (obj instanceof AnonymousClass0OW) {
                obj = null;
            }
            if (obj != null) {
                A0v.add(obj);
            }
        }
        return AnonymousClass00J.A0c(A0v);
    }

    public static final Set A01(AnonymousClass0IB r7, String str) {
        Object obj;
        List A06 = C81074n3.A06(str);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            Object obj2 = null;
            try {
                obj = C36632Sb.A00(A0k);
                if (obj == null) {
                    throw new C32092Ad(AnonymousClass00U.A0L("Invalid trigger surface ", A0k));
                }
            } catch (Throwable th) {
                obj = new AnonymousClass0OW(th);
            }
            Throwable A00 = AnonymousClass0OV.A00(obj);
            if (A00 != null) {
                r7.CuY("InstagramFetchExperimentationHelper", "Error parsing experiment trigger token", A00);
            }
            if (!(obj instanceof AnonymousClass0OW)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                A0v.add(obj2);
            }
        }
        return AnonymousClass00J.A0c(A0v);
    }
}
