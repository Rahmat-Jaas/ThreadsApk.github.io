package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxCListenerShape268S0100000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.52Q  reason: invalid class name */
public final class AnonymousClass52Q extends SwitchCompat implements C143538gu {
    public C91925hJ A00;
    public final CompoundButton.OnCheckedChangeListener A01 = new IDxCListenerShape268S0100000_2_I2(this, 2);

    public void setViewModel(C91925hJ r4) {
        this.A00 = r4;
        Object A0C = AnonymousClass7Ih.A0C(r4);
        A0C.getClass();
        setChecked(AnonymousClass0wJ.A1X(A0C));
        setEnabled(this.A00.A08);
        setText(this.A00.A00);
        setTextColor(AnonymousClass7Kz.A0G().A03(getContext(), 0));
        setOnCheckedChangeListener(this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52Q(Context context) {
        super(new ContextThemeWrapper(context, R.style.Switch));
        AnonymousClass7Kz.A0K();
    }

    public void setEnabled(boolean z) {
        setClickable(z);
        setAlpha(C18230wP.A00(z ? 1 : 0));
    }
}
