package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.1gV  reason: invalid class name */
public final class AnonymousClass1gV extends AnonymousClass436 {
    public final Context A00;
    public final C11630kW A01;
    public final AnonymousClass1cP A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gV(Context context, C11630kW r2, AnonymousClass1cP r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1515127135);
        AnonymousClass0wJ.A1M(view, 1, obj);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerViewBinder.Holder");
            AnonymousClass3CT r4 = (AnonymousClass3CT) tag;
            AnonymousClass395 r11 = (AnonymousClass395) obj;
            C11630kW r7 = this.A01;
            AnonymousClass1cP r3 = this.A02;
            C04220Ms.A0B(r4, 0);
            C04220Ms.A0B(r11, 1);
            User user = r11.A01;
            GradientSpinnerAvatarView gradientSpinnerAvatarView = r4.A04;
            gradientSpinnerAvatarView.A09(user.B4M(), r7);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            TextView textView = r4.A02;
            textView.setText(user.BK7());
            C63563ho.A07(textView, user.BZi());
            String Ak2 = user.Ak2();
            if (Ak2.length() > 0) {
                TextView textView2 = r4.A01;
                textView2.setText(Ak2);
                textView2.setVisibility(0);
            } else {
                r4.A01.setVisibility(8);
            }
            ((CompoundButton) r4.A03.A08()).setChecked(r11.A00);
            C18200wM.A1E(r4.A00, r11, r3, r4, 62);
        }
        C14030oh.A0A(517553624, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1920752752);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.selectable_user_row);
        C04220Ms.A06(A0H);
        A0H.setTag(new AnonymousClass3CT(A0H));
        C14030oh.A0A(-1674123119, A03);
        return A0H;
    }
}
