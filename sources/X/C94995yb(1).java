package X;

import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.5yb  reason: invalid class name and case insensitive filesystem */
public final class C94995yb extends C63873iU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstagramARClassBenchmark A01;
    public final /* synthetic */ Object A02;

    public C94995yb(InstagramARClassBenchmark instagramARClassBenchmark, Object obj, long j) {
        this.A01 = instagramARClassBenchmark;
        this.A00 = j;
        this.A02 = obj;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(-1319000767);
        super.onFail(r3);
        C14030oh.A0A(-47050841, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        Object obj2;
        int A03 = C14030oh.A03(-1061519482);
        AnonymousClass5z0 r8 = (AnonymousClass5z0) obj;
        int A032 = C14030oh.A03(1056526515);
        if (r8 == null || (obj2 = r8.A01) == null) {
            i = 1813625094;
        } else {
            C58933Ih r3 = (C58933Ih) obj2;
            Class<C89465Fa> cls = C89465Fa.class;
            if (r3.A00(cls, "arclass_benchmark_count") == null || ((long) r3.A00(cls, "arclass_benchmark_count").A00.optInt(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) < this.A00) {
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
            i = 284250860;
        }
        C14030oh.A0A(i, A032);
        C14030oh.A0A(-899709615, A03);
    }
}
