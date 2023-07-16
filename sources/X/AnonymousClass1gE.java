package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gE  reason: invalid class name */
public final class AnonymousClass1gE extends AnonymousClass436 {
    public final Context A00;
    public final View.OnClickListener A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-894465484);
        AnonymousClass38J r9 = (AnonymousClass38J) obj;
        Context context = this.A00;
        AnonymousClass3CG r4 = (AnonymousClass3CG) view.getTag();
        View.OnClickListener onClickListener = this.A01;
        C18200wM.A15(context, r4.A03, 2131828377);
        TextView textView = r4.A04;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = r9.A00;
        textView.setText(locationPageInfoPageOperationHourResponse.A01);
        r4.A02.setText(locationPageInfoPageOperationHourResponse.A02);
        ImageView imageView = r4.A00;
        imageView.setOnClickListener(onClickListener);
        LinearLayout linearLayout = r4.A01;
        linearLayout.setVisibility(C18190wL.A00(r9.A01 ? 1 : 0));
        List<LocationPageInfoPageOperationHour> list = locationPageInfoPageOperationHourResponse.A04;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        for (LocationPageInfoPageOperationHour locationPageInfoPageOperationHour : list) {
            String str = locationPageInfoPageOperationHour.A00;
            str.getClass();
            String A0g = C18240wQ.A0g(str);
            if (AnonymousClass316.DAYS_IN_A_WEEK.containsKey(A0g)) {
                str = context.getString(AnonymousClass0wJ.A04(AnonymousClass316.DAYS_IN_A_WEEK.get(A0g)));
            }
            List list2 = locationPageInfoPageOperationHour.A01;
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                String str2 = str;
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_info_page_business_hour_row, linearLayout, false);
                    if (str2 != null) {
                        AnonymousClass0wJ.A0L(inflate, R.id.left_title).setText(str);
                        str2 = null;
                    }
                    AnonymousClass0wJ.A0L(inflate, R.id.right_title).setText(A0k);
                    linearLayout.addView(inflate);
                }
            } else {
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.location_page_info_page_business_hour_row, linearLayout, false);
                AnonymousClass0wJ.A0L(inflate2, R.id.left_title).setText(str);
                C18200wM.A15(context, AnonymousClass0wJ.A0L(inflate2, R.id.right_title), 2131824052);
                linearLayout.addView(inflate2);
            }
        }
        if (list.isEmpty()) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            boolean z = r9.A01;
            int i2 = R.drawable.down_chevron;
            if (z) {
                i2 = R.drawable.up_chevron;
            }
            C18180wK.A0r(context, imageView, i2);
        }
        C14030oh.A0A(-460603277, A03);
    }

    public AnonymousClass1gE(Context context, View.OnClickListener onClickListener) {
        this.A00 = context;
        this.A01 = onClickListener;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(133869633);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.location_page_info_page_business_hours_expandable_row);
        A0H.setTag(new AnonymousClass3CG(A0H));
        C14030oh.A0A(631400218, A03);
        return A0H;
    }
}
