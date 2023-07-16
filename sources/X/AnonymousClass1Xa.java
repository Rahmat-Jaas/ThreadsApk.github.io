package X;

import android.app.Dialog;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.1Xa  reason: invalid class name */
public final class AnonymousClass1Xa extends C34568Iak implements C11630kW {
    public static final String __redex_internal_original_name = "IgBloksIdfaDialog";
    public int A00 = 4;
    public C10300i6 A01;
    public FrameLayout A02;
    public C130667qT A03;
    public IgBloksScreenConfig A04;
    public C121247Ez A05;
    public C30938GbW A06;

    public final String getModuleName() {
        return "bloks-idfa-dialog";
    }

    public final C10300i6 A0O() {
        return this.A01;
    }

    public final Dialog A0C(Bundle bundle) {
        super.A0C(bundle);
        Dialog dialog = new Dialog(C18230wP.A0A(this), R.style.IgDialog);
        dialog.setCancelable(false);
        if (this.A05 == null) {
            C30967GcS.A02(__redex_internal_original_name, "Hosting component is null");
            this.A0A = false;
            A07();
            return dialog;
        }
        View A0E = C18240wQ.A0E(LayoutInflater.from(C18230wP.A0A(this)), R.layout.idfa_dialog);
        this.A02 = (FrameLayout) A0E.requireViewById(R.id.bloks_container);
        LLF llf = new LLF(requireContext());
        this.A02.addView(llf);
        this.A05.A06(llf);
        this.A06.A04(this.A02, C35004Ikn.A00(this));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) this.A00);
        gradientDrawable.setColor(C18230wP.A0A(this).getColor(R.color.direct_widget_primary_background));
        A0E.setBackground(gradientDrawable);
        dialog.setContentView(A0E);
        return dialog;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1807793478);
        super.onCreate(bundle);
        C10300i6 A0S = C18190wL.A0S(requireArguments());
        this.A01 = A0S;
        IgBloksScreenConfig A002 = IgBloksScreenConfig.A00(this.mArguments, A0S);
        if (A002 != null) {
            this.A04 = A002;
            C30938GbW A003 = C29781Fu1.A00();
            this.A06 = A003;
            this.A03 = C130667qT.A01(this, this, this.A01, A003);
            C121997Jj r3 = this.A04.A08;
            if (r3 != null) {
                this.A05 = new C58513Fy(requireContext(), r3, this.A03).A00();
            }
            C14030oh.A09(616787432, A022);
            return;
        }
        throw C18180wK.A0a("IgBloksScreenConfig is null");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(784329951);
        super.onDestroy();
        C121247Ez r0 = this.A05;
        if (r0 != null) {
            r0.A03();
        }
        C14030oh.A09(1773340820, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1164242359);
        super.onDestroyView();
        C121247Ez r0 = this.A05;
        if (r0 != null) {
            r0.A04();
        }
        this.A05 = null;
        this.A02 = null;
        C14030oh.A09(-1775274152, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-916897706);
        super.onResume();
        C14030oh.A09(158786884, A022);
    }
}
