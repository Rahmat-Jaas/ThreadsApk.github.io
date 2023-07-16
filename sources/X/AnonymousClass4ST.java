package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4ST  reason: invalid class name */
public final class AnonymousClass4ST implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C82764qE A02;

    public AnonymousClass4ST(Context context, FragmentActivity fragmentActivity, C82764qE r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = fragmentActivity;
    }

    public final void run() {
        C25745DrH A022 = C25745DrH.A00.A02(this.A00);
        if (A022 != null) {
            A022.A0C();
        }
        this.A02.BMv(this.A01);
    }
}
