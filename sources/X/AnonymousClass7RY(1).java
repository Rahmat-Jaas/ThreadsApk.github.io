package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.redex.IDxLAdapterShape0S0200000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.7RY  reason: invalid class name */
public final class AnonymousClass7RY implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HDT A01;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C04220Ms.A0B(view, 0);
        view.removeOnLayoutChangeListener(this);
        View view2 = this.A00;
        int height = view2.getHeight();
        view2.setVisibility(8);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, 0});
        HDT hdt = this.A01;
        C86134wK.A0z(ofInt, AnonymousClass0wJ.A0K(hdt.A0p, R.id.gallery_container), 7);
        ofInt.addListener(new IDxLAdapterShape0S0200000_2_I2(0, view2, hdt));
        if (!ofInt.isRunning()) {
            ofInt.start();
        }
    }

    public AnonymousClass7RY(View view, HDT hdt) {
        this.A00 = view;
        this.A01 = hdt;
    }
}
