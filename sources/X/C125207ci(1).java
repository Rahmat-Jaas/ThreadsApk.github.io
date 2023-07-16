package X;

import android.os.Bundle;
import com.bloks.foa.core.lifecycles.impl.NativeLifecycleCallback$NativeCallback;

/* renamed from: X.7ci  reason: invalid class name and case insensitive filesystem */
public final class C125207ci implements C83284r8 {
    public final NativeLifecycleCallback$NativeCallback A00;
    public final Integer A01 = AnonymousClass006.A01;

    public final void CxA(Bundle bundle, String str) {
        C04220Ms.A0B(str, 1);
        bundle.putParcelable(str, this.A00);
    }

    public final Integer BIw() {
        return this.A01;
    }

    public C125207ci(NativeLifecycleCallback$NativeCallback nativeLifecycleCallback$NativeCallback) {
        this.A00 = nativeLifecycleCallback$NativeCallback;
    }
}
