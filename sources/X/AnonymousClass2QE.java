package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;

/* renamed from: X.2QE  reason: invalid class name */
public final class AnonymousClass2QE {
    public static final void A00(AnonymousClass3CF r6, AnonymousClass38E r7) {
        r7.A01.setText(r6.A04);
        LinearLayout linearLayout = r7.A00;
        ImmutableList immutableList = r6.A00;
        boolean A1Z = C18180wK.A1Z(r6.A02, AnonymousClass211.LIST_STYLE);
        Context context = linearLayout.getContext();
        String A0g = C18190wL.A0g(context.getResources(), 2131826228);
        C1366783w it = immutableList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            TextView A0A = C18250wR.A0A(AnonymousClass0wJ.A0H(LayoutInflater.from(context), linearLayout, R.layout.lead_ads_text_view));
            if (A1Z) {
                str = AnonymousClass00U.A0N(A0g, str, ' ');
            }
            A0A.setText(str);
            linearLayout.addView(A0A);
        }
    }
}
