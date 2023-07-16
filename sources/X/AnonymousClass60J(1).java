package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.60J  reason: invalid class name */
public final class AnonymousClass60J extends AnonymousClass1lO {
    public final Context A00;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        Object tag = C102236Uk.A00(this.A00, viewGroup).getTag();
        C04220Ms.A0C(tag, AnonymousClass000.A00(1019));
        return (M5O) tag;
    }

    public final Class modelClass() {
        return C167409pU.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C88795Ar r3 = (C88795Ar) m5o;
        C04220Ms.A0B(r3, 1);
        r3.A00.A04();
    }

    public AnonymousClass60J(Context context) {
        this.A00 = context;
    }
}
