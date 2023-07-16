package X;

import com.facebook.profilo.logger.api.ProfiloClassLoadTracer;
import com.facebook.profilo.logger.api.ProfiloLogger;

/* renamed from: X.0cf  reason: invalid class name and case insensitive filesystem */
public final class C08060cf extends ProfiloClassLoadTracer {
    public final void classLoadFailed() {
        ProfiloLogger.classLoadFailed();
    }

    public final void classLoadStart() {
        ProfiloLogger.classLoadStart();
    }

    public final void classLoadEnd(Class cls) {
        ProfiloLogger.classLoadEnd(cls);
    }
}
