package X;

import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;

/* renamed from: X.7da  reason: invalid class name and case insensitive filesystem */
public final class C125597da implements C145178k0 {
    public final /* synthetic */ IgArVoltronModuleLoader A00;
    public final /* synthetic */ C145178k0 A01;
    public final /* synthetic */ C28979FfK A02;

    public C125597da(C145178k0 r1, IgArVoltronModuleLoader igArVoltronModuleLoader, C28979FfK ffK) {
        this.A00 = igArVoltronModuleLoader;
        this.A02 = ffK;
        this.A01 = r1;
    }

    public final void onFailure(Throwable th) {
        this.A01.onFailure(th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C28979FfK ffK = this.A02;
        if (ffK == C28979FfK.PYTORCH) {
            try {
                C15020qa.A0B(AnonymousClass000.A00(873), 16);
                C15020qa.A0B("torch-code-gen", 16);
                C15020qa.A0B("aten_vulkan", 16);
                C15020qa.A0B("gans-ops-xplat", 16);
            } catch (UnsatisfiedLinkError e) {
                e = e;
                str = "SoLoader dynamic pytorch library exception:";
                AnonymousClass0LU.A0I(IgArVoltronModuleLoader.TAG, str, e);
                this.A01.onFailure(e);
                return;
            }
        }
        if (ffK == C28979FfK.SLAM) {
            try {
                C15020qa.A0B("slam-native", 16);
            } catch (UnsatisfiedLinkError e2) {
                e = e2;
                str = "SoLoader dynamic slam-native library exception:";
            }
        }
        this.A01.onSuccess(obj);
    }
}
