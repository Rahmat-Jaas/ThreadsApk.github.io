package X;

import com.facebook.common.dextricks.DexStore;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.4AB  reason: invalid class name */
public final class AnonymousClass4AB implements C144658ir {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C28961vq A01;

    public AnonymousClass4AB(C28961vq r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void C46(int i, boolean z) {
        C28961vq r1 = this.A01;
        SimpleWebViewConfig simpleWebViewConfig = r1.A00;
        if (simpleWebViewConfig == null) {
            C04220Ms.A0E(DexStore.CONFIG_FILENAME);
            throw null;
        }
        if (!simpleWebViewConfig.A06) {
            i -= this.A00;
        }
        C09860go.A0Q(r1.mView, Math.max(i, 0));
    }
}
