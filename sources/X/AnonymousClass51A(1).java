package X;

import android.widget.Filter;

/* renamed from: X.51A  reason: invalid class name */
public final class AnonymousClass51A extends Filter {
    public final /* synthetic */ AnonymousClass515 A00;

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    public AnonymousClass51A(AnonymousClass515 r1) {
        this.A00 = r1;
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        AnonymousClass515 r1 = this.A00;
        filterResults.values = r1.A00;
        filterResults.count = r1.getCount();
        return filterResults;
    }
}
