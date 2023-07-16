package X;

import android.app.Activity;

/* renamed from: X.4T5  reason: invalid class name */
public final class AnonymousClass4T5 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C303820v A01;
    public final /* synthetic */ C58703Gu A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;

    public AnonymousClass4T5(Activity activity, C303820v r2, C58703Gu r3, Integer num, Integer num2) {
        this.A04 = num;
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = num2;
        this.A01 = r2;
    }

    public final void run() {
        C58703Gu r4;
        Activity activity;
        Integer num;
        Integer num2 = this.A04;
        if (num2 == AnonymousClass006.A01) {
            r4 = this.A02;
            activity = this.A00;
            num = AnonymousClass006.A1L;
        } else if (num2 == AnonymousClass006.A00) {
            r4 = this.A02;
            activity = this.A00;
            num = AnonymousClass006.A0C;
        } else {
            return;
        }
        r4.A01(activity, this.A01, num, this.A03);
    }
}
