package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.07n  reason: invalid class name and case insensitive filesystem */
public final class C016107n extends AnonymousClass0L1 implements C05130Ra {
    public static C016107n A01;
    public UserSession A00;

    public final C14090on A01() {
        return new C127997iB(C07520be.A03, new Random(), CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
    }

    public final boolean A02() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return AnonymousClass0RD.A00(userSession).booleanValue();
        }
        return super.A02();
    }

    public C016107n(Context context) {
        super(context);
    }
}
