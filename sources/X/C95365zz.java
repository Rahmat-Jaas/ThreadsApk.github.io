package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

/* renamed from: X.5zz  reason: invalid class name and case insensitive filesystem */
public final class C95365zz extends C19819BBt implements C148698rh {
    public ViewStub A00;
    public final int A01;
    public final Fragment A02;
    public final C11630kW A03;
    public final C144988jc A04;
    public final C127307gu A05 = new C127307gu();

    public final void onDestroyView() {
        this.A00 = null;
    }

    public final void onPause() {
        C127307gu r1 = this.A05;
        r1.A01((C144998jd) null);
        r1.A04.clear();
    }

    public final void onResume() {
        C127307gu r2 = this.A05;
        r2.A01(this);
        r2.A04.add(this.A04);
        C25812DsR dsR = r2.A03;
        if (!dsR.A0G()) {
            r2.CLi(dsR);
        }
    }

    public C95365zz(Fragment fragment, C11630kW r4, C144988jc r5) {
        this.A02 = fragment;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = AnonymousClass0wJ.A0B(fragment).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
    }

    public final void Bsd(View view) {
        this.A00 = (ViewStub) view.findViewById(R.id.save_popout_image_stub);
    }

    public final void Bki(float f, boolean z) {
    }
}
