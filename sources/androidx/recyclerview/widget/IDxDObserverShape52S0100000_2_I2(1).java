package androidx.recyclerview.widget;

import X.AnonymousClass67F;
import X.C41021LuS;
import androidx.paging.PagingDataAdapter;

public class IDxDObserverShape52S0100000_2_I2 extends C41021LuS {
    public Object A00;
    public final int A01;

    public IDxDObserverShape52S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A08(int i, int i2) {
        if (this.A01 == 0) {
            PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A00;
            if (pagingDataAdapter.mStateRestorationPolicy == AnonymousClass67F.PREVENT && !pagingDataAdapter.A00) {
                pagingDataAdapter.setStateRestorationPolicy(AnonymousClass67F.ALLOW);
            }
            pagingDataAdapter.unregisterAdapterDataObserver(this);
        } else if (i == 0) {
            RecyclerView recyclerView = (RecyclerView) this.A00;
            if (recyclerView.getChildCount() != 0) {
                recyclerView.A0l(0);
            }
        }
    }
}
