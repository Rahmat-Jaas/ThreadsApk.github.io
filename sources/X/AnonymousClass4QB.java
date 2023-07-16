package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;

/* renamed from: X.4QB  reason: invalid class name */
public final class AnonymousClass4QB implements Runnable {
    public final /* synthetic */ AnonymousClass1x2 A00;

    public AnonymousClass4QB(AnonymousClass1x2 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1x2 r4 = this.A00;
        C58753Hb r2 = r4.A06;
        if (r2 == null) {
            C04220Ms.A0E("userOptionsController");
            throw null;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        r2.A01(A0v, true, false);
        r2.A00(C06810aP.A01.A01(r2.A05), A0v);
        if (A0v.isEmpty() && !r4.A0C) {
            ((UserFlowLogger) r4.A0K.getValue()).flowEndFail(r4.A00, "zero user option items", (String) null);
            r4.A0C = true;
        }
        C57593Br r22 = r4.A08;
        if (r22 != null) {
            SearchEditText searchEditText = r22.A00;
            if (searchEditText != null) {
                searchEditText.setText("");
            }
            A0v.add(0, r22);
        }
        if (r4.A05 == null) {
            C04220Ms.A0E("accountsCenterOptionsController");
            throw null;
        }
        AnonymousClass3CZ r1 = r4.A07;
        if (r1 != null && r1.A04) {
            A0v.add(0, r1);
        }
        r4.setItems(A0v);
        AnonymousClass1x2.A0C(r4);
        if (!r4.A0C) {
            ((UserFlowLogger) r4.A0K.getValue()).flowEndSuccess(r4.A00);
            r4.A0C = true;
        }
    }
}
