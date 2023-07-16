package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.7s9  reason: invalid class name and case insensitive filesystem */
public final class C131497s9 implements C21800C0z, C27927Evd {
    public FrameLayout A00;
    public LLF A01;
    public C121247Ez A02;
    public final C25812DsR A03;

    public final void A01(ViewGroup viewGroup, C81644o8 r10, C84844tx r11) {
        C28321u4 r0;
        C28291u0 r6;
        C84844tx r5 = r11;
        C81644o8 r62 = r10;
        boolean A1Y = AnonymousClass0wJ.A1Y(viewGroup, r11);
        C25812DsR dsR = this.A03;
        if (!dsR.A0G()) {
            dsR.A08();
            A00(this);
        }
        dsR.A09(0.0d);
        Context A0A = C18190wL.A0A(viewGroup);
        if ((r11 instanceof C28321u4) && (r0 = (C28321u4) r5) != null) {
            C130667qT A06 = r0.A06();
            if ((r10 instanceof C28291u0) && (r6 = (C28291u0) r62) != null) {
                if (this.A00 == null) {
                    View inflate = LayoutInflater.from(A0A).inflate(R.layout.bloks_floating_banner, viewGroup, A1Y);
                    C04220Ms.A0C(inflate, C18170wI.A00(1));
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this.A00 = frameLayout;
                    viewGroup.addView(frameLayout);
                }
                LLF llf = new LLF(A0A);
                this.A01 = llf;
                FrameLayout frameLayout2 = this.A00;
                if (frameLayout2 != null) {
                    frameLayout2.addView(llf);
                }
                A06.A01.put(R.id.bloks_action_listener, new C57253Ai(A0A, A06, r5, r6, new C133897we(this)));
            }
        }
    }

    public final void Bsd(View view) {
    }

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        if (dsR.A09.A00 == -1.0d) {
            A00(this);
            LLF llf = this.A01;
            if (llf != null) {
                llf.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            dsR.A09(0.0d);
        }
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void CLi(C25812DsR dsR) {
        int i;
        C04220Ms.A0B(dsR, 0);
        float f = (float) dsR.A09.A00;
        LLF llf = this.A01;
        if (llf != null) {
            i = llf.getMeasuredHeight();
        } else {
            i = 0;
        }
        LLF llf2 = this.A01;
        if (llf2 != null) {
            llf2.setTranslationY((-f) * ((float) i));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C131497s9 r2) {
        C121247Ez r0 = r2.A02;
        if (r0 != null) {
            r0.A04();
            r2.A02 = null;
            FrameLayout frameLayout = r2.A00;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            r2.A01 = null;
        }
    }

    public C131497s9() {
        C25812DsR A0O = C86134wK.A0O();
        A0O.A0D(C25757DrU.A02);
        A0O.A09(0.0d);
        A0O.A06 = true;
        A0O.A0E(this);
        this.A03 = A0O;
    }

    public final void onDestroyView() {
        A00(this);
        this.A01 = null;
        this.A00 = null;
    }
}
