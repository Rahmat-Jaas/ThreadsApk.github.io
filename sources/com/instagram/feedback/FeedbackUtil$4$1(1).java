package com.instagram.feedback;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.AnonymousClass066;
import X.AnonymousClass4RQ;
import X.C62463a4;
import androidx.lifecycle.OnLifecycleEvent;

public class FeedbackUtil$4$1 implements AnonymousClass065 {
    public final /* synthetic */ AnonymousClass4RQ A00;

    public FeedbackUtil$4$1(AnonymousClass4RQ r1) {
        this.A00 = r1;
    }

    @OnLifecycleEvent(AnonymousClass060.ON_ANY)
    public void onAny(AnonymousClass066 r3) {
        r3.getLifecycle().A08(this);
        C62463a4.A00.set(false);
    }
}
