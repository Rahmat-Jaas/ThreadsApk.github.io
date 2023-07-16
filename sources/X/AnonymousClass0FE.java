package X;

import com.facebook.traffic.monitor.api.ITrafficTransportMonitor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* renamed from: X.0FE  reason: invalid class name */
public final class AnonymousClass0FE extends C11940l3 {
    public final ITrafficTransportMonitor A00;

    /* renamed from: A03 */
    public final ListenableFuture AHJ(C09350fH r5, AnonymousClass0XP r6, AnonymousClass0XP r7) {
        UUID markerInstanceUuid;
        if (!(r6 == null || r7 == null || (markerInstanceUuid = this.A00.getMarkerInstanceUuid(r5.getMarkerId(), r5.A02)) == null)) {
            r5.AvU().A03("event_instance_uuid", markerInstanceUuid.toString());
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "traffic_transport_monitor_metadata";
    }

    public final int B52() {
        return 62;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        return new AnonymousClass0XP();
    }

    public AnonymousClass0FE(ITrafficTransportMonitor iTrafficTransportMonitor) {
        this.A00 = iTrafficTransportMonitor;
    }

    public final Class BCf() {
        return AnonymousClass0XP.class;
    }

    public final boolean BTR(C08640dy r3) {
        return C07960cV.A05(AnonymousClass0e5.A00(36316748806360377L));
    }
}
