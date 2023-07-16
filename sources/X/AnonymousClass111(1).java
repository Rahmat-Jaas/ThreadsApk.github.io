package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.111  reason: invalid class name */
public final class AnonymousClass111 extends C41030Luu {
    public final C22651Yx A00;
    public final List A01;

    public final void onBindViewHolder(M5O m5o, int i) {
        Drawable drawable;
        C04220Ms.A0B(m5o, 0);
        C201913m r7 = (C201913m) m5o;
        AnonymousClass3CU r3 = (AnonymousClass3CU) this.A01.get(i);
        C04220Ms.A0B(r3, 0);
        IgLinearLayout igLinearLayout = r7.A03;
        AnonymousClass111 r5 = r7.A08;
        AnonymousClass0wJ.A18(igLinearLayout, 200, r5, r3);
        IgSimpleImageView igSimpleImageView = r7.A04;
        igSimpleImageView.setImageDrawable(r3.A02);
        IgTextView igTextView = r7.A07;
        C18210wN.A0y(igTextView);
        igTextView.setText(r3.A04);
        IgTextView igTextView2 = r7.A06;
        igTextView2.setText(r3.A00);
        String str = r3.A00;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        if (r3.A03 == AnonymousClass250.CLOSE_FRIENDS) {
            AnonymousClass0wJ.A17(igTextView2, 225, r5);
        } else {
            igTextView2.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        IgSimpleImageView igSimpleImageView2 = r7.A05;
        if (r3.A01) {
            drawable = r7.A00;
        } else {
            drawable = r7.A01;
        }
        igSimpleImageView2.setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        Context context = r7.A02.getContext();
        layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
        igSimpleImageView.getLayoutParams().height = C18220wO.A01(context, R.dimen.abc_action_bar_stacked_max_height);
    }

    public AnonymousClass111(C22651Yx r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1487673881);
        int size = this.A01.size();
        C14030oh.A0A(-239255023, A03);
        return size;
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C201913m(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.birthday_effects_audience_item, C18200wM.A1Y(viewGroup)), this);
    }
}
