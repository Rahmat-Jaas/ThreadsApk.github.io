package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape73S0300000_1_I2;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.1jV  reason: invalid class name */
public final class AnonymousClass1jV extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        return new IgSwitch(context);
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r12, C127397h3 r13, Object obj) {
        IgSwitch igSwitch = (IgSwitch) view;
        C127397h3 r7 = r13;
        String A0o = C18230wP.A0o(r13);
        boolean z = true;
        boolean A0T = r13.A0T(38, true);
        if (A0o == null || !A0o.equals("on")) {
            z = false;
        }
        igSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        igSwitch.setChecked(z);
        C109326jp A0L = r13.A0L(40);
        AnonymousClass3HX r6 = r12;
        if (A0L != null) {
            igSwitch.A07 = new AnonymousClass4DL(this, r6, r7, A0L, A0o);
        }
        igSwitch.setOnCheckedChangeListener(new IDxCListenerShape73S0300000_1_I2(1, this, r12, r13));
        igSwitch.setEnabled(A0T);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r3, C127397h3 r4, Object obj, Object obj2) {
        IgSwitch igSwitch = (IgSwitch) view;
        igSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        igSwitch.A07 = null;
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return new IgSwitch(context);
    }

    public AnonymousClass1jV(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
