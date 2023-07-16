package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.location.surface.data.LocationPageInfo;

/* renamed from: X.1gy  reason: invalid class name and case insensitive filesystem */
public final class C24151gy extends AnonymousClass435 {
    public final Context A00;
    public final C11630kW A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24151gy(Context context, C11630kW r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1403435284);
        if (view == null) {
            view = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_page);
            C04220Ms.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            view.setTag(new AnonymousClass3C2(view));
        }
        LocationPageInfo locationPageInfo = (LocationPageInfo) obj;
        AnonymousClass3C2 r4 = (AnonymousClass3C2) C18210wN.A0X(view);
        r4.A03.setText(locationPageInfo.A05);
        r4.A02.setText(locationPageInfo.A01);
        ImageUrl imageUrl = locationPageInfo.A00;
        if (imageUrl != null) {
            r4.A04.setUrl(imageUrl, this.A01);
        }
        CheckBox checkBox = r4.A01;
        checkBox.setChecked(true);
        checkBox.setBackgroundResource(R.drawable.checkbox_selector);
        checkBox.setClickable(false);
        C14030oh.A0A(257485302, A03);
        return view;
    }
}
