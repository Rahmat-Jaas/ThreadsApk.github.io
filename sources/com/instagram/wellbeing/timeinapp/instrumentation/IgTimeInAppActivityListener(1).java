package com.instagram.wellbeing.timeinapp.instrumentation;

import X.AnonymousClass0i4;
import X.AnonymousClass22G;
import X.AnonymousClass376;
import X.AnonymousClass3VQ;
import android.app.Application;
import android.content.Context;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.instagram.common.app.AbstractActivityLifecycleCallbacks;
import com.instagram.service.session.UserSession;
import java.util.concurrent.ScheduledExecutorService;

public final class IgTimeInAppActivityListener extends AbstractActivityLifecycleCallbacks implements AnonymousClass0i4 {
    public Context A00;
    public UserSession A01;
    public ScheduledExecutorService A02;
    public final AnonymousClass3VQ A03 = AnonymousClass3VQ.A01;

    public static synchronized IgTimeInAppActivityListener A00(Context context, UserSession userSession) {
        IgTimeInAppActivityListener igTimeInAppActivityListener;
        Class<IgTimeInAppActivityListener> cls = IgTimeInAppActivityListener.class;
        synchronized (cls) {
            igTimeInAppActivityListener = (IgTimeInAppActivityListener) userSession.A00(cls);
            if (igTimeInAppActivityListener == null) {
                igTimeInAppActivityListener = new IgTimeInAppActivityListener(context, userSession);
                ((Application) context).registerActivityLifecycleCallbacks(igTimeInAppActivityListener);
                userSession.A04(cls, igTimeInAppActivityListener);
            }
        }
        return igTimeInAppActivityListener;
    }

    public final void onSessionWillEnd() {
        ((Application) this.A00).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.A01.A00(IgTimeInAppActivityListener.class));
        AnonymousClass376 r2 = (AnonymousClass376) this.A03.A00.getAndSet(new AnonymousClass376());
        if (r2 != null) {
            synchronized (r2) {
                TimeInAppControllerWrapper timeInAppControllerWrapper = r2.A00;
                if (timeInAppControllerWrapper != null) {
                    timeInAppControllerWrapper.dispatch(AnonymousClass22G.BACKGROUND);
                    r2.A00 = null;
                } else {
                    r2.A01.add(AnonymousClass22G.BACKGROUND);
                }
            }
        }
    }

    public IgTimeInAppActivityListener(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
