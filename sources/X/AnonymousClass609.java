package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape170S0100000_I2_3;

/* renamed from: X.609  reason: invalid class name */
public final class AnonymousClass609 extends AnonymousClass1lO {
    public final Class modelClass() {
        return C131837st.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        Object r9;
        C131837st r12 = (C131837st) mfV;
        C88815Au r13 = (C88815Au) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r13);
        AnonymousClass0YY r0 = r12.A02;
        ComposeView composeView = r13.A00;
        r0.invoke(composeView);
        List<C111056mi> list = r12.A01;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(list, 10)));
        for (C111056mi r8 : list) {
            int intValue = r8.A00.intValue();
            if (intValue == A1Z) {
                r9 = new AnonymousClass5MW(r8.A04, 6);
            } else if (intValue == 0) {
                r9 = new AnonymousClass5MX(r8.A04, C86134wK.A0A(r8.A01), 12);
            } else if (intValue == 2) {
                r9 = new AnonymousClass5MY(AnonymousClass006.A00, r8.A04, C86134wK.A0A(r8.A01), 24);
            } else if (intValue == 3) {
                r9 = new AnonymousClass5MY(AnonymousClass006.A01, r8.A04, C86134wK.A0A(r8.A02), 24);
            } else {
                throw AnonymousClass4VZ.A00();
            }
            A0v.put(r9, r8.A05);
        }
        composeView.setContent(AnonymousClass7WY.A01(new KtLambdaShape170S0100000_I2_3(A0v, 3), -881975334, A1Z));
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C88815Au(new ComposeView(C18190wL.A0A(viewGroup), (AttributeSet) null, C18200wM.A1Y(viewGroup) ? 1 : 0));
    }
}
