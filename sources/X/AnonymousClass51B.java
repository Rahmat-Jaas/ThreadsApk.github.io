package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.51B  reason: invalid class name */
public final class AnonymousClass51B extends Filter {
    public final UserSession A00;
    public final C28279F7r A01;

    public final CharSequence convertResultToString(Object obj) {
        if (obj instanceof Hashtag) {
            return AnonymousClass00U.A0L("#", ((Hashtag) obj).A0C);
        }
        return "";
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            C28279F7r f7r = this.A01;
            List list = (List) filterResults.values;
            C28269F7c f7c = f7r.A0G;
            C04220Ms.A0B(list, 0);
            List list2 = f7c.A02;
            list2.clear();
            int size = list.size();
            if (size > 2) {
                size = 2;
            }
            list2.addAll(list.subList(0, size));
            f7c.notifyDataSetChanged();
            List list3 = f7r.A0H.A02.B5G(charSequence.toString()).A06;
            if (list3 != null && !list3.isEmpty()) {
                f7c.A00(list3);
            }
        }
    }

    public AnonymousClass51B(C28279F7r f7r, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = f7r;
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(0) != '#') {
            return null;
        }
        List A02 = AnonymousClass5vV.A00(this.A00).A02(charSequence.subSequence(1, charSequence.length()).toString());
        ArrayList A0t = C18200wM.A0t(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C36421JUf jUf = new C36421JUf(C19274Atd.A00(C18180wK.A0k(it)));
            jUf.A04 = true;
            A0t.add(jUf.A00());
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = A0t;
        filterResults.count = A0t.size();
        return filterResults;
    }
}
