package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0mW  reason: invalid class name and case insensitive filesystem */
public final class C12810mW extends AnonymousClass05Y {
    public final Object A03(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public final Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final Object A05(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null) {
            transition = null;
            if (transition2 != null) {
                transition = transition2;
            }
        } else if (transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public final Object A06(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public final void A07(Rect rect, Object obj) {
        ((Transition) obj).setEpicenterCallback(new AnonymousClass05V(rect, this));
    }

    public final void A08(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public final void A09(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AnonymousClass05Y.A00(view, rect);
            ((Transition) obj).setEpicenterCallback(new AnonymousClass05R(rect, this));
        }
    }

    public final void A0A(View view, Object obj, ArrayList arrayList) {
        ((Transition) obj).addListener(new AnonymousClass05S(view, this, arrayList));
    }

    public final void A0B(View view, Object obj, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass05Y.A01((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        A0F(transitionSet, arrayList);
    }

    public final void A0C(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final void A0D(C113806sA r2, Fragment fragment, Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new AnonymousClass05U(this, runnable));
    }

    public final void A0E(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((Transition) obj).addListener(new AnonymousClass05T(this, obj2, obj4, arrayList, arrayList3));
    }

    public final void A0F(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    A0F(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (AnonymousClass05Y.A02(transition.getTargetIds()) && AnonymousClass05Y.A02(transition.getTargetNames()) && AnonymousClass05Y.A02(transition.getTargetTypes()) && AnonymousClass05Y.A02(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public final void A0G(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            A0I(transitionSet, arrayList, arrayList2);
        }
    }

    public final void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A0I(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (AnonymousClass05Y.A02(transition.getTargetIds()) && AnonymousClass05Y.A02(transition.getTargetNames()) && AnonymousClass05Y.A02(transition.getTargetTypes()) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget((View) arrayList.get(size2));
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A0H(Object obj) {
        return obj instanceof Transition;
    }
}
