package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.business.fragment.CategorySearchFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1fK  reason: invalid class name */
public final class AnonymousClass1fK extends I4A {
    public final Context A00;
    public final AnonymousClass1g9 A01;
    public final CategorySearchFragment A02;
    public final C24021gl A03;

    public AnonymousClass1fK(Context context, CategorySearchFragment categorySearchFragment) {
        this.A00 = context;
        this.A02 = categorySearchFragment;
        C24021gl r1 = new C24021gl(context);
        this.A03 = r1;
        AnonymousClass1g9 r0 = new AnonymousClass1g9(context, categorySearchFragment);
        this.A01 = r0;
        A08(r1, r0);
    }

    public static void A00(AnonymousClass1fK r7, AnonymousClass48S r8, List list) {
        String A0Z = C18250wR.A0Z(r8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass48S r4 = (AnonymousClass48S) it.next();
            String str = r4.A01;
            if (!TextUtils.isEmpty(str)) {
                String str2 = r4.A02;
                if (!TextUtils.isEmpty(str2)) {
                    boolean equals = str.equals(A0Z);
                    C57403Ax r1 = new C57403Ax(str2, C18200wM.A0R(r4, r7, 31));
                    r1.A00 = equals;
                    r7.A05(r7.A01, r1);
                }
            }
        }
    }
}
