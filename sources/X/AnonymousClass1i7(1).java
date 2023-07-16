package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.business.fragment.CategorySearchFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1i7  reason: invalid class name */
public final class AnonymousClass1i7 extends C63873iU {
    public final String A00;
    public final /* synthetic */ CategorySearchFragment A01;

    public AnonymousClass1i7(CategorySearchFragment categorySearchFragment, String str) {
        this.A01 = categorySearchFragment;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r13) {
        int A03 = C14030oh.A03(740788064);
        CategorySearchFragment categorySearchFragment = this.A01;
        String str = this.A00;
        ImmutableList of = ImmutableList.of();
        if (str != null && str.equals(categorySearchFragment.A0D)) {
            categorySearchFragment.A02 = of;
            categorySearchFragment.A0I = true;
            if (categorySearchFragment.A0O()) {
                CategorySearchFragment.A05(categorySearchFragment);
            }
        }
        String A032 = C63483hZ.A03(r13, C18230wP.A0l(categorySearchFragment));
        if (categorySearchFragment.A05 != null) {
            HashMap hashMap = null;
            if (str != null) {
                hashMap = AnonymousClass0wJ.A0y();
                hashMap.put("category_search_keyword", str);
            }
            categorySearchFragment.A05.BcB(new C37408JrQ(C18220wO.A0n(categorySearchFragment), categorySearchFragment.A0C, "searched_category", A032, (String) null, (Map) null, hashMap, (Map) null));
        }
        C14030oh.A0A(757149292, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1160131583);
        CategorySearchFragment categorySearchFragment = this.A01;
        categorySearchFragment.A0H = false;
        if (categorySearchFragment.getActivity() != null) {
            C18180wK.A11(categorySearchFragment);
        }
        C14030oh.A0A(-149553533, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1566317790);
        CategorySearchFragment categorySearchFragment = this.A01;
        categorySearchFragment.A0H = true;
        if (categorySearchFragment.getActivity() != null) {
            C18180wK.A11(categorySearchFragment);
        }
        C14030oh.A0A(-1714638605, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C84944uG r10;
        int size;
        int A03 = C14030oh.A03(773374172);
        int A032 = C14030oh.A03(-1224091556);
        Object obj2 = ((AnonymousClass5z0) obj).A01;
        if (obj2 != null) {
            r10 = ((C84954uH) obj2).Ano();
        } else {
            r10 = null;
        }
        CategorySearchFragment categorySearchFragment = this.A01;
        String str = this.A00;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (!(r10 == null || r10.AqW() == null || r10.AqW().isEmpty())) {
            C1366783w it = r10.AqW().iterator();
            while (it.hasNext()) {
                C85564vP r0 = (C85564vP) it.next();
                String id = r0.getId();
                String name = r0.getName();
                String AOY = r0.AOY();
                if (!TextUtils.isEmpty(id) && !TextUtils.isEmpty(name)) {
                    builder.add((Object) new AnonymousClass48S(AnonymousClass266.A01(AOY), id, name));
                }
            }
        }
        ImmutableList build = builder.build();
        if (str != null && str.equals(categorySearchFragment.A0D)) {
            categorySearchFragment.A02 = build;
            categorySearchFragment.A0I = true;
            if (categorySearchFragment.A0O()) {
                CategorySearchFragment.A05(categorySearchFragment);
            }
        }
        if (r10 == null) {
            size = 0;
        } else {
            size = r10.AqW().size();
        }
        CategorySearchFragment.A08(categorySearchFragment, "searched_category", "category_search_keyword", str, size);
        C14030oh.A0A(750091908, A032);
        C14030oh.A0A(-640376162, A03);
    }
}
