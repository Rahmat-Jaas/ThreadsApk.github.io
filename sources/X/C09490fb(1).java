package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Iterator;

/* renamed from: X.0fb  reason: invalid class name and case insensitive filesystem */
public final class C09490fb extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C09470fZ A00;

    public C09490fb(C09470fZ r1) {
        this.A00 = r1;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C09470fZ r5 = this.A00;
        if (!r5.A03 && networkCapabilities.hasCapability(16)) {
            r5.A03 = true;
            Iterator it = r5.A05.iterator();
            while (it.hasNext()) {
                ((C09480fa) it.next()).onConnected();
            }
        }
        Network network2 = r5.A01;
        if (network2 == null || network2.getNetworkHandle() != network.getNetworkHandle()) {
            Iterator it2 = r5.A05.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        r5.A01 = network;
        r5.A02 = networkCapabilities;
    }

    public final void onLost(Network network) {
        C09470fZ r5 = this.A00;
        Network network2 = r5.A01;
        if (network2 == null || network2.getNetworkHandle() == network.getNetworkHandle()) {
            r5.A01 = null;
            r5.A03 = false;
            Iterator it = r5.A05.iterator();
            while (it.hasNext()) {
                ((C09480fa) it.next()).Bu2();
            }
        }
    }

    public final void onUnavailable() {
        C09470fZ r1 = this.A00;
        r1.A01 = null;
        r1.A03 = false;
        Iterator it = r1.A05.iterator();
        while (it.hasNext()) {
            ((C09480fa) it.next()).Bu2();
        }
    }

    public final void onAvailable(Network network) {
        network.getNetworkHandle();
        C09470fZ r1 = this.A00;
        if (r1.A01 == null) {
            Iterator it = r1.A05.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void onLosing(Network network, int i) {
    }
}
