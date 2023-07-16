package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Zx  reason: invalid class name and case insensitive filesystem */
public final class C123917Zx implements AnonymousClass066, AnonymousClass06C, C012605w, C15750rp {
    public AnonymousClass061 A00;
    public AnonymousClass061 A01 = AnonymousClass061.INITIALIZED;
    public C14340pE A02 = new C14340pE(this);
    public AnonymousClass7AO A03;
    public boolean A04;
    public final Context A05;
    public final Bundle A06;
    public final Bundle A07;
    public final C141898dQ A08;
    public final AnonymousClass072 A09 = new AnonymousClass072(this);
    public final String A0A;
    public final C04530Oa A0B = AnonymousClass0OY.A02(C86154wM.A13(this, 48));
    public final C04530Oa A0C = AnonymousClass0OY.A02(C86154wM.A13(this, 49));

    public final void A02(AnonymousClass061 r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
        A01();
    }

    public final boolean equals(Object obj) {
        Set keySet;
        Object obj2;
        if (obj == null || !(obj instanceof C123917Zx)) {
            return false;
        }
        C123917Zx r7 = (C123917Zx) obj;
        if (!C04220Ms.A0I(this.A0A, r7.A0A) || !C04220Ms.A0I(this.A03, r7.A03) || !C04220Ms.A0I(this.A02, r7.A02) || !C04220Ms.A0I(this.A09.A01, r7.A09.A01)) {
            return false;
        }
        Bundle bundle = this.A06;
        Bundle bundle2 = r7.A06;
        if (!C04220Ms.A0I(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    Object obj3 = bundle.get(A0k);
                    if (bundle2 != null) {
                        obj2 = bundle2.get(A0k);
                    } else {
                        obj2 = null;
                    }
                    if (!C04220Ms.A0I(obj3, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final C111686o9 getDefaultViewModelCreationExtras() {
        Context context = null;
        C884758f r2 = new C884758f(C884658e.A00);
        Context context2 = this.A05;
        if (context2 != null) {
            context = context2.getApplicationContext();
        }
        if ((context instanceof Application) && context != null) {
            r2.A01(C884358b.A02, context);
        }
        r2.A01(AnonymousClass7GW.A01, this);
        r2.A01(AnonymousClass7GW.A02, this);
        Bundle bundle = this.A06;
        if (bundle != null) {
            r2.A01(AnonymousClass7GW.A00, bundle);
        }
        return r2;
    }

    public static C121177En A00(C123917Zx r0) {
        return (C121177En) r0.A0C.getValue();
    }

    public final void A01() {
        if (!this.A04) {
            AnonymousClass072 r1 = this.A09;
            r1.A00();
            this.A04 = true;
            if (this.A08 != null) {
                AnonymousClass7GW.A02(this);
            }
            r1.A01(this.A07);
        }
        AnonymousClass061 r4 = this.A00;
        int ordinal = r4.ordinal();
        AnonymousClass061 r2 = this.A01;
        int ordinal2 = r2.ordinal();
        C14340pE r0 = this.A02;
        if (ordinal < ordinal2) {
            r0.A0A(r4);
        } else {
            r0.A0A(r2);
        }
    }

    public final C147138nS getDefaultViewModelProviderFactory() {
        return (C884558d) this.A0B.getValue();
    }

    public final AnonymousClass062 getLifecycle() {
        return this.A02;
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        return this.A09.A01;
    }

    public final AnonymousClass06B getViewModelStore() {
        if (!this.A04) {
            throw C18180wK.A0a("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        } else if (this.A02.A00 != AnonymousClass061.DESTROYED) {
            C141898dQ r1 = this.A08;
            if (r1 != null) {
                String str = this.A0A;
                C04220Ms.A0B(str, 0);
                Map map = ((AnonymousClass58Q) r1).A00;
                AnonymousClass06B r0 = (AnonymousClass06B) map.get(str);
                if (r0 != null) {
                    return r0;
                }
                AnonymousClass06B r02 = new AnonymousClass06B();
                map.put(str, r02);
                return r02;
            }
            throw C18180wK.A0a("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        } else {
            throw C18180wK.A0a("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
    }

    public final int hashCode() {
        Set keySet;
        int A062 = C18220wO.A06(this.A03, C18180wK.A03(this.A0A));
        Bundle bundle = this.A06;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                A062 = (A062 * 31) + C18230wP.A05(bundle.get(C18180wK.A0k(it)));
            }
        }
        return C18220wO.A06(this.A09.A01, AnonymousClass0wJ.A05(this.A02, A062 * 31));
    }

    public C123917Zx(Context context, Bundle bundle, Bundle bundle2, AnonymousClass061 r5, AnonymousClass7AO r6, C141898dQ r7, String str) {
        this.A05 = context;
        this.A03 = r6;
        this.A06 = bundle;
        this.A00 = r5;
        this.A08 = r7;
        this.A0A = str;
        this.A07 = bundle2;
    }
}
