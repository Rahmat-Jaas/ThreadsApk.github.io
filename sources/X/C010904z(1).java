package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.04z  reason: invalid class name and case insensitive filesystem */
public final class C010904z {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final C12560m7 A01;

    public final void A00(Bundle bundle, View view, Fragment fragment, boolean z) {
        C12560m7 r3 = this.A01;
        Fragment fragment2 = r3.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A00(bundle, view, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C010804y r1 = (C010804y) it.next();
            if (!z || r1.A00) {
                r1.A01.A01(bundle, view, fragment, r3);
            }
        }
    }

    public final void A01(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A01(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A02(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A02(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A03(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A04(Bundle bundle, Fragment fragment, boolean z) {
        C12560m7 r3 = this.A01;
        Fragment fragment2 = r3.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A04(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C010804y r1 = (C010804y) it.next();
            if (!z || r1.A00) {
                r1.A01.A02(bundle, fragment, r3);
            }
        }
    }

    public final void A05(Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A05(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A06(Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A06(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A07(Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A07(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A08(Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A08(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A09(Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A09(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A0A(Fragment fragment) {
        Fragment fragment2 = this.A01.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A0A(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A0B(Fragment fragment, boolean z) {
        C12560m7 r4 = this.A01;
        Context context = r4.A09.A01;
        Fragment fragment2 = r4.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A0B(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C010804y r1 = (C010804y) it.next();
            if (!z || r1.A00) {
                r1.A01.A00(context, fragment, r4);
            }
        }
    }

    public final void A0C(Fragment fragment, boolean z) {
        C12560m7 r3 = this.A01;
        Fragment fragment2 = r3.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A0C(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C010804y r1 = (C010804y) it.next();
            if (!z || r1.A00) {
                r1.A01.A03(fragment, r3);
            }
        }
    }

    public final void A0D(Fragment fragment, boolean z) {
        C12560m7 r3 = this.A01;
        Fragment fragment2 = r3.A05;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0S.A0D(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C010804y r1 = (C010804y) it.next();
            if (!z || r1.A00) {
                r1.A01.A04(fragment, r3);
            }
        }
    }

    public C010904z(C12560m7 r2) {
        this.A01 = r2;
    }
}
