package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2PC  reason: invalid class name */
public final class AnonymousClass2PC {
    public static final void A00(Context context, ViewGroup viewGroup, List list) {
        LayoutInflater from;
        int i;
        TextView textView;
        boolean A1Z = AnonymousClass0wJ.A1Z(context, viewGroup);
        C04220Ms.A0B(list, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass380 r7 = (AnonymousClass380) it.next();
            int intValue = r7.A00.intValue();
            if (intValue == A1Z) {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_text_view;
            } else if (intValue == 2) {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_emphasize_text_view;
            } else if (intValue == 3) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.gdpr_bullet_point_paragraph, viewGroup, false);
                C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                C18200wM.A0K(inflate, R.id.text_view).setText(r7.A01);
                textView = inflate;
                viewGroup.addView(textView);
            } else if (intValue == 0) {
                from = LayoutInflater.from(context);
                i = R.layout.gdpr_subheading_text_view;
            }
            View inflate2 = from.inflate(i, viewGroup, false);
            C04220Ms.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) inflate2;
            textView2.setText(r7.A01);
            textView = textView2;
            viewGroup.addView(textView);
        }
    }
}
