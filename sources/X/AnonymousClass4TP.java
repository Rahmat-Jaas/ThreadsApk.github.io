package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.4TP  reason: invalid class name */
public final class AnonymousClass4TP implements Runnable {
    public AnonymousClass24O A00;
    public final /* synthetic */ C696349j A01;

    public AnonymousClass4TP(AnonymousClass24O r1, C696349j r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C63643hy.A04(new AnonymousClass4QU(this));
    }

    public static C25828Dsm A00(FragmentActivity fragmentActivity, AnonymousClass4TP r9) {
        Drawable A002 = C30845GYu.A00(fragmentActivity.getResources(), R.drawable.instagram_wellbeing_illustrations_time_up);
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
        A0W.A0g(A002);
        A0W.A02 = fragmentActivity.getString(2131836604);
        Resources resources = fragmentActivity.getResources();
        C696349j r2 = r9.A01;
        A0W.A0p(AnonymousClass0wJ.A0l(fragmentActivity, C60653Py.A00(resources, (int) C63043bN.A01.A05(r2.A02), C63803iN.A0E(AnonymousClass0TJ.A05, r2.A02, 36316134626102240L), false), 2131836601));
        C18180wK.A1O(A0W, r9, 196, 2131826219);
        A0W.A0N(new IDxCListenerShape77S0200000_1_I2(83, (Object) r9, (Object) fragmentActivity), 2131836602);
        A0W.A0r(false);
        return A0W;
    }
}
