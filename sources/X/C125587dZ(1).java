package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.ARClassBenchmarkCountQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* renamed from: X.7dZ  reason: invalid class name and case insensitive filesystem */
public final class C125587dZ implements C145178k0 {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InstagramARClassBenchmark A02;

    public C125587dZ(InstagramARClassBenchmark instagramARClassBenchmark, double d, long j) {
        this.A02 = instagramARClassBenchmark;
        this.A00 = d;
        this.A01 = j;
    }

    public final void onFailure(Throwable th) {
        AnonymousClass0IB r2 = this.A02.A02;
        if (r2 != null) {
            r2.CuY("InstagramARClassBenchmark", "AR Class benchmark lib download failed.", th);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        try {
            int i = 0;
            Constructor<?> constructor = Class.forName("com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base.ARClassBenchmark").getConstructor(new Class[]{Executor.class, AnalyticsLogger.class, Context.class, Float.TYPE, C142018df.class});
            InstagramARClassBenchmark instagramARClassBenchmark = this.A02;
            Object newInstance = constructor.newInstance(new Object[]{instagramARClassBenchmark.A04, instagramARClassBenchmark.A01, instagramARClassBenchmark.A00, Float.valueOf((float) this.A00), null});
            Integer num = (Integer) C86114wI.A0g(newInstance, newInstance.getClass(), "getBenchmarkVersion");
            if (num != null) {
                i = num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            long j = this.A01;
            UserSession userSession = instagramARClassBenchmark.A03;
            if (userSession == null || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317457479569086L)) {
                C67463zb A002 = C67463zb.A00();
                String num2 = Integer.toString(valueOf.intValue());
                A002.A05("benchmark_version", num2);
                AnonymousClass7Ko.A0B(AnonymousClass0wJ.A1W(num2));
                C67473zc r2 = new C67473zc(A002, C89475Fb.class, "ARClassBenchmarkCountQuery");
                C04220Ms.A0B(userSession, 0);
                C31082GfJ gfJ = new C31082GfJ((C10300i6) userSession);
                gfJ.A06(r2);
                C32165H8c A05 = gfJ.A05(AnonymousClass006.A00);
                A05.A00 = new C94995yb(instagramARClassBenchmark, newInstance, j);
                C31155GhB.A05(A05, 813, 3, false, false);
                return;
            }
            C67463zb A003 = C67463zb.A00();
            C67463zb A004 = C67463zb.A00();
            String num3 = Integer.toString(valueOf.intValue());
            A003.A05("benchmark_version", num3);
            AnonymousClass3WK.A01(userSession).AMA(new PandoGraphQLRequest(C63233h2.A03(AnonymousClass0wJ.A1W(num3)), "ARClassBenchmarkCountQuery", A003.getParamsCopy(), A004.getParamsCopy(), ARClassBenchmarkCountQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_arclass_benchmark_count"), new C130007nr(instagramARClassBenchmark, newInstance, j));
        } catch (Exception e) {
            AnonymousClass0IB r22 = this.A02.A02;
            if (r22 != null) {
                r22.CuY("InstagramARClassBenchmark", "AR Class benchmark instance creation failed.", e);
            }
        }
    }
}
