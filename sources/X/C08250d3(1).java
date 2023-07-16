package X;

import com.facebook.profilo.logger.api.ProfiloLogger;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.IOException;

/* renamed from: X.0d3  reason: invalid class name and case insensitive filesystem */
public final class C08250d3 extends JY2 {
    public final void onFailed(GXK gxk, IOException iOException) {
        int i;
        long A00 = (long) gxk.A00();
        if (ProfiloLogger.sHasProfilo) {
            i = ExternalProviders.A03.A08().A00(6, 7, 0, 0, A00);
        } else {
            i = -1;
        }
        ProfiloLogger.writeLigerMetadata(i, "error", iOException.getMessage());
    }

    public final void onRequestUploadAttemptStart(GXK gxk) {
        long A00 = (long) gxk.A00();
        if (ProfiloLogger.sHasProfilo) {
            ExternalProviders.A03.A08().A00(6, 11, 0, 0, A00);
        }
    }

    public final void onResponseStarted(GXK gxk, JWQ jwq, GJN gjn) {
        long A00 = (long) gxk.A00();
        if (ProfiloLogger.sHasProfilo) {
            ExternalProviders.A03.A08().A00(6, 9, 0, 0, A00);
        }
    }

    public final void onSucceeded(GXK gxk) {
        long A00 = (long) gxk.A00();
        if (ProfiloLogger.sHasProfilo) {
            ExternalProviders.A03.A08().A00(6, 8, 0, 0, A00);
        }
    }
}
