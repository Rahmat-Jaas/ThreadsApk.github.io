package X;

import android.content.Context;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import java.util.List;

/* renamed from: X.5yI  reason: invalid class name */
public final class AnonymousClass5yI extends C34727Idy {
    public AnonymousClass5KP A00;
    public List A01 = AnonymousClass0wJ.A0v();
    public final AnonymousClass5yS A02;
    public final SupportProfileDisplayOptionsFragment A03;

    public final void A01(AnonymousClass5KP r4) {
        boolean z;
        String str;
        SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = this.A03;
        AnonymousClass5yI r0 = supportProfileDisplayOptionsFragment.A02;
        r0.A00 = r4;
        A00(r0);
        ActionButton actionButton = supportProfileDisplayOptionsFragment.A00;
        C146558mR r02 = supportProfileDisplayOptionsFragment.A01;
        if (r02 == null || ((str = r4.A04) != null && !str.equals(r02.AWx()))) {
            z = true;
        } else {
            z = false;
        }
        actionButton.setEnabled(z);
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public AnonymousClass5yI(Context context, SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment) {
        AnonymousClass5yS r0 = new AnonymousClass5yS(context, this);
        this.A02 = r0;
        this.A03 = supportProfileDisplayOptionsFragment;
        init(r0);
    }

    public static void A00(AnonymousClass5yI r4) {
        boolean z;
        r4.clear();
        for (C94215tw r2 : r4.A01) {
            AnonymousClass5KP r0 = r4.A00;
            if (r0 != null) {
                boolean equals = r2.A01.equals(r0.A04);
                z = true;
                if (equals) {
                    r4.addModel(r2, Boolean.valueOf(z), r4.A02);
                }
            }
            z = false;
            r4.addModel(r2, Boolean.valueOf(z), r4.A02);
        }
        r4.notifyDataSetChanged();
    }
}
