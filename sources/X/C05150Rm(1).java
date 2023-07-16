package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0Rm  reason: invalid class name and case insensitive filesystem */
public final class C05150Rm extends C04600Oi implements AnonymousClass06C, C15750rp, AnonymousClass092, AnonymousClass00S, C83244r4, C83254r5, C83264r6, C83274r7, AnonymousClass02O, AnonymousClass05C {
    public final /* synthetic */ FragmentActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05150Rm(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.A00 = fragmentActivity;
    }

    public final View A00(int i) {
        return this.A00.findViewById(i);
    }

    public final boolean A01() {
        Window window = this.A00.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public final LayoutInflater A02() {
        FragmentActivity fragmentActivity = this.A00;
        return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
    }

    public final void A04() {
        this.A00.invalidateMenu();
    }

    public final void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.A00.dump("  ", (FileDescriptor) null, printWriter, strArr);
    }

    public final boolean A06(String str) {
        return F6X.A05(this.A00, str);
    }

    public final void BlQ(Fragment fragment, C12560m7 r3) {
        this.A00.onAttachFragment(fragment);
    }

    public final void addMenuProvider(AnonymousClass02V r2) {
        this.A00.addMenuProvider(r2);
    }

    public final void addOnConfigurationChangedListener(C002301a r2) {
        this.A00.addOnConfigurationChangedListener(r2);
    }

    public final void addOnMultiWindowModeChangedListener(C002301a r2) {
        this.A00.addOnMultiWindowModeChangedListener(r2);
    }

    public final void addOnPictureInPictureModeChangedListener(C002301a r2) {
        this.A00.addOnPictureInPictureModeChangedListener(r2);
    }

    public final void addOnTrimMemoryListener(C002301a r2) {
        this.A00.addOnTrimMemoryListener(r2);
    }

    public final AnonymousClass00R getActivityResultRegistry() {
        return this.A00.getActivityResultRegistry();
    }

    public final AnonymousClass062 getLifecycle() {
        return this.A00.mFragmentLifecycleRegistry;
    }

    public final AnonymousClass00F getOnBackPressedDispatcher() {
        return this.A00.getOnBackPressedDispatcher();
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        return this.A00.getSavedStateRegistry();
    }

    public final AnonymousClass06B getViewModelStore() {
        return this.A00.getViewModelStore();
    }

    public final void removeMenuProvider(AnonymousClass02V r2) {
        this.A00.removeMenuProvider(r2);
    }

    public final void removeOnConfigurationChangedListener(C002301a r2) {
        this.A00.removeOnConfigurationChangedListener(r2);
    }

    public final void removeOnMultiWindowModeChangedListener(C002301a r2) {
        this.A00.removeOnMultiWindowModeChangedListener(r2);
    }

    public final void removeOnPictureInPictureModeChangedListener(C002301a r2) {
        this.A00.removeOnPictureInPictureModeChangedListener(r2);
    }

    public final void removeOnTrimMemoryListener(C002301a r2) {
        this.A00.removeOnTrimMemoryListener(r2);
    }

    public final /* bridge */ /* synthetic */ Object A03() {
        return this.A00;
    }
}
