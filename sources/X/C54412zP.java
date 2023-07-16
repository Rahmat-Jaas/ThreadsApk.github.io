package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.2zP  reason: invalid class name and case insensitive filesystem */
public final class C54412zP {
    public static void A00(Context context, AnonymousClass3DN r12, C84244sn r13, C202013n r14, boolean z) {
        ImageView imageView;
        int i;
        AnonymousClass3DN r7 = r12;
        Context context2 = context;
        C202013n r6 = r14;
        if (r12.A0B) {
            L70 l70 = (L70) r14.itemView.getLayoutParams();
            l70.height = (int) context.getResources().getDimension(R.dimen.alt_text_carousel_card_width);
            if (!z) {
                l70.width = (int) context.getResources().getDimension(R.dimen.login_history_map_width);
            }
            r14.A00.setVisibility(0);
            imageView = r14.A06;
            i = R.drawable.instagram_error_pano_outline_24;
        } else {
            r14.A07.setVisibility(8);
            imageView = r14.A06;
            i = R.drawable.instagram_location_pano_outline_24;
        }
        C18180wK.A0r(context, imageView, i);
        C63393hP.A04(context, imageView, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        IgStaticMapView igStaticMapView = r14.A05;
        igStaticMapView.setEnabled(true);
        igStaticMapView.A07 = C29007Ffw.TOP_RIGHT;
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
        staticMapView$StaticMapOptions.A02((double) r12.A00, (double) r12.A01);
        staticMapView$StaticMapOptions.A03(11);
        igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
        r14.A00.setOnClickListener(new IDxCListenerShape15S0400000_1_I2(21, r6, r7, context2, r13));
        AnonymousClass0wJ.A18(r14.A01, 233, r12, r13);
        String A05 = C19591Ayr.A05(context, System.currentTimeMillis());
        String string = context.getString(2131830145);
        String A0h = C18220wO.A0h(context, A05, string, 2131830144);
        AnonymousClass3Zw.A03(new C29411y0(context, r12, r13, r14, context.getColor(R.color.igds_primary_text)), r14.A08, string, A0h);
        TextView textView = r14.A04;
        String str = r12.A07;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        r14.A03.setText(C54422zQ.A00(context, r12));
        TextView textView2 = r14.A02;
        String str2 = r12.A05;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(str2);
    }
}
