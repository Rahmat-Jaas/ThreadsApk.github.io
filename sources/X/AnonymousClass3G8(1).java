package X;

import android.database.DataSetObserver;
import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDListenerShape435S0100000_1_I2;
import com.instagram.business.fragment.SuggestBusinessFragment;

/* renamed from: X.3G8  reason: invalid class name */
public final class AnonymousClass3G8 {
    public int A00 = 0;
    public int A01 = 0;
    public DataSetObserver A02;
    public final RecyclerView A03;
    public final AnonymousClass1fT A04;
    public final SuggestBusinessFragment A05;
    public final C113246qz A06;
    public final AnonymousClass0hW A07;

    public AnonymousClass3G8(RecyclerView recyclerView, AnonymousClass1fT r8, SuggestBusinessFragment suggestBusinessFragment) {
        C04220Ms.A0B(recyclerView, 1);
        this.A03 = recyclerView;
        this.A04 = r8;
        this.A05 = suggestBusinessFragment;
        C18410x9 r0 = new C18410x9(this);
        this.A02 = r0;
        IDxSListenerShape58S0100000_1_I2 iDxSListenerShape58S0100000_1_I2 = new IDxSListenerShape58S0100000_1_I2(this, 0);
        this.A06 = iDxSListenerShape58S0100000_1_I2;
        r8.registerDataSetObserver(r0);
        this.A07 = new AnonymousClass0hW(AnonymousClass0wJ.A0F(), new IDxDListenerShape435S0100000_1_I2(this, 0), (long) 300);
        recyclerView.A11(iDxSListenerShape58S0100000_1_I2);
    }

    public final void A00(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0H;
        if (linearLayoutManager != null) {
            int max = Math.max(linearLayoutManager.A1i(), 1);
            this.A07.A01(C18220wO.A0H(Integer.valueOf(max), Math.min(linearLayoutManager.A1j(), (i - 1) - 1)));
        }
    }
}
