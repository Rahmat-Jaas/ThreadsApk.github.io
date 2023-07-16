package X;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import com.instagram.barcelona.R;

/* renamed from: X.51D  reason: invalid class name */
public final class AnonymousClass51D extends FrameLayout {
    public RadioButton A00;

    public AnonymousClass51D(Context context) {
        super(context, (AttributeSet) null, 0);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_right_add_on_radio_button, this, false));
        RadioButton radioButton = (RadioButton) AnonymousClass0wJ.A0I(this, R.id.list_cell_right_add_on_radio_button);
        this.A00 = radioButton;
        if (radioButton != null) {
            AnonymousClass697 r2 = AnonymousClass697.RADIO_BUTTON_ON_MEDIUM;
            AnonymousClass697 r9 = AnonymousClass697.RADIO_BUTTON_OFF_MEDIUM;
            StateListDrawable stateListDrawable = new StateListDrawable();
            C121097Ec A0G = AnonymousClass7Kz.A0G();
            int i = r2.A00;
            int i2 = r2.A01;
            Context context2 = radioButton.getContext();
            stateListDrawable.addState(new int[]{16842912}, A0G.A04(context2, i, i2));
            stateListDrawable.addState(new int[]{16842908}, AnonymousClass7Kz.A0G().A04(context2, i, i2));
            stateListDrawable.addState(new int[0], AnonymousClass7Kz.A0G().A04(context2, r9.A00, r9.A01));
            radioButton.setButtonDrawable(stateListDrawable);
            RadioButton radioButton2 = this.A00;
            if (radioButton2 != null) {
                radioButton2.setEnabled(false);
                RadioButton radioButton3 = this.A00;
                if (radioButton3 != null) {
                    radioButton3.setClickable(false);
                    RadioButton radioButton4 = this.A00;
                    if (radioButton4 != null) {
                        radioButton4.setImportantForAccessibility(2);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E("radioButton");
        throw null;
    }

    public final void A00() {
        RadioButton radioButton = this.A00;
        if (radioButton == null) {
            C04220Ms.A0E("radioButton");
            throw null;
        } else {
            radioButton.toggle();
        }
    }

    public final void setChecked(boolean z) {
        RadioButton radioButton = this.A00;
        if (radioButton == null) {
            C04220Ms.A0E("radioButton");
            throw null;
        } else {
            radioButton.setChecked(z);
        }
    }
}
