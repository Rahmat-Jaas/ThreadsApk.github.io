package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.0RN  reason: invalid class name */
public final class AnonymousClass0RN implements AnonymousClass06C, C012605w, C15750rp {
    public C14340pE A00 = null;
    public AnonymousClass072 A01 = null;
    public C147138nS A02;
    public final Fragment A03;
    public final AnonymousClass06B A04;

    public final void A00() {
        if (this.A00 == null) {
            this.A00 = new C14340pE(this);
            AnonymousClass072 r0 = new AnonymousClass072(this);
            this.A01 = r0;
            r0.A00();
        }
    }

    public final C111686o9 getDefaultViewModelCreationExtras() {
        Fragment fragment = this.A03;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                applicationContext = null;
                break;
            }
        }
        C884758f r2 = new C884758f();
        if (applicationContext != null) {
            r2.A01(C884358b.A02, applicationContext);
        }
        r2.A01(AnonymousClass7GW.A01, fragment);
        r2.A01(AnonymousClass7GW.A02, this);
        Bundle bundle = fragment.mArguments;
        if (bundle != null) {
            r2.A01(AnonymousClass7GW.A00, bundle);
        }
        return r2;
    }

    public final C147138nS getDefaultViewModelProviderFactory() {
        Fragment fragment = this.A03;
        C147138nS defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            defaultViewModelProviderFactory = this.A02;
            if (defaultViewModelProviderFactory == null) {
                Application application = null;
                Context context = fragment.requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                defaultViewModelProviderFactory = new C884558d(application, fragment.mArguments, fragment);
            }
            return defaultViewModelProviderFactory;
        }
        this.A02 = defaultViewModelProviderFactory;
        return defaultViewModelProviderFactory;
    }

    public AnonymousClass0RN(Fragment fragment, AnonymousClass06B r3) {
        this.A03 = fragment;
        this.A04 = r3;
    }

    public final AnonymousClass062 getLifecycle() {
        A00();
        return this.A00;
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        A00();
        return this.A01.A01;
    }

    public final AnonymousClass06B getViewModelStore() {
        A00();
        return this.A04;
    }
}
