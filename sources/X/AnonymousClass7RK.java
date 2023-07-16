package X;

import android.content.Context;
import android.view.View;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import kotlin.jvm.internal.KtLambdaShape3S0410000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0210000_I2;

/* renamed from: X.7RK  reason: invalid class name */
public final class AnonymousClass7RK implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SelectionPaymentMethodItem A01;
    public final /* synthetic */ C91755gk A02;
    public final /* synthetic */ C91695ge A03;
    public final /* synthetic */ AnonymousClass7Kx A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass7RK(Context context, SelectionPaymentMethodItem selectionPaymentMethodItem, C91755gk r3, C91695ge r4, AnonymousClass7Kx r5, boolean z) {
        this.A03 = r4;
        this.A05 = z;
        this.A01 = selectionPaymentMethodItem;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        String str;
        int A052 = C14030oh.A05(-1526642514);
        C91695ge r7 = this.A03;
        AnonymousClass0YC r8 = r7.A05;
        boolean z = this.A05;
        if (z) {
            str = "remove_paypal";
        } else {
            str = "remove_card";
        }
        SelectionPaymentMethodItem selectionPaymentMethodItem = this.A01;
        r8.invoke("user_remove_credential_enter", str, AnonymousClass0wJ.A0d(selectionPaymentMethodItem.A0E), selectionPaymentMethodItem.A08);
        Context context = this.A00;
        C04220Ms.A05(context);
        KtLambdaShape3S0410000_I2 ktLambdaShape3S0410000_I2 = new KtLambdaShape3S0410000_I2(0, selectionPaymentMethodItem, this.A02, r7, this.A04, z);
        KtLambdaShape4S0210000_I2 ktLambdaShape4S0210000_I2 = new KtLambdaShape4S0210000_I2(4, selectionPaymentMethodItem, r7, z);
        AnonymousClass77R A0M = AnonymousClass7Kz.A0M();
        int i = 2131826499;
        int i2 = 2131826498;
        if (z) {
            i = 2131826503;
            i2 = 2131826502;
        }
        AnonymousClass77R.A00(context, C117016xz.A00(C86154wM.A0N(ktLambdaShape3S0410000_I2, 16), C86154wM.A0N(ktLambdaShape4S0210000_I2, 17), i, i2, 2131826495, 2131826488, 0, 0, 2), A0M);
        C14030oh.A0C(1956132215, A052);
    }
}
