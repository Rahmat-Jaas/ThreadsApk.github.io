package X;

import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.10x  reason: invalid class name and case insensitive filesystem */
public final class C196510x extends C41030Luu {
    public final List A00;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass130 r4 = (AnonymousClass130) m5o;
        AnonymousClass3A6 r2 = (AnonymousClass3A6) this.A00.get(i);
        r4.A00.setImageResource(r2.A01);
        r4.A02.setText(r2.A02);
        r4.A01.setText(r2.A00);
    }

    public C196510x(List list) {
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1533006938);
        int size = this.A00.size();
        C14030oh.A0A(-2028998632, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass130(AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.wellbeing_interstitial_list_item));
    }
}
