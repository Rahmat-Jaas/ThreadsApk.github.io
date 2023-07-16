package X;

import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0iu  reason: invalid class name and case insensitive filesystem */
public final class C10770iu {
    public static volatile C14090on A00;

    public static C14090on A00() {
        C14090on r0;
        C14090on r02 = A00;
        if (r02 != null) {
            return r02;
        }
        synchronized (C10770iu.class) {
            if (A00 == null) {
                A00 = A01();
            }
            r0 = A00;
        }
        return r0;
    }

    public static C14090on A01() {
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        if (r3 == null) {
            return new K87();
        }
        return new C127997iB(r3, new Random(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
    }
}
