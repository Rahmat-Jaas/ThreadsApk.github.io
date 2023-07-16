package X;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.02Q  reason: invalid class name */
public final class AnonymousClass02Q {
    public final Runnable A00;
    public final Map A01 = new HashMap();
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public final void A00(Menu menu) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0g2) ((AnonymousClass02V) it.next())).A00.A17(menu);
        }
    }

    public final void A01(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0g2) ((AnonymousClass02V) it.next())).A00.A18(menu, menuInflater);
        }
    }

    public final void A02(AnonymousClass02V r4) {
        this.A02.remove(r4);
        AnonymousClass02P r2 = (AnonymousClass02P) this.A01.remove(r4);
        if (r2 != null) {
            r2.A01.A08(r2.A00);
            r2.A00 = null;
        }
        this.A00.run();
    }

    public final boolean A03(MenuItem menuItem) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass0g2) ((AnonymousClass02V) it.next())).A00.A1A(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass02Q(Runnable runnable) {
        this.A00 = runnable;
    }
}
