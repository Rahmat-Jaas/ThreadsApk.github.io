package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.instagram.barcelona.R;

/* renamed from: X.0SK  reason: invalid class name */
public class AnonymousClass0SK extends Dialog implements AnonymousClass066, C15750rp, AnonymousClass092 {
    public C14340pE A00;
    public final AnonymousClass00F A01 = new AnonymousClass00F(new AnonymousClass00B(this));
    public final AnonymousClass072 A02 = new AnonymousClass072(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0SK(Context context, int i) {
        super(context, i);
        C04220Ms.A0B(context, 1);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C04220Ms.A0B(view, 0);
        A00();
        super.addContentView(view, layoutParams);
    }

    public void setContentView(View view) {
        C04220Ms.A0B(view, 0);
        A00();
        super.setContentView(view);
    }

    public final AnonymousClass062 getLifecycle() {
        C14340pE r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C14340pE r02 = new C14340pE(this);
        this.A00 = r02;
        return r02;
    }

    public final AnonymousClass070 getSavedStateRegistry() {
        return this.A02.A01;
    }

    public void onBackPressed() {
        this.A01.A02();
    }

    public void onStop() {
        C14340pE r1 = this.A00;
        if (r1 == null) {
            r1 = new C14340pE(this);
            this.A00 = r1;
        }
        r1.A09(AnonymousClass060.ON_DESTROY);
        this.A00 = null;
        super.onStop();
    }

    private final void A00() {
        Window window = getWindow();
        C04220Ms.A0A(window);
        View decorView = window.getDecorView();
        C04220Ms.A06(decorView);
        C116066wM.A01(decorView, this);
        Window window2 = getWindow();
        C04220Ms.A0A(window2);
        View decorView2 = window2.getDecorView();
        C04220Ms.A06(decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        C04220Ms.A0A(window3);
        View decorView3 = window3.getDecorView();
        C04220Ms.A06(decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final AnonymousClass00F getOnBackPressedDispatcher() {
        return this.A01;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            AnonymousClass00F r1 = this.A01;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C04220Ms.A06(onBackInvokedDispatcher);
            r1.A04(onBackInvokedDispatcher);
        }
        this.A02.A01(bundle);
        C14340pE r12 = this.A00;
        if (r12 == null) {
            r12 = new C14340pE(this);
            this.A00 = r12;
        }
        r12.A09(AnonymousClass060.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C04220Ms.A06(onSaveInstanceState);
        this.A02.A01.A02(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        C14340pE r1 = this.A00;
        if (r1 == null) {
            r1 = new C14340pE(this);
            this.A00 = r1;
        }
        r1.A09(AnonymousClass060.ON_RESUME);
    }

    public static final void A01(AnonymousClass0SK r0) {
        super.onBackPressed();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C04220Ms.A0B(view, 0);
        A00();
        super.setContentView(view, layoutParams);
    }

    public void setContentView(int i) {
        A00();
        super.setContentView(i);
    }
}
