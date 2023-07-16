package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5qo  reason: invalid class name */
public final class AnonymousClass5qo extends AnonymousClass52I {
    public Context A00 = getContext();
    public View A01;
    public TextView A02;
    public Map A03;
    public Set A04;

    public final void show() {
        if (this.A04.size() == 1) {
            View view = (View) this.A03.get(this.A04.iterator().next());
            if (view != null) {
                view.callOnClick();
                return;
            }
            return;
        }
        super.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5qo(Context context) {
        super(context, 2131886672);
        AnonymousClass7Kz.A0K();
        View inflate = View.inflate(getContext(), R.layout.hub_bottom_sheet, (ViewGroup) null);
        setContentView(inflate);
        this.A02 = AnonymousClass0wJ.A0L(inflate, R.id.title);
        ViewStub viewStub = (ViewStub) inflate.requireViewById(R.id.content);
        AnonymousClass7Kz.A0K();
        Context context2 = getContext();
        AnonymousClass7Kz.A0K();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, 2131886669);
        this.A00 = contextThemeWrapper;
        viewStub.setLayoutInflater(LayoutInflater.from(contextThemeWrapper));
        viewStub.setLayoutResource(R.layout.hub_add_new_payment_bottom_sheet);
        View inflate2 = viewStub.inflate();
        this.A01 = inflate2;
        View requireViewById = inflate2.requireViewById(R.id.add_card_row);
        View requireViewById2 = this.A01.requireViewById(R.id.add_paypal_row);
        View requireViewById3 = this.A01.requireViewById(R.id.add_shop_pay_row);
        A00(requireViewById, 2131832197, R.drawable.payment_visa_new);
        A00(requireViewById2, 2131832199, R.drawable.payment_paypal_hub);
        A00(requireViewById3, 2131832200, C86104wH.A0G(this.A00, R.attr.fbpay_shop_pay_icon).resourceId);
        HashMap A0y = AnonymousClass0wJ.A0y();
        this.A03 = A0y;
        A0y.put(C969867m.CREDIT_CARD, requireViewById);
        this.A03.put(C969867m.PAYPAL, requireViewById2);
        this.A03.put(C969867m.SHOP_PAY, requireViewById3);
    }

    public static void A00(View view, int i, int i2) {
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.title);
        ImageView A0J = C18200wM.A0J(view, R.id.icon);
        A0L.setText(i);
        A0J.setImageResource(i2);
    }
}
