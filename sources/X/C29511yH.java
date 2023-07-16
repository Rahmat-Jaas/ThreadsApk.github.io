package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2;
import com.instagram.notifications.badging.ui.component.BaseBadgeView$onResumeLifecycleObserver$1;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.1yH  reason: invalid class name and case insensitive filesystem */
public abstract class C29511yH extends ProxyFrameLayout {
    public int A00;
    public AnonymousClass066 A01;
    public AnonymousClass25P A02;
    public AnonymousClass25P A03;
    public AnonymousClass25P A04;
    public AnonymousClass25P A05;
    public C81544ny A06;
    public C81554nz A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public C25918DvM A0C;
    public C81564o0 A0D;
    public final C14260p5 A0E;
    public final TypedArray A0F;
    public final D0f A0G;
    public final Map A0H;
    public final Map A0I;
    public final C04530Oa A0J;
    public final C04530Oa A0K = C18190wL.A0x(this, 8);
    public final C04530Oa A0L = C18190wL.A0x(this, 9);
    public final C04530Oa A0M = C18190wL.A0x(this, 10);
    public final C04530Oa A0N = C18190wL.A0x(this, 11);
    public final C04530Oa A0O = C18190wL.A0x(this, 13);

    public C29511yH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Pair A0p = C18180wK.A0p(0, AnonymousClass25P.TOAST);
        AnonymousClass25P r12 = AnonymousClass25P.DOT;
        Map A0H2 = AnonymousClass4WJ.A0H(A0p, C18180wK.A0p(1, r12), C18180wK.A0p(2, AnonymousClass25P.SMALL_DOT), C18180wK.A0p(3, AnonymousClass25P.NUMBERED));
        this.A0H = A0H2;
        D0f d0f = D0f.ABOVE_ANCHOR;
        Map A0G2 = AnonymousClass4WJ.A0G(C18180wK.A0p(0, d0f), C18180wK.A0p(1, D0f.BELOW_ANCHOR));
        this.A0I = A0G2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C29934Fwk.A2E, 0, 0);
        C04220Ms.A06(obtainStyledAttributes);
        this.A0F = obtainStyledAttributes;
        AnonymousClass25P r0 = (AnonymousClass25P) C18200wM.A0f(A0H2, obtainStyledAttributes.getInt(1, -1));
        this.A02 = r0 == null ? r12 : r0;
        this.A03 = (AnonymousClass25P) C18200wM.A0f(A0H2, obtainStyledAttributes.getInt(4, -1));
        AnonymousClass25P r02 = (AnonymousClass25P) C18200wM.A0f(A0H2, obtainStyledAttributes.getInt(8, -1));
        this.A05 = r02 == null ? this.A02 : r02;
        AnonymousClass25P r03 = (AnonymousClass25P) C18200wM.A0f(A0H2, obtainStyledAttributes.getInt(7, -1));
        this.A04 = r03 == null ? this.A05 : r03;
        this.A0A = obtainStyledAttributes.getBoolean(6, false);
        this.A0B = obtainStyledAttributes.getBoolean(9, true);
        D0f d0f2 = (D0f) C18200wM.A0f(A0G2, obtainStyledAttributes.getInt(10, -1));
        this.A0G = d0f2 == null ? d0f : d0f2;
        this.A09 = obtainStyledAttributes.getBoolean(5, false);
        this.A00 = obtainStyledAttributes.getInt(3, 0);
        this.A0J = C18190wL.A0x(this, 7);
        ProxyFrameLayout.inflate(context, R.layout.dot_badge, this);
        setClipChildren(false);
        setClipToPadding(false);
        this.A02.add(C18190wL.A0H(this, 563));
        obtainStyledAttributes.recycle();
        this.A0E = new BaseBadgeView$onResumeLifecycleObserver$1(this);
    }

    public abstract C82694q7 getViewModelFactory();

    public final void setBadgeDisplayStyle(AnonymousClass25P r2) {
        C04220Ms.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void setBadgeValue(String str) {
        C04220Ms.A0B(str, 0);
        IgTextView numberBadge = getNumberBadge();
        if (numberBadge != null) {
            numberBadge.setText(str);
        }
    }

    public final void setLifecycleOwner(AnonymousClass066 r5) {
        C04220Ms.A0B(r5, 0);
        this.A01 = r5;
        M5J m5j = getViewModel().A06;
        AnonymousClass066 r1 = this.A01;
        if (r1 != null) {
            C18190wL.A1C(r1, m5j, this, 29);
            M5J m5j2 = getViewModel().A07;
            AnonymousClass066 r12 = this.A01;
            if (r12 != null) {
                C18190wL.A1C(r12, m5j2, this, 30);
                M5J m5j3 = getViewModel().A05;
                AnonymousClass066 r13 = this.A01;
                if (r13 != null) {
                    m5j3.A0C(r13, new C73834Uj(this));
                    if (this.A02 == AnonymousClass25P.TOAST || this.A09) {
                        M5J m5j4 = getViewModel().A08;
                        AnonymousClass066 r14 = this.A01;
                        if (r14 != null) {
                            C18190wL.A1C(r14, m5j4, this, 31);
                        }
                    }
                    AnonymousClass066 r0 = this.A01;
                    if (r0 != null) {
                        r0.getLifecycle().A07(this.A0E);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E("lifecycleOwner");
        throw null;
    }

    public final void setToastCappedFallbackDisplayStyle(AnonymousClass25P r2) {
        C04220Ms.A0B(r2, 0);
        this.A04 = r2;
    }

    public final void setToastFallbackDisplayStyle(AnonymousClass25P r2) {
        C04220Ms.A0B(r2, 0);
        this.A05 = r2;
    }

    private final ViewGroup getContainer() {
        return (ViewGroup) this.A0J.getValue();
    }

    private final Map getDisplayStyleToViewMap() {
        return (Map) this.A0K.getValue();
    }

    /* access modifiers changed from: private */
    public final View getLedBadge() {
        return (View) this.A0L.getValue();
    }

    /* access modifiers changed from: private */
    public final IgTextView getNumberBadge() {
        return (IgTextView) this.A0M.getValue();
    }

    /* access modifiers changed from: private */
    public final View getToastBadge() {
        return (View) this.A0N.getValue();
    }

    public static /* synthetic */ void setLedBadgeOffsetsInDPs$default(C29511yH r1, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            r1.A05(i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLedBadgeOffsetsInDPs");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == null || view.getId() != R.id.wrapper) {
            ViewGroup container = getContainer();
            if (container != null) {
                container.addView(view, i, layoutParams);
                return;
            }
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final AnonymousClass25P getBadgeDisplayStyle() {
        return this.A02;
    }

    public final C81544ny getCappedBadgeValueProvider() {
        return this.A06;
    }

    public final boolean getCheckAnchorVisibilityWhenShowingTooltip() {
        return this.A08;
    }

    public final int getNumberCap() {
        return this.A00;
    }

    public final AnonymousClass25P getSelectedDisplayStyle() {
        return this.A03;
    }

    public final boolean getShouldToast() {
        return this.A09;
    }

    public final boolean getShowBadgeWhenSelected() {
        return this.A0A;
    }

    public final AnonymousClass25P getToastCappedFallbackDisplayStyle() {
        return this.A04;
    }

    public final AnonymousClass25P getToastFallbackDisplayStyle() {
        return this.A05;
    }

    public final boolean getToastWhenSelected() {
        return this.A0B;
    }

    public final C81554nz getTooltipClickListener() {
        return this.A07;
    }

    public final C81564o0 getTooltipStateChangeListener() {
        return null;
    }

    public final AnonymousClass3GM getViewModel() {
        return (AnonymousClass3GM) this.A0O.getValue();
    }

    public static final void A03(KtCSuperShape0S0121000_I2 ktCSuperShape0S0121000_I2, C29511yH r6) {
        Activity activity;
        Context context = r6.getContext();
        C25918DvM dvM = null;
        if ((context instanceof Activity) && (activity = (Activity) context) != null && !ktCSuperShape0S0121000_I2.A02) {
            IDxTCallbackShape159S0100000_1_I2 iDxTCallbackShape159S0100000_1_I2 = new IDxTCallbackShape159S0100000_1_I2(r6, 9);
            AnonymousClass4DR r2 = new AnonymousClass4DR((List) ktCSuperShape0S0121000_I2.A01);
            ViewGroup container = r6.getContainer();
            if (container != null) {
                C25553Dnn dnn = new C25553Dnn(activity, r2);
                dnn.A01(container);
                dnn.A03(r6.A0G);
                dnn.A0D = true;
                AnonymousClass3TC r0 = AnonymousClass3TC.A07;
                dnn.A08 = r0;
                dnn.A07 = r0;
                dnn.A00 = ktCSuperShape0S0121000_I2.A00;
                dnn.A0A = false;
                dnn.A05 = iDxTCallbackShape159S0100000_1_I2;
                dnn.A0C = r6.A08;
                dvM = dnn.A00();
            }
            r6.A0C = dvM;
            if (dvM != null) {
                dvM.A05();
            }
        }
    }

    public static final void A04(AnonymousClass25P r5, C29511yH r6) {
        int i;
        View badge = r6.getBadge();
        if (badge != null) {
            i = badge.getVisibility();
        } else {
            i = 8;
        }
        r6.A02 = r5;
        Iterator it = r6.getDisplayStyleToViewMap().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            View view = (View) A0o.getValue();
            if (view != null) {
                Object key = A0o.getKey();
                int i2 = 8;
                if (key == r5) {
                    i2 = i;
                }
                view.setVisibility(i2);
            }
        }
    }

    private final View getBadge() {
        return (View) getDisplayStyleToViewMap().get(this.A02);
    }

    public final void A05(int i, int i2) {
        C39909L6z l6z;
        View ledBadge = getLedBadge();
        ViewGroup.LayoutParams layoutParams = null;
        if (ledBadge != null) {
            layoutParams = ledBadge.getLayoutParams();
        }
        if ((layoutParams instanceof C39909L6z) && (l6z = (C39909L6z) layoutParams) != null) {
            Context context = getContext();
            l6z.setMarginEnd(C18240wQ.A01(context, i));
            l6z.topMargin = C18240wQ.A01(context, i2);
            View ledBadge2 = getLedBadge();
            if (ledBadge2 != null) {
                ledBadge2.setLayoutParams(l6z);
            }
        }
    }

    public final void A06(boolean z) {
        Integer num;
        View badge;
        View badge2 = getBadge();
        if (badge2 != null) {
            num = Integer.valueOf(badge2.getVisibility());
        } else {
            num = null;
        }
        int A002 = C18190wL.A00(z ? 1 : 0);
        if ((num == null || A002 != num.intValue()) && (badge = getBadge()) != null) {
            badge.setVisibility(A002);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass3GM viewModel = getViewModel();
        C86074wE.A01(viewModel.A0I, isSelected());
    }

    public final String getBadgeValue() {
        CharSequence charSequence;
        IgTextView numberBadge = getNumberBadge();
        if (numberBadge != null) {
            charSequence = numberBadge.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final boolean getTooltipVisible() {
        return C18180wK.A1Z(getViewModel().A0H.getValue(), AnonymousClass225.VISIBLE);
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(-261424511);
        super.onDetachedFromWindow();
        M5J m5j = getViewModel().A06;
        AnonymousClass066 r0 = this.A01;
        if (r0 != null) {
            m5j.A0B(r0);
            M5J m5j2 = getViewModel().A07;
            AnonymousClass066 r02 = this.A01;
            if (r02 != null) {
                m5j2.A0B(r02);
                M5J m5j3 = getViewModel().A05;
                AnonymousClass066 r03 = this.A01;
                if (r03 != null) {
                    m5j3.A0B(r03);
                    M5J m5j4 = getViewModel().A08;
                    AnonymousClass066 r04 = this.A01;
                    if (r04 != null) {
                        m5j4.A0B(r04);
                        AnonymousClass066 r05 = this.A01;
                        if (r05 != null) {
                            r05.getLifecycle().A08(this.A0E);
                            C14030oh.A0D(-931718746, A062);
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E("lifecycleOwner");
        throw null;
    }

    public final void setCappedBadgeValueProvider(C81544ny r1) {
        this.A06 = r1;
    }

    public final void setCheckAnchorVisibilityWhenShowingTooltip(boolean z) {
        this.A08 = z;
    }

    public final void setNumberCap(int i) {
        this.A00 = i;
    }

    public final void setSelectedDisplayStyle(AnonymousClass25P r1) {
        this.A03 = r1;
    }

    public final void setShouldToast(boolean z) {
        this.A09 = z;
    }

    public final void setShowBadgeWhenSelected(boolean z) {
        this.A0A = z;
    }

    public final void setToastWhenSelected(boolean z) {
        this.A0B = z;
    }

    public final void setTooltipClickListener(C81554nz r1) {
        this.A07 = r1;
    }

    public final void setTooltipStateChangeListener(C81564o0 r1) {
        this.A0D = r1;
    }
}
