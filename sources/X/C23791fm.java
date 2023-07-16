package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1fm  reason: invalid class name and case insensitive filesystem */
public final class C23791fm extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C23791fm(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1744968079);
        AnonymousClass0wJ.A1M(view, 1, obj);
        C554933k r0 = (C554933k) view.getTag();
        if (r0 != null) {
            C63293hC r6 = (C63293hC) obj;
            C04220Ms.A0B(r6, 1);
            TextView textView = r0.A00;
            r6.A03(textView);
            View.OnClickListener onClickListener = r6.A03;
            if (onClickListener != null) {
                textView.setOnClickListener(onClickListener);
            }
            C14030oh.A0A(190438618, A03);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A0A(259644180, A03);
        throw A0b;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-1615382445, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.secondary_text_view);
        A0H.setTag(new C554933k((TextView) AnonymousClass0wJ.A0J(A0H, R.id.secondary_text)));
        C14030oh.A0A(292842302, A002);
        return A0H;
    }
}
