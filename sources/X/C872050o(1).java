package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1;
import com.facebook.forker.Process;
import com.facebook.redex.IDxMPolicyShape265S0200000_2_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2;

/* renamed from: X.50o  reason: invalid class name and case insensitive filesystem */
public class C872050o extends ViewGroup implements C145718ky, AnonymousClass0S2 {
    public int A00;
    public int A01;
    public View A02;
    public AnonymousClass0ZU A03;
    public AnonymousClass0YY A04;
    public boolean A05;
    public Modifier A06;
    public C147168nV A07;
    public AnonymousClass066 A08;
    public C15750rp A09;
    public AnonymousClass0ZU A0A;
    public AnonymousClass0ZU A0B;
    public AnonymousClass0YY A0C;
    public AnonymousClass0YY A0D;
    public final AnonymousClass78y A0E;
    public final NestedScrollDispatcher A0F;
    public final AnonymousClass7Y3 A0G;
    public final AnonymousClass0ZU A0H;
    public final AnonymousClass0YY A0I;
    public final AnonymousClass02Z A0J;
    public final int[] A0K;

    public C872050o(Context context, C115506vH r9, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context);
        this.A0F = nestedScrollDispatcher;
        if (r9 != null) {
            setTag(R.id.androidx_compose_ui_view_composition_context, r9);
        }
        setSaveFromParentEnabled(false);
        this.A03 = C74154Zv.A00;
        this.A0B = C74144Zu.A00;
        this.A0A = AnonymousClass4Zt.A00;
        C123327Wm r2 = Modifier.A00;
        this.A06 = r2;
        this.A07 = new AnonymousClass7ZI(1.0f, 1.0f);
        this.A0E = new AnonymousClass78y(C86164wN.A0q(this, 0));
        this.A0I = C86154wM.A10(this, 49);
        this.A0H = C86154wM.A13(this, 39);
        this.A0K = new int[2];
        this.A01 = Process.WAIT_RESULT_TIMEOUT;
        this.A00 = Process.WAIT_RESULT_TIMEOUT;
        this.A0J = new AnonymousClass02Z();
        AnonymousClass7Y3 r4 = new AnonymousClass7Y3(false, AnonymousClass55K.A01.addAndGet(1));
        r4.A0E = this;
        Modifier A002 = AnonymousClass6FI.A00(r2, C78044hn.A00, true);
        C04220Ms.A0B(A002, 0);
        AnonymousClass7XO r5 = new AnonymousClass7XO();
        r5.A01 = C86154wM.A10(this, 29);
        AnonymousClass86I r22 = new AnonymousClass86I();
        AnonymousClass86I r1 = r5.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        r5.A00 = r22;
        r22.A00 = r5;
        this.A04 = r22;
        Modifier A003 = C98246Et.A00(C115836vz.A00(A002.Cx6(r5), C86164wN.A11(this, r4, 23)), C86164wN.A11(this, r4, 24));
        r4.Cn8(this.A06.Cx6(A003));
        this.A0D = C86164wN.A11(r4, A003, 20);
        r4.CkD(this.A07);
        this.A0C = C86154wM.A10(r4, 48);
        AnonymousClass0MJ A17 = C86144wL.A17();
        r4.A0I = C86154wM.A0y(r4, A17, this, 20);
        r4.A0J = C86164wN.A11(A17, this, 21);
        r4.Cmu(new IDxMPolicyShape265S0200000_2_I2(1, r4, this));
        this.A0G = r4;
    }

    public final void C8l(View view, int[] iArr, int i, int i2, int i3) {
        long j;
        C04220Ms.A0B(iArr, 3);
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0F;
            float f = (float) -1;
            long A0C2 = C86104wH.A0C(((float) i) * f, ((float) i2) * f);
            int i4 = 2;
            if (i3 == 0) {
                i4 = 1;
            }
            C146088lc r0 = nestedScrollDispatcher.A00;
            if (r0 != null) {
                j = r0.CBu(A0C2, i4);
            } else {
                j = AnonymousClass7KC.A03;
            }
            iArr[0] = AnonymousClass6F8.A00(AnonymousClass7KC.A01(j));
            iArr[1] = AnonymousClass6F8.A00(AnonymousClass7KC.A02(j));
        }
    }

    public final void C8n(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        long j;
        C04220Ms.A0B(iArr, 6);
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0F;
            float f = (float) -1;
            long A0C2 = C86104wH.A0C(((float) i) * f, ((float) i2) * f);
            long A0C3 = C86104wH.A0C(((float) i3) * f, ((float) i4) * f);
            int i6 = 2;
            if (i5 == 0) {
                i6 = 1;
            }
            C146088lc r3 = nestedScrollDispatcher.A00;
            if (r3 != null) {
                j = r3.CBp(A0C2, A0C3, i6);
            } else {
                j = AnonymousClass7KC.A03;
            }
            iArr[0] = AnonymousClass6F8.A00(AnonymousClass7KC.A01(j));
            iArr[1] = AnonymousClass6F8.A00(AnonymousClass7KC.A02(j));
        }
    }

    public final boolean CM1(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public final void CMY(View view, int i) {
        C04220Ms.A0B(view, 0);
        AnonymousClass02Z r1 = this.A0J;
        if (i == 1) {
            r1.A00 = 0;
        } else {
            r1.A01 = 0;
        }
    }

    public final boolean gatherTransparentRegion(Region region) {
        Region region2 = region;
        if (region != null) {
            int[] iArr = this.A0K;
            getLocationInWindow(iArr);
            int i = iArr[0];
            region2.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        }
        return true;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C04220Ms.A0B(view, 0);
        if (isNestedScrollingEnabled()) {
            long A0C2 = C86104wH.A0C(f * -1.0f, f2 * -1.0f);
            C83224qz r1 = (C83224qz) this.A0F.A01.invoke();
            if (r1 != null) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new AndroidViewHolder$onNestedFling$1(this, (C146958n9) null, A0C2, z), r1, 3);
            } else {
                throw C18180wK.A0a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (isNestedScrollingEnabled()) {
            long A0C2 = C86104wH.A0C(f * -1.0f, f2 * -1.0f);
            C83224qz r0 = (C83224qz) this.A0F.A01.invoke();
            if (r0 != null) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101100_I2(this, (C146958n9) null, 3, A0C2), r0, 3);
            } else {
                throw C18180wK.A0a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        }
        return false;
    }

    public final void setDensity(C147168nV r2) {
        C04220Ms.A0B(r2, 0);
        if (r2 != this.A07) {
            this.A07 = r2;
            AnonymousClass0YY r0 = this.A0C;
            if (r0 != null) {
                r0.invoke(r2);
            }
        }
    }

    public final void setModifier(Modifier modifier) {
        C04220Ms.A0B(modifier, 0);
        if (modifier != this.A06) {
            this.A06 = modifier;
            AnonymousClass0YY r0 = this.A0D;
            if (r0 != null) {
                r0.invoke(modifier);
            }
        }
    }

    public final void setRelease(AnonymousClass0ZU r2) {
        C04220Ms.A0B(r2, 0);
        this.A0A = r2;
    }

    public final void setReset(AnonymousClass0ZU r2) {
        C04220Ms.A0B(r2, 0);
        this.A0B = r2;
    }

    public final void setUpdate(AnonymousClass0ZU r2) {
        C04220Ms.A0B(r2, 0);
        this.A03 = r2;
        this.A05 = true;
        this.A0H.invoke();
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public static final int A00(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(AnonymousClass8bI.A02(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Process.WAIT_RESULT_TIMEOUT);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public final void BtB() {
        this.A0B.invoke();
        removeAllViewsInLayout();
    }

    public final void CFI() {
        this.A0A.invoke();
    }

    public final void CHS() {
        View view = this.A02;
        C04220Ms.A0A(view);
        if (view.getParent() != this) {
            addView(this.A02);
        } else {
            this.A0B.invoke();
        }
    }

    public final C147168nV getDensity() {
        return this.A07;
    }

    public final View getInteropView() {
        return this.A02;
    }

    public final AnonymousClass7Y3 getLayoutNode() {
        return this.A0G;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.A02;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final AnonymousClass066 getLifecycleOwner() {
        return this.A08;
    }

    public final Modifier getModifier() {
        return this.A06;
    }

    public int getNestedScrollAxes() {
        AnonymousClass02Z r0 = this.A0J;
        return r0.A01 | r0.A00;
    }

    public final AnonymousClass0YY getOnDensityChanged$ui_release() {
        return this.A0C;
    }

    public final AnonymousClass0YY getOnModifierChanged$ui_release() {
        return this.A0D;
    }

    public final AnonymousClass0YY getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.A04;
    }

    public final AnonymousClass0ZU getRelease() {
        return this.A0A;
    }

    public final AnonymousClass0ZU getReset() {
        return this.A0B;
    }

    public final C15750rp getSavedStateRegistryOwner() {
        return this.A09;
    }

    public final AnonymousClass0ZU getUpdate() {
        return this.A03;
    }

    public final View getView() {
        return this.A02;
    }

    public final boolean isNestedScrollingEnabled() {
        View view = this.A02;
        if (view != null) {
            return view.isNestedScrollingEnabled();
        }
        return super.isNestedScrollingEnabled();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.A02;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        View view = this.A02;
        if (view == null || view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        View view2 = this.A02;
        if (view2 != null) {
            view2.measure(i, i2);
        }
        View view3 = this.A02;
        int i4 = 0;
        if (view3 != null) {
            i3 = view3.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        View view4 = this.A02;
        if (view4 != null) {
            i4 = view4.getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
        this.A01 = i;
        this.A00 = i2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        AnonymousClass0YY r1 = this.A04;
        if (r1 != null) {
            r1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setLifecycleOwner(AnonymousClass066 r2) {
        if (r2 != this.A08) {
            this.A08 = r2;
            C116066wM.A01(this, r2);
        }
    }

    public final void setSavedStateRegistryOwner(C15750rp r2) {
        if (r2 != this.A09) {
            this.A09 = r2;
            setTag(R.id.view_tree_saved_state_registry_owner, r2);
        }
    }

    public final void setView$ui_release(View view) {
        if (view != this.A02) {
            this.A02 = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.A0H.invoke();
            }
        }
    }

    public final void C8m(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0F;
            float f = (float) -1;
            long A0C2 = C86104wH.A0C(((float) i) * f, ((float) i2) * f);
            long A0C3 = C86104wH.A0C(((float) i3) * f, ((float) i4) * f);
            int i6 = 2;
            if (i5 == 0) {
                i6 = 1;
            }
            C146088lc r3 = nestedScrollDispatcher.A00;
            if (r3 != null) {
                r3.CBp(A0C2, A0C3, i6);
            }
        }
    }

    public final void C8o(View view, View view2, int i, int i2) {
        boolean A1Z = AnonymousClass0wJ.A1Z(view, view2);
        AnonymousClass02Z r0 = this.A0J;
        if (i2 == A1Z) {
            r0.A00 = i;
        } else {
            r0.A01 = i;
        }
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.A0G.A0D();
        return null;
    }

    public final void onAttachedToWindow() {
        int A062 = C14030oh.A06(-49646196);
        super.onAttachedToWindow();
        AnonymousClass78y r1 = this.A0E;
        r1.A00 = C121637Hc.A01(r1.A08);
        C14030oh.A0D(612489332, A062);
    }

    public final void onDescendantInvalidated(View view, View view2) {
        AnonymousClass0wJ.A1N(view, view2);
        super.onDescendantInvalidated(view, view2);
        this.A0G.A0D();
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(580764336);
        super.onDetachedFromWindow();
        AnonymousClass78y r1 = this.A0E;
        C142868fj r0 = r1.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r1.A01();
        C14030oh.A0D(-1556579525, A062);
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = C14030oh.A06(-162848620);
        super.onWindowVisibilityChanged(i);
        C14030oh.A0D(46239234, A062);
    }

    public final void setOnDensityChanged$ui_release(AnonymousClass0YY r1) {
        this.A0C = r1;
    }

    public final void setOnModifierChanged$ui_release(AnonymousClass0YY r1) {
        this.A0D = r1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(AnonymousClass0YY r1) {
        this.A04 = r1;
    }
}
