package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.3Ff  reason: invalid class name and case insensitive filesystem */
public final class C58363Ff {
    public final Bundle A00;
    public final FragmentActivity A01;
    public final ConcurrentLinkedQueue A02 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();

    public final void A00() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C82474pl) it.next()).Bgn(this.A00);
        }
        Iterator it2 = this.A03.iterator();
        while (it2.hasNext()) {
            if (((C82484pm) it2.next()).BVr()) {
                throw C18200wM.A0d();
            }
        }
        C10450iM.A03("ChannelLauncher", "Attempted to launch channel creation flow but failed to satisfy any launch conditions.");
    }

    public C58363Ff(Bundle bundle, FragmentActivity fragmentActivity) {
        this.A01 = fragmentActivity;
        this.A00 = bundle;
    }
}
