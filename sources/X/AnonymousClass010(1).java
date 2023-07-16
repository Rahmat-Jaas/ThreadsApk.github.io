package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.010  reason: invalid class name */
public final class AnonymousClass010 extends C011605j {
    private void A02(List list, List list2, Map map, boolean z) {
        AnonymousClass04o A04;
        ViewGroup viewGroup = this.A02;
        Context context = viewGroup.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AnonymousClass01I r12 = (AnonymousClass01I) it.next();
            if (!r12.A03() && (A04 = r12.A04(context)) != null) {
                Animator animator = A04.A00;
                if (animator == null) {
                    arrayList.add(r12);
                } else {
                    C13370nZ r14 = r12.A00;
                    Fragment fragment = r14.A04;
                    if (Boolean.TRUE.equals(map.get(r14))) {
                        C12560m7.A0E(2);
                    } else {
                        boolean z3 = false;
                        if (r14.A00 == AnonymousClass006.A0C) {
                            z3 = true;
                            list2.remove(r14);
                        }
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        animator.addListener(new AnonymousClass04Q(view, viewGroup, r12, this, r14, z3));
                        animator.setTarget(view);
                        animator.start();
                        C12560m7.A0E(2);
                        r12.A01().A01(new AnonymousClass04R(animator, this, r14));
                        z2 = true;
                    }
                }
            }
            r12.A02();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass01I r122 = (AnonymousClass01I) it2.next();
            C13370nZ r142 = r122.A00;
            Fragment fragment2 = r142.A04;
            if (z || z2) {
                C12560m7.A0E(2);
                r122.A02();
            } else {
                View view2 = fragment2.mView;
                AnonymousClass04o A042 = r122.A04(context);
                A042.getClass();
                Animation animation = A042.A01;
                animation.getClass();
                if (r142.A00 != AnonymousClass006.A00) {
                    view2.startAnimation(animation);
                    r122.A02();
                } else {
                    viewGroup.startViewTransition(view2);
                    C010104p r0 = new C010104p(view2, viewGroup, animation);
                    r0.setAnimationListener(new AnonymousClass04T(view2, viewGroup, r122, this, r142));
                    view2.startAnimation(r0);
                    C12560m7.A0E(2);
                }
                r122.A01().A01(new AnonymousClass04U(view2, viewGroup, r122, this, r142));
                z2 = false;
            }
        }
    }

    public final void A0A(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        A0A(childAt, arrayList);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static final void A01(C013306f r1, Collection collection) {
        Iterator it = r1.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(((View) ((Map.Entry) it.next()).getValue()).getTransitionName())) {
                it.remove();
            }
        }
    }

    public final void A09(List list, boolean z) {
        C13370nZ r10;
        boolean z2;
        Iterator it = list.iterator();
        C13370nZ r3 = null;
        C13370nZ r9 = null;
        loop0:
        while (true) {
            r10 = r3;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                r3 = (C13370nZ) it.next();
                Integer A01 = C011505i.A01(r3.A04.mView);
                int intValue = r3.A00.intValue();
                if (intValue == 2 || intValue == 3 || intValue == 0) {
                    if (A01 == AnonymousClass006.A01 && r9 == null) {
                        r9 = r3;
                    }
                } else if (intValue == 1 && A01 != AnonymousClass006.A01) {
                }
            }
        }
        C12560m7.A0E(2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        Fragment fragment = ((C13370nZ) list.get(list.size() - 1)).A04;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C009804j r32 = ((C13370nZ) it2.next()).A04.mAnimationInfo;
            C009804j r1 = fragment.mAnimationInfo;
            r32.A0H = r1.A0H;
            r32.A0I = r1.A0I;
            r32.A0J = r1.A0J;
            r32.A0K = r1.A0K;
        }
        Iterator it3 = list.iterator();
        while (true) {
            z2 = z;
            if (!it3.hasNext()) {
                break;
            }
            C13370nZ r6 = (C13370nZ) it3.next();
            C113806sA r33 = new C113806sA();
            r6.A02();
            HashSet hashSet = r6.A05;
            hashSet.add(r33);
            arrayList.add(new AnonymousClass01I(r33, r6, z2));
            C113806sA r34 = new C113806sA();
            r6.A02();
            hashSet.add(r34);
            boolean z3 = false;
            if (z) {
                if (r6 != r9) {
                    arrayList2.add(new AnonymousClass01H(r34, r6, z2, z3));
                    r6.A06.add(new AnonymousClass04P(this, r6, arrayList3));
                }
            } else if (r6 != r10) {
                arrayList2.add(new AnonymousClass01H(r34, r6, z2, z3));
                r6.A06.add(new AnonymousClass04P(this, r6, arrayList3));
            }
            z3 = true;
            arrayList2.add(new AnonymousClass01H(r34, r6, z2, z3));
            r6.A06.add(new AnonymousClass04P(this, r6, arrayList3));
        }
        Map A00 = A00(r9, r10, arrayList2, arrayList3, z2);
        A02(arrayList, arrayList3, A00, A00.containsValue(true));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C13370nZ r2 = (C13370nZ) it4.next();
            C011505i.A02(r2.A04.mView, r2.A00);
        }
        arrayList3.clear();
        C12560m7.A0E(2);
    }

    public final void A0B(View view, Map map) {
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    A0B(childAt, map);
                }
            }
        }
    }

    public AnonymousClass010(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private Map A00(C13370nZ r38, C13370nZ r39, List list, List list2, boolean z) {
        C13370nZ r27;
        C13370nZ r26;
        boolean z2;
        boolean z3;
        C18209Abd enterTransitionCallback;
        C18209Abd exitTransitionCallback;
        View view;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        AnonymousClass05Y r4 = null;
        while (it.hasNext()) {
            AnonymousClass01H r6 = (AnonymousClass01H) it.next();
            if (!r6.A03()) {
                Object obj = r6.A01;
                AnonymousClass05Y A00 = AnonymousClass01H.A00(r6, obj);
                Object obj2 = r6.A00;
                AnonymousClass05Y A002 = AnonymousClass01H.A00(r6, obj2);
                if (A00 == null) {
                    A00 = A002;
                } else if (!(A002 == null || A00 == A002)) {
                    StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb.append(r6.A00.A04);
                    sb.append(" returned Transition ");
                    sb.append(obj);
                    sb.append(" which uses a different Transition  type than its shared element transition ");
                    sb.append(obj2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (r4 == null) {
                    r4 = A00;
                } else if (!(A00 == null || r4 == A00)) {
                    StringBuilder sb2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb2.append(r6.A00.A04);
                    sb2.append(" returned Transition ");
                    sb2.append(obj);
                    sb2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        if (r4 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass04Z r2 = (AnonymousClass04Z) it2.next();
                hashMap.put(r2.A00, false);
                r2.A02();
            }
        } else {
            ViewGroup viewGroup = this.A02;
            View view2 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C013306f r1 = new C013306f();
            Iterator it3 = list.iterator();
            Object obj3 = null;
            View view3 = null;
            boolean z4 = false;
            while (true) {
                r27 = r38;
                r26 = r39;
                if (!it3.hasNext()) {
                    break;
                }
                Object obj4 = ((AnonymousClass01H) it3.next()).A00;
                if (!(obj4 == null || r38 == null || r39 == null)) {
                    obj3 = r4.A04(r4.A03(obj4));
                    Fragment fragment = r26.A04;
                    ArrayList sharedElementSourceNames = fragment.getSharedElementSourceNames();
                    Fragment fragment2 = r27.A04;
                    ArrayList sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                    ArrayList sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                    for (int i = 0; i < sharedElementTargetNames.size(); i++) {
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                        }
                    }
                    ArrayList sharedElementTargetNames2 = fragment.getSharedElementTargetNames();
                    boolean z5 = z;
                    if (!z) {
                        enterTransitionCallback = fragment2.getExitTransitionCallback();
                        exitTransitionCallback = fragment.getEnterTransitionCallback();
                    } else {
                        enterTransitionCallback = fragment2.getEnterTransitionCallback();
                        exitTransitionCallback = fragment.getExitTransitionCallback();
                    }
                    int size = sharedElementSourceNames.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        r1.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    }
                    if (C12560m7.A0E(2)) {
                        Iterator it4 = sharedElementTargetNames2.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                        Iterator it5 = sharedElementSourceNames.iterator();
                        while (it5.hasNext()) {
                            it5.next();
                        }
                    }
                    C013306f r11 = new C013306f();
                    A0B(fragment2.mView, r11);
                    r11.A09(sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        C12560m7.A0E(2);
                        enterTransitionCallback.A00(sharedElementSourceNames, r11);
                        for (int size2 = sharedElementSourceNames.size() - 1; size2 >= 0; size2--) {
                            String str = (String) sharedElementSourceNames.get(size2);
                            View view4 = (View) r11.get(str);
                            if (view4 == null) {
                                r1.remove(str);
                            } else if (!str.equals(view4.getTransitionName())) {
                                r1.put(view4.getTransitionName(), r1.remove(str));
                            }
                        }
                    } else {
                        r1.A09(r11.keySet());
                    }
                    C013306f r9 = new C013306f();
                    A0B(fragment.mView, r9);
                    r9.A09(sharedElementTargetNames2);
                    r9.A09(r1.values());
                    if (exitTransitionCallback == null) {
                        int size3 = r1.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                break;
                            } else if (!r9.containsKey(r1.A02[(size3 << 1) + 1])) {
                                r1.A06(size3);
                            }
                        }
                    } else {
                        C12560m7.A0E(2);
                        exitTransitionCallback.A00(sharedElementTargetNames2, r9);
                        for (int size4 = sharedElementTargetNames2.size() - 1; size4 >= 0; size4--) {
                            String str2 = (String) sharedElementTargetNames2.get(size4);
                            View view5 = (View) r9.get(str2);
                            if (view5 == null) {
                                int size5 = r1.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size5) {
                                        break;
                                    }
                                    Object[] objArr = r1.A02;
                                    int i4 = i3 << 1;
                                    if (str2.equals(objArr[i4 + 1])) {
                                        Object obj5 = objArr[i4];
                                        if (obj5 != null) {
                                            r1.remove(obj5);
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            } else if (!str2.equals(view5.getTransitionName())) {
                                int size6 = r1.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size6) {
                                        break;
                                    }
                                    Object[] objArr2 = r1.A02;
                                    int i6 = i5 << 1;
                                    if (str2.equals(objArr2[i6 + 1])) {
                                        Object obj6 = objArr2[i6];
                                        if (obj6 != null) {
                                            r1.put(obj6, view5.getTransitionName());
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                    }
                    A01(r11, r1.keySet());
                    A01(r9, r1.values());
                    if (r1.isEmpty()) {
                        arrayList.clear();
                        arrayList2.clear();
                        obj3 = null;
                    } else {
                        boolean z6 = z5;
                        AnonymousClass05Q.A00(r11, fragment, fragment2, z6);
                        C004702d.A00(viewGroup, new AnonymousClass04V(r9, this, r26, r27, z6));
                        arrayList.addAll(r11.values());
                        if (!sharedElementSourceNames.isEmpty()) {
                            view3 = (View) r11.get(sharedElementSourceNames.get(0));
                            r4.A09(view3, obj3);
                        }
                        arrayList2.addAll(r9.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view = (View) r9.get(sharedElementTargetNames2.get(0))) != null) {
                            C004702d.A00(viewGroup, new AnonymousClass04W(rect, view, this, r4));
                            z4 = true;
                        }
                        r4.A0B(view2, obj3, arrayList);
                        r4.A0E(obj3, (Object) null, (Object) null, obj3, (ArrayList) null, (ArrayList) null, arrayList2);
                        hashMap.put(r27, true);
                        hashMap.put(r26, true);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = list.iterator();
            Object obj7 = null;
            Object obj8 = null;
            while (it6.hasNext()) {
                AnonymousClass01H r112 = (AnonymousClass01H) it6.next();
                if (r112.A03()) {
                    hashMap.put(r112.A00, false);
                } else {
                    Object A03 = r4.A03(r112.A01);
                    C13370nZ r7 = r112.A00;
                    if (obj3 == null || !(r7 == r27 || r7 == r26)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (A03 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Fragment fragment3 = r7.A04;
                        A0A(fragment3.mView, arrayList4);
                        if (z3) {
                            if (r7 == r27) {
                                arrayList4.removeAll(arrayList);
                            } else {
                                arrayList4.removeAll(arrayList2);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            r4.A08(view2, A03);
                        } else {
                            r4.A0F(A03, arrayList4);
                            r4.A0E(A03, A03, (Object) null, (Object) null, arrayList4, (ArrayList) null, (ArrayList) null);
                            if (r7.A00 == AnonymousClass006.A0C) {
                                list2.remove(r7);
                                ArrayList arrayList5 = new ArrayList(arrayList4);
                                arrayList5.remove(fragment3.mView);
                                r4.A0A(fragment3.mView, A03, arrayList5);
                                C004702d.A00(viewGroup, new AnonymousClass04X(this, arrayList4));
                            }
                        }
                        if (r7.A00 == AnonymousClass006.A01) {
                            arrayList3.addAll(arrayList4);
                            if (z4) {
                                r4.A07(rect, A03);
                            }
                        } else {
                            r4.A09(view3, A03);
                        }
                        hashMap.put(r7, true);
                        if (r112.A02) {
                            obj8 = r4.A06(obj8, A03, (Object) null);
                        } else {
                            obj7 = r4.A06(obj7, A03, (Object) null);
                        }
                    } else if (!z3) {
                        hashMap.put(r7, false);
                    }
                }
                r112.A02();
            }
            Object A05 = r4.A05(obj8, obj7, obj3);
            if (A05 != null) {
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    AnonymousClass01H r113 = (AnonymousClass01H) it7.next();
                    if (!r113.A03()) {
                        Object obj9 = r113.A01;
                        C13370nZ r10 = r113.A00;
                        if (obj3 == null || !(r10 == r27 || r10 == r26)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (obj9 != null || z2) {
                            if (!viewGroup.isLaidOut()) {
                                C12560m7.A0E(2);
                                r113.A02();
                            } else {
                                r4.A0D(r113.A01(), r10.A04, A05, new AnonymousClass04Y(r113, this, r10));
                            }
                        }
                    }
                }
                if (viewGroup.isLaidOut()) {
                    AnonymousClass05Q.A01(arrayList3, 4);
                    ArrayList arrayList6 = new ArrayList();
                    int size7 = arrayList2.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        View view6 = (View) arrayList2.get(i7);
                        arrayList6.add(view6.getTransitionName());
                        view6.setTransitionName((String) null);
                    }
                    if (C12560m7.A0E(2)) {
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            ((View) it8.next()).getTransitionName();
                        }
                        Iterator it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            ((View) it9.next()).getTransitionName();
                        }
                    }
                    r4.A0C(viewGroup, A05);
                    int size8 = arrayList2.size();
                    ArrayList arrayList7 = new ArrayList();
                    for (int i8 = 0; i8 < size8; i8++) {
                        View view7 = (View) arrayList.get(i8);
                        String transitionName = view7.getTransitionName();
                        arrayList7.add(transitionName);
                        if (transitionName != null) {
                            view7.setTransitionName((String) null);
                            String str3 = (String) r1.get(transitionName);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size8) {
                                    break;
                                } else if (str3.equals(arrayList6.get(i9))) {
                                    ((View) arrayList2.get(i9)).setTransitionName(transitionName);
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                    C004702d.A00(viewGroup, new AnonymousClass05X(r4, arrayList2, arrayList6, arrayList, arrayList7, size8));
                    AnonymousClass05Q.A01(arrayList3, 0);
                    r4.A0G(obj3, arrayList, arrayList2);
                }
            }
        }
        return hashMap;
    }
}
