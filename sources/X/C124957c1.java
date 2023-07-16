package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.7c1  reason: invalid class name and case insensitive filesystem */
public final class C124957c1 implements AnonymousClass06D {
    public final /* synthetic */ SignInHubActivity A00;

    public /* synthetic */ C124957c1(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    public final AnonymousClass06K BsQ(Bundle bundle, int i) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = AnonymousClass7AL.A00;
        synchronized (set) {
        }
        return new C884858g(signInHubActivity, set);
    }

    public final /* bridge */ /* synthetic */ void C55(AnonymousClass06K r4, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }
}
