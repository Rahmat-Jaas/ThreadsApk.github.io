package X;

import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.graphql.instagramschema.ARClassBenchmarkCountQueryResponseImpl;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7nr  reason: invalid class name and case insensitive filesystem */
public final class C130007nr implements C83334rD {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstagramARClassBenchmark A01;
    public final /* synthetic */ Object A02;

    public C130007nr(InstagramARClassBenchmark instagramARClassBenchmark, Object obj, long j) {
        this.A01 = instagramARClassBenchmark;
        this.A00 = j;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        C143338gY r6 = (C143338gY) obj;
        if (r6 != null && (obj2 = ((AnonymousClass5z0) r6).A01) != null) {
            TreeJNI treeJNI = (TreeJNI) obj2;
            Class<ARClassBenchmarkCountQueryResponseImpl.XfbArclassBenchmarkCount> cls = ARClassBenchmarkCountQueryResponseImpl.XfbArclassBenchmarkCount.class;
            if (treeJNI.getTreeValue("xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)", cls) == null || ((long) treeJNI.getTreeValue("xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)", cls).getIntValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) < this.A00) {
                try {
                    Object obj3 = this.A02;
                    obj3.getClass().getMethod("startBenchmarks", new Class[0]).invoke(obj3, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    AnonymousClass0IB r2 = this.A01.A02;
                    if (r2 != null) {
                        r2.CuY("InstagramARClassBenchmark", "AR Class benchmark invoke failed.", e);
                    }
                }
            }
        }
    }

    public final void onFailure(Throwable th) {
        String str;
        if (th.getMessage() != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        AnonymousClass0LU.A0B("com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base.ARClassBenchmark", str);
    }
}
