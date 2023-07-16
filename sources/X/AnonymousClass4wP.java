package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import com.facebook.redex.IDxLAdapterShape0S0100000_2_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4wP  reason: invalid class name */
public final class AnonymousClass4wP extends Animator {
    public long A00;
    public long A01;
    public final List A02;
    public final Integer A03;

    public final void cancel() {
        for (Animator cancel : this.A02) {
            cancel.cancel();
        }
        A00(this, C86164wN.A0q(this, 27));
    }

    public final void end() {
        for (Animator end : this.A02) {
            end.end();
        }
    }

    public final long getDuration() {
        return this.A00;
    }

    public final long getStartDelay() {
        return this.A01;
    }

    public final long getTotalDuration() {
        long j = this.A00;
        if (j != -1) {
            return j + this.A01;
        }
        return j;
    }

    public final boolean isRunning() {
        for (Animator isRunning : this.A02) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isStarted() {
        for (Animator isStarted : this.A02) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        for (Animator interpolator : this.A02) {
            interpolator.setInterpolator(timeInterpolator);
        }
    }

    public final void setStartDelay(long j) {
        this.A01 = j;
        for (Animator animator : this.A02) {
            if (animator instanceof AnonymousClass4wP) {
                animator.setStartDelay(j);
            } else {
                AnonymousClass7Jm.A02(animator, j);
            }
        }
    }

    public final void start() {
        List<Animator> list = this.A02;
        for (Animator start : list) {
            start.start();
        }
        A00(this, C86164wN.A0q(this, 28));
        if (list.isEmpty()) {
            A00(this, C86164wN.A0q(this, 29));
        }
    }

    public AnonymousClass4wP(Integer num, List list) {
        Object next;
        this.A03 = num;
        this.A02 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Animator animator = (Animator) it.next();
            C04220Ms.A0B(animator, 0);
            long totalDuration = animator.getTotalDuration();
            if (totalDuration == -1) {
                this.A00 = -1;
                break;
            }
            this.A00 = Math.max(this.A00, totalDuration);
        }
        if (this.A00 != -1 && (!this.A02.isEmpty())) {
            int intValue = this.A03.intValue();
            if (intValue == 0 || intValue == 2) {
                Iterator it2 = this.A02.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Animator animator2 = (Animator) next;
                        C04220Ms.A0B(animator2, 0);
                        long totalDuration2 = animator2.getTotalDuration();
                        do {
                            Object next2 = it2.next();
                            Animator animator3 = (Animator) next2;
                            C04220Ms.A0B(animator3, 0);
                            long totalDuration3 = animator3.getTotalDuration();
                            if (totalDuration2 < totalDuration3) {
                                next = next2;
                                totalDuration2 = totalDuration3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    throw C86154wM.A0u();
                }
            } else if (intValue == 1) {
                next = AnonymousClass00J.A0E(this.A02);
            } else {
                throw AnonymousClass4VZ.A00();
            }
            ((Animator) next).addListener(new IDxLAdapterShape0S0100000_2_I2(this, 2));
        }
    }

    public static final void A00(AnonymousClass4wP r1, AnonymousClass0YY r2) {
        ArrayList<Animator.AnimatorListener> listeners = r1.getListeners();
        if (listeners != null) {
            for (Object next : AnonymousClass00J.A0N(listeners)) {
                C04220Ms.A04(next);
                r2.invoke(next);
            }
        }
    }

    public final void pause() {
        super.pause();
        if (isPaused()) {
            for (Animator pause : this.A02) {
                pause.pause();
            }
        }
    }

    public final void resume() {
        super.resume();
        if (!isPaused()) {
            for (Animator resume : this.A02) {
                resume.resume();
            }
        }
    }

    public final Animator setDuration(long j) {
        return this;
    }
}
