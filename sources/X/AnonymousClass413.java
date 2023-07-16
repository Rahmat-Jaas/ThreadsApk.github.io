package X;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: X.413  reason: invalid class name */
public final /* synthetic */ class AnonymousClass413 implements C143758hG {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass3YF A01;
    public final /* synthetic */ C82664q4 A02;

    public /* synthetic */ AnonymousClass413(Activity activity, AnonymousClass3YF r2, C82664q4 r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void CH9(C82014ow r5) {
        Activity activity = this.A00;
        C82664q4 r2 = this.A02;
        boolean z = false;
        if (((Status) r5).A01 <= 0) {
            z = true;
        }
        activity.runOnUiThread(new AnonymousClass4SO(activity, r2, Boolean.valueOf(z)));
    }
}
