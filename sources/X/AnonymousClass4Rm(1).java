package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxCListenerShape461S0100000_1_I2;

/* renamed from: X.4Rm  reason: invalid class name */
public final class AnonymousClass4Rm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IDxCListenerShape461S0100000_1_I2 A01;

    public AnonymousClass4Rm(IDxCListenerShape461S0100000_1_I2 iDxCListenerShape461S0100000_1_I2, int i) {
        this.A01 = iDxCListenerShape461S0100000_1_I2;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass3CP r2 = (AnonymousClass3CP) this.A01.A00;
        int i = this.A00;
        View view = r2.A03;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float height = (float) (iArr[1] + view.getHeight());
        Context context = view.getContext();
        float A002 = height + C09860go.A00(context, 8.0f) + ((float) r2.A02);
        float A07 = (float) (C09860go.A07(context) - i);
        if (A002 > A07) {
            r2.A04.smoothScrollBy(0, (int) (A002 - A07));
        }
    }
}
