package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.0Rv  reason: invalid class name and case insensitive filesystem */
public final class C05200Rv implements Iterator, AnonymousClass0Wi {
    public int A00;
    public final /* synthetic */ ViewGroup A01;

    public C05200Rv(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }

    public final boolean hasNext() {
        if (this.A00 < this.A01.getChildCount()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        ViewGroup viewGroup = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void remove() {
        ViewGroup viewGroup = this.A01;
        int i = this.A00 - 1;
        this.A00 = i;
        viewGroup.removeViewAt(i);
    }
}
