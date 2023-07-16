package X;

import android.os.Bundle;

/* renamed from: X.3Um  reason: invalid class name */
public final class AnonymousClass3Um {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public final void A00(Bundle bundle) {
        bundle.putInt("resend_sms_delay_sec", this.A02);
        bundle.putInt("robocall_count_down_time_sec", this.A01);
        bundle.putBoolean("robocall_after_max_sms", this.A03);
        bundle.putInt("max_sms_count", this.A00);
    }

    public AnonymousClass3Um(Bundle bundle) {
        this.A02 = bundle.getInt("resend_sms_delay_sec");
        this.A01 = bundle.getInt("robocall_count_down_time_sec");
        this.A03 = bundle.getBoolean("robocall_after_max_sms");
        this.A00 = bundle.getInt("max_sms_count");
    }

    public AnonymousClass3Um() {
    }
}
