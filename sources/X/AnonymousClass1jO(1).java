package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.instagram.barcelona.R;
import java.util.Calendar;

/* renamed from: X.1jO  reason: invalid class name */
public final class AnonymousClass1jO extends C90995fQ {
    public final View A0O(Context context) {
        C04220Ms.A0B(context, 0);
        return C18180wK.A0D(LayoutInflater.from(context), (ViewGroup) null, R.layout.date_picker_spinner, false);
    }

    public final void A0R(View view, AnonymousClass3HX r4, C127397h3 r5, Object obj, Object obj2) {
        C04220Ms.A0B(view, 0);
        DatePicker datePicker = (DatePicker) view;
        datePicker.init(0, 0, 0, (DatePicker.OnDateChangedListener) null);
        datePicker.setMinDate(0);
        datePicker.setMaxDate(Long.MAX_VALUE);
    }

    public AnonymousClass1jO(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }

    public final Object A0P(View view, AnonymousClass3HX r15, C127397h3 r16, Object obj) {
        long j;
        boolean A1Z = AnonymousClass0wJ.A1Z(view, r15);
        C127397h3 r11 = r16;
        C04220Ms.A0B(r11, 2);
        DatePicker datePicker = (DatePicker) view;
        C109326jp A0V = C18230wP.A0V(r11);
        C127397h3 A0K = r11.A0K(40);
        long j2 = 0;
        if (A0K != null) {
            j = A0K.A0I(44, 0);
            j2 = A0K.A0I(48, 0);
        } else {
            j = 0;
        }
        long j3 = 9223372036854775L;
        if (A0K != null) {
            j3 = A0K.A0I(49, 9223372036854775L);
        }
        Calendar instance = Calendar.getInstance();
        C18220wO.A1Q(instance, j * 1000);
        datePicker.init(instance.get(A1Z ? 1 : 0), instance.get(2), C18240wQ.A07(instance), new C65743vh(r15, r11, A0V));
        datePicker.setMinDate(j2 * 1000);
        datePicker.setMaxDate(j3 * 1000);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return A0O(context);
    }
}
