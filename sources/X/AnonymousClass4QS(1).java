package X;

import android.os.Handler;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;

/* renamed from: X.4QS  reason: invalid class name */
public final class AnonymousClass4QS implements Runnable {
    public final /* synthetic */ TimeSpentReminderFullyBlockingFragment A00;

    public AnonymousClass4QS(TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment) {
        this.A00 = timeSpentReminderFullyBlockingFragment;
    }

    public final void run() {
        TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment = this.A00;
        if (timeSpentReminderFullyBlockingFragment.A03 == AnonymousClass24O.DAILY_LIMIT) {
            C54602zi.A00(ScreenTimeScreenType.GUARDIAN_DAILY_LIMIT_BLOCKING_SCREEN, timeSpentReminderFullyBlockingFragment.A02, C18190wL.A07());
            Handler handler = timeSpentReminderFullyBlockingFragment.A05;
            Runnable runnable = timeSpentReminderFullyBlockingFragment.A06;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, (long) 10000);
        }
    }
}
