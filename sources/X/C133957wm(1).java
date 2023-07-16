package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.redex.IDxCListenerShape266S0200000_2_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7wm  reason: invalid class name and case insensitive filesystem */
public final class C133957wm implements C27942Evs {
    public int A00;
    public int A01;
    public final SeekBar A02;
    public final AnonymousClass4xV A03;

    public C133957wm(View view, C109466k3 r9) {
        C04220Ms.A0B(r9, 2);
        r9.A02.add(this);
        C133967wn r4 = new C133967wn(r9);
        SeekBar seekBar = (SeekBar) AnonymousClass0wJ.A0J(view, R.id.fast_scrubber);
        this.A02 = seekBar;
        Context context = seekBar.getContext();
        boolean A05 = C121907Is.A05(context, R.attr.musicCreationShadowEnabled, false);
        C04220Ms.A06(context);
        AnonymousClass4xV r1 = new AnonymousClass4xV(context, A05);
        this.A03 = r1;
        seekBar.setThumb(new C86334xT(context, A05));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{r1, new ColorDrawable(0)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        seekBar.setProgressDrawable(layerDrawable);
        seekBar.setOnSeekBarChangeListener(new IDxCListenerShape266S0200000_2_I2(1, r4, this));
    }

    public final void C8Z(int i) {
    }

    public final void BQ9(List list, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        SeekBar seekBar = this.A02;
        seekBar.setMax(i - i2);
        seekBar.setProgress(i3);
        int i4 = this.A01 - this.A00;
        ArrayList A0t = C18200wM.A0t(list);
        for (Object A04 : list) {
            A0t.add(Float.valueOf(Math.min(((float) AnonymousClass0wJ.A04(A04)) / ((float) i4), 1.0f)));
        }
        AnonymousClass4xV r0 = this.A03;
        r0.A00 = A0t;
        r0.invalidateSelf();
    }

    public final void CLO(int i) {
        this.A00 = i;
        this.A02.setMax(this.A01 - i);
    }

    public final void CLP(int i) {
        this.A02.setProgress(i);
    }
}
