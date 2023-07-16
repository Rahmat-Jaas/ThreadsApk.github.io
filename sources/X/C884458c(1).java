package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.58c  reason: invalid class name and case insensitive filesystem */
public abstract class C884458c extends C98386Fh implements C147138nS {
    public AnonymousClass062 A00;
    public AnonymousClass070 A01;
    public Bundle A02;

    private final C62793ak A00(Class cls, String str) {
        AnonymousClass070 r4 = this.A01;
        C04220Ms.A0A(r4);
        AnonymousClass062 r3 = this.A00;
        C04220Ms.A0A(r3);
        Bundle bundle = this.A02;
        AnonymousClass0wJ.A1N(r4, r3);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(C98366Ff.A00(r4.A00(str), bundle), str);
        savedStateHandleController.A00(r3, r4);
        C116026wI.A01(r3, r4);
        C62793ak A012 = A01(savedStateHandleController.A01, cls, str);
        A012.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return A012;
    }

    public C62793ak A01(C121177En r3, Class cls, String str) {
        if (this instanceof AnonymousClass56P) {
            AnonymousClass56P r1 = (AnonymousClass56P) this;
            AnonymousClass0wJ.A1O(cls, r3);
            if (cls.isAssignableFrom(AnonymousClass587.class)) {
                return new AnonymousClass587(r3, r1.A00);
            }
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
        }
        C04220Ms.A0B(r3, 2);
        return new C881256v(r3);
    }

    public C884458c(Bundle bundle, C15750rp r3) {
        this.A01 = r3.getSavedStateRegistry();
        this.A00 = r3.getLifecycle();
        this.A02 = bundle;
    }

    public final C62793ak create(Class cls, C111686o9 r4) {
        AnonymousClass0wJ.A1N(cls, r4);
        String str = (String) r4.A00(C124877bt.A01);
        if (str == null) {
            throw C18180wK.A0a("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.A01 != null) {
            return A00(cls, str);
        } else {
            return A01(AnonymousClass7GW.A00(r4), cls, str);
        }
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw C18190wL.A0a("Local and anonymous classes can not be ViewModels");
        } else if (this.A00 != null) {
            return A00(cls, canonicalName);
        } else {
            throw C86134wK.A0s("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
