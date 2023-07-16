package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.3C5  reason: invalid class name */
public final class AnonymousClass3C5 {
    public String A00;
    public final FragmentActivity A01;
    public final PromoteData A02;
    public final C11630kW A03;
    public final IgRadioGroup A04;

    public AnonymousClass3C5(View view, FragmentActivity fragmentActivity, PromoteData promoteData, C11630kW r5) {
        C04220Ms.A0B(promoteData, 2);
        this.A02 = promoteData;
        this.A01 = fragmentActivity;
        this.A03 = r5;
        this.A04 = (IgRadioGroup) AnonymousClass0wJ.A0I(view, R.id.connect_page_radio_group);
    }
}
