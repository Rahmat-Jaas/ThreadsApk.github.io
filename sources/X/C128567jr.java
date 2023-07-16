package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.7jr  reason: invalid class name and case insensitive filesystem */
public final class C128567jr implements C147868q3 {
    public final AnonymousClass062 A00;
    public final C147138nS A01;
    public final AnonymousClass06B A02;
    public final /* synthetic */ Fragment A03;

    public C128567jr(Fragment fragment) {
        this.A03 = fragment;
        AnonymousClass06B viewModelStore = fragment.getViewModelStore();
        C04220Ms.A06(viewModelStore);
        this.A02 = viewModelStore;
        C147138nS defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        C04220Ms.A06(defaultViewModelProviderFactory);
        this.A01 = defaultViewModelProviderFactory;
        C14340pE r0 = fragment.mLifecycleRegistry;
        C04220Ms.A06(r0);
        this.A00 = r0;
    }

    public final /* synthetic */ C111686o9 getDefaultViewModelCreationExtras() {
        return C884658e.A00;
    }

    public final C147138nS getDefaultViewModelProviderFactory() {
        return this.A01;
    }

    public final AnonymousClass062 getLifecycle() {
        return this.A00;
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        return this.A03.mSavedStateRegistryController.A01;
    }

    public final AnonymousClass06B getViewModelStore() {
        return this.A02;
    }
}
