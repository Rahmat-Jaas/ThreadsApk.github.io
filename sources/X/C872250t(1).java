package X;

import android.util.Pair;
import android.view.ViewStructure;
import java.util.List;

/* renamed from: X.50t  reason: invalid class name and case insensitive filesystem */
public final class C872250t extends ViewStructure.HtmlInfo.Builder {
    public final List A00 = AnonymousClass0wJ.A0v();

    public final ViewStructure.HtmlInfo.Builder addAttribute(String str, String str2) {
        if (str != null) {
            List list = this.A00;
            if (str2 == null) {
                str2 = "";
            }
            list.add(new Pair(str, str2));
        }
        return this;
    }

    public final ViewStructure.HtmlInfo build() {
        return new AnonymousClass50u(this.A00);
    }
}
