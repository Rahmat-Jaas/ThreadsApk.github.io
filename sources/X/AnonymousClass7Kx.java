package X;

import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.7Kx  reason: invalid class name */
public final class AnonymousClass7Kx {
    public final AnonymousClass67Q A00;
    public final Object A01;
    public final Throwable A02;

    public static AnonymousClass7Kx A01() {
        return A09((Object) null);
    }

    public static AnonymousClass7Kx A0C(Throwable th) {
        return A0B((Object) null, th);
    }

    public static void A0M(Integer num, Integer num2, AbstractCollection abstractCollection) {
        abstractCollection.add(A0A(new SelectionHeaderItem(AnonymousClass69U.A0i, num, num2, (String) null)));
    }

    public static TransactionInfo A00(AnonymousClass58M r0) {
        return (TransactionInfo) r0.A0S.A01;
    }

    public static AnonymousClass7Kx A02(C142618fJ r1, AnonymousClass7Kx r2) {
        return A05(r2, r1.apply(r2.A01));
    }

    public static AnonymousClass7Kx A03(C142618fJ r1, AnonymousClass7Kx r2) {
        Object obj;
        Object obj2 = r2.A01;
        if (obj2 != null) {
            obj = r1.apply(obj2);
        } else {
            obj = null;
        }
        return A05(r2, obj);
    }

    public static AnonymousClass7Kx A04(AnonymousClass69U r1, C108826j0 r2, AnonymousClass7Kx r3, List list, boolean z) {
        return A0A(new PuxAccordionItem(r1, r2, r3, list, z));
    }

    public static AnonymousClass7Kx A05(AnonymousClass7Kx r3, Object obj) {
        return new AnonymousClass7Kx(r3.A00, obj, r3.A02);
    }

    public static AnonymousClass7Kx A06(AnonymousClass7Kx r1, Object obj, int i) {
        return A02(new IDxFunctionShape326S0100000_2_I2(obj, i), r1);
    }

    public static AnonymousClass7Kx A07(AnonymousClass7Kx r1, Object obj, int i) {
        return A03(new IDxFunctionShape326S0100000_2_I2(obj, i), r1);
    }

    public static AnonymousClass7Kx A08(Integer num, Object obj, String str) {
        return A0A(new C108806iy(num, obj, str));
    }

    public static AnonymousClass7Kx A09(Object obj) {
        return new AnonymousClass7Kx(AnonymousClass67Q.LOADING, obj, (Throwable) null);
    }

    public static AnonymousClass7Kx A0A(Object obj) {
        return new AnonymousClass7Kx(AnonymousClass67Q.SUCCESS, obj, (Throwable) null);
    }

    public static AnonymousClass7Kx A0B(Object obj, Throwable th) {
        return new AnonymousClass7Kx(AnonymousClass67Q.ERROR, obj, th);
    }

    public static Object A0D(AnonymousClass7Kx r0) {
        Object obj = r0.A01;
        obj.getClass();
        return obj;
    }

    public static void A0F(AnonymousClass066 r2, M5J m5j, C143158gC r4) {
        m5j.A0C(r2, new IDxObserverShape99S0200000_2_I2(m5j, r4, 30));
    }

    public static void A0G(AnonymousClass066 r2, M5J m5j, C143158gC r4) {
        m5j.A0C(r2, new IDxObserverShape99S0200000_2_I2(m5j, r4, 31));
    }

    public static void A0H(M5J m5j, C143158gC r3) {
        m5j.A0E(new IDxObserverShape99S0200000_2_I2(m5j, r3, 28));
    }

    public static void A0L(ListSectionViewModel listSectionViewModel, AnonymousClass7Kx r3) {
        listSectionViewModel.A06.A0H(r3.A00);
        listSectionViewModel.A05.A0H(Boolean.valueOf(A0P(r3)));
    }

    public static boolean A0O(AnonymousClass7Kx r2) {
        if (r2 == null || r2.A00 != AnonymousClass67Q.ERROR) {
            return false;
        }
        return true;
    }

    public static boolean A0P(AnonymousClass7Kx r2) {
        if (r2 == null || r2.A00 != AnonymousClass67Q.LOADING) {
            return false;
        }
        return true;
    }

    public static boolean A0Q(AnonymousClass7Kx r2) {
        if (r2 != null && r2.A00 == AnonymousClass67Q.LOADING && r2.A01 == null) {
            return true;
        }
        return false;
    }

    public static boolean A0R(AnonymousClass7Kx r2) {
        if (r2 == null || r2.A00 != AnonymousClass67Q.SUCCESS) {
            return false;
        }
        return true;
    }

    public AnonymousClass7Kx(AnonymousClass67Q r1, Object obj, Throwable th) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = th;
    }

    public static void A0E(C142618fJ r0, M5J m5j, AnonymousClass7Kx r2) {
        m5j.A0H(A02(r0, r2));
    }

    public static void A0I(M5J m5j, Object obj) {
        m5j.A0H(A0A(obj));
    }

    public static void A0J(M5J m5j, Object obj) {
        m5j.A0H(A09(obj));
    }

    public static void A0K(M5J m5j, Object obj, Throwable th) {
        m5j.A0H(A0B(obj, th));
    }

    public static void A0N(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(A0A(obj));
    }
}
