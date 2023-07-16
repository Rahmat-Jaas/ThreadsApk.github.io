package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0y9  reason: invalid class name and case insensitive filesystem */
public final class C18910y9 extends Filter {
    public final /* synthetic */ C29341xn A00;

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Collection collection;
        C04220Ms.A0B(filterResults, 1);
        C29341xn r2 = this.A00;
        Object obj = filterResults.values;
        if (!(obj instanceof List) || (collection = (Collection) obj) == null) {
            collection = AnonymousClass0ZV.A00;
        }
        r2.setItems(collection);
    }

    public C18910y9(C29341xn r1) {
        this.A00 = r1;
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (charSequence == null || AnonymousClass8bQ.A0n(charSequence)) {
            A0v.addAll(this.A00.A00);
        }
        C29341xn r10 = this.A00;
        A0v.addAll(r10.A01);
        if (charSequence == null || charSequence.length() == 0) {
            A0v.addAll(r10.A02);
        } else {
            HashSet A0u = C18200wM.A0u();
            for (Object next : r10.A02) {
                if (next instanceof C57593Br) {
                    A0v.add(next);
                } else {
                    String str = (String) charSequence;
                    String str2 = (String) C29341xn.A01(r10, next);
                    if (!(str2 == null || str2.length() == 0)) {
                        Locale A02 = C31103Gfm.A02();
                        String A0r = C18190wL.A0r(A02, str);
                        if (!AnonymousClass8bP.A0j(C18190wL.A0r(A02, str2), A0r, false)) {
                            StringBuilder A0r2 = C18200wM.A0r();
                            for (String str3 : C18190wL.A1b(C18190wL.A0r(C31103Gfm.A02(), str2), " ", 0)) {
                                if (str3.length() != 0) {
                                    int codePointAt = str3.codePointAt(0);
                                    if (Character.isLetter(codePointAt)) {
                                        A0r2.appendCodePoint(codePointAt);
                                    }
                                }
                            }
                            if (!C18190wL.A0n(A0r2).startsWith(A0r)) {
                            }
                        }
                        if (!A0u.contains(C29341xn.A01(r10, next))) {
                            A0v.add(next);
                            A0u.add(C29341xn.A01(r10, next));
                        }
                    }
                }
            }
        }
        filterResults.values = A0v;
        filterResults.count = A0v.size();
        return filterResults;
    }
}
