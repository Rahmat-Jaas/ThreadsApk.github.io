package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2;
import com.instagram.barcelona.R;

/* renamed from: X.1gM  reason: invalid class name */
public final class AnonymousClass1gM extends AnonymousClass436 {
    public final Context A00;
    public final AnonymousClass1cP A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gM(Context context, AnonymousClass1cP r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-601135064);
        AnonymousClass0wJ.A1M(view, 1, obj);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.FBAudiencePickerViewBinder.Holder");
            AnonymousClass3Bl r4 = (AnonymousClass3Bl) tag;
            KtCSuperShape0S1010000_I2 ktCSuperShape0S1010000_I2 = (KtCSuperShape0S1010000_I2) obj;
            AnonymousClass1cP r2 = this.A01;
            C18210wN.A0n(1, r4, ktCSuperShape0S1010000_I2);
            ((CompoundButton) r4.A03.A08()).setChecked(ktCSuperShape0S1010000_I2.A01);
            AnonymousClass0wJ.A18(r4.A00, 195, r4, r2);
            r4.A01.setText(ktCSuperShape0S1010000_I2.A00);
            AnonymousClass0wJ.A17(r4.A02, 223, r2);
        }
        C14030oh.A0A(-758574285, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-2141428319);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.fb_audience_row);
        C04220Ms.A06(A0H);
        A0H.setTag(new AnonymousClass3Bl(A0H));
        C14030oh.A0A(-1064796067, A03);
        return A0H;
    }
}
