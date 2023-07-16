package com.facebook.redex;

import X.C14030oh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.test.core.app.InstrumentationActivityInvoker;

public class IDxBReceiverShape7S0100000_2_I2 extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public IDxBReceiverShape7S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onReceive(Context context, Intent intent) {
        int A012;
        int i;
        switch (this.A01) {
            case 0:
                A012 = C14030oh.A01(-718309746);
                InstrumentationActivityInvoker.BootstrapActivity bootstrapActivity = (InstrumentationActivityInvoker.BootstrapActivity) this.A00;
                bootstrapActivity.finishActivity(0);
                bootstrapActivity.finish();
                i = -926547868;
                break;
            case 1:
                A012 = C14030oh.A01(-253777063);
                ((InstrumentationActivityInvoker.EmptyActivity) this.A00).finish();
                i = -1449148468;
                break;
            default:
                A012 = C14030oh.A01(359985466);
                ((InstrumentationActivityInvoker.EmptyFloatingActivity) this.A00).finish();
                i = 2143011340;
                break;
        }
        C14030oh.A0E(i, A012, intent);
    }
}
