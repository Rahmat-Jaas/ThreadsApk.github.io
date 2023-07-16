package androidx.fragment.app;

import X.AnonymousClass052;
import X.AnonymousClass1Xb;
import X.AnonymousClass1c8;
import X.C12560m7;
import android.app.Activity;
import com.instagram.urlhandlers.passwordreset.PasswordResetExternalUrlHandlerActivity;

public class IDxLCallbacksShape41S0100000_1_I2 extends AnonymousClass052 {
    public Object A00;
    public final int A01;

    public IDxLCallbacksShape41S0100000_1_I2(PasswordResetExternalUrlHandlerActivity passwordResetExternalUrlHandlerActivity, int i) {
        this.A01 = i;
        this.A00 = passwordResetExternalUrlHandlerActivity;
    }

    public final void A04(Fragment fragment, C12560m7 r3) {
        boolean z;
        if (this.A01 != 0) {
            z = fragment instanceof AnonymousClass1c8;
        } else {
            z = fragment instanceof AnonymousClass1Xb;
        }
        if (z && r3.A0T.A04().isEmpty()) {
            ((Activity) this.A00).finish();
        }
    }
}
