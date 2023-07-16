package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.11N  reason: invalid class name */
public final class AnonymousClass11N extends C41030Luu implements View.OnClickListener {
    public C83164qt A00;
    public final List A01;

    public final void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass3B2 r2 = (AnonymousClass3B2) this.A01.get(i);
        C200212u r4 = (C200212u) m5o;
        r4.A01.setText(r2.A02);
        r4.A00.setChecked(r2.A00);
        r4.itemView.setTag(Integer.valueOf(i));
    }

    public AnonymousClass11N(C83164qt r2, List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A01 = A0v;
        A0v.addAll(list);
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-1647721792);
        int size = this.A01.size();
        C14030oh.A0A(-480925291, A03);
        return size;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1937355865);
        int A04 = AnonymousClass0wJ.A04(view.getTag());
        List list = this.A01;
        C309523p r4 = ((AnonymousClass3B2) list.get(A04)).A01;
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass3B2 r2 = (AnonymousClass3B2) list.get(i);
            boolean A1Z = C18180wK.A1Z(r2.A01, r4);
            if (r2.A00 != A1Z) {
                r2.A00 = A1Z;
                notifyItemChanged(i);
            }
        }
        this.A00.CLT(r4);
        C14030oh.A0C(117089192, A05);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.follow_list_sorting_option_row);
        A0H.setOnClickListener(this);
        return new C200212u(A0H);
    }
}
