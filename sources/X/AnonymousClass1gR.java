package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1gR  reason: invalid class name */
public final class AnonymousClass1gR extends AnonymousClass436 {
    public final Context A00;
    public final C81334nc A01;
    public final C11630kW A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gR(Context context, C81334nc r2, C11630kW r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-789990505);
        AnonymousClass3C2 r6 = (AnonymousClass3C2) C18210wN.A0X(view);
        AnonymousClass3IK r10 = (AnonymousClass3IK) obj;
        C11630kW r4 = this.A02;
        C81334nc r3 = this.A01;
        boolean A1X = AnonymousClass0wJ.A1X(obj2);
        AnonymousClass0wJ.A1N(r6, r10);
        ImageUrl imageUrl = r10.A02;
        if (imageUrl != null) {
            r6.A04.setUrl(imageUrl, r4);
        }
        r6.A03.setText(r10.A0A);
        r6.A02.setText(r10.A06);
        r6.A01.setChecked(A1X);
        AnonymousClass0wJ.A18(r6.A00, 38, r10, r3);
        C14030oh.A0A(-1027783394, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-589075642);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_page);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type android.view.ViewGroup");
        A0H.setTag(new AnonymousClass3C2(A0H));
        C14030oh.A0A(-8086513, A03);
        return A0H;
    }
}
