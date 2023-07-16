package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kd  reason: invalid class name and case insensitive filesystem */
public final class C24791kd extends AnonymousClass1lO {
    public final AnonymousClass0ZU A00;

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C04220Ms.A0B(m5o, 1);
        AnonymousClass0wJ.A16(m5o.itemView, 556, this.A00);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(layoutInflater, 1);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.media_kit_grid_camera_item);
        C04220Ms.A06(A0H);
        return new C197511p(A0H);
    }

    public final Class modelClass() {
        return C23149Cmj.class;
    }

    public C24791kd(AnonymousClass0ZU r1) {
        this.A00 = r1;
    }
}
