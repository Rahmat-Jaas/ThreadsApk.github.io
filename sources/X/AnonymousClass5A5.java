package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.5A5  reason: invalid class name */
public final class AnonymousClass5A5 extends C41030Luu {
    public int A00;
    public C114976uE[] A01;
    public final AnonymousClass0YY A02;

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        AnonymousClass7Kz.A0Q();
        View A0D = C18180wK.A0D(C86124wJ.A0K(context, R.style.BSCIGTheme), viewGroup, R.layout.msc_pivot_bar_item, false);
        C04220Ms.A06(A0D.findViewById(R.id.item_title));
        C04220Ms.A06(A0D.findViewById(R.id.selected_indicator));
        AnonymousClass7Kz.A0D().A00(C18190wL.A0A(A0D), 18);
        throw null;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B((AnonymousClass5AY) m5o, 0);
        throw new NullPointerException("setText");
    }

    public AnonymousClass5A5(AnonymousClass0YY r1, C114976uE[] r2) {
        this.A01 = r2;
        this.A02 = r1;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-917264102);
        int length = this.A01.length;
        C14030oh.A0A(-1475726058, A03);
        return length;
    }
}
