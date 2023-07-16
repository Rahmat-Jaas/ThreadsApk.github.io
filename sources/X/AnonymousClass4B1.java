package X;

import android.content.Context;
import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;

/* renamed from: X.4B1  reason: invalid class name */
public final class AnonymousClass4B1 implements DeveloperOptionsPlugin.OnPinnedDevOptionInteraction {
    public final /* synthetic */ AnonymousClass4Db A00;

    public AnonymousClass4B1(AnonymousClass4Db r1) {
        this.A00 = r1;
    }

    public final void onPinnedDevOptionRemoved() {
        AnonymousClass4Db r2 = this.A00;
        Context context = r2.A01.getContext();
        if (context != null) {
            AnonymousClass1wA.A0B(context, r2.A03);
        }
    }

    public final void onPinnedDevOptionSelected() {
        AnonymousClass1wA.A0C(this.A00.A03);
    }
}
