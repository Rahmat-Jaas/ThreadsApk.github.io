package X;

import ca.psiphon.PsiphonTunnel;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4dM  reason: invalid class name and case insensitive filesystem */
public final class C76044dM extends C02220Ah implements AnonymousClass0ZU {
    public static final C76044dM A00 = new C76044dM();

    public C76044dM() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean A05 = C63173fJ.A05(AnonymousClass0TJ.A05, 18312460649899806L);
        int i = PsiphonTunnel.VPN_INTERFACE_MTU;
        if (A05) {
            i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        }
        return Integer.valueOf(i);
    }
}
