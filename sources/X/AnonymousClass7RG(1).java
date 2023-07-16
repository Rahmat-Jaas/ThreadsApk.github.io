package X;

import android.content.Context;
import android.view.View;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.fbpay.logging.LoggingContext;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape4S0400000_I2;

/* renamed from: X.7RG  reason: invalid class name */
public final class AnonymousClass7RG implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SelectionShippingAddressItem A01;
    public final /* synthetic */ C88925Bf A02;
    public final /* synthetic */ C91675gc A03;
    public final /* synthetic */ AnonymousClass7Kx A04;

    public AnonymousClass7RG(Context context, SelectionShippingAddressItem selectionShippingAddressItem, C88925Bf r3, C91675gc r4, AnonymousClass7Kx r5) {
        this.A03 = r4;
        this.A01 = selectionShippingAddressItem;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1640820380);
        C128957ke A002 = AnonymousClass7JJ.A00();
        C91675gc r10 = this.A03;
        LoggingContext loggingContext = r10.A03;
        SelectionShippingAddressItem selectionShippingAddressItem = this.A01;
        A002.A0E(loggingContext, AnonymousClass0wJ.A0d(selectionShippingAddressItem.A0A), (Map) null);
        Context context = this.A00;
        KtLambdaShape4S0400000_I2 ktLambdaShape4S0400000_I2 = new KtLambdaShape4S0400000_I2(5, selectionShippingAddressItem, this.A04, this.A02, r10);
        KtLambdaShape17S0200000_I2_1 A11 = C86154wM.A11(selectionShippingAddressItem, r10, 12);
        AnonymousClass77R.A00(context, C117016xz.A00(C86154wM.A0N(ktLambdaShape4S0400000_I2, 20), C86154wM.A0N(A11, 21), 2131826497, 2131826496, 2131826495, 2131826488, 0, 0, 2), AnonymousClass7Kz.A0M());
        C14030oh.A0C(-835883483, A05);
    }
}
