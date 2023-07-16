package X;

import com.instagram.business.fragment.SupportServicePartnerSelectionFragment;
import java.util.List;

/* renamed from: X.5yH  reason: invalid class name */
public final class AnonymousClass5yH extends C34727Idy {
    public List A00 = AnonymousClass0wJ.A0v();
    public final AnonymousClass5yM A01;
    public final SupportServicePartnerSelectionFragment A02;

    public final boolean isEmpty() {
        List list = this.A00;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public AnonymousClass5yH(SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment) {
        AnonymousClass5yM r0 = new AnonymousClass5yM(this);
        this.A01 = r0;
        this.A02 = supportServicePartnerSelectionFragment;
        init(r0);
    }
}
