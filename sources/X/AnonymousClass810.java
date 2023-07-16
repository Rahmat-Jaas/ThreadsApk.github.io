package X;

import android.view.View;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.810  reason: invalid class name */
public final class AnonymousClass810 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IDxObserverShape211S0100000_2_I2 A01;

    public AnonymousClass810(View view, IDxObserverShape211S0100000_2_I2 iDxObserverShape211S0100000_2_I2) {
        this.A01 = iDxObserverShape211S0100000_2_I2;
        this.A00 = view;
    }

    public final void run() {
        BottomSheetBehavior bottomSheetBehavior;
        View view = this.A00;
        View view2 = (View) view.getParent();
        if (view2 != null && (view2.getLayoutParams() instanceof L71) && (bottomSheetBehavior = (BottomSheetBehavior) ((L71) view2.getLayoutParams()).A0A) != null) {
            bottomSheetBehavior.A0H(view.getMeasuredHeight());
        }
    }
}
