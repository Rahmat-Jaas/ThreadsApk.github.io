package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: X.4wQ  reason: invalid class name and case insensitive filesystem */
public final class C86174wQ extends Animator {
    public int A00;
    public boolean A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public C86174wQ(Animator animator, AnonymousClass3HX r4, int i) {
        C04220Ms.A0B(animator, 2);
        AnonymousClass7K7.A06(animator, r4);
        this.A05 = animator;
        this.A04 = animator.getTotalDuration();
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new AnonymousClass4wX(this, i));
        }
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        C04220Ms.A0B(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    public final void start() {
        this.A00 = 0;
        this.A01 = false;
        long j = this.A02;
        if (j != 0) {
            AnonymousClass7Jm.A02(this.A05, j);
        }
        this.A05.start();
    }

    public final void cancel() {
        this.A05.cancel();
    }

    public final void end() {
        this.A05.end();
    }

    public final long getDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return j * ((long) i);
        }
        return -1;
    }

    public final long getStartDelay() {
        return this.A02;
    }

    public final long getTotalDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return (j * ((long) i)) + this.A02;
        }
        return -1;
    }

    public final boolean isPaused() {
        return this.A05.isPaused();
    }

    public final boolean isRunning() {
        return this.A05.isRunning();
    }

    public final void pause() {
        this.A05.pause();
    }

    public final void resume() {
        this.A05.resume();
    }

    public static final void A00(C86174wQ r1, AnonymousClass0YY r2) {
        ArrayList<Animator.AnimatorListener> listeners = r1.getListeners();
        if (listeners != null) {
            for (Object next : AnonymousClass00J.A0N(listeners)) {
                C04220Ms.A04(next);
                r2.invoke(next);
            }
        }
    }

    public final Animator setDuration(long j) {
        return this;
    }

    public final void setStartDelay(long j) {
        this.A02 = j;
    }
}
