package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3QS  reason: invalid class name */
public final class AnonymousClass3QS {
    public static final List A00 = Arrays.asList(new AnonymousClass25T[]{AnonymousClass25T.A04, AnonymousClass25T.A01, AnonymousClass25T.A03, AnonymousClass25T.A05, AnonymousClass25T.A02});

    public static C19060yu A00(Context context, AutofillData autofillData, boolean z) {
        String str;
        ArrayList arrayList;
        String join;
        String str2;
        int i;
        AnonymousClass25T r0;
        String A002;
        Object obj;
        int i2;
        AnonymousClass25T r02;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass25T r1 : AnonymousClass25T.values()) {
            if (r1.A01(autofillData) != null) {
                A0v.add(r1);
            }
        }
        int size = A0v.size();
        if (z) {
            int i3 = 0;
            if (size == 1) {
                A002 = ((AnonymousClass25T) A0v.get(0)).A00(context, autofillData);
                obj = A0v.get(0);
            } else {
                Iterator it = A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    AnonymousClass25T r12 = (AnonymousClass25T) it.next();
                    if (A0v.contains(r12)) {
                        str = r12.A01(autofillData);
                        A0v.remove(r12);
                        if (r12 == AnonymousClass25T.A01) {
                            AnonymousClass25T r13 = AnonymousClass25T.A02;
                            if (A0v.contains(r13)) {
                                str = AnonymousClass00U.A0V(str, ", ", r13.A01(autofillData));
                                A0v.remove(r13);
                            }
                        }
                    }
                }
                arrayList = AnonymousClass0wJ.A0v();
                while (i3 < A0v.size()) {
                    AnonymousClass25T r7 = (AnonymousClass25T) A0v.get(i3);
                    AnonymousClass25T r6 = AnonymousClass25T.A01;
                    if (r7 == r6 && (i2 = i3 + 1) < A0v.size() && A0v.get(i2) == (r02 = AnonymousClass25T.A02)) {
                        arrayList.add(AnonymousClass00U.A0V(r6.A01(autofillData), ", ", r02.A01(autofillData)));
                        i3 = i2;
                    } else {
                        arrayList.add(r7.A01(autofillData));
                    }
                    i3++;
                }
                join = TextUtils.join("\n", arrayList);
                Pair create = Pair.create(str, join);
                C19060yu r2 = new C19060yu(context);
                r2.setId(View.generateViewId());
                r2.setTitle((String) create.first);
                r2.setSubtitle((String) create.second);
                r2.setExtraButtonText(context.getResources().getString(2131826643));
                return r2;
            }
        } else {
            int i4 = 0;
            if (size == 1) {
                A002 = ((AnonymousClass25T) A0v.get(0)).A00(context, autofillData);
                obj = A0v.get(0);
            } else {
                Iterator it2 = A00.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str2 = null;
                        break;
                    }
                    AnonymousClass25T r14 = (AnonymousClass25T) it2.next();
                    if (A0v.contains(r14)) {
                        str2 = r14.A01(autofillData);
                        A0v.remove(r14);
                        break;
                    }
                }
                arrayList = AnonymousClass0wJ.A0v();
                while (i4 < A0v.size()) {
                    AnonymousClass25T r72 = (AnonymousClass25T) A0v.get(i4);
                    AnonymousClass25T r22 = AnonymousClass25T.A03;
                    if (r72 == r22 && (i = i4 + 1) < A0v.size() && A0v.get(i) == (r0 = AnonymousClass25T.A05)) {
                        arrayList.add(AnonymousClass00U.A0V(r22.A01(autofillData), " · ", r0.A01(autofillData)));
                        i4 += 2;
                    } else {
                        arrayList.add(r72.A01(autofillData));
                        i4++;
                    }
                }
                join = TextUtils.join("\n", arrayList);
                Pair create2 = Pair.create(str, join);
                C19060yu r23 = new C19060yu(context);
                r23.setId(View.generateViewId());
                r23.setTitle((String) create2.first);
                r23.setSubtitle((String) create2.second);
                r23.setExtraButtonText(context.getResources().getString(2131826643));
                return r23;
            }
        }
        join = ((AnonymousClass25T) obj).A01(autofillData);
        Pair create22 = Pair.create(str, join);
        C19060yu r232 = new C19060yu(context);
        r232.setId(View.generateViewId());
        r232.setTitle((String) create22.first);
        r232.setSubtitle((String) create22.second);
        r232.setExtraButtonText(context.getResources().getString(2131826643));
        return r232;
    }
}
