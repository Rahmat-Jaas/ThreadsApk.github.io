package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6T2  reason: invalid class name */
public final class AnonymousClass6T2 {
    public static LeadForm A00(ImageUrl imageUrl, Boolean bool, String str, String str2, String str3, List list) {
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (Object add : list) {
            A0w.add(add);
        }
        return new LeadForm(imageUrl, bool, str, str2, str3, A0w);
    }
}
