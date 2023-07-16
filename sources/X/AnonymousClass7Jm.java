package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.instagram.barcelona.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Jm  reason: invalid class name */
public final class AnonymousClass7Jm {
    public static final long A00 = C86154wM.A08(TimeUnit.SECONDS);
    public static final AnonymousClass7Jm A01 = new AnonymousClass7Jm();

    public static final long A00(Animator animator) {
        C04220Ms.A0B(animator, 0);
        if (animator instanceof C86174wQ) {
            C86174wQ r6 = (C86174wQ) animator;
            return (r6.A04 * ((long) r6.A00)) + A00(r6.A05);
        } else if (animator instanceof AnonymousClass4wP) {
            List<Animator> list = ((AnonymousClass4wP) animator).A02;
            ArrayList A0w = AnonymousClass0wJ.A0w(list);
            for (Animator A002 : list) {
                C86144wL.A1U(A0w, A00(A002));
            }
            return C86134wK.A0C((Number) AnonymousClass00J.A02(A0w));
        } else if (animator instanceof L67) {
            return ((ValueAnimator) animator).getCurrentPlayTime();
        } else {
            return 0;
        }
    }

    public static final Animator A01(AnonymousClass3HX r1, String str) {
        C04220Ms.A0B(str, 1);
        return (Animator) ((AbstractMap) r1.A00(R.id.bk_context_key_animations)).get(str);
    }

    public static final void A02(Animator animator, long j) {
        C04220Ms.A0B(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A03(Animator animator, long j) {
        C04220Ms.A0B(animator, 0);
        long j2 = j;
        if (animator instanceof C86174wQ) {
            C86174wQ r8 = (C86174wQ) animator;
            long A07 = AnonymousClass8bI.A07(j2, 0, r8.getDuration());
            long j3 = r8.A04;
            r8.A00 = (int) (A07 / j3);
            A03(r8.A05, A07 % j3);
        } else if (animator instanceof AnonymousClass4wP) {
            for (Animator A03 : ((AnonymousClass4wP) animator).A02) {
                A03(A03, j);
            }
        } else if (animator instanceof L67) {
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public final void A05(AnonymousClass3HX r8, String str, boolean z) {
        C04220Ms.A0B(str, 1);
        Animator A012 = A01(r8, str);
        if (A012 != null) {
            C112856qJ r4 = r8.A02.ATb().A06;
            A012.addListener(new AnonymousClass4wV(r8, r4, str, z));
            A012.start();
            if (r4.A01 == null) {
                r4.A01 = new AnonymousClass5FF(r4.A02);
            }
            r4.A00++;
            Map map = r4.A04;
            int size = map.size();
            Iterator A14 = C86104wH.A14(map);
            while (A14.hasNext()) {
                C126107ea r2 = (C126107ea) A14.next();
                int i = r2.A00 + 1;
                r2.A00 = i;
                r2.A01 = Math.max(r2.A01, i);
            }
            C126107ea r1 = new C126107ea(r4.A03, str, r4.A00, size);
            r4.A01.A00.add(r1);
            r1.BwA();
            map.put(str, r1);
            r4.A01.AJS();
        }
    }

    public static final void A04(Animator animator, AnonymousClass3HX r2, String str) {
        AnonymousClass0wJ.A1O(animator, str);
        Animator animator2 = (Animator) ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            C30967GcS.A02("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", new Object[]{str}));
        }
    }
}
