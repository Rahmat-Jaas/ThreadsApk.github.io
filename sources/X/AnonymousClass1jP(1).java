package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.instagram.barcelona.R;
import java.util.Calendar;

/* renamed from: X.1jP  reason: invalid class name */
public final class AnonymousClass1jP extends C90995fQ {
    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r7, C127397h3 r8, Object obj, Object obj2) {
        Calendar instance = Calendar.getInstance();
        ((DatePicker) view).init(instance.get(1), instance.get(2), C18240wQ.A07(instance), (DatePicker.OnDateChangedListener) null);
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r7, C127397h3 r8, Object obj) {
        DatePicker datePicker = (DatePicker) view;
        C109326jp A0V = C18230wP.A0V(r8);
        Calendar instance = Calendar.getInstance();
        datePicker.init(instance.get(1), instance.get(2), C18240wQ.A07(instance), new C65753vi(this, r7, r8, A0V));
        datePicker.setMaxDate(Calendar.getInstance().getTimeInMillis());
        return null;
    }

    public AnonymousClass1jP(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }

    public final View A0O(Context context) {
        return AnonymousClass0wJ.A0H(LayoutInflater.from(context), (ViewGroup) null, R.layout.date_picker_spinner);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return A0O(context);
    }
}
