package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1kD  reason: invalid class name */
public final class AnonymousClass1kD extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass48B.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        TextView textView;
        AnonymousClass48B r3 = (AnonymousClass48B) mfV;
        C198011x r4 = (C198011x) m5o;
        String str = null;
        if (r4 != null && (textView = r4.A00) != null) {
            if (r3 != null) {
                str = r3.A00;
            }
            textView.setText(str);
        }
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C198011x(C18180wK.A0D(layoutInflater, viewGroup, R.layout.onboarding_check_list_header_row, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
