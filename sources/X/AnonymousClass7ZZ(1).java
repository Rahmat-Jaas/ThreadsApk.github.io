package X;

import com.instagram.urlhandlers.stories.StoriesUrlHandlerActivity;

/* renamed from: X.7ZZ  reason: invalid class name */
public final class AnonymousClass7ZZ implements AnonymousClass054 {
    public final /* synthetic */ StoriesUrlHandlerActivity A00;

    public AnonymousClass7ZZ(StoriesUrlHandlerActivity storiesUrlHandlerActivity) {
        this.A00 = storiesUrlHandlerActivity;
    }

    public final void onBackStackChanged() {
        StoriesUrlHandlerActivity storiesUrlHandlerActivity = this.A00;
        if (storiesUrlHandlerActivity.getSupportFragmentManager().A0I() <= 0) {
            storiesUrlHandlerActivity.finish();
        }
    }
}
