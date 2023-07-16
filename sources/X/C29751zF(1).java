package X;

import com.instagram.util.offline.BackgroundPrefetchJobService;
import com.instagram.util.offline.MainFeedBackgroundPrefetchJobService;
import com.instagram.util.offline.StoryBackgroundPrefetchJobService;

/* renamed from: X.1zF  reason: invalid class name and case insensitive filesystem */
public enum C29751zF {
    A01(0),
    A03(1),
    A02(2);
    
    public final Class A00;

    /* access modifiers changed from: public */
    static {
        A01 = new C29751zF(BackgroundPrefetchJobService.class, "ALL", 0);
        A03 = new C29751zF(StoryBackgroundPrefetchJobService.class, "STORY", 1);
        A02 = new C29751zF(MainFeedBackgroundPrefetchJobService.class, "FEED", 2);
    }

    /* access modifiers changed from: public */
    C29751zF(int i) {
        this.A00 = r1;
    }
}
