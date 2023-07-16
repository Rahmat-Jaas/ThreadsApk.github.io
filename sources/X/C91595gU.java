package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5gU  reason: invalid class name and case insensitive filesystem */
public final class C91595gU extends C886359v {
    public final Context A00;

    public C91595gU(Context context, LoggingContext loggingContext) {
        super(AnonymousClass69U.A0F, loggingContext, false);
        this.A00 = context;
    }

    public final void A0A(C88935Bg r10, AnonymousClass7Kx r11) {
        AnonymousClass0wJ.A1N(r11, r10);
        InlineBackButtonItem inlineBackButtonItem = (InlineBackButtonItem) r11.A01;
        if (inlineBackButtonItem != null) {
            LinearLayout linearLayout = r10.A01;
            linearLayout.setOnClickListener(this.A00);
            TextView textView = r10.A02;
            textView.setText(inlineBackButtonItem.A00);
            AnonymousClass7Fd.A02(textView, AnonymousClass69Q.A14);
            Context context = this.A00;
            C121047Dv.A01(context, linearLayout, AnonymousClass006.A00, (Integer) null, (Integer) null, 24);
            C121097Ec A0G = AnonymousClass7Kz.A0G();
            AnonymousClass697 r0 = AnonymousClass697.LEFT_ARROW_FILLED;
            r10.A00.setImageDrawable(A0G.A04(context, r0.A00, r0.A01));
        }
    }
}
