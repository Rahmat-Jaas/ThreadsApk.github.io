package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape201S0200000_2_I2;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5AA  reason: invalid class name */
public final class AnonymousClass5AA extends C41030Luu {
    public View.OnAttachStateChangeListener A00;
    public ImmutableList A01 = C86134wK.A0T();
    public final SparseArray A02;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C04220Ms.A0B(recyclerView, 0);
        IDxCListenerShape201S0200000_2_I2 iDxCListenerShape201S0200000_2_I2 = new IDxCListenerShape201S0200000_2_I2(3, this, recyclerView);
        this.A00 = iDxCListenerShape201S0200000_2_I2;
        recyclerView.addOnAttachStateChangeListener(iDxCListenerShape201S0200000_2_I2);
    }

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        ((C128377jT) this.A01.get(i)).A02(m5o);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return ((C143578gy) this.A02.get(i)).Bsh(viewGroup);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C04220Ms.A0B(recyclerView, 0);
        recyclerView.removeOnAttachStateChangeListener(this.A00);
    }

    public final void onViewRecycled(M5O m5o) {
        C89105Bx r2;
        C04220Ms.A0B(m5o, 0);
        if ((m5o instanceof C89105Bx) && (r2 = (C89105Bx) m5o) != null) {
            r2.A00();
        }
    }

    public final void A00(ImmutableList immutableList) {
        C41200Lyt A002 = C41069Lvu.A00(new C886059s(this, this.A01, immutableList));
        this.A01 = immutableList;
        A002.A02(this);
    }

    public AnonymousClass5AA(SparseArray sparseArray) {
        this.A02 = sparseArray;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-1243391509);
        int size = this.A01.size();
        C14030oh.A0A(266034162, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = C14030oh.A03(1252620778);
        int i2 = ((C128377jT) this.A01.get(i)).A00.A05;
        C14030oh.A0A(-130196553, A03);
        return i2;
    }
}
