package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;

/* renamed from: X.51g  reason: invalid class name and case insensitive filesystem */
public final class C872651g extends FrameLayout implements C143538gu {
    public C91915hI A00;

    public void setViewModel(C91915hI r9) {
        C04220Ms.A0B(r9, 0);
        this.A00 = r9;
        Context context = getContext();
        View inflate = FrameLayout.inflate(context, R.layout.hub_cell_header_card_icons, this);
        View requireViewById = inflate.requireViewById(R.id.card_icon_list);
        C04220Ms.A0C(requireViewById, C18170wI.A00(0));
        LinearLayout linearLayout = (LinearLayout) requireViewById;
        linearLayout.setGravity(8388611);
        C91915hI r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("supportedLogosViewModel");
            throw null;
        }
        for (Object A04 : r0.A00) {
            C86134wK.A14(context.getDrawable(AnonymousClass0wJ.A04(A04)), LayoutInflater.from(context).inflate(R.layout.hub_cell_header_card_icon, linearLayout, false), linearLayout);
        }
        C04220Ms.A06(context);
        AnonymousClass7IS.A02(inflate, (Integer) null, (Integer) null, AnonymousClass7IS.A01(context, R.attr.fbpay_card_form_card_logos_top_padding), AnonymousClass7IS.A01(context, R.attr.fbpay_card_form_card_logos_bottom_padding));
    }

    public C872651g(Context context) {
        super(context);
    }
}
