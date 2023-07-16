package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fbpay.w3c.CardDetails;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.51w  reason: invalid class name and case insensitive filesystem */
public final class C873051w extends LinearLayout implements L3L {
    public static final int[] A04 = {16842912};
    public CardDetails A00;
    public boolean A01;
    public boolean A02;
    public final Set A03 = new LinkedHashSet(1);

    public final void Cc6(C83094qm r3) {
        this.A03.remove((Object) null);
    }

    public final void A00(CardDetails cardDetails) {
        Integer valueOf;
        int i;
        this.A00 = cardDetails;
        TextView A0L = AnonymousClass0wJ.A0L(this, R.id.card_info_line_1);
        String str = AnonymousClass69W.A01(cardDetails.A04).A03;
        Resources resources = getResources();
        A0L.setText(resources.getString(2131832194, new Object[]{str, cardDetails.A09}));
        TextView A0L2 = AnonymousClass0wJ.A0L(this, R.id.card_info_line_2);
        Integer num = cardDetails.A03;
        if (num == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(num.intValue() % 100);
        }
        A0L2.setText(resources.getString(2131832195, new Object[]{cardDetails.A02, valueOf}));
        IgImageView igImageView = (IgImageView) requireViewById(R.id.autofill_payment_item_icon);
        String str2 = cardDetails.A05;
        if (str2 != null) {
            igImageView.setUrl(C18250wR.A0K(str2), AnonymousClass7q9.A00);
            return;
        }
        Context context = getContext();
        switch (AnonymousClass69W.A00(this.A00.A06).ordinal()) {
            case 0:
                i = R.drawable.checkout_acceptance_amex;
                break;
            case 1:
                i = R.drawable.checkout_acceptance_discover;
                break;
            case 2:
                i = R.drawable.checkout_acceptance_jcb;
                break;
            case 3:
                i = R.drawable.checkout_acceptance_mastercard;
                break;
            case 4:
                i = R.drawable.checkout_acceptance_rupay;
                break;
            case 5:
                i = R.drawable.checkout_acceptance_visa;
                break;
            default:
                i = R.drawable.rectangular_placeholder;
                break;
        }
        C18180wK.A0r(context, igImageView, i);
    }

    public final void A6q(C83094qm r2) {
        this.A03.add(r2);
    }

    public CardDetails getCardDetails() {
        return this.A00;
    }

    public final boolean isChecked() {
        return this.A02;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, A04);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            if (!this.A01) {
                this.A01 = true;
                for (C83094qm Boh : this.A03) {
                    Boh.Boh(this, this.A02);
                }
                this.A01 = false;
            }
        }
    }

    public C873051w(Context context) {
        super(context);
        C18180wK.A0C(this).inflate(R.layout.layout_autofill_payment_item, this, true);
        setGravity(16);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setId(View.generateViewId());
        setOnClickListener(C86134wK.A0P(this, 2));
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A02);
        }
    }
}
