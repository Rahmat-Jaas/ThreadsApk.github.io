package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.117  reason: invalid class name */
public final class AnonymousClass117 extends C41030Luu {
    public List A00 = AnonymousClass0wJ.A0v();
    public final Context A01;
    public final C84244sn A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass3DN r2 = (AnonymousClass3DN) this.A00.get(i);
        boolean A1V = C18230wP.A1V(getItemCount());
        C54412zP.A00(this.A01, r2, this.A02, (C202013n) m5o, A1V);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C202013n(LayoutInflater.from(this.A01).inflate(R.layout.login_activity_map_item, viewGroup, false));
    }

    public AnonymousClass117(Context context, C84244sn r3) {
        this.A01 = context;
        this.A02 = r3;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1581021844);
        int size = this.A00.size();
        C14030oh.A0A(1202324648, A03);
        return size;
    }
}
