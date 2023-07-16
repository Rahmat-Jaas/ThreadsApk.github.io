package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape45S0200000_1_I2;

/* renamed from: X.13y  reason: invalid class name and case insensitive filesystem */
public final class C202813y extends M5O implements C83724rs {
    public C121247Ez A00;
    public final FrameLayout A01;
    public final ProgressBar A02;
    public final TextView A03;
    public final LLF A04;

    public final void C1l(C121247Ez r4, C57253Ai r5) {
        C121247Ez r0 = this.A00;
        if (r0 != r4) {
            if (r0 != null) {
                r0.A04();
            }
            this.A00 = r4;
            r4.A06(this.A04);
        }
        this.A02.setVisibility(8);
        this.A01.setVisibility(0);
        this.A03.setVisibility(8);
        r5.A02.CEB(r5.A01);
        C130667qT r2 = r5.A00;
        r2.A04(new IDxLListenerShape45S0200000_1_I2(6, (Object) this, (Object) r2));
    }

    public final void C54(String str) {
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        TextView textView = this.A03;
        textView.setVisibility(0);
        textView.setText("Bloks data was null");
    }

    public C202813y(View view) {
        super(view);
        this.A02 = (ProgressBar) view.findViewById(R.id.bloks_loader);
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.bloks_container);
        this.A01 = frameLayout;
        this.A03 = C18180wK.A0G(view, R.id.error_message);
        LLF llf = new LLF(view.getContext());
        this.A04 = llf;
        frameLayout.addView(llf);
    }
}
