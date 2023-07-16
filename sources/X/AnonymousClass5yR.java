package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5yR  reason: invalid class name */
public final class AnonymousClass5yR extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yR(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(910661818);
        TextView textView = ((C106606fJ) view.getTag()).A00;
        textView.getClass();
        textView.setText((String) obj);
        C14030oh.A0A(-347397007, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(883733818);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.user_group_header_text);
        C106606fJ r1 = new C106606fJ();
        r1.A00 = C18180wK.A0G(A0H, R.id.text);
        A0H.setTag(r1);
        C14030oh.A0A(-1047130465, A03);
        return A0H;
    }
}
