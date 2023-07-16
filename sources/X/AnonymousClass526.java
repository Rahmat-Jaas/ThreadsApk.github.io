package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape42S0300000_2_I2;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.526  reason: invalid class name */
public abstract class AnonymousClass526 extends RelativeLayout {
    public Button A00;
    public Button A01;
    public C107966hb A02;

    public AnonymousClass526(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    private void A00(Context context) {
        inflate(context, R.layout.instant_experiences_confirmation_dialog, this);
        Button button = (Button) requireViewById(R.id.instant_experiences_confirm_dialog_decline_button);
        this.A01 = button;
        C86104wH.A1C(button, 107, this);
        Button button2 = (Button) requireViewById(R.id.instant_experiences_confirm_dialog_accept_button);
        this.A00 = button2;
        C86104wH.A1C(button2, 108, this);
    }

    public void setDetailItems(List list) {
        View requireViewById = requireViewById(R.id.instant_experiences_confirm_dialog_details);
        if (list == null || list.isEmpty()) {
            requireViewById.setVisibility(8);
            return;
        }
        TextView A0L = AnonymousClass0wJ.A0L(this, R.id.instant_experiences_confirm_dialog_detail_clickable);
        ViewGroup A0J = C18220wO.A0J(this, R.id.instant_experiences_confirm_dialog_detail_info_container);
        AnonymousClass0wJ.A0L(this, R.id.instant_experiences_confirm_dialog_detail_string).setText((CharSequence) list.get(0));
        if (list.size() == 1) {
            A0L.setVisibility(8);
            A0J.setVisibility(8);
        } else {
            A0L.setVisibility(0);
            A0L.setText(getResources().getString(2131821702));
            A0L.setOnClickListener(new IDxCListenerShape42S0300000_2_I2(15, (Object) A0L, (Object) this, (Object) A0J));
            A0J.removeAllViews();
            for (int i = 1; i < list.size(); i++) {
                Context context = getContext();
                TextView textView = new TextView(context);
                textView.setText((CharSequence) list.get(i));
                C18180wK.A0s(context, textView, R.color.grey_5);
                A0J.addView(textView);
            }
        }
        requireViewById.setVisibility(0);
    }

    public AnonymousClass526(Context context) {
        super(context);
        A00(context);
    }
}
