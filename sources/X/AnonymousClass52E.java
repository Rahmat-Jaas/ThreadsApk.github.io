package X;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.IDxPCallbackShape32S0100000_I2;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.redex.IDxOProviderShape4S0000000_2_I2;
import com.instagram.barcelona.R;
import java.util.UUID;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;

/* renamed from: X.52E  reason: invalid class name */
public final class AnonymousClass52E extends AnonymousClass0SK {
    public C1200278c A00;
    public AnonymousClass0ZU A01;
    public final View A02;
    public final C877954o A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52E(View view, C147168nV r9, AnonymousClass69J r10, C1200278c r11, UUID uuid, AnonymousClass0ZU r13) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        ViewGroup viewGroup;
        AnonymousClass0wJ.A1Q(r11, view);
        C18190wL.A1S(r10, 4, r9);
        this.A01 = r13;
        this.A00 = r11;
        this.A02 = view;
        float f = (float) 8;
        Window window = getWindow();
        if (window != null) {
            this.A04 = window.getAttributes().softInputMode & 240;
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            AnonymousClass03G.A00(window, true);
            Context context = getContext();
            C04220Ms.A06(context);
            C877954o r2 = new C877954o(context, window);
            r2.setTag(R.id.compose_view_saveable_id_tag, AnonymousClass0wJ.A0t("Dialog:", uuid));
            r2.setClipChildren(false);
            r2.setElevation(r9.CxL(f));
            r2.setOutlineProvider(new IDxOProviderShape4S0000000_2_I2(1));
            this.A03 = r2;
            View decorView = window.getDecorView();
            if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                A00(viewGroup);
            }
            setContentView((View) r2);
            C116066wM.A01(r2, C116066wM.A00(view));
            r2.setTag(R.id.view_tree_view_model_store_owner, ViewTreeViewModelStoreOwner.A00(view));
            r2.setTag(R.id.view_tree_saved_state_registry_owner, (C15750rp) C146838mw.A00(C138988Mf.A00, AnonymousClass8bL.A08(view, C138978Me.A00)));
            A01(r10, this.A00, this.A01);
            AnonymousClass00F r22 = this.A01;
            KtLambdaShape148S0100000_I2_3 A0q = C86164wN.A0q(this, 7);
            C04220Ms.A0B(r22, 0);
            r22.A05(new IDxPCallbackShape32S0100000_I2((AnonymousClass0YY) A0q), this);
            return;
        }
        throw C18180wK.A0a("Dialog has no window");
    }

    public static final void A00(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof C877954o)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                    A00(viewGroup2);
                }
            }
        }
    }

    public final void A01(AnonymousClass69J r7, C1200278c r8, AnonymousClass0ZU r9) {
        WindowManager.LayoutParams layoutParams;
        Window window;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        C04220Ms.A0B(r7, 2);
        this.A01 = r9;
        this.A00 = r8;
        AnonymousClass20X r2 = r8.A00;
        View view = this.A02;
        C04220Ms.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        boolean z = false;
        if (!(layoutParams == null || (layoutParams.flags & 8192) == 0)) {
            z = true;
        }
        C04220Ms.A0B(r2, 0);
        Window window2 = getWindow();
        C04220Ms.A0A(window2);
        int i = -8193;
        if (z) {
            i = 8192;
        }
        window2.setFlags(i, 8192);
        C877954o r22 = this.A03;
        int ordinal = r7.ordinal();
        int i2 = 1;
        if (ordinal == 0) {
            i2 = 0;
        } else if (ordinal != A1Z) {
            throw AnonymousClass4VZ.A00();
        }
        r22.setLayoutDirection(i2);
        r22.A01 = A1Z;
        if (Build.VERSION.SDK_INT < 31 && (window = getWindow()) != null) {
            window.setSoftInputMode(this.A04);
        }
    }

    public final void cancel() {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C04220Ms.A0B(motionEvent, 0);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.A01.invoke();
        }
        return onTouchEvent;
    }
}
