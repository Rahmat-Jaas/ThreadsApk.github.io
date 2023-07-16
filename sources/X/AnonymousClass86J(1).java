package X;

import androidx.paging.PagingDataAdapter;
import kotlin.Unit;

/* renamed from: X.86J  reason: invalid class name */
public final class AnonymousClass86J implements AnonymousClass0YY {
    public boolean A00 = true;
    public final /* synthetic */ PagingDataAdapter A01;

    public AnonymousClass86J(PagingDataAdapter pagingDataAdapter) {
        this.A01 = pagingDataAdapter;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C115226ui r4 = (C115226ui) obj;
        C04220Ms.A0B(r4, 0);
        if (this.A00) {
            this.A00 = false;
        } else if (r4.A02.A02 instanceof AnonymousClass59K) {
            PagingDataAdapter pagingDataAdapter = this.A01;
            if (pagingDataAdapter.mStateRestorationPolicy == AnonymousClass67F.PREVENT && !pagingDataAdapter.A00) {
                pagingDataAdapter.setStateRestorationPolicy(AnonymousClass67F.ALLOW);
            }
            pagingDataAdapter.A01.A01.A04.A06.remove(this);
        }
        return Unit.A00;
    }
}
