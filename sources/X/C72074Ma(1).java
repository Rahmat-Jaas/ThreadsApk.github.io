package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;

/* renamed from: X.4Ma  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72074Ma implements C33562Hpw {
    public final /* synthetic */ ModalActivity A00;

    public /* synthetic */ C72074Ma(ModalActivity modalActivity) {
        this.A00 = modalActivity;
    }

    public final void CLp(int i, int i2) {
        ModalActivity modalActivity = this.A00;
        View findViewById = modalActivity.findViewById(R.id.bottom_sheet_container_stub);
        if (findViewById != null) {
            C09860go.A0M(findViewById, i2);
        }
        modalActivity.BCa().A05(i2);
    }
}
