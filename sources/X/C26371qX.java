package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.1qX  reason: invalid class name and case insensitive filesystem */
public final class C26371qX extends C558534v {
    public final List A00;

    public C26371qX(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.section_1);
        C04220Ms.A0C(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = view.findViewById(R.id.section_2);
        C04220Ms.A0C(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = view.findViewById(R.id.section_3);
        C04220Ms.A0C(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.A00 = C06750aI.A17((TextView) findViewById, (TextView) findViewById2, (TextView) findViewById3);
    }
}
