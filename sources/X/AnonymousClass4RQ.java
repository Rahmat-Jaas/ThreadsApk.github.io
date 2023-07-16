package X;

import android.os.Bundle;
import com.instagram.feedback.FeedbackUtil$4$1;

/* renamed from: X.4RQ  reason: invalid class name */
public final class AnonymousClass4RQ implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C12560m7 A01;

    public AnonymousClass4RQ(Bundle bundle, C12560m7 r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final void run() {
        C12560m7 r4 = this.A01;
        if (!r4.A15() && r4.A0O("feedbackAlertDialog") == null && C62463a4.A00.compareAndSet(false, true)) {
            AnonymousClass1XT r2 = new AnonymousClass1XT();
            r2.setArguments(this.A00);
            r2.mLifecycleRegistry.A07(new FeedbackUtil$4$1(this));
            r2.A0A(r4, "feedbackAlertDialog");
        }
    }
}
